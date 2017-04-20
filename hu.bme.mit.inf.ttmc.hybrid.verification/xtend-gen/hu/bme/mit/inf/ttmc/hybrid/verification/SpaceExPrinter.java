package hu.bme.mit.inf.ttmc.hybrid.verification;

import TTMCConstraint.AddExpression;
import TTMCConstraint.AndExpression;
import TTMCConstraint.ConstantDeclaration;
import TTMCConstraint.DecimalLiteralExpression;
import TTMCConstraint.Declaration;
import TTMCConstraint.DivideExpression;
import TTMCConstraint.EqualityExpression;
import TTMCConstraint.Expression;
import TTMCConstraint.GreaterEqualExpression;
import TTMCConstraint.GreaterExpression;
import TTMCConstraint.IntegerLiteralExpression;
import TTMCConstraint.LessEqualExpression;
import TTMCConstraint.LessExpression;
import TTMCConstraint.MultiplyExpression;
import TTMCConstraint.OrExpression;
import TTMCConstraint.ReferenceExpression;
import TTMCConstraint.SubtractExpression;
import TTMCConstraint.UnaryMinusExpression;
import TTMCConstraint.UnaryPlusExpression;
import TTMCHybrid.Assignment;
import TTMCHybrid.DotExpression;
import TTMCHybrid.FlowCondition;
import TTMCHybrid.HybridAutomaton;
import TTMCHybrid.HybridSpecification;
import TTMCHybrid.InvariantCondition;
import TTMCHybrid.LocalVariableDeclaration;
import TTMCHybrid.Location;
import TTMCHybrid.PropertyDeclaration;
import TTMCHybrid.Transition;
import com.google.common.collect.Iterables;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class SpaceExPrinter {
  private HybridAutomaton automaton;
  
  private List<Location> locations;
  
  private List<Transition> transitions;
  
  private Map<Location, Integer> locId = new HashMap<Location, Integer>();
  
  private List<LocalVariableDeclaration> localVals;
  
  public SpaceExPrinter(final HybridSpecification model) {
    EList<PropertyDeclaration> _propertyDeclarations = model.getPropertyDeclarations();
    PropertyDeclaration _get = _propertyDeclarations.get(0);
    HybridAutomaton _hybridAutomaton = _get.getHybridAutomaton();
    this.automaton = _hybridAutomaton;
    EList<EObject> _eContents = this.automaton.eContents();
    Iterable<LocalVariableDeclaration> _filter = Iterables.<LocalVariableDeclaration>filter(_eContents, LocalVariableDeclaration.class);
    List<LocalVariableDeclaration> _list = IterableExtensions.<LocalVariableDeclaration>toList(_filter);
    this.localVals = _list;
    EList<EObject> _eContents_1 = this.automaton.eContents();
    Iterable<Location> _filter_1 = Iterables.<Location>filter(_eContents_1, Location.class);
    List<Location> _list_1 = IterableExtensions.<Location>toList(_filter_1);
    this.locations = _list_1;
    int _size = this.locations.size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      Location _get_1 = this.locations.get((i).intValue());
      this.locId.put(_get_1, Integer.valueOf(((i).intValue() + 1)));
    }
    EList<EObject> _eContents_2 = this.automaton.eContents();
    Iterable<Transition> _filter_2 = Iterables.<Transition>filter(_eContents_2, Transition.class);
    List<Transition> _list_2 = IterableExtensions.<Transition>toList(_filter_2);
    this.transitions = _list_2;
  }
  
  public void printXml() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>");
      _builder.newLine();
      _builder.append("<sspaceex xmlns=\"http://www-verimag.imag.fr/xml-namespaces/sspaceex\" version=\"0.2\" math=\"SpaceEx\">");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<component id=\"system\">");
      _builder.newLine();
      _builder.append("    ");
      CharSequence _printVariables = this.printVariables();
      _builder.append(_printVariables, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      CharSequence _printLocations = this.printLocations();
      _builder.append(_printLocations, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("    ");
      CharSequence _printTransitions = this.printTransitions();
      _builder.append(_printTransitions, "    ");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      _builder.append("</component>");
      _builder.newLine();
      _builder.append("</sspaceex>");
      _builder.newLine();
      final String xml = _builder.toString();
      final PrintWriter writer = new PrintWriter("system.xml", "iso-8859-1");
      writer.print(xml);
      writer.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence printVariables() {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final LocalVariableDeclaration x : this.localVals) {
        _builder.append("<param name=\"");
        String _name = x.getName();
        _builder.append(_name, "");
        _builder.append("\" type=\"real\" local=\"false\" d1=\"1\" d2=\"1\" dynamics=\"any\" />");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence printLocations() {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Location x : this.locations) {
        CharSequence _printLocation = this.printLocation(x);
        _builder.append(_printLocation, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence printLocation(final Location loc) {
    CharSequence _xblockexpression = null;
    {
      EList<EObject> _eContents = loc.eContents();
      Iterable<InvariantCondition> _filter = Iterables.<InvariantCondition>filter(_eContents, InvariantCondition.class);
      final List<InvariantCondition> invts = IterableExtensions.<InvariantCondition>toList(_filter);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<location id=\"");
      Integer _get = this.locId.get(loc);
      _builder.append(_get, "");
      _builder.append("\" name=\"");
      String _name = loc.getName();
      _builder.append(_name, "");
      _builder.append("\">");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      CharSequence _printInvariants = this.printInvariants(loc);
      _builder.append(_printInvariants, "  ");
      _builder.newLineIfNotEmpty();
      _builder.append("  ");
      CharSequence _printFlows = this.printFlows(loc);
      _builder.append(_printFlows, "  ");
      _builder.newLineIfNotEmpty();
      _builder.append("</location>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence printTransitions() {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final Transition x : this.transitions) {
        CharSequence _printTransition = this.printTransition(x);
        _builder.append(_printTransition, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public CharSequence printTransition(final Transition trans) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<transition source=\"");
    Location _source = trans.getSource();
    Integer _get = this.locId.get(_source);
    _builder.append(_get, "");
    _builder.append("\" target=\"");
    Location _target = trans.getTarget();
    Integer _get_1 = this.locId.get(_target);
    _builder.append(_get_1, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    CharSequence _printGuards = this.printGuards(trans);
    _builder.append(_printGuards, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    CharSequence _printAssignments = this.printAssignments(trans);
    _builder.append(_printAssignments, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("</transition>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence printInvariants(final Location loc) {
    CharSequence _xblockexpression = null;
    {
      EList<EObject> _eContents = loc.eContents();
      Iterable<InvariantCondition> _filter = Iterables.<InvariantCondition>filter(_eContents, InvariantCondition.class);
      final List<InvariantCondition> invts = IterableExtensions.<InvariantCondition>toList(_filter);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<invariant>");
      _builder.newLine();
      _builder.append("  ");
      {
        boolean _hasElements = false;
        for(final InvariantCondition x : invts) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(" &amp; ", "  ");
          }
          Expression _expression = x.getExpression();
          String _spaceEx = this.toSpaceEx(_expression);
          _builder.append(_spaceEx, "  ");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("</invariant>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence printFlows(final Location loc) {
    CharSequence _xblockexpression = null;
    {
      EList<EObject> _eContents = loc.eContents();
      Iterable<FlowCondition> _filter = Iterables.<FlowCondition>filter(_eContents, FlowCondition.class);
      final List<FlowCondition> flows = IterableExtensions.<FlowCondition>toList(_filter);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<flow>");
      _builder.newLine();
      _builder.append("  ");
      {
        boolean _hasElements = false;
        for(final FlowCondition x : flows) {
          if (!_hasElements) {
            _hasElements = true;
          } else {
            _builder.appendImmediate(" &amp; ", "  ");
          }
          Expression _expression = x.getExpression();
          String _spaceEx = this.toSpaceEx(_expression);
          _builder.append(_spaceEx, "  ");
        }
      }
      _builder.newLineIfNotEmpty();
      _builder.append("</flow>");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence printGuards(final Transition trans) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<guard>");
    _builder.newLine();
    _builder.append("  ");
    {
      EList<Expression> _guards = trans.getGuards();
      boolean _hasElements = false;
      for(final Expression x : _guards) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" &amp; ", "  ");
        }
        String _spaceEx = this.toSpaceEx(x);
        _builder.append(_spaceEx, "  ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</guard>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence printAssignments(final Transition trans) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<assignment>");
    _builder.newLine();
    _builder.append("  ");
    {
      EList<Assignment> _assignments = trans.getAssignments();
      boolean _hasElements = false;
      for(final Assignment x : _assignments) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(" &amp; ", "  ");
        }
        String _spaceEx = this.toSpaceEx(x);
        _builder.append(_spaceEx, "  ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("</assignment>");
    _builder.newLine();
    return _builder;
  }
  
  protected String _toSpaceEx(final Assignment ass) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    Expression _lhs = ass.getLhs();
    String _spaceEx = this.toSpaceEx(_lhs);
    _builder.append(_spaceEx, "");
    _builder.append("\' == ");
    Expression _rhs = ass.getRhs();
    String _spaceEx_1 = this.toSpaceEx(_rhs);
    _builder.append(_spaceEx_1, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final LessEqualExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    EList<EObject> _eContents = exp.eContents();
    EObject _get = _eContents.get(0);
    String _spaceEx = this.toSpaceEx(_get);
    _builder.append(_spaceEx, "");
    _builder.append(" &lt;= ");
    EList<EObject> _eContents_1 = exp.eContents();
    EObject _get_1 = _eContents_1.get(1);
    String _spaceEx_1 = this.toSpaceEx(_get_1);
    _builder.append(_spaceEx_1, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final GreaterEqualExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    EList<EObject> _eContents = exp.eContents();
    EObject _get = _eContents.get(0);
    String _spaceEx = this.toSpaceEx(_get);
    _builder.append(_spaceEx, "");
    _builder.append(" &gt;= ");
    EList<EObject> _eContents_1 = exp.eContents();
    EObject _get_1 = _eContents_1.get(1);
    String _spaceEx_1 = this.toSpaceEx(_get_1);
    _builder.append(_spaceEx_1, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final LessExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    EList<EObject> _eContents = exp.eContents();
    EObject _get = _eContents.get(0);
    String _spaceEx = this.toSpaceEx(_get);
    _builder.append(_spaceEx, "");
    _builder.append(" &lt; ");
    EList<EObject> _eContents_1 = exp.eContents();
    EObject _get_1 = _eContents_1.get(1);
    String _spaceEx_1 = this.toSpaceEx(_get_1);
    _builder.append(_spaceEx_1, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final GreaterExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    EList<EObject> _eContents = exp.eContents();
    EObject _get = _eContents.get(0);
    String _spaceEx = this.toSpaceEx(_get);
    _builder.append(_spaceEx, "");
    _builder.append(" &gt; ");
    EList<EObject> _eContents_1 = exp.eContents();
    EObject _get_1 = _eContents_1.get(1);
    String _spaceEx_1 = this.toSpaceEx(_get_1);
    _builder.append(_spaceEx_1, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final EqualityExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    EList<EObject> _eContents = exp.eContents();
    EObject _get = _eContents.get(0);
    String _spaceEx = this.toSpaceEx(_get);
    _builder.append(_spaceEx, "");
    _builder.append(" == ");
    EList<EObject> _eContents_1 = exp.eContents();
    EObject _get_1 = _eContents_1.get(1);
    String _spaceEx_1 = this.toSpaceEx(_get_1);
    _builder.append(_spaceEx_1, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final Integer value) {
    return ("" + value);
  }
  
  protected String _toSpaceEx(final DecimalLiteralExpression exp) {
    BigDecimal _value = exp.getValue();
    return this.toSpaceEx(_value);
  }
  
  protected String _toSpaceEx(final Number value) {
    double _doubleValue = value.doubleValue();
    final double dValue = ((double) _doubleValue);
    return ("" + Double.valueOf(dValue));
  }
  
  protected String _toSpaceEx(final BigInteger value) {
    return value.toString();
  }
  
  protected String _toSpaceEx(final IntegerLiteralExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    BigInteger _value = exp.getValue();
    String _spaceEx = this.toSpaceEx(_value);
    _builder.append(_spaceEx, "");
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final Expression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("unknown_expression ");
    EClass _eClass = exp.eClass();
    _builder.append(_eClass, "");
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final AndExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    EList<EObject> _eContents = exp.eContents();
    EObject _get = _eContents.get(0);
    String _spaceEx = this.toSpaceEx(_get);
    _builder.append(_spaceEx, "");
    _builder.append(" &amp; ");
    EList<EObject> _eContents_1 = exp.eContents();
    EObject _get_1 = _eContents_1.get(1);
    String _spaceEx_1 = this.toSpaceEx(_get_1);
    _builder.append(_spaceEx_1, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final OrExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    EList<EObject> _eContents = exp.eContents();
    EObject _get = _eContents.get(0);
    String _spaceEx = this.toSpaceEx(_get);
    _builder.append(_spaceEx, "");
    _builder.append(" | ");
    EList<EObject> _eContents_1 = exp.eContents();
    EObject _get_1 = _eContents_1.get(1);
    String _spaceEx_1 = this.toSpaceEx(_get_1);
    _builder.append(_spaceEx_1, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final ReferenceExpression exp) {
    Declaration _declaration = exp.getDeclaration();
    EClass _eClass = _declaration.eClass();
    String _name = _eClass.getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("LocalVariableDeclaration");
    boolean _equalsIgnoreCase = _name.equalsIgnoreCase(_builder.toString());
    if (_equalsIgnoreCase) {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _string = exp.toString();
      _builder_1.append(_string, "");
      return _builder_1.toString();
    } else {
      Declaration _declaration_1 = exp.getDeclaration();
      EClass _eClass_1 = _declaration_1.eClass();
      String _name_1 = _eClass_1.getName();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("ConstantDeclaration");
      boolean _equalsIgnoreCase_1 = _name_1.equalsIgnoreCase(_builder_2.toString());
      if (_equalsIgnoreCase_1) {
        Declaration _declaration_2 = exp.getDeclaration();
        Expression _expression = ((ConstantDeclaration) _declaration_2).getExpression();
        return this.toSpaceEx(_expression);
      } else {
        return exp.toString();
      }
    }
  }
  
  protected String _toSpaceEx(final DotExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    Expression _operand = exp.getOperand();
    String _spaceEx = this.toSpaceEx(_operand);
    _builder.append(_spaceEx, "");
    _builder.append("\'");
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final AddExpression exp) {
    final EList<EObject> terms = exp.eContents();
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final EObject x : terms) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("(", "");
        } else {
          _builder.appendImmediate(" + ", "");
        }
        String _spaceEx = this.toSpaceEx(x);
        _builder.append(_spaceEx, "");
      }
      if (_hasElements) {
        _builder.append(")", "");
      }
    }
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final MultiplyExpression exp) {
    final EList<EObject> terms = exp.eContents();
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final EObject x : terms) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("(", "");
        } else {
          _builder.appendImmediate(" * ", "");
        }
        String _spaceEx = this.toSpaceEx(x);
        _builder.append(_spaceEx, "");
      }
      if (_hasElements) {
        _builder.append(")", "");
      }
    }
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final DivideExpression exp) {
    final EList<EObject> terms = exp.eContents();
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final EObject x : terms) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("(", "");
        } else {
          _builder.appendImmediate(" / ", "");
        }
        String _spaceEx = this.toSpaceEx(x);
        _builder.append(_spaceEx, "");
      }
      if (_hasElements) {
        _builder.append(")", "");
      }
    }
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final SubtractExpression exp) {
    final EList<EObject> terms = exp.eContents();
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _hasElements = false;
      for(final EObject x : terms) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("(", "");
        } else {
          _builder.appendImmediate(" - ", "");
        }
        String _spaceEx = this.toSpaceEx(x);
        _builder.append(_spaceEx, "");
      }
      if (_hasElements) {
        _builder.append(")", "");
      }
    }
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final UnaryMinusExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(-");
    EList<EObject> _eContents = exp.eContents();
    EObject _get = _eContents.get(0);
    String _spaceEx = this.toSpaceEx(_get);
    _builder.append(_spaceEx, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSpaceEx(final UnaryPlusExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("-");
    EList<EObject> _eContents = exp.eContents();
    EObject _get = _eContents.get(0);
    String _spaceEx = this.toSpaceEx(_get);
    _builder.append(_spaceEx, "");
    return _builder.toString();
  }
  
  public String toSpaceEx(final Object exp) {
    if (exp instanceof DecimalLiteralExpression) {
      return _toSpaceEx((DecimalLiteralExpression)exp);
    } else if (exp instanceof EqualityExpression) {
      return _toSpaceEx((EqualityExpression)exp);
    } else if (exp instanceof GreaterEqualExpression) {
      return _toSpaceEx((GreaterEqualExpression)exp);
    } else if (exp instanceof GreaterExpression) {
      return _toSpaceEx((GreaterExpression)exp);
    } else if (exp instanceof IntegerLiteralExpression) {
      return _toSpaceEx((IntegerLiteralExpression)exp);
    } else if (exp instanceof LessEqualExpression) {
      return _toSpaceEx((LessEqualExpression)exp);
    } else if (exp instanceof LessExpression) {
      return _toSpaceEx((LessExpression)exp);
    } else if (exp instanceof AddExpression) {
      return _toSpaceEx((AddExpression)exp);
    } else if (exp instanceof AndExpression) {
      return _toSpaceEx((AndExpression)exp);
    } else if (exp instanceof DivideExpression) {
      return _toSpaceEx((DivideExpression)exp);
    } else if (exp instanceof MultiplyExpression) {
      return _toSpaceEx((MultiplyExpression)exp);
    } else if (exp instanceof OrExpression) {
      return _toSpaceEx((OrExpression)exp);
    } else if (exp instanceof ReferenceExpression) {
      return _toSpaceEx((ReferenceExpression)exp);
    } else if (exp instanceof SubtractExpression) {
      return _toSpaceEx((SubtractExpression)exp);
    } else if (exp instanceof UnaryMinusExpression) {
      return _toSpaceEx((UnaryMinusExpression)exp);
    } else if (exp instanceof UnaryPlusExpression) {
      return _toSpaceEx((UnaryPlusExpression)exp);
    } else if (exp instanceof DotExpression) {
      return _toSpaceEx((DotExpression)exp);
    } else if (exp instanceof Expression) {
      return _toSpaceEx((Expression)exp);
    } else if (exp instanceof Assignment) {
      return _toSpaceEx((Assignment)exp);
    } else if (exp instanceof Integer) {
      return _toSpaceEx((Integer)exp);
    } else if (exp instanceof BigInteger) {
      return _toSpaceEx((BigInteger)exp);
    } else if (exp instanceof Number) {
      return _toSpaceEx((Number)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}

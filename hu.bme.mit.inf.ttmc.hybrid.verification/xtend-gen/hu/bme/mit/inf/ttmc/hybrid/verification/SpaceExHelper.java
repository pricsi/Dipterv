package hu.bme.mit.inf.ttmc.hybrid.verification;

import TTMCConstraint.AddExpression;
import TTMCConstraint.AndExpression;
import TTMCConstraint.ConstantDeclaration;
import TTMCConstraint.DecimalLiteralExpression;
import TTMCConstraint.Declaration;
import TTMCConstraint.DivideExpression;
import TTMCConstraint.EqualityExpression;
import TTMCConstraint.Expression;
import TTMCConstraint.FinallyExpression;
import TTMCConstraint.GloballyExpression;
import TTMCConstraint.GreaterEqualExpression;
import TTMCConstraint.GreaterExpression;
import TTMCConstraint.ImplyExpression;
import TTMCConstraint.IntegerLiteralExpression;
import TTMCConstraint.LessEqualExpression;
import TTMCConstraint.LessExpression;
import TTMCConstraint.MultiplyExpression;
import TTMCConstraint.NextExpression;
import TTMCConstraint.NotExpression;
import TTMCConstraint.OrExpression;
import TTMCConstraint.ReferenceExpression;
import TTMCConstraint.SubtractExpression;
import TTMCConstraint.TemporalExistsExpression;
import TTMCConstraint.TemporalForallExpression;
import TTMCConstraint.UnaryMinusExpression;
import TTMCConstraint.UnaryPlusExpression;
import TTMCHybrid.DotExpression;
import TTMCHybrid.FlowCondition;
import TTMCHybrid.Location;
import TTMCHybrid.LocationReferenceExpression;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;

@SuppressWarnings("all")
public class SpaceExHelper {
  public String NamePrefix = "";
  
  public String NamePostfix = "";
  
  public Function1<Location, String> locResolve = null;
  
  public HashMap<Object, String> dictionary = new HashMap<Object, String>();
  
  protected String _toSmtLib2(final Integer value) {
    return ("" + value);
  }
  
  protected String _toSmtLib2(final DecimalLiteralExpression exp) {
    BigDecimal _value = exp.getValue();
    return this.toSmtLib2(_value);
  }
  
  protected String _toSmtLib2(final Number value) {
    double _doubleValue = value.doubleValue();
    final double dValue = ((double) _doubleValue);
    return ("" + Double.valueOf(dValue));
  }
  
  protected String _toSmtLib2(final BigInteger value) {
    return value.toString();
  }
  
  protected String _toSmtLib2(final DotExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("d/dt[");
    Expression _operand = exp.getOperand();
    String _smtLib2 = this.toSmtLib2(_operand);
    _builder.append(_smtLib2, "");
    _builder.append("]");
    return _builder.toString();
  }
  
  public String toSmtLib2(final List<FlowCondition> ode, final String name) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(define-ode ");
    _builder.append(name, "");
    _builder.append(" (");
    {
      for(final FlowCondition flow : ode) {
        _builder.append(" ");
        EList<EObject> _eContents = flow.eContents();
        EObject _get = _eContents.get(0);
        String _smtLib2 = this.toSmtLib2(_get);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append("))");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final ReferenceExpression exp) {
    Declaration _declaration = exp.getDeclaration();
    EClass _eClass = _declaration.eClass();
    String _name = _eClass.getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("LocalVariableDeclaration");
    boolean _equalsIgnoreCase = _name.equalsIgnoreCase(_builder.toString());
    if (_equalsIgnoreCase) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(this.NamePrefix, "");
      String _string = exp.toString();
      _builder_1.append(_string, "");
      _builder_1.append(this.NamePostfix, "");
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
        return this.toSmtLib2(_expression);
      } else {
        return exp.toString();
      }
    }
  }
  
  protected String _toSmtLib2(final EqualityExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(= ");
    Expression _leftOperand = exp.getLeftOperand();
    String _smtLib2 = this.toSmtLib2(_leftOperand);
    _builder.append(_smtLib2, "");
    _builder.append(" ");
    Expression _rightOperand = exp.getRightOperand();
    String _smtLib2_1 = this.toSmtLib2(_rightOperand);
    _builder.append(_smtLib2_1, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final AddExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(+");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final MultiplyExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(*");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final DivideExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(/");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final SubtractExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(-");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final UnaryMinusExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(- 0");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final UnaryPlusExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(+ 0");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final IntegerLiteralExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    BigInteger _value = exp.getValue();
    String _smtLib2 = this.toSmtLib2(_value);
    _builder.append(_smtLib2, "");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final LessEqualExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(<=");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final GreaterEqualExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(>=");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final LessExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(<");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final GreaterExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(>");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final AndExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(and");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final OrExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(or");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final ImplyExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(=>");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final NotExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(not");
    {
      EList<EObject> _eContents = exp.eContents();
      for(final EObject operand : _eContents) {
        _builder.append(" ");
        String _smtLib2 = this.toSmtLib2(operand);
        _builder.append(_smtLib2, "");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  protected String _toSmtLib2(final LocationReferenceExpression exp) {
    Location _location = exp.getLocation();
    boolean _containsKey = this.dictionary.containsKey(_location);
    if (_containsKey) {
      boolean _or = false;
      boolean _endsWith = this.NamePostfix.endsWith("_t");
      if (_endsWith) {
        _or = true;
      } else {
        boolean _endsWith_1 = this.NamePostfix.endsWith("_0");
        _or = _endsWith_1;
      }
      if (_or) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("(= mode");
        int _length = this.NamePostfix.length();
        int _minus = (_length - 2);
        String _substring = this.NamePostfix.substring(0, _minus);
        _builder.append(_substring, "");
        _builder.append(" ");
        Location _location_1 = exp.getLocation();
        String _get = this.dictionary.get(_location_1);
        _builder.append(_get, "");
        _builder.append(")");
        return _builder.toString();
      }
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("(false)");
    return _builder_1.toString();
  }
  
  protected String _toSmtLib2(final Expression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(猫 WTF ");
    Class<? extends Expression> _class = exp.getClass();
    _builder.append(_class, "");
    _builder.append(")");
    return _builder.toString();
  }
  
  protected CharSequence _temporalString(final TemporalExistsExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("E");
    Expression _operand = exp.getOperand();
    CharSequence _temporalString = this.temporalString(_operand);
    _builder.append(_temporalString, "");
    return _builder;
  }
  
  protected CharSequence _temporalString(final TemporalForallExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("A");
    Expression _operand = exp.getOperand();
    CharSequence _temporalString = this.temporalString(_operand);
    _builder.append(_temporalString, "");
    return _builder;
  }
  
  protected CharSequence _temporalString(final GloballyExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("G");
    Expression _operand = exp.getOperand();
    CharSequence _temporalString = this.temporalString(_operand);
    _builder.append(_temporalString, "");
    return _builder;
  }
  
  protected CharSequence _temporalString(final NextExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("N");
    Expression _operand = exp.getOperand();
    CharSequence _temporalString = this.temporalString(_operand);
    _builder.append(_temporalString, "");
    return _builder;
  }
  
  protected CharSequence _temporalString(final FinallyExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("F");
    Expression _operand = exp.getOperand();
    CharSequence _temporalString = this.temporalString(_operand);
    _builder.append(_temporalString, "");
    return _builder;
  }
  
  protected CharSequence _temporalString(final Expression exp) {
    StringConcatenation _builder = new StringConcatenation();
    return _builder;
  }
  
  public String toSmtLib2(final Object exp) {
    if (exp instanceof DecimalLiteralExpression) {
      return _toSmtLib2((DecimalLiteralExpression)exp);
    } else if (exp instanceof EqualityExpression) {
      return _toSmtLib2((EqualityExpression)exp);
    } else if (exp instanceof GreaterEqualExpression) {
      return _toSmtLib2((GreaterEqualExpression)exp);
    } else if (exp instanceof GreaterExpression) {
      return _toSmtLib2((GreaterExpression)exp);
    } else if (exp instanceof IntegerLiteralExpression) {
      return _toSmtLib2((IntegerLiteralExpression)exp);
    } else if (exp instanceof LessEqualExpression) {
      return _toSmtLib2((LessEqualExpression)exp);
    } else if (exp instanceof LessExpression) {
      return _toSmtLib2((LessExpression)exp);
    } else if (exp instanceof AddExpression) {
      return _toSmtLib2((AddExpression)exp);
    } else if (exp instanceof AndExpression) {
      return _toSmtLib2((AndExpression)exp);
    } else if (exp instanceof DivideExpression) {
      return _toSmtLib2((DivideExpression)exp);
    } else if (exp instanceof ImplyExpression) {
      return _toSmtLib2((ImplyExpression)exp);
    } else if (exp instanceof MultiplyExpression) {
      return _toSmtLib2((MultiplyExpression)exp);
    } else if (exp instanceof NotExpression) {
      return _toSmtLib2((NotExpression)exp);
    } else if (exp instanceof OrExpression) {
      return _toSmtLib2((OrExpression)exp);
    } else if (exp instanceof ReferenceExpression) {
      return _toSmtLib2((ReferenceExpression)exp);
    } else if (exp instanceof SubtractExpression) {
      return _toSmtLib2((SubtractExpression)exp);
    } else if (exp instanceof UnaryMinusExpression) {
      return _toSmtLib2((UnaryMinusExpression)exp);
    } else if (exp instanceof UnaryPlusExpression) {
      return _toSmtLib2((UnaryPlusExpression)exp);
    } else if (exp instanceof DotExpression) {
      return _toSmtLib2((DotExpression)exp);
    } else if (exp instanceof LocationReferenceExpression) {
      return _toSmtLib2((LocationReferenceExpression)exp);
    } else if (exp instanceof Expression) {
      return _toSmtLib2((Expression)exp);
    } else if (exp instanceof Integer) {
      return _toSmtLib2((Integer)exp);
    } else if (exp instanceof BigInteger) {
      return _toSmtLib2((BigInteger)exp);
    } else if (exp instanceof Number) {
      return _toSmtLib2((Number)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public CharSequence temporalString(final Expression exp) {
    if (exp instanceof FinallyExpression) {
      return _temporalString((FinallyExpression)exp);
    } else if (exp instanceof GloballyExpression) {
      return _temporalString((GloballyExpression)exp);
    } else if (exp instanceof NextExpression) {
      return _temporalString((NextExpression)exp);
    } else if (exp instanceof TemporalExistsExpression) {
      return _temporalString((TemporalExistsExpression)exp);
    } else if (exp instanceof TemporalForallExpression) {
      return _temporalString((TemporalForallExpression)exp);
    } else if (exp != null) {
      return _temporalString(exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}

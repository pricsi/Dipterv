package hu.bme.mit.inf.ttmc.constraint.model.utils.impl

import TTMCConstraint.AddExpression
import TTMCConstraint.AndExpression
import TTMCConstraint.BinaryExpression
import TTMCConstraint.DecimalLiteralExpression
import TTMCConstraint.DivideExpression
import TTMCConstraint.EqualExpression
import TTMCConstraint.EqualityExpression
import TTMCConstraint.FalseExpression
import TTMCConstraint.GreaterEqualExpression
import TTMCConstraint.GreaterExpression
import TTMCConstraint.ImplyExpression
import TTMCConstraint.InequalityExpression
import TTMCConstraint.IntegerLiteralExpression
import TTMCConstraint.LessEqualExpression
import TTMCConstraint.LessExpression
import TTMCConstraint.MultiaryExpression
import TTMCConstraint.MultiplyExpression
import TTMCConstraint.NotExpression
import TTMCConstraint.OrExpression
import TTMCConstraint.PrimedExpression
import TTMCConstraint.RationalLiteralExpression
import TTMCConstraint.ReferenceExpression
import TTMCConstraint.SubtractExpression
import TTMCConstraint.TrueExpression
import TTMCConstraint.TupleAccessExpression
import hu.bme.mit.inf.ttmc.constraint.model.utils.ConstraintPrettyPrinter
import TTMCConstraint.FunctionAccessExpression
import TTMCConstraint.InExpression
import TTMCConstraint.TupleLiteralExpression
import TTMCConstraint.EnumerationLiteralExpression
import TTMCConstraint.ForallExpression
import TTMCConstraint.ParameterDeclaration
import TTMCConstraint.GloballyExpression
import TTMCConstraint.UnaryExpression
import TTMCConstraint.FinallyExpression
import TTMCConstraint.NextExpression
import TTMCConstraint.DivExpression
import TTMCConstraint.Type
import TTMCConstraint.IntegerTypeDefinition
import TTMCConstraint.ModExpression
import TTMCConstraint.UnaryMinusExpression

class ConstraintPrettyPrinterImpl implements ConstraintPrettyPrinter {
	
	public def dispatch String asString(Object object) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	////
	
	public def dispatch String asString(ParameterDeclaration object) {
		return object.name + " : " + object.type.asString
	}
	
	////
	
	public def dispatch String asString(Type object) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	public def dispatch String asString(IntegerTypeDefinition object) {
		return 'integer'
	}
	
	////
	
	public def dispatch String asString(ReferenceExpression object) {
		return object.declaration.name
	}
	
	public def dispatch String asString(EnumerationLiteralExpression object) {
		return "::" + object.reference.name
	}
	
	public def dispatch String asString(TrueExpression object) {
		return "true"
	}
	
	public def dispatch String asString(FalseExpression object) {
		return "false"
	}
	
	public def dispatch String asString(IntegerLiteralExpression object) {
		return object.value.toString
	}
	
	public def dispatch String asString(DecimalLiteralExpression object) {
		return object.value.toString
	}
	
	public def dispatch String asString(RationalLiteralExpression object) {
		return object.numerator + '%' + object.denominator
	}
	
	
	public def dispatch String asString(NotExpression object) {
		return "!" + object.operand.asString
	}
	
	public def dispatch String asString(PrimedExpression object) {
		return object.operand.asString + "'"
	}
	
	public def dispatch String asString(ForallExpression object) {
		val builder = new StringBuilder
		builder.append("forall(")
		for (parameterDeclaration : object.parameterDeclarations) {
			builder.append(parameterDeclaration.asString)
			if (parameterDeclaration !== object.parameterDeclarations.last) {
				builder.append(", ")
			}
		}
		builder.append(' | ')
		builder.append(object.operand)
		builder.append(')')
		return builder.toString
	}
	
	public def dispatch String asString(InExpression object) {
		val builder = new StringBuilder
		builder.append("in(")
		builder.append(object.operand)
		builder.append(",")
		builder.append(object.type)
		builder.append(")")
		return builder.toString
	}
	
	public def dispatch String asString(TupleAccessExpression object) {
		return object.operand.asString + '!' + object.index
	}
	
	public def dispatch String asString(FunctionAccessExpression object) {
		val builder = new StringBuilder
		builder.append(object.operand)
		builder.append("(")
		for (parameter : object.parameters) {
			builder.append(parameter.asString)
			if (parameter !== object.parameters.last) {
				builder.append(", ")
			}
		}
		builder.append(")")
		return builder.toString
	}
	
	public def dispatch String asString(TupleLiteralExpression object) {
		val builder = new StringBuilder
		builder.append("(# ")
		for (expression : object.expressions) {
			builder.append(expression.asString)
			if (expression !== object.expressions.last) {
				builder.append(", ")
			}
		}
		builder.append(" #)")
		return builder.toString
	}
	
	public def dispatch String asString(UnaryExpression object) {
		var String operator
		
		switch object {
			GloballyExpression:
				operator = 'G'
			FinallyExpression:
				operator = 'F'
			NextExpression:
				operator = 'X'
			UnaryMinusExpression:
				operator = '-'
			default:
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
		val builder = new StringBuilder
		builder.append(operator)
		builder.append("(")
		builder.append(object.operand.asString)
		builder.append(")")
		return builder.toString
	}
	
	public def dispatch String asString(BinaryExpression object) {
		var String operator
		
		switch object {
			GreaterExpression:
				operator = '>'
			GreaterEqualExpression:
				operator = '>='
			LessExpression:
				operator = '<'
			LessEqualExpression:
				operator = '<='
			EqualityExpression:
				operator = '='
			InequalityExpression:
				operator = '/='
			ImplyExpression:
				operator = 'imply'
			EqualExpression:
				operator = 'equal'
			DivideExpression:
				operator = '/'
			SubtractExpression:
				operator = '-'
			DivExpression:
				operator = 'div'
			ModExpression:
				operator = 'mod'
			default:
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
		val builder = new StringBuilder
		builder.append(operator)
		builder.append("(")
		builder.append(object.leftOperand.asString)
		builder.append(", ")
		builder.append(object.rightOperand.asString)
		builder.append(")")
		return builder.toString
	}
	
	public def dispatch String asString(MultiaryExpression object) {
		var String operator
		
		switch object {
			AndExpression:
				operator = 'and'
			OrExpression:
				operator = 'or'
			MultiplyExpression:
				operator = '*'
			AddExpression:
				operator = '+'
			default:
				throw new UnsupportedOperationException("TODO: auto-generated method stub")
		}
		
		val builder = new StringBuilder
		builder.append(operator)
		builder.append("(")
		for (operand : object.operands) {
			builder.append(operand.asString)
			if (operand !== object.operands.last) {
				builder.append(", ")
			}
		}
		builder.append(")")
		return builder.toString
	}
	
}
package hu.bme.mit.inf.ttmc.hybrid.verification

import TTMCConstraint.*
import TTMCHybrid.*
import java.math.BigInteger
import java.util.List
import org.eclipse.xtext.xbase.lib.Functions.Function1
import java.util.HashMap

class SpaceExHelper {
	
	public String NamePrefix = ""
	public String NamePostfix = ""
	public Function1<Location, String> locResolve = null
	public HashMap<Object, String> dictionary = new HashMap<Object, String>
	
	def dispatch String toSmtLib2(Integer value){
		//if (value > 0)
		return "" + value
		//else return '''(- 0 «(0 - value)»)'''
	}
	
	def dispatch String toSmtLib2(DecimalLiteralExpression exp){
		return exp.value.toSmtLib2
	}
	
	def dispatch String toSmtLib2(Number value){
		val dValue = value.doubleValue() as double
		//if (dValue > 0)
		return "" + dValue
		//else return '''(- 0 «0.0 - (dValue)»)'''
	}
	
	def dispatch String toSmtLib2(BigInteger value){
		//if (value.signum >= 0)
		return value.toString
		//else return '''(- 0 «value.negate.toString»)'''
	}	
	
	// (= d/dt[x] v)
	
	def dispatch String toSmtLib2(DotExpression exp){
		return '''d/dt[«exp.operand.toSmtLib2»]'''
	}
	
	def String toSmtLib2(List<FlowCondition> ode, String name){
		return '''(define-ode «name» («FOR flow : ode» «flow.eContents.get(0).toSmtLib2»«ENDFOR»))'''
		
	}
	
	def dispatch String toSmtLib2(ReferenceExpression exp){
		if (exp.declaration.eClass.name.equalsIgnoreCase('''LocalVariableDeclaration'''))
			return '''«NamePrefix»«exp.toString»«NamePostfix»'''
		else if (exp.declaration.eClass.name.equalsIgnoreCase('''ConstantDeclaration'''))
			return (exp.declaration as ConstantDeclaration).expression.toSmtLib2
		else return exp.toString
			//return '''«exp.declaration.eClass.name»'''
		//return exp.declaration.eClass.toString
		//return '''«NamePrefix»«exp.toString»«NamePostfix»'''
	}
	
	def dispatch String toSmtLib2(EqualityExpression exp){
		return '''(= «exp.leftOperand.toSmtLib2» «exp.rightOperand.toSmtLib2»)'''
	}
	
	def dispatch String toSmtLib2(AddExpression exp){
		return '''(+«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}
	
	def dispatch String toSmtLib2(MultiplyExpression exp){
		return '''(*«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}
	
		def dispatch String toSmtLib2(DivideExpression exp){
		return '''(/«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}
	
	def dispatch String toSmtLib2(SubtractExpression exp){
		return '''(-«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}
	
	def dispatch String toSmtLib2(UnaryMinusExpression exp){
		return '''(- 0«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}
	
		def dispatch String toSmtLib2(UnaryPlusExpression exp){
		return '''(+ 0«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}
	
	def dispatch String toSmtLib2(IntegerLiteralExpression exp){
		return '''«exp.value.toSmtLib2»'''
	}
	
	def dispatch String toSmtLib2(LessEqualExpression exp){
		return '''(<=«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}
	
	def dispatch String toSmtLib2(GreaterEqualExpression exp){
		return '''(>=«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}
	
	def dispatch String toSmtLib2(LessExpression exp){
		return '''(<«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}
	
	def dispatch String toSmtLib2(GreaterExpression exp){
		return '''(>«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}	
	
	def dispatch String toSmtLib2(AndExpression exp){
		return '''(and«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}
	
	def dispatch String toSmtLib2(OrExpression exp){
		return '''(or«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}
	
	def dispatch String toSmtLib2(ImplyExpression exp){
		return '''(=>«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}
	
	def dispatch String toSmtLib2(NotExpression exp){
		return '''(not«FOR operand : exp.eContents» «operand.toSmtLib2»«ENDFOR»)'''
	}	
	
	def dispatch String toSmtLib2(LocationReferenceExpression exp){
		if(dictionary.containsKey(exp.location)){
			if(NamePostfix.endsWith("_t") || NamePostfix.endsWith("_0"))
			return '''(= mode«NamePostfix.substring(0,NamePostfix.length-2)» «dictionary.get(exp.location)»)'''			
		}
			return '''(false)'''
	}		
	
	def dispatch String toSmtLib2(Expression exp){
		return '''(猫 WTF «exp.class»)'''
	}
	
	def dispatch CharSequence temporalString(TemporalExistsExpression exp){
		return '''E«exp.operand.temporalString»'''
	}
	
	//Release Until Finally Globally Ntxt TemporalExists TemporalForall
	
	def dispatch CharSequence temporalString(TemporalForallExpression exp){
		return '''A«exp.operand.temporalString»'''		
	}
	
	def dispatch CharSequence temporalString(GloballyExpression exp){
		return '''G«exp.operand.temporalString»'''		
	}	

	def dispatch CharSequence temporalString(NextExpression exp){
		return '''N«exp.operand.temporalString»'''		
	}	
	
	def dispatch CharSequence temporalString(FinallyExpression exp){
		return '''F«exp.operand.temporalString»'''		
	}

	def dispatch CharSequence temporalString(Expression exp){
		return ''''''
	}
	
	
}
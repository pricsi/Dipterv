package hu.bme.mit.inf.ttmc.constraint.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.inf.ttmc.constraint.language.services.TTMCConstraintLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTTMCConstraintLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGER", "RULE_DECIMAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'('", "','", "')'", "'{'", "'}'", "':'", "':='", "'const'", "'function'", "'type'", "'natural'", "'integer'", "'boolean'", "'real'", "'array'", "'of'", "'enum'", "'record'", "'tuple'", "'['", "'-'", "'inf'", "'to'", "']'", "'|'", "'if'", "'then'", "'else'", "'equal'", "'imply'", "'or'", "'and'", "'R'", "'U'", "'not'", "'forall'", "'exists'", "'G'", "'F'", "'X'", "'A'", "'E'", "'let'", "'in'", "'='", "'/='", "'>'", "'>='", "'<'", "'<='", "'+'", "'*'", "'/'", "'div'", "'mod'", "'.'", "'!'", "'\\''", "'%'", "'true'", "'false'", "'(#'", "'#)'", "'::'", "'constraint'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int RULE_DECIMAL=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=8;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int RULE_INTEGER=5;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalTTMCConstraintLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTTMCConstraintLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTTMCConstraintLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g"; }



     	private TTMCConstraintLanguageGrammarAccess grammarAccess;
     	
        public InternalTTMCConstraintLanguageParser(TokenStream input, TTMCConstraintLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ConstraintSpecification";	
       	}
       	
       	@Override
       	protected TTMCConstraintLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleConstraintSpecification"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:67:1: entryRuleConstraintSpecification returns [EObject current=null] : iv_ruleConstraintSpecification= ruleConstraintSpecification EOF ;
    public final EObject entryRuleConstraintSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraintSpecification = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:68:2: (iv_ruleConstraintSpecification= ruleConstraintSpecification EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:69:2: iv_ruleConstraintSpecification= ruleConstraintSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstraintSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstraintSpecification_in_entryRuleConstraintSpecification75);
            iv_ruleConstraintSpecification=ruleConstraintSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstraintSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraintSpecification85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraintSpecification"


    // $ANTLR start "ruleConstraintSpecification"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:76:1: ruleConstraintSpecification returns [EObject current=null] : (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_constantDeclarations_9_0= ruleConstantDeclaration ) ) | ( (lv_functionDeclarations_10_0= ruleFunctionDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleConstraintSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_12=null;
        EObject lv_parameterDeclarations_3_0 = null;

        EObject lv_parameterDeclarations_5_0 = null;

        EObject lv_typeDeclarations_8_0 = null;

        EObject lv_constantDeclarations_9_0 = null;

        EObject lv_functionDeclarations_10_0 = null;

        EObject lv_basicConstraintDefinitions_11_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:79:28: ( (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_constantDeclarations_9_0= ruleConstantDeclaration ) ) | ( (lv_functionDeclarations_10_0= ruleFunctionDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) )* otherlv_12= '}' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:80:1: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_constantDeclarations_9_0= ruleConstantDeclaration ) ) | ( (lv_functionDeclarations_10_0= ruleFunctionDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) )* otherlv_12= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:80:1: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_constantDeclarations_9_0= ruleConstantDeclaration ) ) | ( (lv_functionDeclarations_10_0= ruleFunctionDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) )* otherlv_12= '}' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:80:3: otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_constantDeclarations_9_0= ruleConstantDeclaration ) ) | ( (lv_functionDeclarations_10_0= ruleFunctionDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleConstraintSpecification122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstraintSpecificationAccess().getSpecificationKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstraintSpecification139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstraintSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstraintSpecificationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:102:2: (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:102:4: otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConstraintSpecification157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConstraintSpecificationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:106:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_ID) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:106:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            {
                            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:106:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:107:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            {
                            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:107:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:108:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getConstraintSpecificationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleConstraintSpecification179);
                            lv_parameterDeclarations_3_0=ruleParameterDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getConstraintSpecificationRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameterDeclarations",
                                      		lv_parameterDeclarations_3_0, 
                                      		"ParameterDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:124:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==15) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:124:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConstraintSpecification192); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getConstraintSpecificationAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:128:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:129:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    {
                            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:129:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:130:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getConstraintSpecificationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleConstraintSpecification213);
                            	    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getConstraintSpecificationRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameterDeclarations",
                            	              		lv_parameterDeclarations_5_0, 
                            	              		"ParameterDeclaration");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop1;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConstraintSpecification229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getConstraintSpecificationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConstraintSpecification243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getConstraintSpecificationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:154:1: ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_constantDeclarations_9_0= ruleConstantDeclaration ) ) | ( (lv_functionDeclarations_10_0= ruleFunctionDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) )*
            loop4:
            do {
                int alt4=5;
                switch ( input.LA(1) ) {
                case 23:
                    {
                    alt4=1;
                    }
                    break;
                case 21:
                    {
                    alt4=2;
                    }
                    break;
                case 22:
                    {
                    alt4=3;
                    }
                    break;
                case 78:
                    {
                    alt4=4;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:154:2: ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:154:2: ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:155:1: (lv_typeDeclarations_8_0= ruleTypeDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:155:1: (lv_typeDeclarations_8_0= ruleTypeDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:156:3: lv_typeDeclarations_8_0= ruleTypeDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstraintSpecificationAccess().getTypeDeclarationsTypeDeclarationParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeDeclaration_in_ruleConstraintSpecification265);
            	    lv_typeDeclarations_8_0=ruleTypeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstraintSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeDeclarations",
            	              		lv_typeDeclarations_8_0, 
            	              		"TypeDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:173:6: ( (lv_constantDeclarations_9_0= ruleConstantDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:173:6: ( (lv_constantDeclarations_9_0= ruleConstantDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:174:1: (lv_constantDeclarations_9_0= ruleConstantDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:174:1: (lv_constantDeclarations_9_0= ruleConstantDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:175:3: lv_constantDeclarations_9_0= ruleConstantDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstraintSpecificationAccess().getConstantDeclarationsConstantDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleConstantDeclaration_in_ruleConstraintSpecification292);
            	    lv_constantDeclarations_9_0=ruleConstantDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstraintSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constantDeclarations",
            	              		lv_constantDeclarations_9_0, 
            	              		"ConstantDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:192:6: ( (lv_functionDeclarations_10_0= ruleFunctionDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:192:6: ( (lv_functionDeclarations_10_0= ruleFunctionDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:193:1: (lv_functionDeclarations_10_0= ruleFunctionDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:193:1: (lv_functionDeclarations_10_0= ruleFunctionDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:194:3: lv_functionDeclarations_10_0= ruleFunctionDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstraintSpecificationAccess().getFunctionDeclarationsFunctionDeclarationParserRuleCall_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFunctionDeclaration_in_ruleConstraintSpecification319);
            	    lv_functionDeclarations_10_0=ruleFunctionDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstraintSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functionDeclarations",
            	              		lv_functionDeclarations_10_0, 
            	              		"FunctionDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:211:6: ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:211:6: ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:212:1: (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:212:1: (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:213:3: lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstraintSpecificationAccess().getBasicConstraintDefinitionsBasicConstraintDefinitionParserRuleCall_4_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleBasicConstraintDefinition_in_ruleConstraintSpecification346);
            	    lv_basicConstraintDefinitions_11_0=ruleBasicConstraintDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstraintSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"basicConstraintDefinitions",
            	              		lv_basicConstraintDefinitions_11_0, 
            	              		"BasicConstraintDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstraintSpecification360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getConstraintSpecificationAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraintSpecification"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:241:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:242:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:243:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration396);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterDeclaration406); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:250:1: ruleParameterDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:253:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:254:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:254:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:254:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:254:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:255:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterDeclarationAccess().getParameterDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:260:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:261:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:261:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:262:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParameterDeclaration457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getParameterDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleParameterDeclaration474); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParameterDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:282:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:283:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:283:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:284:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleParameterDeclaration495);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRuleFieldDeclaration"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:308:1: entryRuleFieldDeclaration returns [EObject current=null] : iv_ruleFieldDeclaration= ruleFieldDeclaration EOF ;
    public final EObject entryRuleFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:309:2: (iv_ruleFieldDeclaration= ruleFieldDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:310:2: iv_ruleFieldDeclaration= ruleFieldDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldDeclaration_in_entryRuleFieldDeclaration531);
            iv_ruleFieldDeclaration=ruleFieldDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldDeclaration541); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldDeclaration"


    // $ANTLR start "ruleFieldDeclaration"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:317:1: ruleFieldDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:320:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:321:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:321:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:321:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:321:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:322:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFieldDeclarationAccess().getFieldDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:327:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:328:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:328:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:329:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFieldDeclaration592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFieldDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFieldDeclaration609); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFieldDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:349:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:350:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:350:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:351:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFieldDeclaration630);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldDeclaration"


    // $ANTLR start "entryRuleLetDeclaration"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:375:1: entryRuleLetDeclaration returns [EObject current=null] : iv_ruleLetDeclaration= ruleLetDeclaration EOF ;
    public final EObject entryRuleLetDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:376:2: (iv_ruleLetDeclaration= ruleLetDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:377:2: iv_ruleLetDeclaration= ruleLetDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetDeclaration_in_entryRuleLetDeclaration666);
            iv_ruleLetDeclaration=ruleLetDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetDeclaration676); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetDeclaration"


    // $ANTLR start "ruleLetDeclaration"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:384:1: ruleLetDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) ) ;
    public final EObject ruleLetDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:387:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:388:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:388:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:388:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:388:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:389:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLetDeclarationAccess().getLetDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:394:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:395:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:395:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:396:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLetDeclaration727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLetDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLetDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleLetDeclaration744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLetDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:416:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:417:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:417:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:418:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleLetDeclaration765);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLetDeclaration777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetDeclarationAccess().getColonEqualsSignKeyword_4());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:438:1: ( (lv_expression_5_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:439:1: (lv_expression_5_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:439:1: (lv_expression_5_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:440:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetDeclarationAccess().getExpressionExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleLetDeclaration798);
            lv_expression_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetDeclaration"


    // $ANTLR start "entryRuleConstantDeclaration"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:464:1: entryRuleConstantDeclaration returns [EObject current=null] : iv_ruleConstantDeclaration= ruleConstantDeclaration EOF ;
    public final EObject entryRuleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:465:2: (iv_ruleConstantDeclaration= ruleConstantDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:466:2: iv_ruleConstantDeclaration= ruleConstantDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration834);
            iv_ruleConstantDeclaration=ruleConstantDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDeclaration844); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstantDeclaration"


    // $ANTLR start "ruleConstantDeclaration"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:473:1: ruleConstantDeclaration returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ;
    public final EObject ruleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:476:28: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:477:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:477:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )? )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:477:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConstantDeclaration881); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDeclarationAccess().getConstKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:481:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:482:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:482:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:483:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantDeclaration898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getConstantDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getConstantDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConstantDeclaration915); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstantDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:503:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:504:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:504:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:505:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleConstantDeclaration936);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstantDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:521:2: (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:521:4: otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleConstantDeclaration949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConstantDeclarationAccess().getColonEqualsSignKeyword_4_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:525:1: ( (lv_expression_5_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:526:1: (lv_expression_5_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:526:1: (lv_expression_5_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:527:3: lv_expression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantDeclarationAccess().getExpressionExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleConstantDeclaration970);
                    lv_expression_5_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstantDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstantDeclaration"


    // $ANTLR start "entryRuleFunctionDeclaration"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:551:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:552:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:553:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration1008);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionDeclaration1018); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDeclaration"


    // $ANTLR start "ruleFunctionDeclaration"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:560:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )? ) ;
    public final EObject ruleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameterDeclarations_3_0 = null;

        EObject lv_parameterDeclarations_5_0 = null;

        EObject lv_type_8_0 = null;

        EObject lv_expression_10_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:563:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:564:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:564:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )? )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:564:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFunctionDeclaration1055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:568:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:569:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:569:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:570:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFunctionDeclaration1072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getFunctionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:586:2: (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:586:4: otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFunctionDeclaration1090); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:590:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:590:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            {
                            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:590:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:591:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            {
                            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:591:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:592:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration1112);
                            lv_parameterDeclarations_3_0=ruleParameterDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"parameterDeclarations",
                                      		lv_parameterDeclarations_3_0, 
                                      		"ParameterDeclaration");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:608:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==15) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:608:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFunctionDeclaration1125); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:612:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:613:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    {
                            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:613:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:614:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration1146);
                            	    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"parameterDeclarations",
                            	              		lv_parameterDeclarations_5_0, 
                            	              		"ParameterDeclaration");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionDeclaration1162); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFunctionDeclaration1176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFunctionDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:638:1: ( (lv_type_8_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:639:1: (lv_type_8_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:639:1: (lv_type_8_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:640:3: lv_type_8_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getTypeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFunctionDeclaration1197);
            lv_type_8_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_8_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:656:2: (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:656:4: otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) )
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFunctionDeclaration1210); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getFunctionDeclarationAccess().getColonEqualsSignKeyword_5_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:660:1: ( (lv_expression_10_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:661:1: (lv_expression_10_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:661:1: (lv_expression_10_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:662:3: lv_expression_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getExpressionExpressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleFunctionDeclaration1231);
                    lv_expression_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_10_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDeclaration"


    // $ANTLR start "entryRuleType"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:686:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:687:2: (iv_ruleType= ruleType EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:688:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType1269);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType1279); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:695:1: ruleType returns [EObject current=null] : (this_TypeReference_0= ruleTypeReference | this_TypeDefinition_1= ruleTypeDefinition ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_TypeReference_0 = null;

        EObject this_TypeDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:698:28: ( (this_TypeReference_0= ruleTypeReference | this_TypeDefinition_1= ruleTypeDefinition ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:699:1: (this_TypeReference_0= ruleTypeReference | this_TypeDefinition_1= ruleTypeDefinition )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:699:1: (this_TypeReference_0= ruleTypeReference | this_TypeDefinition_1= ruleTypeDefinition )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==17||LA10_0==22||(LA10_0>=24 && LA10_0<=28)||(LA10_0>=30 && LA10_0<=33)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:700:5: this_TypeReference_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_ruleType1326);
                    this_TypeReference_0=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:710:5: this_TypeDefinition_1= ruleTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getTypeDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_ruleType1353);
                    this_TypeDefinition_1=ruleTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TypeDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeDeclaration"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:726:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:727:2: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:728:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration1388);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeDeclaration1398); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDeclaration"


    // $ANTLR start "ruleTypeDeclaration"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:735:1: ruleTypeDeclaration returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:738:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:739:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:739:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:739:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleTypeDeclaration1435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:743:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:744:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:744:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:745:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeDeclaration1452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTypeDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleTypeDeclaration1469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:765:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:766:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:766:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:767:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleTypeDeclaration1490);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_3_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDeclaration"


    // $ANTLR start "entryRuleTypeReference"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:791:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:792:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:793:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_entryRuleTypeReference1526);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeReference1536); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:800:1: ruleTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:803:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:804:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:804:1: ( (otherlv_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:805:1: (otherlv_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:805:1: (otherlv_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:806:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeReference1580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getTypeReferenceAccess().getReferenceTypeDeclarationCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:825:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:826:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:827:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1615);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeDefinition1625); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDefinition"


    // $ANTLR start "ruleTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:834:1: ruleTypeDefinition returns [EObject current=null] : (this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition | this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition | this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition | this_RealTypeDefinition_3= ruleRealTypeDefinition | this_ArrayTypeDefinition_4= ruleArrayTypeDefinition | this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition | this_RecordTypeDefinition_6= ruleRecordTypeDefinition | this_TupleTypeDefinition_7= ruleTupleTypeDefinition | this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition | this_SubTypeDefinition_9= ruleSubTypeDefinition | this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_NaturalTypeDefinition_0 = null;

        EObject this_IntegerTypeDefinition_1 = null;

        EObject this_BooleanTypeDefinition_2 = null;

        EObject this_RealTypeDefinition_3 = null;

        EObject this_ArrayTypeDefinition_4 = null;

        EObject this_EnumerationTypeDefinition_5 = null;

        EObject this_RecordTypeDefinition_6 = null;

        EObject this_TupleTypeDefinition_7 = null;

        EObject this_SubrangeTypeDefinition_8 = null;

        EObject this_SubTypeDefinition_9 = null;

        EObject this_FunctionTypeDefinition_10 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:837:28: ( (this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition | this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition | this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition | this_RealTypeDefinition_3= ruleRealTypeDefinition | this_ArrayTypeDefinition_4= ruleArrayTypeDefinition | this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition | this_RecordTypeDefinition_6= ruleRecordTypeDefinition | this_TupleTypeDefinition_7= ruleTupleTypeDefinition | this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition | this_SubTypeDefinition_9= ruleSubTypeDefinition | this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:838:1: (this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition | this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition | this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition | this_RealTypeDefinition_3= ruleRealTypeDefinition | this_ArrayTypeDefinition_4= ruleArrayTypeDefinition | this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition | this_RecordTypeDefinition_6= ruleRecordTypeDefinition | this_TupleTypeDefinition_7= ruleTupleTypeDefinition | this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition | this_SubTypeDefinition_9= ruleSubTypeDefinition | this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:838:1: (this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition | this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition | this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition | this_RealTypeDefinition_3= ruleRealTypeDefinition | this_ArrayTypeDefinition_4= ruleArrayTypeDefinition | this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition | this_RecordTypeDefinition_6= ruleRecordTypeDefinition | this_TupleTypeDefinition_7= ruleTupleTypeDefinition | this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition | this_SubTypeDefinition_9= ruleSubTypeDefinition | this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition )
            int alt11=11;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt11=1;
                }
                break;
            case 25:
                {
                alt11=2;
                }
                break;
            case 26:
                {
                alt11=3;
                }
                break;
            case 27:
                {
                alt11=4;
                }
                break;
            case 28:
                {
                alt11=5;
                }
                break;
            case 30:
                {
                alt11=6;
                }
                break;
            case 31:
                {
                alt11=7;
                }
                break;
            case 32:
                {
                alt11=8;
                }
                break;
            case 33:
                {
                alt11=9;
                }
                break;
            case 17:
                {
                alt11=10;
                }
                break;
            case 22:
                {
                alt11=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:839:5: this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getNaturalTypeDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNaturalTypeDefinition_in_ruleTypeDefinition1672);
                    this_NaturalTypeDefinition_0=ruleNaturalTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NaturalTypeDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:849:5: this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getIntegerTypeDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerTypeDefinition_in_ruleTypeDefinition1699);
                    this_IntegerTypeDefinition_1=ruleIntegerTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerTypeDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:859:5: this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getBooleanTypeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanTypeDefinition_in_ruleTypeDefinition1726);
                    this_BooleanTypeDefinition_2=ruleBooleanTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanTypeDefinition_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:869:5: this_RealTypeDefinition_3= ruleRealTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getRealTypeDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRealTypeDefinition_in_ruleTypeDefinition1753);
                    this_RealTypeDefinition_3=ruleRealTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RealTypeDefinition_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:879:5: this_ArrayTypeDefinition_4= ruleArrayTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getArrayTypeDefinitionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArrayTypeDefinition_in_ruleTypeDefinition1780);
                    this_ArrayTypeDefinition_4=ruleArrayTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayTypeDefinition_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:889:5: this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumerationTypeDefinitionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerationTypeDefinition_in_ruleTypeDefinition1807);
                    this_EnumerationTypeDefinition_5=ruleEnumerationTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumerationTypeDefinition_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:899:5: this_RecordTypeDefinition_6= ruleRecordTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getRecordTypeDefinitionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRecordTypeDefinition_in_ruleTypeDefinition1834);
                    this_RecordTypeDefinition_6=ruleRecordTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RecordTypeDefinition_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:909:5: this_TupleTypeDefinition_7= ruleTupleTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTupleTypeDefinitionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleTypeDefinition_in_ruleTypeDefinition1861);
                    this_TupleTypeDefinition_7=ruleTupleTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleTypeDefinition_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:919:5: this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSubrangeTypeDefinitionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangeTypeDefinition_in_ruleTypeDefinition1888);
                    this_SubrangeTypeDefinition_8=ruleSubrangeTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubrangeTypeDefinition_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:929:5: this_SubTypeDefinition_9= ruleSubTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSubTypeDefinitionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubTypeDefinition_in_ruleTypeDefinition1915);
                    this_SubTypeDefinition_9=ruleSubTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SubTypeDefinition_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:939:5: this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getFunctionTypeDefinitionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionTypeDefinition_in_ruleTypeDefinition1942);
                    this_FunctionTypeDefinition_10=ruleFunctionTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionTypeDefinition_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleNaturalTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:955:1: entryRuleNaturalTypeDefinition returns [EObject current=null] : iv_ruleNaturalTypeDefinition= ruleNaturalTypeDefinition EOF ;
    public final EObject entryRuleNaturalTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:956:2: (iv_ruleNaturalTypeDefinition= ruleNaturalTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:957:2: iv_ruleNaturalTypeDefinition= ruleNaturalTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNaturalTypeDefinition_in_entryRuleNaturalTypeDefinition1977);
            iv_ruleNaturalTypeDefinition=ruleNaturalTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNaturalTypeDefinition1987); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNaturalTypeDefinition"


    // $ANTLR start "ruleNaturalTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:964:1: ruleNaturalTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'natural' ) ;
    public final EObject ruleNaturalTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:967:28: ( ( () otherlv_1= 'natural' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:968:1: ( () otherlv_1= 'natural' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:968:1: ( () otherlv_1= 'natural' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:968:2: () otherlv_1= 'natural'
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:968:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:969:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalTypeDefinitionAccess().getNaturalTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleNaturalTypeDefinition2033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalTypeDefinitionAccess().getNaturalKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNaturalTypeDefinition"


    // $ANTLR start "entryRuleIntegerTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:986:1: entryRuleIntegerTypeDefinition returns [EObject current=null] : iv_ruleIntegerTypeDefinition= ruleIntegerTypeDefinition EOF ;
    public final EObject entryRuleIntegerTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:987:2: (iv_ruleIntegerTypeDefinition= ruleIntegerTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:988:2: iv_ruleIntegerTypeDefinition= ruleIntegerTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntegerTypeDefinition_in_entryRuleIntegerTypeDefinition2069);
            iv_ruleIntegerTypeDefinition=ruleIntegerTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerTypeDefinition2079); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerTypeDefinition"


    // $ANTLR start "ruleIntegerTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:995:1: ruleIntegerTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'integer' ) ;
    public final EObject ruleIntegerTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:998:28: ( ( () otherlv_1= 'integer' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:999:1: ( () otherlv_1= 'integer' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:999:1: ( () otherlv_1= 'integer' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:999:2: () otherlv_1= 'integer'
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:999:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1000:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntegerTypeDefinitionAccess().getIntegerTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleIntegerTypeDefinition2125); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIntegerTypeDefinitionAccess().getIntegerKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerTypeDefinition"


    // $ANTLR start "entryRuleBooleanTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1017:1: entryRuleBooleanTypeDefinition returns [EObject current=null] : iv_ruleBooleanTypeDefinition= ruleBooleanTypeDefinition EOF ;
    public final EObject entryRuleBooleanTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1018:2: (iv_ruleBooleanTypeDefinition= ruleBooleanTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1019:2: iv_ruleBooleanTypeDefinition= ruleBooleanTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanTypeDefinition_in_entryRuleBooleanTypeDefinition2161);
            iv_ruleBooleanTypeDefinition=ruleBooleanTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanTypeDefinition2171); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanTypeDefinition"


    // $ANTLR start "ruleBooleanTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1026:1: ruleBooleanTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'boolean' ) ;
    public final EObject ruleBooleanTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1029:28: ( ( () otherlv_1= 'boolean' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1030:1: ( () otherlv_1= 'boolean' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1030:1: ( () otherlv_1= 'boolean' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1030:2: () otherlv_1= 'boolean'
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1030:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1031:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanTypeDefinitionAccess().getBooleanTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleBooleanTypeDefinition2217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBooleanTypeDefinitionAccess().getBooleanKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanTypeDefinition"


    // $ANTLR start "entryRuleRealTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1048:1: entryRuleRealTypeDefinition returns [EObject current=null] : iv_ruleRealTypeDefinition= ruleRealTypeDefinition EOF ;
    public final EObject entryRuleRealTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1049:2: (iv_ruleRealTypeDefinition= ruleRealTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1050:2: iv_ruleRealTypeDefinition= ruleRealTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRealTypeDefinition_in_entryRuleRealTypeDefinition2253);
            iv_ruleRealTypeDefinition=ruleRealTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRealTypeDefinition2263); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealTypeDefinition"


    // $ANTLR start "ruleRealTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1057:1: ruleRealTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'real' ) ;
    public final EObject ruleRealTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1060:28: ( ( () otherlv_1= 'real' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1061:1: ( () otherlv_1= 'real' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1061:1: ( () otherlv_1= 'real' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1061:2: () otherlv_1= 'real'
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1061:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1062:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealTypeDefinitionAccess().getRealTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleRealTypeDefinition2309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRealTypeDefinitionAccess().getRealKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealTypeDefinition"


    // $ANTLR start "entryRuleArrayTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1079:1: entryRuleArrayTypeDefinition returns [EObject current=null] : iv_ruleArrayTypeDefinition= ruleArrayTypeDefinition EOF ;
    public final EObject entryRuleArrayTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1080:2: (iv_ruleArrayTypeDefinition= ruleArrayTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1081:2: iv_ruleArrayTypeDefinition= ruleArrayTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArrayTypeDefinition_in_entryRuleArrayTypeDefinition2345);
            iv_ruleArrayTypeDefinition=ruleArrayTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayTypeDefinition2355); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayTypeDefinition"


    // $ANTLR start "ruleArrayTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1088:1: ruleArrayTypeDefinition returns [EObject current=null] : (otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) ) ) ;
    public final EObject ruleArrayTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_indexTypes_1_0 = null;

        EObject lv_indexTypes_3_0 = null;

        EObject lv_elementType_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1091:28: ( (otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1092:1: (otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1092:1: (otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1092:3: otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleArrayTypeDefinition2392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayTypeDefinitionAccess().getArrayKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1096:1: ( (lv_indexTypes_1_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1097:1: (lv_indexTypes_1_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1097:1: (lv_indexTypes_1_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1098:3: lv_indexTypes_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefinitionAccess().getIndexTypesTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleArrayTypeDefinition2413);
            lv_indexTypes_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayTypeDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"indexTypes",
                      		lv_indexTypes_1_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1114:2: (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1114:4: otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArrayTypeDefinition2426); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayTypeDefinitionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1118:1: ( (lv_indexTypes_3_0= ruleType ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1119:1: (lv_indexTypes_3_0= ruleType )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1119:1: (lv_indexTypes_3_0= ruleType )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1120:3: lv_indexTypes_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayTypeDefinitionAccess().getIndexTypesTypeParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleArrayTypeDefinition2447);
            	    lv_indexTypes_3_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArrayTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"indexTypes",
            	              		lv_indexTypes_3_0, 
            	              		"Type");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleArrayTypeDefinition2461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayTypeDefinitionAccess().getOfKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1140:1: ( (lv_elementType_5_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1141:1: (lv_elementType_5_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1141:1: (lv_elementType_5_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1142:3: lv_elementType_5_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefinitionAccess().getElementTypeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleArrayTypeDefinition2482);
            lv_elementType_5_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayTypeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"elementType",
                      		lv_elementType_5_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayTypeDefinition"


    // $ANTLR start "entryRuleEnumerationTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1166:1: entryRuleEnumerationTypeDefinition returns [EObject current=null] : iv_ruleEnumerationTypeDefinition= ruleEnumerationTypeDefinition EOF ;
    public final EObject entryRuleEnumerationTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1167:2: (iv_ruleEnumerationTypeDefinition= ruleEnumerationTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1168:2: iv_ruleEnumerationTypeDefinition= ruleEnumerationTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationTypeDefinition_in_entryRuleEnumerationTypeDefinition2518);
            iv_ruleEnumerationTypeDefinition=ruleEnumerationTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationTypeDefinition2528); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationTypeDefinition"


    // $ANTLR start "ruleEnumerationTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1175:1: ruleEnumerationTypeDefinition returns [EObject current=null] : (otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleEnumerationTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_literals_2_0 = null;

        EObject lv_literals_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1178:28: ( (otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1179:1: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1179:1: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1179:3: otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleEnumerationTypeDefinition2565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeDefinitionAccess().getEnumKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEnumerationTypeDefinition2577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumerationTypeDefinitionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1187:1: ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1188:1: (lv_literals_2_0= ruleEnumerationLiteralDefinition )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1188:1: (lv_literals_2_0= ruleEnumerationLiteralDefinition )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1189:3: lv_literals_2_0= ruleEnumerationLiteralDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerationTypeDefinitionAccess().getLiteralsEnumerationLiteralDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralDefinition_in_ruleEnumerationTypeDefinition2598);
            lv_literals_2_0=ruleEnumerationLiteralDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumerationTypeDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"literals",
                      		lv_literals_2_0, 
                      		"EnumerationLiteralDefinition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1205:2: (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1205:4: otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEnumerationTypeDefinition2611); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEnumerationTypeDefinitionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1209:1: ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1210:1: (lv_literals_4_0= ruleEnumerationLiteralDefinition )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1210:1: (lv_literals_4_0= ruleEnumerationLiteralDefinition )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1211:3: lv_literals_4_0= ruleEnumerationLiteralDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationTypeDefinitionAccess().getLiteralsEnumerationLiteralDefinitionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralDefinition_in_ruleEnumerationTypeDefinition2632);
            	    lv_literals_4_0=ruleEnumerationLiteralDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumerationTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"literals",
            	              		lv_literals_4_0, 
            	              		"EnumerationLiteralDefinition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnumerationTypeDefinition2646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEnumerationTypeDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationTypeDefinition"


    // $ANTLR start "entryRuleEnumerationLiteralDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1239:1: entryRuleEnumerationLiteralDefinition returns [EObject current=null] : iv_ruleEnumerationLiteralDefinition= ruleEnumerationLiteralDefinition EOF ;
    public final EObject entryRuleEnumerationLiteralDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteralDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1240:2: (iv_ruleEnumerationLiteralDefinition= ruleEnumerationLiteralDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1241:2: iv_ruleEnumerationLiteralDefinition= ruleEnumerationLiteralDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralDefinition_in_entryRuleEnumerationLiteralDefinition2682);
            iv_ruleEnumerationLiteralDefinition=ruleEnumerationLiteralDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteralDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationLiteralDefinition2692); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteralDefinition"


    // $ANTLR start "ruleEnumerationLiteralDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1248:1: ruleEnumerationLiteralDefinition returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumerationLiteralDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1251:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1252:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1252:1: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1253:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1253:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1254:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumerationLiteralDefinition2733); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getEnumerationLiteralDefinitionAccess().getNameIDTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationLiteralDefinitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteralDefinition"


    // $ANTLR start "entryRuleRecordTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1278:1: entryRuleRecordTypeDefinition returns [EObject current=null] : iv_ruleRecordTypeDefinition= ruleRecordTypeDefinition EOF ;
    public final EObject entryRuleRecordTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1279:2: (iv_ruleRecordTypeDefinition= ruleRecordTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1280:2: iv_ruleRecordTypeDefinition= ruleRecordTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRecordTypeDefinition_in_entryRuleRecordTypeDefinition2773);
            iv_ruleRecordTypeDefinition=ruleRecordTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecordTypeDefinition2783); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordTypeDefinition"


    // $ANTLR start "ruleRecordTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1287:1: ruleRecordTypeDefinition returns [EObject current=null] : (otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleRecordTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_fieldDeclarations_2_0 = null;

        EObject lv_fieldDeclarations_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1290:28: ( (otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1291:1: (otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1291:1: (otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1291:3: otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleRecordTypeDefinition2820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordTypeDefinitionAccess().getRecordKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRecordTypeDefinition2832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRecordTypeDefinitionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1299:1: ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1300:1: (lv_fieldDeclarations_2_0= ruleFieldDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1300:1: (lv_fieldDeclarations_2_0= ruleFieldDeclaration )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1301:3: lv_fieldDeclarations_2_0= ruleFieldDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecordTypeDefinitionAccess().getFieldDeclarationsFieldDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldDeclaration_in_ruleRecordTypeDefinition2853);
            lv_fieldDeclarations_2_0=ruleFieldDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRecordTypeDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"fieldDeclarations",
                      		lv_fieldDeclarations_2_0, 
                      		"FieldDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1317:2: (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1317:4: otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRecordTypeDefinition2866); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRecordTypeDefinitionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1321:1: ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1322:1: (lv_fieldDeclarations_4_0= ruleFieldDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1322:1: (lv_fieldDeclarations_4_0= ruleFieldDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1323:3: lv_fieldDeclarations_4_0= ruleFieldDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordTypeDefinitionAccess().getFieldDeclarationsFieldDeclarationParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFieldDeclaration_in_ruleRecordTypeDefinition2887);
            	    lv_fieldDeclarations_4_0=ruleFieldDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRecordTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fieldDeclarations",
            	              		lv_fieldDeclarations_4_0, 
            	              		"FieldDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRecordTypeDefinition2901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getRecordTypeDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordTypeDefinition"


    // $ANTLR start "entryRuleTupleTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1351:1: entryRuleTupleTypeDefinition returns [EObject current=null] : iv_ruleTupleTypeDefinition= ruleTupleTypeDefinition EOF ;
    public final EObject entryRuleTupleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1352:2: (iv_ruleTupleTypeDefinition= ruleTupleTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1353:2: iv_ruleTupleTypeDefinition= ruleTupleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeDefinition_in_entryRuleTupleTypeDefinition2937);
            iv_ruleTupleTypeDefinition=ruleTupleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeDefinition2947); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleTypeDefinition"


    // $ANTLR start "ruleTupleTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1360:1: ruleTupleTypeDefinition returns [EObject current=null] : (otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_types_2_0 = null;

        EObject lv_types_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1363:28: ( (otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1364:1: (otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1364:1: (otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1364:3: otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTupleTypeDefinition2984); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleTypeDefinitionAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTupleTypeDefinition2996); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleTypeDefinitionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1372:1: ( (lv_types_2_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1373:1: (lv_types_2_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1373:1: (lv_types_2_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1374:3: lv_types_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleTypeDefinitionAccess().getTypesTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleTupleTypeDefinition3017);
            lv_types_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleTypeDefinitionRule());
              	        }
                     		add(
                     			current, 
                     			"types",
                      		lv_types_2_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1390:2: (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1390:4: otherlv_3= ',' ( (lv_types_4_0= ruleType ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTupleTypeDefinition3030); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeDefinitionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1394:1: ( (lv_types_4_0= ruleType ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1395:1: (lv_types_4_0= ruleType )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1395:1: (lv_types_4_0= ruleType )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1396:3: lv_types_4_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleTypeDefinitionAccess().getTypesTypeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleTupleTypeDefinition3051);
            	    lv_types_4_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTupleTypeDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"types",
            	              		lv_types_4_0, 
            	              		"Type");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTupleTypeDefinition3065); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTupleTypeDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleTypeDefinition"


    // $ANTLR start "entryRuleSubrangeTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1424:1: entryRuleSubrangeTypeDefinition returns [EObject current=null] : iv_ruleSubrangeTypeDefinition= ruleSubrangeTypeDefinition EOF ;
    public final EObject entryRuleSubrangeTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangeTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1425:2: (iv_ruleSubrangeTypeDefinition= ruleSubrangeTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1426:2: iv_ruleSubrangeTypeDefinition= ruleSubrangeTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubrangeTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubrangeTypeDefinition_in_entryRuleSubrangeTypeDefinition3101);
            iv_ruleSubrangeTypeDefinition=ruleSubrangeTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubrangeTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangeTypeDefinition3111); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubrangeTypeDefinition"


    // $ANTLR start "ruleSubrangeTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1433:1: ruleSubrangeTypeDefinition returns [EObject current=null] : ( () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']' ) ;
    public final EObject ruleSubrangeTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_lowerBound_4_0 = null;

        EObject lv_upperBound_7_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1436:28: ( ( () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1437:1: ( () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1437:1: ( () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1437:2: () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']'
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1437:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1438:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubrangeTypeDefinitionAccess().getSubrangeTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleSubrangeTypeDefinition3157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubrangeTypeDefinitionAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1447:1: ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>=RULE_ID && LA16_1<=RULE_DECIMAL)||LA16_1==14||(LA16_1>=33 && LA16_1<=34)||LA16_1==64||(LA16_1>=73 && LA16_1<=75)||LA16_1==77) ) {
                    alt16=2;
                }
                else if ( (LA16_1==35) ) {
                    alt16=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_DECIMAL)||LA16_0==14||LA16_0==22||LA16_0==33||LA16_0==39||(LA16_0>=48 && LA16_0<=56)||LA16_0==64||(LA16_0>=73 && LA16_0<=75)||LA16_0==77) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1447:2: (otherlv_2= '-' otherlv_3= 'inf' )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1447:2: (otherlv_2= '-' otherlv_3= 'inf' )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1447:4: otherlv_2= '-' otherlv_3= 'inf'
                    {
                    otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSubrangeTypeDefinition3171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSubrangeTypeDefinitionAccess().getHyphenMinusKeyword_2_0_0());
                          
                    }
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSubrangeTypeDefinition3183); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSubrangeTypeDefinitionAccess().getInfKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1456:6: ( (lv_lowerBound_4_0= ruleExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1456:6: ( (lv_lowerBound_4_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1457:1: (lv_lowerBound_4_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1457:1: (lv_lowerBound_4_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1458:3: lv_lowerBound_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubrangeTypeDefinitionAccess().getLowerBoundExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSubrangeTypeDefinition3211);
                    lv_lowerBound_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubrangeTypeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"lowerBound",
                              		lv_lowerBound_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleSubrangeTypeDefinition3224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSubrangeTypeDefinitionAccess().getToKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1478:1: (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_DECIMAL)||LA17_0==14||LA17_0==22||(LA17_0>=33 && LA17_0<=34)||LA17_0==39||(LA17_0>=48 && LA17_0<=56)||LA17_0==64||(LA17_0>=73 && LA17_0<=75)||LA17_0==77) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1478:3: otherlv_6= 'inf'
                    {
                    otherlv_6=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleSubrangeTypeDefinition3237); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSubrangeTypeDefinitionAccess().getInfKeyword_4_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1483:6: ( (lv_upperBound_7_0= ruleExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1483:6: ( (lv_upperBound_7_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1484:1: (lv_upperBound_7_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1484:1: (lv_upperBound_7_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1485:3: lv_upperBound_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubrangeTypeDefinitionAccess().getUpperBoundExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSubrangeTypeDefinition3264);
                    lv_upperBound_7_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubrangeTypeDefinitionRule());
                      	        }
                             		set(
                             			current, 
                             			"upperBound",
                              		lv_upperBound_7_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleSubrangeTypeDefinition3277); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSubrangeTypeDefinitionAccess().getRightSquareBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubrangeTypeDefinition"


    // $ANTLR start "entryRuleSubTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1513:1: entryRuleSubTypeDefinition returns [EObject current=null] : iv_ruleSubTypeDefinition= ruleSubTypeDefinition EOF ;
    public final EObject entryRuleSubTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1514:2: (iv_ruleSubTypeDefinition= ruleSubTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1515:2: iv_ruleSubTypeDefinition= ruleSubTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubTypeDefinition_in_entryRuleSubTypeDefinition3313);
            iv_ruleSubTypeDefinition=ruleSubTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubTypeDefinition3323); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubTypeDefinition"


    // $ANTLR start "ruleSubTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1522:1: ruleSubTypeDefinition returns [EObject current=null] : (otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleSubTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDeclaration_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1525:28: ( (otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1526:1: (otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1526:1: (otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1526:3: otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSubTypeDefinition3360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSubTypeDefinitionAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1530:1: ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1531:1: (lv_parameterDeclaration_1_0= ruleParameterDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1531:1: (lv_parameterDeclaration_1_0= ruleParameterDeclaration )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1532:3: lv_parameterDeclaration_1_0= ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubTypeDefinitionAccess().getParameterDeclarationParameterDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleSubTypeDefinition3381);
            lv_parameterDeclaration_1_0=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSubTypeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"parameterDeclaration",
                      		lv_parameterDeclaration_1_0, 
                      		"ParameterDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleSubTypeDefinition3393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSubTypeDefinitionAccess().getVerticalLineKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1552:1: ( (lv_expression_3_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1553:1: (lv_expression_3_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1553:1: (lv_expression_3_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1554:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubTypeDefinitionAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSubTypeDefinition3414);
            lv_expression_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSubTypeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_3_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSubTypeDefinition3426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSubTypeDefinitionAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubTypeDefinition"


    // $ANTLR start "entryRuleFunctionTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1582:1: entryRuleFunctionTypeDefinition returns [EObject current=null] : iv_ruleFunctionTypeDefinition= ruleFunctionTypeDefinition EOF ;
    public final EObject entryRuleFunctionTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1583:2: (iv_ruleFunctionTypeDefinition= ruleFunctionTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1584:2: iv_ruleFunctionTypeDefinition= ruleFunctionTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionTypeDefinition_in_entryRuleFunctionTypeDefinition3462);
            iv_ruleFunctionTypeDefinition=ruleFunctionTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionTypeDefinition3472); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionTypeDefinition"


    // $ANTLR start "ruleFunctionTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1591:1: ruleFunctionTypeDefinition returns [EObject current=null] : (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) ) ) ;
    public final EObject ruleFunctionTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_parameterTypes_2_0 = null;

        EObject lv_parameterTypes_4_0 = null;

        EObject lv_returnType_7_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1594:28: ( (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1595:1: (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1595:1: (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1595:3: otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFunctionTypeDefinition3509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionTypeDefinitionAccess().getFunctionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFunctionTypeDefinition3521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionTypeDefinitionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1603:1: ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID||LA19_0==17||LA19_0==22||(LA19_0>=24 && LA19_0<=28)||(LA19_0>=30 && LA19_0<=33)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1603:2: ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1603:2: ( (lv_parameterTypes_2_0= ruleType ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1604:1: (lv_parameterTypes_2_0= ruleType )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1604:1: (lv_parameterTypes_2_0= ruleType )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1605:3: lv_parameterTypes_2_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionTypeDefinitionAccess().getParameterTypesTypeParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFunctionTypeDefinition3543);
                    lv_parameterTypes_2_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionTypeDefinitionRule());
                      	        }
                             		add(
                             			current, 
                             			"parameterTypes",
                              		lv_parameterTypes_2_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1621:2: (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1621:4: otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFunctionTypeDefinition3556); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getFunctionTypeDefinitionAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1625:1: ( (lv_parameterTypes_4_0= ruleType ) )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1626:1: (lv_parameterTypes_4_0= ruleType )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1626:1: (lv_parameterTypes_4_0= ruleType )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1627:3: lv_parameterTypes_4_0= ruleType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionTypeDefinitionAccess().getParameterTypesTypeParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFunctionTypeDefinition3577);
                    	    lv_parameterTypes_4_0=ruleType();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionTypeDefinitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameterTypes",
                    	              		lv_parameterTypes_4_0, 
                    	              		"Type");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionTypeDefinition3593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFunctionTypeDefinitionAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_6=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFunctionTypeDefinition3605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionTypeDefinitionAccess().getColonKeyword_4());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1651:1: ( (lv_returnType_7_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1652:1: (lv_returnType_7_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1652:1: (lv_returnType_7_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1653:3: lv_returnType_7_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionTypeDefinitionAccess().getReturnTypeTypeParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFunctionTypeDefinition3626);
            lv_returnType_7_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionTypeDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_7_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionTypeDefinition"


    // $ANTLR start "entryRuleExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1677:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1678:2: (iv_ruleExpression= ruleExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1679:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression3662);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression3672); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1686:1: ruleExpression returns [EObject current=null] : this_IfThenElseExpression_0= ruleIfThenElseExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfThenElseExpression_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1689:28: (this_IfThenElseExpression_0= ruleIfThenElseExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1691:5: this_IfThenElseExpression_0= ruleIfThenElseExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getIfThenElseExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfThenElseExpression_in_ruleExpression3718);
            this_IfThenElseExpression_0=ruleIfThenElseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_IfThenElseExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleIfThenElseExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1707:1: entryRuleIfThenElseExpression returns [EObject current=null] : iv_ruleIfThenElseExpression= ruleIfThenElseExpression EOF ;
    public final EObject entryRuleIfThenElseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElseExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1708:2: (iv_ruleIfThenElseExpression= ruleIfThenElseExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1709:2: iv_ruleIfThenElseExpression= ruleIfThenElseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfThenElseExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfThenElseExpression_in_entryRuleIfThenElseExpression3752);
            iv_ruleIfThenElseExpression=ruleIfThenElseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfThenElseExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfThenElseExpression3762); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfThenElseExpression"


    // $ANTLR start "ruleIfThenElseExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1716:1: ruleIfThenElseExpression returns [EObject current=null] : ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) ) | this_EqualExpression_7= ruleEqualExpression ) ;
    public final EObject ruleIfThenElseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_else_6_0 = null;

        EObject this_EqualExpression_7 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1719:28: ( ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) ) | this_EqualExpression_7= ruleEqualExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1720:1: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) ) | this_EqualExpression_7= ruleEqualExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1720:1: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) ) | this_EqualExpression_7= ruleEqualExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_DECIMAL)||LA20_0==14||LA20_0==22||(LA20_0>=33 && LA20_0<=34)||(LA20_0>=48 && LA20_0<=56)||LA20_0==64||(LA20_0>=73 && LA20_0<=75)||LA20_0==77) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1720:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1720:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1720:3: () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1720:3: ()
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1721:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getIfThenElseExpressionAccess().getIfThenElseExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleIfThenElseExpression3809); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIfThenElseExpressionAccess().getIfKeyword_0_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1730:1: ( (lv_condition_2_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1731:1: (lv_condition_2_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1731:1: (lv_condition_2_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1732:3: lv_condition_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseExpressionAccess().getConditionExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfThenElseExpression3830);
                    lv_condition_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfThenElseExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_2_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleIfThenElseExpression3842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIfThenElseExpressionAccess().getThenKeyword_0_3());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1752:1: ( (lv_then_4_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1753:1: (lv_then_4_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1753:1: (lv_then_4_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1754:3: lv_then_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseExpressionAccess().getThenExpressionParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfThenElseExpression3863);
                    lv_then_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfThenElseExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"then",
                              		lv_then_4_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1770:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1770:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1770:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1770:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleIfThenElseExpression3884); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfThenElseExpressionAccess().getElseKeyword_0_5_0());
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1775:2: ( (lv_else_6_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1776:1: (lv_else_6_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1776:1: (lv_else_6_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1777:3: lv_else_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseExpressionAccess().getElseExpressionParserRuleCall_0_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfThenElseExpression3906);
                    lv_else_6_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfThenElseExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_6_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1795:5: this_EqualExpression_7= ruleEqualExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIfThenElseExpressionAccess().getEqualExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleIfThenElseExpression3936);
                    this_EqualExpression_7=ruleEqualExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EqualExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfThenElseExpression"


    // $ANTLR start "entryRuleEqualExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1811:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1812:2: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1813:2: iv_ruleEqualExpression= ruleEqualExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression3971);
            iv_ruleEqualExpression=ruleEqualExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression3981); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualExpression"


    // $ANTLR start "ruleEqualExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1820:1: ruleEqualExpression returns [EObject current=null] : (this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )? ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ImplyExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1823:28: ( (this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1824:1: (this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1824:1: (this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )? )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1825:5: this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualExpressionAccess().getImplyExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleImplyExpression_in_ruleEqualExpression4028);
            this_ImplyExpression_0=ruleImplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ImplyExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1833:1: ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1833:2: () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1833:2: ()
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1834:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEqualExpressionAccess().getEqualExpressionLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleEqualExpression4049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEqualExpressionAccess().getEqualKeyword_1_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1843:1: ( (lv_rightOperand_3_0= ruleEqualExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1844:1: (lv_rightOperand_3_0= ruleEqualExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1844:1: (lv_rightOperand_3_0= ruleEqualExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1845:3: lv_rightOperand_3_0= ruleEqualExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualExpressionAccess().getRightOperandEqualExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleEqualExpression4070);
                    lv_rightOperand_3_0=ruleEqualExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEqualExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_3_0, 
                              		"EqualExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualExpression"


    // $ANTLR start "entryRuleImplyExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1869:1: entryRuleImplyExpression returns [EObject current=null] : iv_ruleImplyExpression= ruleImplyExpression EOF ;
    public final EObject entryRuleImplyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplyExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1870:2: (iv_ruleImplyExpression= ruleImplyExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1871:2: iv_ruleImplyExpression= ruleImplyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImplyExpression_in_entryRuleImplyExpression4108);
            iv_ruleImplyExpression=ruleImplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplyExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplyExpression4118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplyExpression"


    // $ANTLR start "ruleImplyExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1878:1: ruleImplyExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )? ) ;
    public final EObject ruleImplyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1881:28: ( (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1882:1: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1882:1: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )? )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1883:5: this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplyExpressionAccess().getOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleImplyExpression4165);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1891:1: ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1891:2: () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1891:2: ()
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1892:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImplyExpressionAccess().getImplyExpressionLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleImplyExpression4186); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImplyExpressionAccess().getImplyKeyword_1_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1901:1: ( (lv_rightOperand_3_0= ruleImplyExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1902:1: (lv_rightOperand_3_0= ruleImplyExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1902:1: (lv_rightOperand_3_0= ruleImplyExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1903:3: lv_rightOperand_3_0= ruleImplyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplyExpressionAccess().getRightOperandImplyExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleImplyExpression_in_ruleImplyExpression4207);
                    lv_rightOperand_3_0=ruleImplyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_3_0, 
                              		"ImplyExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplyExpression"


    // $ANTLR start "entryRuleOrExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1927:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1928:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1929:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression4245);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression4255); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpression"


    // $ANTLR start "ruleOrExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1936:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_operands_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1939:28: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )? ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1940:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )? )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1940:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )? )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1941:5: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression4302);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1949:1: ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1949:2: () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1949:2: ()
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1950:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getOrExpressionAccess().getOrExpressionOperandsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1955:2: (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==44) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1955:4: otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleOrExpression4324); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1959:1: ( (lv_operands_3_0= ruleAndExpression ) )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1960:1: (lv_operands_3_0= ruleAndExpression )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1960:1: (lv_operands_3_0= ruleAndExpression )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1961:3: lv_operands_3_0= ruleAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getOperandsAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression4345);
                    	    lv_operands_3_0=ruleAndExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getOrExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"operands",
                    	              		lv_operands_3_0, 
                    	              		"AndExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpression"


    // $ANTLR start "entryRuleAndExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1985:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1986:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1987:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression4385);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression4395); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1994:1: ruleAndExpression returns [EObject current=null] : (this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ReleaseExpression_0 = null;

        EObject lv_operands_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1997:28: ( (this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )? ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1998:1: (this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )? )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1998:1: (this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )? )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:1999:5: this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getReleaseExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleReleaseExpression_in_ruleAndExpression4442);
            this_ReleaseExpression_0=ruleReleaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ReleaseExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2007:1: ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2007:2: () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2007:2: ()
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2008:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getAndExpressionAccess().getAndExpressionOperandsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2013:2: (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==45) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2013:4: otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleAndExpression4464); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2017:1: ( (lv_operands_3_0= ruleReleaseExpression ) )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2018:1: (lv_operands_3_0= ruleReleaseExpression )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2018:1: (lv_operands_3_0= ruleReleaseExpression )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2019:3: lv_operands_3_0= ruleReleaseExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getOperandsReleaseExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleReleaseExpression_in_ruleAndExpression4485);
                    	    lv_operands_3_0=ruleReleaseExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getAndExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"operands",
                    	              		lv_operands_3_0, 
                    	              		"ReleaseExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt25 >= 1 ) break loop25;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(25, input);
                                throw eee;
                        }
                        cnt25++;
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleReleaseExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2043:1: entryRuleReleaseExpression returns [EObject current=null] : iv_ruleReleaseExpression= ruleReleaseExpression EOF ;
    public final EObject entryRuleReleaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReleaseExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2044:2: (iv_ruleReleaseExpression= ruleReleaseExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2045:2: iv_ruleReleaseExpression= ruleReleaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReleaseExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleReleaseExpression_in_entryRuleReleaseExpression4525);
            iv_ruleReleaseExpression=ruleReleaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReleaseExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReleaseExpression4535); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReleaseExpression"


    // $ANTLR start "ruleReleaseExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2052:1: ruleReleaseExpression returns [EObject current=null] : (this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )* ) ;
    public final EObject ruleReleaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UntilExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2055:28: ( (this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2056:1: (this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2056:1: (this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )* )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2057:5: this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getReleaseExpressionAccess().getUntilExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleUntilExpression_in_ruleReleaseExpression4582);
            this_UntilExpression_0=ruleUntilExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UntilExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2065:1: ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==46) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2065:2: () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2065:2: ()
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2066:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getReleaseExpressionAccess().getReleaseExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleReleaseExpression4603); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReleaseExpressionAccess().getRKeyword_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2075:1: ( (lv_rightOperand_3_0= ruleUntilExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2076:1: (lv_rightOperand_3_0= ruleUntilExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2076:1: (lv_rightOperand_3_0= ruleUntilExpression )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2077:3: lv_rightOperand_3_0= ruleUntilExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReleaseExpressionAccess().getRightOperandUntilExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleUntilExpression_in_ruleReleaseExpression4624);
            	    lv_rightOperand_3_0=ruleUntilExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getReleaseExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"UntilExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReleaseExpression"


    // $ANTLR start "entryRuleUntilExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2101:1: entryRuleUntilExpression returns [EObject current=null] : iv_ruleUntilExpression= ruleUntilExpression EOF ;
    public final EObject entryRuleUntilExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntilExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2102:2: (iv_ruleUntilExpression= ruleUntilExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2103:2: iv_ruleUntilExpression= ruleUntilExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUntilExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUntilExpression_in_entryRuleUntilExpression4662);
            iv_ruleUntilExpression=ruleUntilExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUntilExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUntilExpression4672); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUntilExpression"


    // $ANTLR start "ruleUntilExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2110:1: ruleUntilExpression returns [EObject current=null] : (this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )* ) ;
    public final EObject ruleUntilExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryLogicExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2113:28: ( (this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2114:1: (this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2114:1: (this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )* )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2115:5: this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUntilExpressionAccess().getUnaryLogicExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleUntilExpression4719);
            this_UnaryLogicExpression_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryLogicExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2123:1: ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==47) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2123:2: () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2123:2: ()
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2124:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getUntilExpressionAccess().getUntilExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleUntilExpression4740); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getUntilExpressionAccess().getUKeyword_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2133:1: ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2134:1: (lv_rightOperand_3_0= ruleUnaryLogicExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2134:1: (lv_rightOperand_3_0= ruleUnaryLogicExpression )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2135:3: lv_rightOperand_3_0= ruleUnaryLogicExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUntilExpressionAccess().getRightOperandUnaryLogicExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleUntilExpression4761);
            	    lv_rightOperand_3_0=ruleUnaryLogicExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUntilExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"UnaryLogicExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUntilExpression"


    // $ANTLR start "entryRuleUnaryLogicExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2159:1: entryRuleUnaryLogicExpression returns [EObject current=null] : iv_ruleUnaryLogicExpression= ruleUnaryLogicExpression EOF ;
    public final EObject entryRuleUnaryLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryLogicExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2160:2: (iv_ruleUnaryLogicExpression= ruleUnaryLogicExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2161:2: iv_ruleUnaryLogicExpression= ruleUnaryLogicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryLogicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_entryRuleUnaryLogicExpression4799);
            iv_ruleUnaryLogicExpression=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryLogicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryLogicExpression4809); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryLogicExpression"


    // $ANTLR start "ruleUnaryLogicExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2168:1: ruleUnaryLogicExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression ) ;
    public final EObject ruleUnaryLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NotExpression_0 = null;

        EObject this_ForallExpression_1 = null;

        EObject this_ExistsExpression_2 = null;

        EObject this_FunctionLiteralExpression_3 = null;

        EObject this_GloballyExpression_4 = null;

        EObject this_FinallyExpression_5 = null;

        EObject this_NextExpression_6 = null;

        EObject this_TemporalForallExpression_7 = null;

        EObject this_TemporalExistsExpression_8 = null;

        EObject this_LetExpression_9 = null;

        EObject this_InExpression_10 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2171:28: ( (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2172:1: (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2172:1: (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression )
            int alt29=11;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2173:5: this_NotExpression_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getNotExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleUnaryLogicExpression4856);
                    this_NotExpression_0=ruleNotExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NotExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2183:5: this_ForallExpression_1= ruleForallExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getForallExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleForallExpression_in_ruleUnaryLogicExpression4883);
                    this_ForallExpression_1=ruleForallExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ForallExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2193:5: this_ExistsExpression_2= ruleExistsExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getExistsExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExistsExpression_in_ruleUnaryLogicExpression4910);
                    this_ExistsExpression_2=ruleExistsExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExistsExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2203:5: this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getFunctionLiteralExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionLiteralExpression_in_ruleUnaryLogicExpression4937);
                    this_FunctionLiteralExpression_3=ruleFunctionLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionLiteralExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2213:5: this_GloballyExpression_4= ruleGloballyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getGloballyExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGloballyExpression_in_ruleUnaryLogicExpression4964);
                    this_GloballyExpression_4=ruleGloballyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GloballyExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2223:5: this_FinallyExpression_5= ruleFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getFinallyExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFinallyExpression_in_ruleUnaryLogicExpression4991);
                    this_FinallyExpression_5=ruleFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FinallyExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2233:5: this_NextExpression_6= ruleNextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getNextExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNextExpression_in_ruleUnaryLogicExpression5018);
                    this_NextExpression_6=ruleNextExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NextExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2243:5: this_TemporalForallExpression_7= ruleTemporalForallExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getTemporalForallExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTemporalForallExpression_in_ruleUnaryLogicExpression5045);
                    this_TemporalForallExpression_7=ruleTemporalForallExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TemporalForallExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2253:5: this_TemporalExistsExpression_8= ruleTemporalExistsExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getTemporalExistsExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTemporalExistsExpression_in_ruleUnaryLogicExpression5072);
                    this_TemporalExistsExpression_8=ruleTemporalExistsExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TemporalExistsExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2263:5: this_LetExpression_9= ruleLetExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getLetExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpression_in_ruleUnaryLogicExpression5099);
                    this_LetExpression_9=ruleLetExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LetExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2273:5: this_InExpression_10= ruleInExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getInExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInExpression_in_ruleUnaryLogicExpression5126);
                    this_InExpression_10=ruleInExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryLogicExpression"


    // $ANTLR start "entryRuleNotExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2289:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2290:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2291:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression5161);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression5171); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotExpression"


    // $ANTLR start "ruleNotExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2298:1: ruleNotExpression returns [EObject current=null] : ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2301:28: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2302:1: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2302:1: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2302:2: () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2302:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2303:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotExpressionAccess().getNotExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2308:2: ( ( 'not' )=>otherlv_1= 'not' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2308:3: ( 'not' )=>otherlv_1= 'not'
            {
            otherlv_1=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleNotExpression5225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNotExpressionAccess().getNotKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2313:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2314:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2314:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2315:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleNotExpression5247);
            lv_operand_2_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNotExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_2_0, 
                      		"UnaryLogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotExpression"


    // $ANTLR start "entryRuleForallExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2339:1: entryRuleForallExpression returns [EObject current=null] : iv_ruleForallExpression= ruleForallExpression EOF ;
    public final EObject entryRuleForallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForallExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2340:2: (iv_ruleForallExpression= ruleForallExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2341:2: iv_ruleForallExpression= ruleForallExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForallExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForallExpression_in_entryRuleForallExpression5283);
            iv_ruleForallExpression=ruleForallExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForallExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForallExpression5293); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForallExpression"


    // $ANTLR start "ruleForallExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2348:1: ruleForallExpression returns [EObject current=null] : ( () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleForallExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameterDeclarations_3_0 = null;

        EObject lv_parameterDeclarations_5_0 = null;

        EObject lv_operand_8_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2351:28: ( ( () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2352:1: ( () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2352:1: ( () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2352:2: () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2352:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2353:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getForallExpressionAccess().getForallExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2358:2: ( ( 'forall' )=>otherlv_1= 'forall' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2358:3: ( 'forall' )=>otherlv_1= 'forall'
            {
            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleForallExpression5347); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForallExpressionAccess().getForallKeyword_1());
                  
            }

            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleForallExpression5360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForallExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2367:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2367:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2367:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2368:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2368:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2369:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForallExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleForallExpression5382);
                    lv_parameterDeclarations_3_0=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getForallExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"parameterDeclarations",
                              		lv_parameterDeclarations_3_0, 
                              		"ParameterDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2385:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2385:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleForallExpression5395); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getForallExpressionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2389:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2390:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2390:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2391:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getForallExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleForallExpression5416);
                    	    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getForallExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameterDeclarations",
                    	              		lv_parameterDeclarations_5_0, 
                    	              		"ParameterDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleForallExpression5432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getForallExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleForallExpression5444); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForallExpressionAccess().getColonKeyword_5());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2415:1: ( (lv_operand_8_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2416:1: (lv_operand_8_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2416:1: (lv_operand_8_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2417:3: lv_operand_8_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForallExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleForallExpression5465);
            lv_operand_8_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForallExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_8_0, 
                      		"UnaryLogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForallExpression"


    // $ANTLR start "entryRuleExistsExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2441:1: entryRuleExistsExpression returns [EObject current=null] : iv_ruleExistsExpression= ruleExistsExpression EOF ;
    public final EObject entryRuleExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2442:2: (iv_ruleExistsExpression= ruleExistsExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2443:2: iv_ruleExistsExpression= ruleExistsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression5501);
            iv_ruleExistsExpression=ruleExistsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExistsExpression5511); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExistsExpression"


    // $ANTLR start "ruleExistsExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2450:1: ruleExistsExpression returns [EObject current=null] : ( () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleExistsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameterDeclarations_3_0 = null;

        EObject lv_parameterDeclarations_5_0 = null;

        EObject lv_operand_8_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2453:28: ( ( () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2454:1: ( () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2454:1: ( () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2454:2: () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2454:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2455:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExistsExpressionAccess().getExistsExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2460:2: ( ( 'exists' )=>otherlv_1= 'exists' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2460:3: ( 'exists' )=>otherlv_1= 'exists'
            {
            otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleExistsExpression5565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExistsExpressionAccess().getExistsKeyword_1());
                  
            }

            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExistsExpression5578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExistsExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2469:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2469:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2469:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2470:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2470:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2471:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleExistsExpression5600);
                    lv_parameterDeclarations_3_0=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExistsExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"parameterDeclarations",
                              		lv_parameterDeclarations_3_0, 
                              		"ParameterDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2487:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==15) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2487:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExistsExpression5613); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getExistsExpressionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2491:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2492:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2492:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2493:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleExistsExpression5634);
                    	    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getExistsExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameterDeclarations",
                    	              		lv_parameterDeclarations_5_0, 
                    	              		"ParameterDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExistsExpression5650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getExistsExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleExistsExpression5662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getExistsExpressionAccess().getColonKeyword_5());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2517:1: ( (lv_operand_8_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2518:1: (lv_operand_8_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2518:1: (lv_operand_8_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2519:3: lv_operand_8_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleExistsExpression5683);
            lv_operand_8_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExistsExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_8_0, 
                      		"UnaryLogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExistsExpression"


    // $ANTLR start "entryRuleFunctionLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2543:1: entryRuleFunctionLiteralExpression returns [EObject current=null] : iv_ruleFunctionLiteralExpression= ruleFunctionLiteralExpression EOF ;
    public final EObject entryRuleFunctionLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2544:2: (iv_ruleFunctionLiteralExpression= ruleFunctionLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2545:2: iv_ruleFunctionLiteralExpression= ruleFunctionLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionLiteralExpression_in_entryRuleFunctionLiteralExpression5719);
            iv_ruleFunctionLiteralExpression=ruleFunctionLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionLiteralExpression5729); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionLiteralExpression"


    // $ANTLR start "ruleFunctionLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2552:1: ruleFunctionLiteralExpression returns [EObject current=null] : ( () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleFunctionLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameterDeclarations_3_0 = null;

        EObject lv_parameterDeclarations_5_0 = null;

        EObject lv_returnType_8_0 = null;

        EObject lv_operand_10_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2555:28: ( ( () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2556:1: ( () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2556:1: ( () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2556:2: () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2556:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2557:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionLiteralExpressionAccess().getFunctionLiteralExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2562:2: ( ( 'function' )=>otherlv_1= 'function' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2562:3: ( 'function' )=>otherlv_1= 'function'
            {
            otherlv_1=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleFunctionLiteralExpression5783); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionLiteralExpressionAccess().getFunctionKeyword_1());
                  
            }

            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFunctionLiteralExpression5796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionLiteralExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2571:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2571:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2571:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2572:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2572:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2573:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionLiteralExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleFunctionLiteralExpression5818);
                    lv_parameterDeclarations_3_0=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFunctionLiteralExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"parameterDeclarations",
                              		lv_parameterDeclarations_3_0, 
                              		"ParameterDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2589:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==15) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2589:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFunctionLiteralExpression5831); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionLiteralExpressionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2593:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2594:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2594:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2595:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionLiteralExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleFunctionLiteralExpression5852);
                    	    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getFunctionLiteralExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameterDeclarations",
                    	              		lv_parameterDeclarations_5_0, 
                    	              		"ParameterDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionLiteralExpression5868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionLiteralExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleFunctionLiteralExpression5880); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFunctionLiteralExpressionAccess().getColonKeyword_5());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2619:1: ( (lv_returnType_8_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2620:1: (lv_returnType_8_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2620:1: (lv_returnType_8_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2621:3: lv_returnType_8_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionLiteralExpressionAccess().getReturnTypeTypeParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFunctionLiteralExpression5901);
            lv_returnType_8_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionLiteralExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_8_0, 
                      		"Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFunctionLiteralExpression5913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFunctionLiteralExpressionAccess().getColonEqualsSignKeyword_7());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2641:1: ( (lv_operand_10_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2642:1: (lv_operand_10_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2642:1: (lv_operand_10_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2643:3: lv_operand_10_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionLiteralExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleFunctionLiteralExpression5934);
            lv_operand_10_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionLiteralExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_10_0, 
                      		"UnaryLogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionLiteralExpression"


    // $ANTLR start "entryRuleGloballyExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2667:1: entryRuleGloballyExpression returns [EObject current=null] : iv_ruleGloballyExpression= ruleGloballyExpression EOF ;
    public final EObject entryRuleGloballyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGloballyExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2668:2: (iv_ruleGloballyExpression= ruleGloballyExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2669:2: iv_ruleGloballyExpression= ruleGloballyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGloballyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGloballyExpression_in_entryRuleGloballyExpression5970);
            iv_ruleGloballyExpression=ruleGloballyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGloballyExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGloballyExpression5980); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGloballyExpression"


    // $ANTLR start "ruleGloballyExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2676:1: ruleGloballyExpression returns [EObject current=null] : ( () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleGloballyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2679:28: ( ( () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2680:1: ( () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2680:1: ( () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2680:2: () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2680:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2681:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGloballyExpressionAccess().getGloballyExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2686:2: ( ( 'G' )=>otherlv_1= 'G' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2686:3: ( 'G' )=>otherlv_1= 'G'
            {
            otherlv_1=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleGloballyExpression6034); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGloballyExpressionAccess().getGKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2691:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2692:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2692:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2693:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGloballyExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleGloballyExpression6056);
            lv_operand_2_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGloballyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_2_0, 
                      		"UnaryLogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGloballyExpression"


    // $ANTLR start "entryRuleFinallyExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2717:1: entryRuleFinallyExpression returns [EObject current=null] : iv_ruleFinallyExpression= ruleFinallyExpression EOF ;
    public final EObject entryRuleFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinallyExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2718:2: (iv_ruleFinallyExpression= ruleFinallyExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2719:2: iv_ruleFinallyExpression= ruleFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFinallyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFinallyExpression_in_entryRuleFinallyExpression6092);
            iv_ruleFinallyExpression=ruleFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFinallyExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinallyExpression6102); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinallyExpression"


    // $ANTLR start "ruleFinallyExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2726:1: ruleFinallyExpression returns [EObject current=null] : ( () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2729:28: ( ( () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2730:1: ( () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2730:1: ( () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2730:2: () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2730:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2731:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFinallyExpressionAccess().getFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2736:2: ( ( 'F' )=>otherlv_1= 'F' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2736:3: ( 'F' )=>otherlv_1= 'F'
            {
            otherlv_1=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleFinallyExpression6156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFinallyExpressionAccess().getFKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2741:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2742:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2742:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2743:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFinallyExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleFinallyExpression6178);
            lv_operand_2_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_2_0, 
                      		"UnaryLogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinallyExpression"


    // $ANTLR start "entryRuleNextExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2767:1: entryRuleNextExpression returns [EObject current=null] : iv_ruleNextExpression= ruleNextExpression EOF ;
    public final EObject entryRuleNextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2768:2: (iv_ruleNextExpression= ruleNextExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2769:2: iv_ruleNextExpression= ruleNextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNextExpression_in_entryRuleNextExpression6214);
            iv_ruleNextExpression=ruleNextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNextExpression6224); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNextExpression"


    // $ANTLR start "ruleNextExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2776:1: ruleNextExpression returns [EObject current=null] : ( () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleNextExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2779:28: ( ( () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2780:1: ( () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2780:1: ( () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2780:2: () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2780:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2781:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNextExpressionAccess().getNextExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2786:2: ( ( 'X' )=>otherlv_1= 'X' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2786:3: ( 'X' )=>otherlv_1= 'X'
            {
            otherlv_1=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleNextExpression6278); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNextExpressionAccess().getXKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2791:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2792:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2792:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2793:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNextExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleNextExpression6300);
            lv_operand_2_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNextExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_2_0, 
                      		"UnaryLogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNextExpression"


    // $ANTLR start "entryRuleTemporalForallExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2817:1: entryRuleTemporalForallExpression returns [EObject current=null] : iv_ruleTemporalForallExpression= ruleTemporalForallExpression EOF ;
    public final EObject entryRuleTemporalForallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalForallExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2818:2: (iv_ruleTemporalForallExpression= ruleTemporalForallExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2819:2: iv_ruleTemporalForallExpression= ruleTemporalForallExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalForallExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemporalForallExpression_in_entryRuleTemporalForallExpression6336);
            iv_ruleTemporalForallExpression=ruleTemporalForallExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalForallExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemporalForallExpression6346); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalForallExpression"


    // $ANTLR start "ruleTemporalForallExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2826:1: ruleTemporalForallExpression returns [EObject current=null] : ( () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleTemporalForallExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2829:28: ( ( () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2830:1: ( () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2830:1: ( () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2830:2: () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2830:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2831:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTemporalForallExpressionAccess().getTemporalForallExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2836:2: ( ( 'A' )=>otherlv_1= 'A' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2836:3: ( 'A' )=>otherlv_1= 'A'
            {
            otherlv_1=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleTemporalForallExpression6400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemporalForallExpressionAccess().getAKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2841:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2842:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2842:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2843:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemporalForallExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleTemporalForallExpression6422);
            lv_operand_2_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemporalForallExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_2_0, 
                      		"UnaryLogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalForallExpression"


    // $ANTLR start "entryRuleTemporalExistsExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2867:1: entryRuleTemporalExistsExpression returns [EObject current=null] : iv_ruleTemporalExistsExpression= ruleTemporalExistsExpression EOF ;
    public final EObject entryRuleTemporalExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalExistsExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2868:2: (iv_ruleTemporalExistsExpression= ruleTemporalExistsExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2869:2: iv_ruleTemporalExistsExpression= ruleTemporalExistsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalExistsExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemporalExistsExpression_in_entryRuleTemporalExistsExpression6458);
            iv_ruleTemporalExistsExpression=ruleTemporalExistsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalExistsExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemporalExistsExpression6468); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemporalExistsExpression"


    // $ANTLR start "ruleTemporalExistsExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2876:1: ruleTemporalExistsExpression returns [EObject current=null] : ( () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleTemporalExistsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2879:28: ( ( () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2880:1: ( () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2880:1: ( () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2880:2: () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2880:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2881:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTemporalExistsExpressionAccess().getTemporalExistsExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2886:2: ( ( 'E' )=>otherlv_1= 'E' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2886:3: ( 'E' )=>otherlv_1= 'E'
            {
            otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleTemporalExistsExpression6522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemporalExistsExpressionAccess().getEKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2891:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2892:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2892:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2893:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemporalExistsExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleTemporalExistsExpression6544);
            lv_operand_2_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTemporalExistsExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_2_0, 
                      		"UnaryLogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemporalExistsExpression"


    // $ANTLR start "entryRuleLetExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2917:1: entryRuleLetExpression returns [EObject current=null] : iv_ruleLetExpression= ruleLetExpression EOF ;
    public final EObject entryRuleLetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2918:2: (iv_ruleLetExpression= ruleLetExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2919:2: iv_ruleLetExpression= ruleLetExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpression_in_entryRuleLetExpression6580);
            iv_ruleLetExpression=ruleLetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpression6590); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLetExpression"


    // $ANTLR start "ruleLetExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2926:1: ruleLetExpression returns [EObject current=null] : ( () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleLetExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_letDeclarations_3_0 = null;

        EObject lv_letDeclarations_5_0 = null;

        EObject lv_expression_8_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2929:28: ( ( () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2930:1: ( () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2930:1: ( () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2930:2: () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2930:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2931:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLetExpressionAccess().getLetExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleLetExpression6636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLetExpressionAccess().getLetKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLetExpression6648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLetExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2944:1: ( (lv_letDeclarations_3_0= ruleLetDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2945:1: (lv_letDeclarations_3_0= ruleLetDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2945:1: (lv_letDeclarations_3_0= ruleLetDeclaration )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2946:3: lv_letDeclarations_3_0= ruleLetDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpressionAccess().getLetDeclarationsLetDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetDeclaration_in_ruleLetExpression6669);
            lv_letDeclarations_3_0=ruleLetDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"letDeclarations",
                      		lv_letDeclarations_3_0, 
                      		"LetDeclaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2962:2: (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==15) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2962:4: otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLetExpression6682); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getLetExpressionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2966:1: ( (lv_letDeclarations_5_0= ruleLetDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2967:1: (lv_letDeclarations_5_0= ruleLetDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2967:1: (lv_letDeclarations_5_0= ruleLetDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2968:3: lv_letDeclarations_5_0= ruleLetDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpressionAccess().getLetDeclarationsLetDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetDeclaration_in_ruleLetExpression6703);
            	    lv_letDeclarations_5_0=ruleLetDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLetExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"letDeclarations",
            	              		lv_letDeclarations_5_0, 
            	              		"LetDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLetExpression6717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLetExpressionAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleLetExpression6729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getLetExpressionAccess().getInKeyword_6());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2992:1: ( (lv_expression_8_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2993:1: (lv_expression_8_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2993:1: (lv_expression_8_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:2994:3: lv_expression_8_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpressionAccess().getExpressionUnaryLogicExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleLetExpression6750);
            lv_expression_8_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLetExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_8_0, 
                      		"UnaryLogicExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLetExpression"


    // $ANTLR start "entryRuleInExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3018:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3019:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3020:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInExpression_in_entryRuleInExpression6786);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInExpression6796); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInExpression"


    // $ANTLR start "ruleInExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3027:1: ruleInExpression returns [EObject current=null] : (this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )? ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EquivalenceExpression_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3030:28: ( (this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3031:1: (this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3031:1: (this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )? )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3032:5: this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInExpressionAccess().getEquivalenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquivalenceExpression_in_ruleInExpression6843);
            this_EquivalenceExpression_0=ruleEquivalenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EquivalenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3040:1: ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3040:2: () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3040:2: ()
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3041:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getInExpressionAccess().getInExpressionOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleInExpression6864); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInExpressionAccess().getInKeyword_1_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3050:1: ( (lv_type_3_0= ruleType ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3051:1: (lv_type_3_0= ruleType )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3051:1: (lv_type_3_0= ruleType )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3052:3: lv_type_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInExpressionAccess().getTypeTypeParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleInExpression6885);
                    lv_type_3_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_3_0, 
                              		"Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInExpression"


    // $ANTLR start "entryRuleEquivalenceExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3076:1: entryRuleEquivalenceExpression returns [EObject current=null] : iv_ruleEquivalenceExpression= ruleEquivalenceExpression EOF ;
    public final EObject entryRuleEquivalenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivalenceExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3077:2: (iv_ruleEquivalenceExpression= ruleEquivalenceExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3078:2: iv_ruleEquivalenceExpression= ruleEquivalenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquivalenceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquivalenceExpression_in_entryRuleEquivalenceExpression6923);
            iv_ruleEquivalenceExpression=ruleEquivalenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquivalenceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEquivalenceExpression6933); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquivalenceExpression"


    // $ANTLR start "ruleEquivalenceExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3085:1: ruleEquivalenceExpression returns [EObject current=null] : (this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )? ) ;
    public final EObject ruleEquivalenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ComparisionExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3088:28: ( (this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3089:1: (this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3089:1: (this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )? )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3090:5: this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEquivalenceExpressionAccess().getComparisionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression6980);
            this_ComparisionExpression_0=ruleComparisionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparisionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3098:1: ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )?
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==58) ) {
                alt38=1;
            }
            else if ( (LA38_0==59) ) {
                alt38=2;
            }
            switch (alt38) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3098:2: ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3098:2: ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3098:3: () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3098:3: ()
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3099:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEquivalenceExpressionAccess().getEqualityExpressionLeftOperandAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleEquivalenceExpression7002); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEquivalenceExpressionAccess().getEqualsSignKeyword_1_0_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3108:1: ( (lv_rightOperand_3_0= ruleComparisionExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3109:1: (lv_rightOperand_3_0= ruleComparisionExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3109:1: (lv_rightOperand_3_0= ruleComparisionExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3110:3: lv_rightOperand_3_0= ruleComparisionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquivalenceExpressionAccess().getRightOperandComparisionExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression7023);
                    lv_rightOperand_3_0=ruleComparisionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEquivalenceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_3_0, 
                              		"ComparisionExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3127:6: ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3127:6: ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3127:7: () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3127:7: ()
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3128:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEquivalenceExpressionAccess().getInequalityExpressionLeftOperandAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleEquivalenceExpression7052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEquivalenceExpressionAccess().getSolidusEqualsSignKeyword_1_1_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3137:1: ( (lv_rightOperand_6_0= ruleComparisionExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3138:1: (lv_rightOperand_6_0= ruleComparisionExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3138:1: (lv_rightOperand_6_0= ruleComparisionExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3139:3: lv_rightOperand_6_0= ruleComparisionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquivalenceExpressionAccess().getRightOperandComparisionExpressionParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression7073);
                    lv_rightOperand_6_0=ruleComparisionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEquivalenceExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"rightOperand",
                              		lv_rightOperand_6_0, 
                              		"ComparisionExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquivalenceExpression"


    // $ANTLR start "entryRuleComparisionExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3163:1: entryRuleComparisionExpression returns [EObject current=null] : iv_ruleComparisionExpression= ruleComparisionExpression EOF ;
    public final EObject entryRuleComparisionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisionExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3164:2: (iv_ruleComparisionExpression= ruleComparisionExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3165:2: iv_ruleComparisionExpression= ruleComparisionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisionExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleComparisionExpression_in_entryRuleComparisionExpression7112);
            iv_ruleComparisionExpression=ruleComparisionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisionExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisionExpression7122); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparisionExpression"


    // $ANTLR start "ruleComparisionExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3172:1: ruleComparisionExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )* ) ;
    public final EObject ruleComparisionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_AdditiveExpression_0 = null;

        EObject lv_rightOperand_9_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3175:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3176:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3176:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )* )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3177:5: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisionExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleComparisionExpression7169);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3185:1: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=60 && LA40_0<=63)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3185:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3185:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) )
            	    int alt39=4;
            	    switch ( input.LA(1) ) {
            	    case 60:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    case 63:
            	        {
            	        alt39=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3185:3: ( () otherlv_2= '>' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3185:3: ( () otherlv_2= '>' )
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3185:4: () otherlv_2= '>'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3185:4: ()
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3186:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisionExpressionAccess().getGreaterExpressionLeftOperandAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleComparisionExpression7192); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getComparisionExpressionAccess().getGreaterThanSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3196:6: ( () otherlv_4= '>=' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3196:6: ( () otherlv_4= '>=' )
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3196:7: () otherlv_4= '>='
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3196:7: ()
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3197:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisionExpressionAccess().getGreaterEqualExpressionLeftOperandAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleComparisionExpression7221); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getComparisionExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3207:6: ( () otherlv_6= '<' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3207:6: ( () otherlv_6= '<' )
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3207:7: () otherlv_6= '<'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3207:7: ()
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3208:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisionExpressionAccess().getLessExpressionLeftOperandAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_6=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleComparisionExpression7250); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getComparisionExpressionAccess().getLessThanSignKeyword_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3218:6: ( () otherlv_8= '<=' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3218:6: ( () otherlv_8= '<=' )
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3218:7: () otherlv_8= '<='
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3218:7: ()
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3219:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisionExpressionAccess().getLessEqualExpressionLeftOperandAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_8=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleComparisionExpression7279); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getComparisionExpressionAccess().getLessThanSignEqualsSignKeyword_1_0_3_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3228:3: ( (lv_rightOperand_9_0= ruleAdditiveExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3229:1: (lv_rightOperand_9_0= ruleAdditiveExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3229:1: (lv_rightOperand_9_0= ruleAdditiveExpression )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3230:3: lv_rightOperand_9_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisionExpressionAccess().getRightOperandAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleComparisionExpression7302);
            	    lv_rightOperand_9_0=ruleAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComparisionExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_9_0, 
            	              		"AdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparisionExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3254:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3255:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3256:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression7340);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditiveExpression7350); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3263:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operands_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3266:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3267:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3267:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )* )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3268:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7397);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3276:1: ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )*
            loop42:
            do {
                int alt42=3;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==64) ) {
                    alt42=1;
                }
                else if ( (LA42_0==34) ) {
                    alt42=2;
                }


                switch (alt42) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3276:2: ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3276:2: ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3276:3: () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3276:3: ()
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3277:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getAdditiveExpressionAccess().getAddExpressionOperandsAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3282:2: ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+
            	    int cnt41=0;
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==64) ) {
            	            int LA41_2 = input.LA(2);

            	            if ( (synpred11_InternalTTMCConstraintLanguage()) ) {
            	                alt41=1;
            	            }


            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3282:3: ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3287:6: (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) )
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3287:8: otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleAdditiveExpression7439); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_2, grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_1_0_0());
            	    	          
            	    	    }
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3291:1: ( (lv_operands_3_0= ruleMultiplicativeExpression ) )
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3292:1: (lv_operands_3_0= ruleMultiplicativeExpression )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3292:1: (lv_operands_3_0= ruleMultiplicativeExpression )
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3293:3: lv_operands_3_0= ruleMultiplicativeExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperandsMultiplicativeExpressionParserRuleCall_1_0_1_0_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7460);
            	    	    lv_operands_3_0=ruleMultiplicativeExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"operands",
            	    	              		lv_operands_3_0, 
            	    	              		"MultiplicativeExpression");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt41 >= 1 ) break loop41;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(41, input);
            	                throw eee;
            	        }
            	        cnt41++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3310:6: ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3310:6: ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3310:7: () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3310:7: ()
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3311:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getSubtractExpressionLeftOperandAction_1_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAdditiveExpression7492); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3320:1: ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3321:1: (lv_rightOperand_6_0= ruleMultiplicativeExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3321:1: (lv_rightOperand_6_0= ruleMultiplicativeExpression )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3322:3: lv_rightOperand_6_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightOperandMultiplicativeExpressionParserRuleCall_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7513);
            	    lv_rightOperand_6_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"MultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3346:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3347:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3348:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression7552);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicativeExpression7562); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3355:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_SignumExpression_0 = null;

        EObject lv_operands_3_0 = null;

        EObject lv_rightOperand_10_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3358:28: ( (this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3359:1: (this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3359:1: (this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )* )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3360:5: this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getSignumExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression7609);
            this_SignumExpression_0=ruleSignumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SignumExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3368:1: ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )*
            loop45:
            do {
                int alt45=3;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==65) ) {
                    alt45=1;
                }
                else if ( ((LA45_0>=66 && LA45_0<=68)) ) {
                    alt45=2;
                }


                switch (alt45) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3368:2: ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3368:2: ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3368:3: () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3368:3: ()
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3369:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplyExpressionOperandsAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3374:2: ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+
            	    int cnt43=0;
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==65) ) {
            	            int LA43_2 = input.LA(2);

            	            if ( (synpred12_InternalTTMCConstraintLanguage()) ) {
            	                alt43=1;
            	            }


            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3374:3: ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3379:6: (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) )
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3379:8: otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleMultiplicativeExpression7651); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_2, grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_1_0_1_0_0());
            	    	          
            	    	    }
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3383:1: ( (lv_operands_3_0= ruleSignumExpression ) )
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3384:1: (lv_operands_3_0= ruleSignumExpression )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3384:1: (lv_operands_3_0= ruleSignumExpression )
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3385:3: lv_operands_3_0= ruleSignumExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperandsSignumExpressionParserRuleCall_1_0_1_0_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression7672);
            	    	    lv_operands_3_0=ruleSignumExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"operands",
            	    	              		lv_operands_3_0, 
            	    	              		"SignumExpression");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt43 >= 1 ) break loop43;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(43, input);
            	                throw eee;
            	        }
            	        cnt43++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3402:6: ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3402:6: ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3402:7: ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3402:7: ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) )
            	    int alt44=3;
            	    switch ( input.LA(1) ) {
            	    case 66:
            	        {
            	        alt44=1;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt44=2;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt44=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt44) {
            	        case 1 :
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3402:8: ( () otherlv_5= '/' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3402:8: ( () otherlv_5= '/' )
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3402:9: () otherlv_5= '/'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3402:9: ()
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3403:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicativeExpressionAccess().getDivideExpressionLeftOperandAction_1_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_5=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleMultiplicativeExpression7706); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_5, grammarAccess.getMultiplicativeExpressionAccess().getSolidusKeyword_1_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3413:6: ( () otherlv_7= 'div' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3413:6: ( () otherlv_7= 'div' )
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3413:7: () otherlv_7= 'div'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3413:7: ()
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3414:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicativeExpressionAccess().getDivExpressionLeftOperandAction_1_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_7=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleMultiplicativeExpression7735); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getMultiplicativeExpressionAccess().getDivKeyword_1_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3424:6: ( () otherlv_9= 'mod' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3424:6: ( () otherlv_9= 'mod' )
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3424:7: () otherlv_9= 'mod'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3424:7: ()
            	            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3425:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicativeExpressionAccess().getModExpressionLeftOperandAction_1_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_9=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleMultiplicativeExpression7764); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_9, grammarAccess.getMultiplicativeExpressionAccess().getModKeyword_1_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3434:3: ( (lv_rightOperand_10_0= ruleSignumExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3435:1: (lv_rightOperand_10_0= ruleSignumExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3435:1: (lv_rightOperand_10_0= ruleSignumExpression )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3436:3: lv_rightOperand_10_0= ruleSignumExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandSignumExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression7787);
            	    lv_rightOperand_10_0=ruleSignumExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_10_0, 
            	              		"SignumExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleSignumExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3460:1: entryRuleSignumExpression returns [EObject current=null] : iv_ruleSignumExpression= ruleSignumExpression EOF ;
    public final EObject entryRuleSignumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignumExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3461:2: (iv_ruleSignumExpression= ruleSignumExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3462:2: iv_ruleSignumExpression= ruleSignumExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignumExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_entryRuleSignumExpression7826);
            iv_ruleSignumExpression=ruleSignumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignumExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignumExpression7836); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignumExpression"


    // $ANTLR start "ruleSignumExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3469:1: ruleSignumExpression returns [EObject current=null] : ( ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) ) | ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) ) | this_AccessExpression_6= ruleAccessExpression ) ;
    public final EObject ruleSignumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_operand_2_0 = null;

        EObject lv_operand_5_0 = null;

        EObject this_AccessExpression_6 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3472:28: ( ( ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) ) | ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) ) | this_AccessExpression_6= ruleAccessExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3473:1: ( ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) ) | ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) ) | this_AccessExpression_6= ruleAccessExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3473:1: ( ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) ) | ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) ) | this_AccessExpression_6= ruleAccessExpression )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt46=1;
                }
                break;
            case 64:
                {
                alt46=2;
                }
                break;
            case RULE_ID:
            case RULE_INTEGER:
            case RULE_DECIMAL:
            case 14:
            case 33:
            case 73:
            case 74:
            case 75:
            case 77:
                {
                alt46=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3473:2: ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3473:2: ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3473:3: () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3473:3: ()
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3474:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSignumExpressionAccess().getUnaryMinusExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3479:2: ( ( '-' )=>otherlv_1= '-' )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3479:3: ( '-' )=>otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleSignumExpression7891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSignumExpressionAccess().getHyphenMinusKeyword_0_1());
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3484:2: ( (lv_operand_2_0= ruleSignumExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3485:1: (lv_operand_2_0= ruleSignumExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3485:1: (lv_operand_2_0= ruleSignumExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3486:3: lv_operand_2_0= ruleSignumExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignumExpressionAccess().getOperandSignumExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_ruleSignumExpression7913);
                    lv_operand_2_0=ruleSignumExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignumExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"SignumExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3503:6: ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3503:6: ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3503:7: () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3503:7: ()
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3504:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSignumExpressionAccess().getUnaryPlusExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3509:2: ( ( '+' )=>otherlv_4= '+' )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3509:3: ( '+' )=>otherlv_4= '+'
                    {
                    otherlv_4=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleSignumExpression7950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSignumExpressionAccess().getPlusSignKeyword_1_1());
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3514:2: ( (lv_operand_5_0= ruleSignumExpression ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3515:1: (lv_operand_5_0= ruleSignumExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3515:1: (lv_operand_5_0= ruleSignumExpression )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3516:3: lv_operand_5_0= ruleSignumExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignumExpressionAccess().getOperandSignumExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_ruleSignumExpression7972);
                    lv_operand_5_0=ruleSignumExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignumExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_5_0, 
                              		"SignumExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3534:5: this_AccessExpression_6= ruleAccessExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignumExpressionAccess().getAccessExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAccessExpression_in_ruleSignumExpression8001);
                    this_AccessExpression_6=ruleAccessExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AccessExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignumExpression"


    // $ANTLR start "entryRuleAccessExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3550:1: entryRuleAccessExpression returns [EObject current=null] : iv_ruleAccessExpression= ruleAccessExpression EOF ;
    public final EObject entryRuleAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3551:2: (iv_ruleAccessExpression= ruleAccessExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3552:2: iv_ruleAccessExpression= ruleAccessExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAccessExpression_in_entryRuleAccessExpression8036);
            iv_ruleAccessExpression=ruleAccessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccessExpression8046); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAccessExpression"


    // $ANTLR start "ruleAccessExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3559:1: ruleAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )* ) ;
    public final EObject ruleAccessExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token lv_field_15_0=null;
        Token otherlv_17=null;
        Token lv_index_18_0=null;
        Token otherlv_20=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_parameters_9_0 = null;

        EObject lv_parameters_11_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3562:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )* ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3563:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3563:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )* )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3564:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleAccessExpression8093);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3572:1: ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )*
            loop49:
            do {
                int alt49=6;
                switch ( input.LA(1) ) {
                case 33:
                    {
                    alt49=1;
                    }
                    break;
                case 14:
                    {
                    alt49=2;
                    }
                    break;
                case 69:
                    {
                    alt49=3;
                    }
                    break;
                case 70:
                    {
                    alt49=4;
                    }
                    break;
                case 71:
                    {
                    alt49=5;
                    }
                    break;

                }

                switch (alt49) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3572:2: ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3572:2: ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3572:3: () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']'
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3572:3: ()
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3573:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getArrayAccessExpressionOperandAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAccessExpression8115); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAccessExpressionAccess().getLeftSquareBracketKeyword_1_0_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3582:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3582:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )*
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3582:2: ( (lv_parameters_3_0= ruleExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3583:1: (lv_parameters_3_0= ruleExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3583:1: (lv_parameters_3_0= ruleExpression )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3584:3: lv_parameters_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAccessExpressionAccess().getParametersExpressionParserRuleCall_1_0_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAccessExpression8137);
            	    lv_parameters_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAccessExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_3_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3600:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==15) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3600:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAccessExpression8150); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_4, grammarAccess.getAccessExpressionAccess().getCommaKeyword_1_0_2_1_0());
            	    	          
            	    	    }
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3604:1: ( (lv_parameters_5_0= ruleExpression ) )
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3605:1: (lv_parameters_5_0= ruleExpression )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3605:1: (lv_parameters_5_0= ruleExpression )
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3606:3: lv_parameters_5_0= ruleExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAccessExpressionAccess().getParametersExpressionParserRuleCall_1_0_2_1_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAccessExpression8171);
            	    	    lv_parameters_5_0=ruleExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getAccessExpressionRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"parameters",
            	    	              		lv_parameters_5_0, 
            	    	              		"Expression");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);


            	    }

            	    otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAccessExpression8186); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getAccessExpressionAccess().getRightSquareBracketKeyword_1_0_3());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3627:6: ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3627:6: ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3627:7: () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')'
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3627:7: ()
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3628:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getFunctionAccessExpressionOperandAction_1_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAccessExpression8215); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getAccessExpressionAccess().getLeftParenthesisKeyword_1_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3637:1: ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3637:2: ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )*
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3637:2: ( (lv_parameters_9_0= ruleExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3638:1: (lv_parameters_9_0= ruleExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3638:1: (lv_parameters_9_0= ruleExpression )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3639:3: lv_parameters_9_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAccessExpressionAccess().getParametersExpressionParserRuleCall_1_1_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAccessExpression8237);
            	    lv_parameters_9_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAccessExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parameters",
            	              		lv_parameters_9_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3655:2: (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==15) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3655:4: otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAccessExpression8250); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_10, grammarAccess.getAccessExpressionAccess().getCommaKeyword_1_1_2_1_0());
            	    	          
            	    	    }
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3659:1: ( (lv_parameters_11_0= ruleExpression ) )
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3660:1: (lv_parameters_11_0= ruleExpression )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3660:1: (lv_parameters_11_0= ruleExpression )
            	    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3661:3: lv_parameters_11_0= ruleExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAccessExpressionAccess().getParametersExpressionParserRuleCall_1_1_2_1_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAccessExpression8271);
            	    	    lv_parameters_11_0=ruleExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getAccessExpressionRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"parameters",
            	    	              		lv_parameters_11_0, 
            	    	              		"Expression");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop48;
            	        }
            	    } while (true);


            	    }

            	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAccessExpression8286); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getAccessExpressionAccess().getRightParenthesisKeyword_1_1_3());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3682:6: ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3682:6: ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3682:7: () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3682:7: ()
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3683:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getRecordAccessExpressionOperandAction_1_2_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_14=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleAccessExpression8315); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getAccessExpressionAccess().getFullStopKeyword_1_2_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3692:1: ( (lv_field_15_0= RULE_ID ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3693:1: (lv_field_15_0= RULE_ID )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3693:1: (lv_field_15_0= RULE_ID )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3694:3: lv_field_15_0= RULE_ID
            	    {
            	    lv_field_15_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAccessExpression8332); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_field_15_0, grammarAccess.getAccessExpressionAccess().getFieldIDTerminalRuleCall_1_2_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAccessExpressionRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"field",
            	              		lv_field_15_0, 
            	              		"ID");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3711:6: ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3711:6: ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3711:7: () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3711:7: ()
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3712:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getTupleAccessExpressionOperandAction_1_3_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_17=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleAccessExpression8366); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getAccessExpressionAccess().getExclamationMarkKeyword_1_3_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3721:1: ( (lv_index_18_0= RULE_INTEGER ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3722:1: (lv_index_18_0= RULE_INTEGER )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3722:1: (lv_index_18_0= RULE_INTEGER )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3723:3: lv_index_18_0= RULE_INTEGER
            	    {
            	    lv_index_18_0=(Token)match(input,RULE_INTEGER,FollowSets000.FOLLOW_RULE_INTEGER_in_ruleAccessExpression8383); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_index_18_0, grammarAccess.getAccessExpressionAccess().getIndexINTEGERTerminalRuleCall_1_3_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAccessExpressionRule());
            	      	        }
            	             		setWithLastConsumed(
            	             			current, 
            	             			"index",
            	              		lv_index_18_0, 
            	              		"INTEGER");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3740:6: ( () otherlv_20= '\\'' )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3740:6: ( () otherlv_20= '\\'' )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3740:7: () otherlv_20= '\\''
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3740:7: ()
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3741:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getPrimedExpressionOperandAction_1_4_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_20=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleAccessExpression8417); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getAccessExpressionAccess().getApostropheKeyword_1_4_1());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3758:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3759:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3760:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression8456);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression8466); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3767:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ReferenceExpression_1= ruleReferenceExpression | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LiteralExpression_0 = null;

        EObject this_ReferenceExpression_1 = null;

        EObject this_Expression_3 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3770:28: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ReferenceExpression_1= ruleReferenceExpression | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3771:1: (this_LiteralExpression_0= ruleLiteralExpression | this_ReferenceExpression_1= ruleReferenceExpression | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3771:1: (this_LiteralExpression_0= ruleLiteralExpression | this_ReferenceExpression_1= ruleReferenceExpression | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt50=3;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_DECIMAL:
            case 33:
            case 73:
            case 74:
            case 75:
            case 77:
                {
                alt50=1;
                }
                break;
            case RULE_ID:
                {
                alt50=2;
                }
                break;
            case 14:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3772:5: this_LiteralExpression_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_rulePrimaryExpression8513);
                    this_LiteralExpression_0=ruleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3782:5: this_ReferenceExpression_1= ruleReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getReferenceExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleReferenceExpression_in_rulePrimaryExpression8540);
                    this_ReferenceExpression_1=ruleReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ReferenceExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3791:6: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3791:6: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3791:8: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePrimaryExpression8558); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePrimaryExpression8580);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePrimaryExpression8591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleReferenceExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3816:1: entryRuleReferenceExpression returns [EObject current=null] : iv_ruleReferenceExpression= ruleReferenceExpression EOF ;
    public final EObject entryRuleReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3817:2: (iv_ruleReferenceExpression= ruleReferenceExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3818:2: iv_ruleReferenceExpression= ruleReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleReferenceExpression_in_entryRuleReferenceExpression8628);
            iv_ruleReferenceExpression=ruleReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferenceExpression8638); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReferenceExpression"


    // $ANTLR start "ruleReferenceExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3825:1: ruleReferenceExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3828:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3829:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3829:1: ( (otherlv_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3830:1: (otherlv_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3830:1: (otherlv_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3831:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleReferenceExpression8682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getReferenceExpressionAccess().getDeclarationDeclarationCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReferenceExpression"


    // $ANTLR start "entryRuleLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3850:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3851:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3852:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression8717);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralExpression8727); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3859:1: ruleLiteralExpression returns [EObject current=null] : (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression ) ;
    public final EObject ruleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteralExpression_0 = null;

        EObject this_DecimalLiteralExpression_1 = null;

        EObject this_RationalLiteralExpression_2 = null;

        EObject this_BooleanLiteralExpression_3 = null;

        EObject this_ArrayLiteralExpression_4 = null;

        EObject this_RecordLiteralExpression_5 = null;

        EObject this_TupleLiteralExpression_6 = null;

        EObject this_EnumerationLiteralExpression_7 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3862:28: ( (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3863:1: (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3863:1: (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression )
            int alt51=8;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3864:5: this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getIntegerLiteralExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteralExpression_in_ruleLiteralExpression8774);
                    this_IntegerLiteralExpression_0=ruleIntegerLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IntegerLiteralExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3874:5: this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getDecimalLiteralExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDecimalLiteralExpression_in_ruleLiteralExpression8801);
                    this_DecimalLiteralExpression_1=ruleDecimalLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DecimalLiteralExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3884:5: this_RationalLiteralExpression_2= ruleRationalLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getRationalLiteralExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRationalLiteralExpression_in_ruleLiteralExpression8828);
                    this_RationalLiteralExpression_2=ruleRationalLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RationalLiteralExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3894:5: this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpression_in_ruleLiteralExpression8855);
                    this_BooleanLiteralExpression_3=ruleBooleanLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteralExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3904:5: this_ArrayLiteralExpression_4= ruleArrayLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getArrayLiteralExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArrayLiteralExpression_in_ruleLiteralExpression8882);
                    this_ArrayLiteralExpression_4=ruleArrayLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArrayLiteralExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3914:5: this_RecordLiteralExpression_5= ruleRecordLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getRecordLiteralExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRecordLiteralExpression_in_ruleLiteralExpression8909);
                    this_RecordLiteralExpression_5=ruleRecordLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RecordLiteralExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3924:5: this_TupleLiteralExpression_6= ruleTupleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getTupleLiteralExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpression_in_ruleLiteralExpression8936);
                    this_TupleLiteralExpression_6=ruleTupleLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TupleLiteralExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3934:5: this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getEnumerationLiteralExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralExpression_in_ruleLiteralExpression8963);
                    this_EnumerationLiteralExpression_7=ruleEnumerationLiteralExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EnumerationLiteralExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleIntegerLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3950:1: entryRuleIntegerLiteralExpression returns [EObject current=null] : iv_ruleIntegerLiteralExpression= ruleIntegerLiteralExpression EOF ;
    public final EObject entryRuleIntegerLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3951:2: (iv_ruleIntegerLiteralExpression= ruleIntegerLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3952:2: iv_ruleIntegerLiteralExpression= ruleIntegerLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteralExpression_in_entryRuleIntegerLiteralExpression8998);
            iv_ruleIntegerLiteralExpression=ruleIntegerLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLiteralExpression9008); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteralExpression"


    // $ANTLR start "ruleIntegerLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3959:1: ruleIntegerLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INTEGER ) ) ;
    public final EObject ruleIntegerLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3962:28: ( ( (lv_value_0_0= RULE_INTEGER ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3963:1: ( (lv_value_0_0= RULE_INTEGER ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3963:1: ( (lv_value_0_0= RULE_INTEGER ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3964:1: (lv_value_0_0= RULE_INTEGER )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3964:1: (lv_value_0_0= RULE_INTEGER )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3965:3: lv_value_0_0= RULE_INTEGER
            {
            lv_value_0_0=(Token)match(input,RULE_INTEGER,FollowSets000.FOLLOW_RULE_INTEGER_in_ruleIntegerLiteralExpression9049); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getIntegerLiteralExpressionAccess().getValueINTEGERTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIntegerLiteralExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"INTEGER");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteralExpression"


    // $ANTLR start "entryRuleDecimalLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3989:1: entryRuleDecimalLiteralExpression returns [EObject current=null] : iv_ruleDecimalLiteralExpression= ruleDecimalLiteralExpression EOF ;
    public final EObject entryRuleDecimalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3990:2: (iv_ruleDecimalLiteralExpression= ruleDecimalLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3991:2: iv_ruleDecimalLiteralExpression= ruleDecimalLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDecimalLiteralExpression_in_entryRuleDecimalLiteralExpression9089);
            iv_ruleDecimalLiteralExpression=ruleDecimalLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecimalLiteralExpression9099); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecimalLiteralExpression"


    // $ANTLR start "ruleDecimalLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3998:1: ruleDecimalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4001:28: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4002:1: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4002:1: ( (lv_value_0_0= RULE_DECIMAL ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4003:1: (lv_value_0_0= RULE_DECIMAL )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4003:1: (lv_value_0_0= RULE_DECIMAL )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4004:3: lv_value_0_0= RULE_DECIMAL
            {
            lv_value_0_0=(Token)match(input,RULE_DECIMAL,FollowSets000.FOLLOW_RULE_DECIMAL_in_ruleDecimalLiteralExpression9140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getDecimalLiteralExpressionAccess().getValueDECIMALTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDecimalLiteralExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"DECIMAL");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecimalLiteralExpression"


    // $ANTLR start "entryRuleRationalLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4028:1: entryRuleRationalLiteralExpression returns [EObject current=null] : iv_ruleRationalLiteralExpression= ruleRationalLiteralExpression EOF ;
    public final EObject entryRuleRationalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRationalLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4029:2: (iv_ruleRationalLiteralExpression= ruleRationalLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4030:2: iv_ruleRationalLiteralExpression= ruleRationalLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRationalLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRationalLiteralExpression_in_entryRuleRationalLiteralExpression9180);
            iv_ruleRationalLiteralExpression=ruleRationalLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRationalLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRationalLiteralExpression9190); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRationalLiteralExpression"


    // $ANTLR start "ruleRationalLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4037:1: ruleRationalLiteralExpression returns [EObject current=null] : ( ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleRationalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_numerator_0_0=null;
        Token otherlv_1=null;
        Token lv_denominator_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4040:28: ( ( ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4041:1: ( ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4041:1: ( ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4041:2: ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4041:2: ( (lv_numerator_0_0= RULE_INTEGER ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4042:1: (lv_numerator_0_0= RULE_INTEGER )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4042:1: (lv_numerator_0_0= RULE_INTEGER )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4043:3: lv_numerator_0_0= RULE_INTEGER
            {
            lv_numerator_0_0=(Token)match(input,RULE_INTEGER,FollowSets000.FOLLOW_RULE_INTEGER_in_ruleRationalLiteralExpression9232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_numerator_0_0, grammarAccess.getRationalLiteralExpressionAccess().getNumeratorINTEGERTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRationalLiteralExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"numerator",
                      		lv_numerator_0_0, 
                      		"INTEGER");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleRationalLiteralExpression9249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRationalLiteralExpressionAccess().getPercentSignKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4063:1: ( (lv_denominator_2_0= RULE_INTEGER ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4064:1: (lv_denominator_2_0= RULE_INTEGER )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4064:1: (lv_denominator_2_0= RULE_INTEGER )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4065:3: lv_denominator_2_0= RULE_INTEGER
            {
            lv_denominator_2_0=(Token)match(input,RULE_INTEGER,FollowSets000.FOLLOW_RULE_INTEGER_in_ruleRationalLiteralExpression9266); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_denominator_2_0, grammarAccess.getRationalLiteralExpressionAccess().getDenominatorINTEGERTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRationalLiteralExpressionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"denominator",
                      		lv_denominator_2_0, 
                      		"INTEGER");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRationalLiteralExpression"


    // $ANTLR start "entryRuleBooleanLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4089:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4090:2: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4091:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpression_in_entryRuleBooleanLiteralExpression9307);
            iv_ruleBooleanLiteralExpression=ruleBooleanLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpression9317); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanLiteralExpression"


    // $ANTLR start "ruleBooleanLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4098:1: ruleBooleanLiteralExpression returns [EObject current=null] : (this_TrueExpression_0= ruleTrueExpression | this_FalseExpression_1= ruleFalseExpression ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TrueExpression_0 = null;

        EObject this_FalseExpression_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4101:28: ( (this_TrueExpression_0= ruleTrueExpression | this_FalseExpression_1= ruleFalseExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4102:1: (this_TrueExpression_0= ruleTrueExpression | this_FalseExpression_1= ruleFalseExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4102:1: (this_TrueExpression_0= ruleTrueExpression | this_FalseExpression_1= ruleFalseExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==73) ) {
                alt52=1;
            }
            else if ( (LA52_0==74) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4103:5: this_TrueExpression_0= ruleTrueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanLiteralExpressionAccess().getTrueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTrueExpression_in_ruleBooleanLiteralExpression9364);
                    this_TrueExpression_0=ruleTrueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TrueExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4113:5: this_FalseExpression_1= ruleFalseExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanLiteralExpressionAccess().getFalseExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFalseExpression_in_ruleBooleanLiteralExpression9391);
                    this_FalseExpression_1=ruleFalseExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FalseExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanLiteralExpression"


    // $ANTLR start "entryRuleTrueExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4129:1: entryRuleTrueExpression returns [EObject current=null] : iv_ruleTrueExpression= ruleTrueExpression EOF ;
    public final EObject entryRuleTrueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4130:2: (iv_ruleTrueExpression= ruleTrueExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4131:2: iv_ruleTrueExpression= ruleTrueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTrueExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTrueExpression_in_entryRuleTrueExpression9426);
            iv_ruleTrueExpression=ruleTrueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTrueExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTrueExpression9436); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrueExpression"


    // $ANTLR start "ruleTrueExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4138:1: ruleTrueExpression returns [EObject current=null] : ( () otherlv_1= 'true' ) ;
    public final EObject ruleTrueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4141:28: ( ( () otherlv_1= 'true' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4142:1: ( () otherlv_1= 'true' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4142:1: ( () otherlv_1= 'true' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4142:2: () otherlv_1= 'true'
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4142:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4143:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTrueExpressionAccess().getTrueExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleTrueExpression9482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTrueExpressionAccess().getTrueKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTrueExpression"


    // $ANTLR start "entryRuleFalseExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4160:1: entryRuleFalseExpression returns [EObject current=null] : iv_ruleFalseExpression= ruleFalseExpression EOF ;
    public final EObject entryRuleFalseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4161:2: (iv_ruleFalseExpression= ruleFalseExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4162:2: iv_ruleFalseExpression= ruleFalseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFalseExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFalseExpression_in_entryRuleFalseExpression9518);
            iv_ruleFalseExpression=ruleFalseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFalseExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFalseExpression9528); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFalseExpression"


    // $ANTLR start "ruleFalseExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4169:1: ruleFalseExpression returns [EObject current=null] : ( () otherlv_1= 'false' ) ;
    public final EObject ruleFalseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4172:28: ( ( () otherlv_1= 'false' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4173:1: ( () otherlv_1= 'false' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4173:1: ( () otherlv_1= 'false' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4173:2: () otherlv_1= 'false'
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4173:2: ()
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4174:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFalseExpressionAccess().getFalseExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleFalseExpression9574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFalseExpressionAccess().getFalseKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFalseExpression"


    // $ANTLR start "entryRuleArrayLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4191:1: entryRuleArrayLiteralExpression returns [EObject current=null] : iv_ruleArrayLiteralExpression= ruleArrayLiteralExpression EOF ;
    public final EObject entryRuleArrayLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4192:2: (iv_ruleArrayLiteralExpression= ruleArrayLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4193:2: iv_ruleArrayLiteralExpression= ruleArrayLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArrayLiteralExpression_in_entryRuleArrayLiteralExpression9610);
            iv_ruleArrayLiteralExpression=ruleArrayLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayLiteralExpression9620); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayLiteralExpression"


    // $ANTLR start "ruleArrayLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4200:1: ruleArrayLiteralExpression returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']' ) ;
    public final EObject ruleArrayLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameterDeclarations_1_0 = null;

        EObject lv_parameterDeclarations_3_0 = null;

        EObject lv_operand_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4203:28: ( (otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4204:1: (otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4204:1: (otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4204:3: otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleArrayLiteralExpression9657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayLiteralExpressionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4208:1: ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4208:2: ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4208:2: ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4209:1: (lv_parameterDeclarations_1_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4209:1: (lv_parameterDeclarations_1_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4210:3: lv_parameterDeclarations_1_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayLiteralExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleArrayLiteralExpression9679);
                    lv_parameterDeclarations_1_0=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getArrayLiteralExpressionRule());
                      	        }
                             		add(
                             			current, 
                             			"parameterDeclarations",
                              		lv_parameterDeclarations_1_0, 
                              		"ParameterDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4226:2: (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==15) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4226:4: otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArrayLiteralExpression9692); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getArrayLiteralExpressionAccess().getCommaKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4230:1: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4231:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4231:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4232:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArrayLiteralExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleArrayLiteralExpression9713);
                    	    lv_parameterDeclarations_3_0=ruleParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getArrayLiteralExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameterDeclarations",
                    	              		lv_parameterDeclarations_3_0, 
                    	              		"ParameterDeclaration");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleArrayLiteralExpression9729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayLiteralExpressionAccess().getVerticalLineKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4252:1: ( (lv_operand_5_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4253:1: (lv_operand_5_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4253:1: (lv_operand_5_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4254:3: lv_operand_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayLiteralExpressionAccess().getOperandExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleArrayLiteralExpression9750);
            lv_operand_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArrayLiteralExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"operand",
                      		lv_operand_5_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleArrayLiteralExpression9762); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getArrayLiteralExpressionAccess().getRightSquareBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayLiteralExpression"


    // $ANTLR start "entryRuleRecordLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4282:1: entryRuleRecordLiteralExpression returns [EObject current=null] : iv_ruleRecordLiteralExpression= ruleRecordLiteralExpression EOF ;
    public final EObject entryRuleRecordLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4283:2: (iv_ruleRecordLiteralExpression= ruleRecordLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4284:2: iv_ruleRecordLiteralExpression= ruleRecordLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRecordLiteralExpression_in_entryRuleRecordLiteralExpression9798);
            iv_ruleRecordLiteralExpression=ruleRecordLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecordLiteralExpression9808); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordLiteralExpression"


    // $ANTLR start "ruleRecordLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4291:1: ruleRecordLiteralExpression returns [EObject current=null] : (otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)' ) ;
    public final EObject ruleRecordLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fieldAssignments_1_0 = null;

        EObject lv_fieldAssignments_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4294:28: ( (otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4295:1: (otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4295:1: (otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4295:3: otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)'
            {
            otherlv_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleRecordLiteralExpression9845); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordLiteralExpressionAccess().getLeftParenthesisNumberSignKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4299:1: ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4300:1: (lv_fieldAssignments_1_0= ruleFieldAssignment )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4300:1: (lv_fieldAssignments_1_0= ruleFieldAssignment )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4301:3: lv_fieldAssignments_1_0= ruleFieldAssignment
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecordLiteralExpressionAccess().getFieldAssignmentsFieldAssignmentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldAssignment_in_ruleRecordLiteralExpression9866);
            lv_fieldAssignments_1_0=ruleFieldAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRecordLiteralExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"fieldAssignments",
                      		lv_fieldAssignments_1_0, 
                      		"FieldAssignment");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4317:2: (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==15) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4317:4: otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRecordLiteralExpression9879); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getRecordLiteralExpressionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4321:1: ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4322:1: (lv_fieldAssignments_3_0= ruleFieldAssignment )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4322:1: (lv_fieldAssignments_3_0= ruleFieldAssignment )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4323:3: lv_fieldAssignments_3_0= ruleFieldAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordLiteralExpressionAccess().getFieldAssignmentsFieldAssignmentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFieldAssignment_in_ruleRecordLiteralExpression9900);
            	    lv_fieldAssignments_3_0=ruleFieldAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRecordLiteralExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"fieldAssignments",
            	              		lv_fieldAssignments_3_0, 
            	              		"FieldAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_4=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleRecordLiteralExpression9914); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRecordLiteralExpressionAccess().getNumberSignRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordLiteralExpression"


    // $ANTLR start "entryRuleFieldAssignment"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4351:1: entryRuleFieldAssignment returns [EObject current=null] : iv_ruleFieldAssignment= ruleFieldAssignment EOF ;
    public final EObject entryRuleFieldAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldAssignment = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4352:2: (iv_ruleFieldAssignment= ruleFieldAssignment EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4353:2: iv_ruleFieldAssignment= ruleFieldAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldAssignment_in_entryRuleFieldAssignment9950);
            iv_ruleFieldAssignment=ruleFieldAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldAssignment9960); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldAssignment"


    // $ANTLR start "ruleFieldAssignment"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4360:1: ruleFieldAssignment returns [EObject current=null] : ( ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleFieldAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_reference_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4363:28: ( ( ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4364:1: ( ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4364:1: ( ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4364:2: ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4364:2: ( (lv_reference_0_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4365:1: (lv_reference_0_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4365:1: (lv_reference_0_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4366:3: lv_reference_0_0= RULE_ID
            {
            lv_reference_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFieldAssignment10002); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_reference_0_0, grammarAccess.getFieldAssignmentAccess().getReferenceIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFieldAssignmentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"reference",
                      		lv_reference_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFieldAssignment10019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFieldAssignmentAccess().getColonEqualsSignKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4386:1: ( (lv_value_2_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4387:1: (lv_value_2_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4387:1: (lv_value_2_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4388:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleFieldAssignment10040);
            lv_value_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFieldAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldAssignment"


    // $ANTLR start "entryRuleTupleLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4412:1: entryRuleTupleLiteralExpression returns [EObject current=null] : iv_ruleTupleLiteralExpression= ruleTupleLiteralExpression EOF ;
    public final EObject entryRuleTupleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4413:2: (iv_ruleTupleLiteralExpression= ruleTupleLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4414:2: iv_ruleTupleLiteralExpression= ruleTupleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpression_in_entryRuleTupleLiteralExpression10076);
            iv_ruleTupleLiteralExpression=ruleTupleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpression10086); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleLiteralExpression"


    // $ANTLR start "ruleTupleLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4421:1: ruleTupleLiteralExpression returns [EObject current=null] : (otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)' ) ;
    public final EObject ruleTupleLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4424:28: ( (otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)' ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4425:1: (otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)' )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4425:1: (otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)' )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4425:3: otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)'
            {
            otherlv_0=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleTupleLiteralExpression10123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpressionAccess().getLeftParenthesisNumberSignKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4429:1: ( (lv_expressions_1_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4430:1: (lv_expressions_1_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4430:1: (lv_expressions_1_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4431:3: lv_expressions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpressionAccess().getExpressionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTupleLiteralExpression10144);
            lv_expressions_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleLiteralExpressionRule());
              	        }
                     		add(
                     			current, 
                     			"expressions",
                      		lv_expressions_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4447:2: (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==15) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4447:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTupleLiteralExpression10157); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTupleLiteralExpressionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4451:1: ( (lv_expressions_3_0= ruleExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4452:1: (lv_expressions_3_0= ruleExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4452:1: (lv_expressions_3_0= ruleExpression )
            	    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4453:3: lv_expressions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpressionAccess().getExpressionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTupleLiteralExpression10178);
            	    lv_expressions_3_0=ruleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTupleLiteralExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_3_0, 
            	              		"Expression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_4=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleTupleLiteralExpression10192); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTupleLiteralExpressionAccess().getNumberSignRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleLiteralExpression"


    // $ANTLR start "entryRuleEnumerationLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4481:1: entryRuleEnumerationLiteralExpression returns [EObject current=null] : iv_ruleEnumerationLiteralExpression= ruleEnumerationLiteralExpression EOF ;
    public final EObject entryRuleEnumerationLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4482:2: (iv_ruleEnumerationLiteralExpression= ruleEnumerationLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4483:2: iv_ruleEnumerationLiteralExpression= ruleEnumerationLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralExpression_in_entryRuleEnumerationLiteralExpression10228);
            iv_ruleEnumerationLiteralExpression=ruleEnumerationLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationLiteralExpression10238); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumerationLiteralExpression"


    // $ANTLR start "ruleEnumerationLiteralExpression"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4490:1: ruleEnumerationLiteralExpression returns [EObject current=null] : (otherlv_0= '::' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEnumerationLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4493:28: ( (otherlv_0= '::' ( (otherlv_1= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4494:1: (otherlv_0= '::' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4494:1: (otherlv_0= '::' ( (otherlv_1= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4494:3: otherlv_0= '::' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleEnumerationLiteralExpression10275); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumerationLiteralExpressionAccess().getColonColonKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4498:1: ( (otherlv_1= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4499:1: (otherlv_1= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4499:1: (otherlv_1= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4500:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationLiteralExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumerationLiteralExpression10295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralExpressionAccess().getReferenceEnumerationLiteralDefinitionCrossReference_1_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumerationLiteralExpression"


    // $ANTLR start "entryRuleBasicConstraintDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4519:1: entryRuleBasicConstraintDefinition returns [EObject current=null] : iv_ruleBasicConstraintDefinition= ruleBasicConstraintDefinition EOF ;
    public final EObject entryRuleBasicConstraintDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicConstraintDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4520:2: (iv_ruleBasicConstraintDefinition= ruleBasicConstraintDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4521:2: iv_ruleBasicConstraintDefinition= ruleBasicConstraintDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicConstraintDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBasicConstraintDefinition_in_entryRuleBasicConstraintDefinition10331);
            iv_ruleBasicConstraintDefinition=ruleBasicConstraintDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicConstraintDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBasicConstraintDefinition10341); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBasicConstraintDefinition"


    // $ANTLR start "ruleBasicConstraintDefinition"
    // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4528:1: ruleBasicConstraintDefinition returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleBasicConstraintDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4531:28: ( (otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4532:1: (otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4532:1: (otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4532:3: otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleBasicConstraintDefinition10378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBasicConstraintDefinitionAccess().getConstraintKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4536:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4537:1: (lv_expression_1_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4537:1: (lv_expression_1_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:4538:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicConstraintDefinitionAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleBasicConstraintDefinition10399);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBasicConstraintDefinitionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicConstraintDefinition"

    // $ANTLR start synpred11_InternalTTMCConstraintLanguage
    public final void synpred11_InternalTTMCConstraintLanguage_fragment() throws RecognitionException {   
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3282:3: ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3282:4: ( '+' ( ( ruleMultiplicativeExpression ) ) )
        {
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3282:4: ( '+' ( ( ruleMultiplicativeExpression ) ) )
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3282:6: '+' ( ( ruleMultiplicativeExpression ) )
        {
        match(input,64,FollowSets000.FOLLOW_64_in_synpred11_InternalTTMCConstraintLanguage7420); if (state.failed) return ;
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3283:1: ( ( ruleMultiplicativeExpression ) )
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3284:1: ( ruleMultiplicativeExpression )
        {
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3284:1: ( ruleMultiplicativeExpression )
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3285:1: ruleMultiplicativeExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeExpression_in_synpred11_InternalTTMCConstraintLanguage7427);
        ruleMultiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred11_InternalTTMCConstraintLanguage

    // $ANTLR start synpred12_InternalTTMCConstraintLanguage
    public final void synpred12_InternalTTMCConstraintLanguage_fragment() throws RecognitionException {   
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3374:3: ( ( '*' ( ( ruleSignumExpression ) ) ) )
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3374:4: ( '*' ( ( ruleSignumExpression ) ) )
        {
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3374:4: ( '*' ( ( ruleSignumExpression ) ) )
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3374:6: '*' ( ( ruleSignumExpression ) )
        {
        match(input,65,FollowSets000.FOLLOW_65_in_synpred12_InternalTTMCConstraintLanguage7632); if (state.failed) return ;
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3375:1: ( ( ruleSignumExpression ) )
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3376:1: ( ruleSignumExpression )
        {
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3376:1: ( ruleSignumExpression )
        // ../hu.bme.mit.inf.ttmc.constraint.language/src-gen/hu/bme/mit/inf/ttmc/constraint/language/parser/antlr/internal/InternalTTMCConstraintLanguage.g:3377:1: ruleSignumExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_synpred12_InternalTTMCConstraintLanguage7639);
        ruleSignumExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred12_InternalTTMCConstraintLanguage

    // Delegated rules

    public final boolean synpred12_InternalTTMCConstraintLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalTTMCConstraintLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalTTMCConstraintLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalTTMCConstraintLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA29 dfa29 = new DFA29(this);
    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA29_eotS =
        "\14\uffff";
    static final String DFA29_eofS =
        "\14\uffff";
    static final String DFA29_minS =
        "\1\4\13\uffff";
    static final String DFA29_maxS =
        "\1\115\13\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA29_specialS =
        "\14\uffff}>";
    static final String[] DFA29_transitionS = {
            "\3\13\7\uffff\1\13\7\uffff\1\4\12\uffff\2\13\15\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12\7\uffff\1\13\10\uffff\3\13\1\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "2172:1: (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression )";
        }
    }
    static final String DFA51_eotS =
        "\14\uffff";
    static final String DFA51_eofS =
        "\1\uffff\1\7\12\uffff";
    static final String DFA51_minS =
        "\1\5\1\16\3\uffff\1\4\4\uffff\1\16\1\uffff";
    static final String DFA51_maxS =
        "\1\115\1\116\3\uffff\1\115\4\uffff\1\114\1\uffff";
    static final String DFA51_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\uffff\1\10\1\1\1\3\1\7\1\uffff\1\6";
    static final String DFA51_specialS =
        "\14\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\1\1\2\32\uffff\1\4\47\uffff\2\3\1\5\1\uffff\1\6",
            "\3\7\1\uffff\1\7\2\uffff\3\7\11\uffff\2\7\1\uffff\2\7\2\uffff\10\7\11\uffff\17\7\1\10\3\uffff\1\7\1\uffff\1\7",
            "",
            "",
            "",
            "\1\12\2\11\7\uffff\1\11\7\uffff\1\11\12\uffff\2\11\4\uffff\1\11\10\uffff\11\11\7\uffff\1\11\10\uffff\3\11\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "\2\11\4\uffff\1\13\14\uffff\2\11\7\uffff\6\11\11\uffff\17\11\4\uffff\1\11",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "3863:1: (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleConstraintSpecification_in_entryRuleConstraintSpecification75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraintSpecification85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleConstraintSpecification122 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstraintSpecification139 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleConstraintSpecification157 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleConstraintSpecification179 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleConstraintSpecification192 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleConstraintSpecification213 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleConstraintSpecification229 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleConstraintSpecification243 = new BitSet(new long[]{0x0000000000E40000L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleTypeDeclaration_in_ruleConstraintSpecification265 = new BitSet(new long[]{0x0000000000E40000L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleConstantDeclaration_in_ruleConstraintSpecification292 = new BitSet(new long[]{0x0000000000E40000L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleConstraintSpecification319 = new BitSet(new long[]{0x0000000000E40000L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleBasicConstraintDefinition_in_ruleConstraintSpecification346 = new BitSet(new long[]{0x0000000000E40000L,0x0000000000004000L});
        public static final BitSet FOLLOW_18_in_ruleConstraintSpecification360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration396 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration406 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration457 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleParameterDeclaration474 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleParameterDeclaration495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldDeclaration_in_entryRuleFieldDeclaration531 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldDeclaration541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFieldDeclaration592 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFieldDeclaration609 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleFieldDeclaration630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetDeclaration_in_entryRuleLetDeclaration666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetDeclaration676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLetDeclaration727 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleLetDeclaration744 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleLetDeclaration765 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleLetDeclaration777 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleLetDeclaration798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration834 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDeclaration844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleConstantDeclaration881 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDeclaration898 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleConstantDeclaration915 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleConstantDeclaration936 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleConstantDeclaration949 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleConstantDeclaration970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration1008 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration1018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleFunctionDeclaration1055 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration1072 = new BitSet(new long[]{0x0000000000084000L});
        public static final BitSet FOLLOW_14_in_ruleFunctionDeclaration1090 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration1112 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFunctionDeclaration1125 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration1146 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionDeclaration1162 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFunctionDeclaration1176 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleFunctionDeclaration1197 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleFunctionDeclaration1210 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionDeclaration1231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType1269 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType1279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReference_in_ruleType1326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleType1353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration1388 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeDeclaration1398 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleTypeDeclaration1435 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDeclaration1452 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleTypeDeclaration1469 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleTypeDeclaration1490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference1526 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference1536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeReference1580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition1615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNaturalTypeDefinition_in_ruleTypeDefinition1672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerTypeDefinition_in_ruleTypeDefinition1699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanTypeDefinition_in_ruleTypeDefinition1726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRealTypeDefinition_in_ruleTypeDefinition1753 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayTypeDefinition_in_ruleTypeDefinition1780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationTypeDefinition_in_ruleTypeDefinition1807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordTypeDefinition_in_ruleTypeDefinition1834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeDefinition_in_ruleTypeDefinition1861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangeTypeDefinition_in_ruleTypeDefinition1888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubTypeDefinition_in_ruleTypeDefinition1915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionTypeDefinition_in_ruleTypeDefinition1942 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNaturalTypeDefinition_in_entryRuleNaturalTypeDefinition1977 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNaturalTypeDefinition1987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleNaturalTypeDefinition2033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerTypeDefinition_in_entryRuleIntegerTypeDefinition2069 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerTypeDefinition2079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleIntegerTypeDefinition2125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanTypeDefinition_in_entryRuleBooleanTypeDefinition2161 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanTypeDefinition2171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleBooleanTypeDefinition2217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRealTypeDefinition_in_entryRuleRealTypeDefinition2253 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRealTypeDefinition2263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleRealTypeDefinition2309 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayTypeDefinition_in_entryRuleArrayTypeDefinition2345 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayTypeDefinition2355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleArrayTypeDefinition2392 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleArrayTypeDefinition2413 = new BitSet(new long[]{0x0000000020008000L});
        public static final BitSet FOLLOW_15_in_ruleArrayTypeDefinition2426 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleArrayTypeDefinition2447 = new BitSet(new long[]{0x0000000020008000L});
        public static final BitSet FOLLOW_29_in_ruleArrayTypeDefinition2461 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleArrayTypeDefinition2482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationTypeDefinition_in_entryRuleEnumerationTypeDefinition2518 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationTypeDefinition2528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleEnumerationTypeDefinition2565 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEnumerationTypeDefinition2577 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralDefinition_in_ruleEnumerationTypeDefinition2598 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_15_in_ruleEnumerationTypeDefinition2611 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralDefinition_in_ruleEnumerationTypeDefinition2632 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleEnumerationTypeDefinition2646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralDefinition_in_entryRuleEnumerationLiteralDefinition2682 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteralDefinition2692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteralDefinition2733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordTypeDefinition_in_entryRuleRecordTypeDefinition2773 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecordTypeDefinition2783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleRecordTypeDefinition2820 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRecordTypeDefinition2832 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFieldDeclaration_in_ruleRecordTypeDefinition2853 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_15_in_ruleRecordTypeDefinition2866 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFieldDeclaration_in_ruleRecordTypeDefinition2887 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleRecordTypeDefinition2901 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeDefinition_in_entryRuleTupleTypeDefinition2937 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeDefinition2947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleTupleTypeDefinition2984 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTupleTypeDefinition2996 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleTupleTypeDefinition3017 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_15_in_ruleTupleTypeDefinition3030 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleTupleTypeDefinition3051 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleTupleTypeDefinition3065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangeTypeDefinition_in_entryRuleSubrangeTypeDefinition3101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangeTypeDefinition3111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleSubrangeTypeDefinition3157 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_34_in_ruleSubrangeTypeDefinition3171 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleSubrangeTypeDefinition3183 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSubrangeTypeDefinition3211 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_ruleSubrangeTypeDefinition3224 = new BitSet(new long[]{0x01FF008E00404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_35_in_ruleSubrangeTypeDefinition3237 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSubrangeTypeDefinition3264 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleSubrangeTypeDefinition3277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubTypeDefinition_in_entryRuleSubTypeDefinition3313 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubTypeDefinition3323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleSubTypeDefinition3360 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleSubTypeDefinition3381 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_38_in_ruleSubTypeDefinition3393 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSubTypeDefinition3414 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSubTypeDefinition3426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionTypeDefinition_in_entryRuleFunctionTypeDefinition3462 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionTypeDefinition3472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleFunctionTypeDefinition3509 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFunctionTypeDefinition3521 = new BitSet(new long[]{0x00000003DF430010L});
        public static final BitSet FOLLOW_ruleType_in_ruleFunctionTypeDefinition3543 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFunctionTypeDefinition3556 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleFunctionTypeDefinition3577 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionTypeDefinition3593 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFunctionTypeDefinition3605 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleFunctionTypeDefinition3626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression3662 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression3672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElseExpression_in_ruleExpression3718 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElseExpression_in_entryRuleIfThenElseExpression3752 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElseExpression3762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleIfThenElseExpression3809 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElseExpression3830 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleIfThenElseExpression3842 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElseExpression3863 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_41_in_ruleIfThenElseExpression3884 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElseExpression3906 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleIfThenElseExpression3936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression3971 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression3981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplyExpression_in_ruleEqualExpression4028 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_42_in_ruleEqualExpression4049 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleEqualExpression4070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplyExpression_in_entryRuleImplyExpression4108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplyExpression4118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleImplyExpression4165 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_43_in_ruleImplyExpression4186 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleImplyExpression_in_ruleImplyExpression4207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression4245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression4255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression4302 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_44_in_ruleOrExpression4324 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression4345 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression4385 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression4395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReleaseExpression_in_ruleAndExpression4442 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_45_in_ruleAndExpression4464 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleReleaseExpression_in_ruleAndExpression4485 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_ruleReleaseExpression_in_entryRuleReleaseExpression4525 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReleaseExpression4535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUntilExpression_in_ruleReleaseExpression4582 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_46_in_ruleReleaseExpression4603 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleUntilExpression_in_ruleReleaseExpression4624 = new BitSet(new long[]{0x0000400000000002L});
        public static final BitSet FOLLOW_ruleUntilExpression_in_entryRuleUntilExpression4662 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUntilExpression4672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleUntilExpression4719 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_47_in_ruleUntilExpression4740 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleUntilExpression4761 = new BitSet(new long[]{0x0000800000000002L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_entryRuleUnaryLogicExpression4799 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryLogicExpression4809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleUnaryLogicExpression4856 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForallExpression_in_ruleUnaryLogicExpression4883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExistsExpression_in_ruleUnaryLogicExpression4910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionLiteralExpression_in_ruleUnaryLogicExpression4937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGloballyExpression_in_ruleUnaryLogicExpression4964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinallyExpression_in_ruleUnaryLogicExpression4991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextExpression_in_ruleUnaryLogicExpression5018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalForallExpression_in_ruleUnaryLogicExpression5045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalExistsExpression_in_ruleUnaryLogicExpression5072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpression_in_ruleUnaryLogicExpression5099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInExpression_in_ruleUnaryLogicExpression5126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression5161 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression5171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleNotExpression5225 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleNotExpression5247 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForallExpression_in_entryRuleForallExpression5283 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForallExpression5293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleForallExpression5347 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleForallExpression5360 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleForallExpression5382 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleForallExpression5395 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleForallExpression5416 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleForallExpression5432 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleForallExpression5444 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleForallExpression5465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression5501 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExistsExpression5511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleExistsExpression5565 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleExistsExpression5578 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleExistsExpression5600 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleExistsExpression5613 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleExistsExpression5634 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleExistsExpression5650 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleExistsExpression5662 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleExistsExpression5683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionLiteralExpression_in_entryRuleFunctionLiteralExpression5719 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionLiteralExpression5729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleFunctionLiteralExpression5783 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFunctionLiteralExpression5796 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionLiteralExpression5818 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFunctionLiteralExpression5831 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionLiteralExpression5852 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionLiteralExpression5868 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleFunctionLiteralExpression5880 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleFunctionLiteralExpression5901 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFunctionLiteralExpression5913 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleFunctionLiteralExpression5934 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGloballyExpression_in_entryRuleGloballyExpression5970 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGloballyExpression5980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleGloballyExpression6034 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleGloballyExpression6056 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinallyExpression_in_entryRuleFinallyExpression6092 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinallyExpression6102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleFinallyExpression6156 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleFinallyExpression6178 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextExpression_in_entryRuleNextExpression6214 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNextExpression6224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleNextExpression6278 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleNextExpression6300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalForallExpression_in_entryRuleTemporalForallExpression6336 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemporalForallExpression6346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleTemporalForallExpression6400 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleTemporalForallExpression6422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalExistsExpression_in_entryRuleTemporalExistsExpression6458 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemporalExistsExpression6468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleTemporalExistsExpression6522 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleTemporalExistsExpression6544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpression_in_entryRuleLetExpression6580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpression6590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleLetExpression6636 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLetExpression6648 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleLetDeclaration_in_ruleLetExpression6669 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleLetExpression6682 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleLetDeclaration_in_ruleLetExpression6703 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleLetExpression6717 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleLetExpression6729 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleLetExpression6750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression6786 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInExpression6796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquivalenceExpression_in_ruleInExpression6843 = new BitSet(new long[]{0x0200000000000002L});
        public static final BitSet FOLLOW_57_in_ruleInExpression6864 = new BitSet(new long[]{0x00000003DF420010L});
        public static final BitSet FOLLOW_ruleType_in_ruleInExpression6885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquivalenceExpression_in_entryRuleEquivalenceExpression6923 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEquivalenceExpression6933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression6980 = new BitSet(new long[]{0x0C00000000000002L});
        public static final BitSet FOLLOW_58_in_ruleEquivalenceExpression7002 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression7023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleEquivalenceExpression7052 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression7073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisionExpression_in_entryRuleComparisionExpression7112 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisionExpression7122 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleComparisionExpression7169 = new BitSet(new long[]{0xF000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleComparisionExpression7192 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_61_in_ruleComparisionExpression7221 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_62_in_ruleComparisionExpression7250 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_63_in_ruleComparisionExpression7279 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleComparisionExpression7302 = new BitSet(new long[]{0xF000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression7340 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression7350 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7397 = new BitSet(new long[]{0x0000000400000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_64_in_ruleAdditiveExpression7439 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7460 = new BitSet(new long[]{0x0000000400000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_34_in_ruleAdditiveExpression7492 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression7513 = new BitSet(new long[]{0x0000000400000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression7552 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression7562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression7609 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001EL});
        public static final BitSet FOLLOW_65_in_ruleMultiplicativeExpression7651 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression7672 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001EL});
        public static final BitSet FOLLOW_66_in_ruleMultiplicativeExpression7706 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_67_in_ruleMultiplicativeExpression7735 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_68_in_ruleMultiplicativeExpression7764 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression7787 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001EL});
        public static final BitSet FOLLOW_ruleSignumExpression_in_entryRuleSignumExpression7826 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignumExpression7836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleSignumExpression7891 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleSignumExpression_in_ruleSignumExpression7913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleSignumExpression7950 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleSignumExpression_in_ruleSignumExpression7972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessExpression_in_ruleSignumExpression8001 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessExpression_in_entryRuleAccessExpression8036 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccessExpression8046 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleAccessExpression8093 = new BitSet(new long[]{0x0000000200004002L,0x00000000000000E0L});
        public static final BitSet FOLLOW_33_in_ruleAccessExpression8115 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpression8137 = new BitSet(new long[]{0x0000002000008000L});
        public static final BitSet FOLLOW_15_in_ruleAccessExpression8150 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpression8171 = new BitSet(new long[]{0x0000002000008000L});
        public static final BitSet FOLLOW_37_in_ruleAccessExpression8186 = new BitSet(new long[]{0x0000000200004002L,0x00000000000000E0L});
        public static final BitSet FOLLOW_14_in_ruleAccessExpression8215 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpression8237 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleAccessExpression8250 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpression8271 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleAccessExpression8286 = new BitSet(new long[]{0x0000000200004002L,0x00000000000000E0L});
        public static final BitSet FOLLOW_69_in_ruleAccessExpression8315 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAccessExpression8332 = new BitSet(new long[]{0x0000000200004002L,0x00000000000000E0L});
        public static final BitSet FOLLOW_70_in_ruleAccessExpression8366 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INTEGER_in_ruleAccessExpression8383 = new BitSet(new long[]{0x0000000200004002L,0x00000000000000E0L});
        public static final BitSet FOLLOW_71_in_ruleAccessExpression8417 = new BitSet(new long[]{0x0000000200004002L,0x00000000000000E0L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression8456 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression8466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_rulePrimaryExpression8513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceExpression_in_rulePrimaryExpression8540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rulePrimaryExpression8558 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression8580 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePrimaryExpression8591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceExpression_in_entryRuleReferenceExpression8628 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferenceExpression8638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceExpression8682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression8717 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression8727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteralExpression_in_ruleLiteralExpression8774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimalLiteralExpression_in_ruleLiteralExpression8801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRationalLiteralExpression_in_ruleLiteralExpression8828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpression_in_ruleLiteralExpression8855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayLiteralExpression_in_ruleLiteralExpression8882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordLiteralExpression_in_ruleLiteralExpression8909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpression_in_ruleLiteralExpression8936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralExpression_in_ruleLiteralExpression8963 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteralExpression_in_entryRuleIntegerLiteralExpression8998 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteralExpression9008 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INTEGER_in_ruleIntegerLiteralExpression9049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimalLiteralExpression_in_entryRuleDecimalLiteralExpression9089 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecimalLiteralExpression9099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleDecimalLiteralExpression9140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRationalLiteralExpression_in_entryRuleRationalLiteralExpression9180 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRationalLiteralExpression9190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INTEGER_in_ruleRationalLiteralExpression9232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleRationalLiteralExpression9249 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INTEGER_in_ruleRationalLiteralExpression9266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpression_in_entryRuleBooleanLiteralExpression9307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpression9317 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrueExpression_in_ruleBooleanLiteralExpression9364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFalseExpression_in_ruleBooleanLiteralExpression9391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrueExpression_in_entryRuleTrueExpression9426 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTrueExpression9436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleTrueExpression9482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFalseExpression_in_entryRuleFalseExpression9518 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFalseExpression9528 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleFalseExpression9574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayLiteralExpression_in_entryRuleArrayLiteralExpression9610 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteralExpression9620 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleArrayLiteralExpression9657 = new BitSet(new long[]{0x0000004000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleArrayLiteralExpression9679 = new BitSet(new long[]{0x0000004000008000L});
        public static final BitSet FOLLOW_15_in_ruleArrayLiteralExpression9692 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleArrayLiteralExpression9713 = new BitSet(new long[]{0x0000004000008000L});
        public static final BitSet FOLLOW_38_in_ruleArrayLiteralExpression9729 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteralExpression9750 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_37_in_ruleArrayLiteralExpression9762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordLiteralExpression_in_entryRuleRecordLiteralExpression9798 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecordLiteralExpression9808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleRecordLiteralExpression9845 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFieldAssignment_in_ruleRecordLiteralExpression9866 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
        public static final BitSet FOLLOW_15_in_ruleRecordLiteralExpression9879 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFieldAssignment_in_ruleRecordLiteralExpression9900 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
        public static final BitSet FOLLOW_76_in_ruleRecordLiteralExpression9914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldAssignment_in_entryRuleFieldAssignment9950 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldAssignment9960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFieldAssignment10002 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFieldAssignment10019 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleFieldAssignment10040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpression_in_entryRuleTupleLiteralExpression10076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpression10086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleTupleLiteralExpression10123 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTupleLiteralExpression10144 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
        public static final BitSet FOLLOW_15_in_ruleTupleLiteralExpression10157 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTupleLiteralExpression10178 = new BitSet(new long[]{0x0000000000008000L,0x0000000000001000L});
        public static final BitSet FOLLOW_76_in_ruleTupleLiteralExpression10192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralExpression_in_entryRuleEnumerationLiteralExpression10228 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteralExpression10238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleEnumerationLiteralExpression10275 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteralExpression10295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBasicConstraintDefinition_in_entryRuleBasicConstraintDefinition10331 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBasicConstraintDefinition10341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_78_in_ruleBasicConstraintDefinition10378 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBasicConstraintDefinition10399 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_synpred11_InternalTTMCConstraintLanguage7420 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_synpred11_InternalTTMCConstraintLanguage7427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_synpred12_InternalTTMCConstraintLanguage7632 = new BitSet(new long[]{0x01FF008600404070L,0x0000000000002E01L});
        public static final BitSet FOLLOW_ruleSignumExpression_in_synpred12_InternalTTMCConstraintLanguage7639 = new BitSet(new long[]{0x0000000000000002L});
    }


}
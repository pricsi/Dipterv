package hu.bme.mit.inf.ttmc.hybrid.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.inf.ttmc.hybrid.language.services.TTMCHybridLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTTMCHybridLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGER", "RULE_DECIMAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'('", "','", "')'", "'{'", "'}'", "'clock'", "'@'", "'-'", "'+'", "'d'", "'automaton'", "':='", "'global'", "':'", "'local'", "'location'", "'transition'", "'to'", "'['", "']'", "'initial'", "'invariant'", "'flow'", "'property'", "'models'", "'const'", "'function'", "'type'", "'natural'", "'integer'", "'boolean'", "'real'", "'array'", "'of'", "'enum'", "'record'", "'tuple'", "'inf'", "'|'", "'if'", "'then'", "'else'", "'equal'", "'imply'", "'or'", "'and'", "'R'", "'U'", "'not'", "'forall'", "'exists'", "'G'", "'F'", "'X'", "'A'", "'E'", "'let'", "'in'", "'='", "'/='", "'>'", "'>='", "'<'", "'<='", "'*'", "'/'", "'div'", "'mod'", "'.'", "'!'", "'\\''", "'%'", "'true'", "'false'", "'(#'", "'#)'", "'::'", "'constraint'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__91=91;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_DECIMAL=6;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=9;
    public static final int RULE_STRING=8;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int RULE_INTEGER=5;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=7;
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=11;

    // delegates
    // delegators


        public InternalTTMCHybridLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTTMCHybridLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTTMCHybridLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g"; }



     	private TTMCHybridLanguageGrammarAccess grammarAccess;
     	
        public InternalTTMCHybridLanguageParser(TokenStream input, TTMCHybridLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "HybridSpecification";	
       	}
       	
       	@Override
       	protected TTMCHybridLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleHybridSpecification"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:67:1: entryRuleHybridSpecification returns [EObject current=null] : iv_ruleHybridSpecification= ruleHybridSpecification EOF ;
    public final EObject entryRuleHybridSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHybridSpecification = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:68:2: (iv_ruleHybridSpecification= ruleHybridSpecification EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:69:2: iv_ruleHybridSpecification= ruleHybridSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHybridSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleHybridSpecification_in_entryRuleHybridSpecification75);
            iv_ruleHybridSpecification=ruleHybridSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHybridSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHybridSpecification85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHybridSpecification"


    // $ANTLR start "ruleHybridSpecification"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:76:1: ruleHybridSpecification returns [EObject current=null] : (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) ) | ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) | ( (lv_hybridAutomatonDeclarations_12_0= ruleHybridAutomatonDeclaration ) ) | ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) ) )* otherlv_14= '}' ) ;
    public final EObject ruleHybridSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_14=null;
        EObject lv_parameterDeclarations_3_0 = null;

        EObject lv_parameterDeclarations_5_0 = null;

        EObject lv_typeDeclarations_8_0 = null;

        EObject lv_functionDeclarations_9_0 = null;

        EObject lv_constantDeclarations_10_0 = null;

        EObject lv_basicConstraintDefinitions_11_0 = null;

        EObject lv_hybridAutomatonDeclarations_12_0 = null;

        EObject lv_propertyDeclarations_13_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:79:28: ( (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) ) | ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) | ( (lv_hybridAutomatonDeclarations_12_0= ruleHybridAutomatonDeclaration ) ) | ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) ) )* otherlv_14= '}' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:80:1: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) ) | ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) | ( (lv_hybridAutomatonDeclarations_12_0= ruleHybridAutomatonDeclaration ) ) | ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) ) )* otherlv_14= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:80:1: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) ) | ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) | ( (lv_hybridAutomatonDeclarations_12_0= ruleHybridAutomatonDeclaration ) ) | ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) ) )* otherlv_14= '}' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:80:3: otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) ) | ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) | ( (lv_hybridAutomatonDeclarations_12_0= ruleHybridAutomatonDeclaration ) ) | ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleHybridSpecification122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHybridSpecificationAccess().getSpecificationKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHybridSpecification139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getHybridSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHybridSpecificationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:102:2: (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:102:4: otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleHybridSpecification157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getHybridSpecificationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:106:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_ID) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:106:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            {
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:106:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:107:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            {
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:107:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:108:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getHybridSpecificationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleHybridSpecification179);
                            lv_parameterDeclarations_3_0=ruleParameterDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getHybridSpecificationRule());
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

                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:124:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==15) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:124:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleHybridSpecification192); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getHybridSpecificationAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:128:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:129:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    {
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:129:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:130:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getHybridSpecificationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleHybridSpecification213);
                            	    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getHybridSpecificationRule());
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

                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleHybridSpecification229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getHybridSpecificationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleHybridSpecification243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getHybridSpecificationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:154:1: ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) ) | ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) | ( (lv_hybridAutomatonDeclarations_12_0= ruleHybridAutomatonDeclaration ) ) | ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) ) )*
            loop4:
            do {
                int alt4=7;
                switch ( input.LA(1) ) {
                case 41:
                    {
                    alt4=1;
                    }
                    break;
                case 40:
                    {
                    alt4=2;
                    }
                    break;
                case 39:
                    {
                    alt4=3;
                    }
                    break;
                case 91:
                    {
                    alt4=4;
                    }
                    break;
                case 24:
                    {
                    alt4=5;
                    }
                    break;
                case 37:
                    {
                    alt4=6;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:154:2: ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:154:2: ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:155:1: (lv_typeDeclarations_8_0= ruleTypeDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:155:1: (lv_typeDeclarations_8_0= ruleTypeDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:156:3: lv_typeDeclarations_8_0= ruleTypeDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHybridSpecificationAccess().getTypeDeclarationsTypeDeclarationParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTypeDeclaration_in_ruleHybridSpecification265);
            	    lv_typeDeclarations_8_0=ruleTypeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHybridSpecificationRule());
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
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:173:6: ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:173:6: ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:174:1: (lv_functionDeclarations_9_0= ruleFunctionDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:174:1: (lv_functionDeclarations_9_0= ruleFunctionDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:175:3: lv_functionDeclarations_9_0= ruleFunctionDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHybridSpecificationAccess().getFunctionDeclarationsFunctionDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunctionDeclaration_in_ruleHybridSpecification292);
            	    lv_functionDeclarations_9_0=ruleFunctionDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHybridSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"functionDeclarations",
            	              		lv_functionDeclarations_9_0, 
            	              		"FunctionDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:192:6: ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:192:6: ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:193:1: (lv_constantDeclarations_10_0= ruleConstantDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:193:1: (lv_constantDeclarations_10_0= ruleConstantDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:194:3: lv_constantDeclarations_10_0= ruleConstantDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHybridSpecificationAccess().getConstantDeclarationsConstantDeclarationParserRuleCall_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConstantDeclaration_in_ruleHybridSpecification319);
            	    lv_constantDeclarations_10_0=ruleConstantDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHybridSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"constantDeclarations",
            	              		lv_constantDeclarations_10_0, 
            	              		"ConstantDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:211:6: ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:211:6: ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:212:1: (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:212:1: (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:213:3: lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHybridSpecificationAccess().getBasicConstraintDefinitionsBasicConstraintDefinitionParserRuleCall_4_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBasicConstraintDefinition_in_ruleHybridSpecification346);
            	    lv_basicConstraintDefinitions_11_0=ruleBasicConstraintDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHybridSpecificationRule());
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
            	case 5 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:230:6: ( (lv_hybridAutomatonDeclarations_12_0= ruleHybridAutomatonDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:230:6: ( (lv_hybridAutomatonDeclarations_12_0= ruleHybridAutomatonDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:231:1: (lv_hybridAutomatonDeclarations_12_0= ruleHybridAutomatonDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:231:1: (lv_hybridAutomatonDeclarations_12_0= ruleHybridAutomatonDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:232:3: lv_hybridAutomatonDeclarations_12_0= ruleHybridAutomatonDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHybridSpecificationAccess().getHybridAutomatonDeclarationsHybridAutomatonDeclarationParserRuleCall_4_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleHybridAutomatonDeclaration_in_ruleHybridSpecification373);
            	    lv_hybridAutomatonDeclarations_12_0=ruleHybridAutomatonDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHybridSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"hybridAutomatonDeclarations",
            	              		lv_hybridAutomatonDeclarations_12_0, 
            	              		"HybridAutomatonDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:249:6: ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:249:6: ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:250:1: (lv_propertyDeclarations_13_0= rulePropertyDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:250:1: (lv_propertyDeclarations_13_0= rulePropertyDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:251:3: lv_propertyDeclarations_13_0= rulePropertyDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHybridSpecificationAccess().getPropertyDeclarationsPropertyDeclarationParserRuleCall_4_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyDeclaration_in_ruleHybridSpecification400);
            	    lv_propertyDeclarations_13_0=rulePropertyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHybridSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"propertyDeclarations",
            	              		lv_propertyDeclarations_13_0, 
            	              		"PropertyDeclaration");
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

            otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleHybridSpecification414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getHybridSpecificationAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleHybridSpecification"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:279:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:280:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:281:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition450);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition460); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:288:1: ruleTypeDefinition returns [EObject current=null] : (this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition | this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition | this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition | this_RealTypeDefinition_3= ruleRealTypeDefinition | this_ArrayTypeDefinition_4= ruleArrayTypeDefinition | this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition | this_RecordTypeDefinition_6= ruleRecordTypeDefinition | this_TupleTypeDefinition_7= ruleTupleTypeDefinition | this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition | this_SubTypeDefinition_9= ruleSubTypeDefinition | this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition | this_ClockTypeDefinition_11= ruleClockTypeDefinition ) ;
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

        EObject this_ClockTypeDefinition_11 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:291:28: ( (this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition | this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition | this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition | this_RealTypeDefinition_3= ruleRealTypeDefinition | this_ArrayTypeDefinition_4= ruleArrayTypeDefinition | this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition | this_RecordTypeDefinition_6= ruleRecordTypeDefinition | this_TupleTypeDefinition_7= ruleTupleTypeDefinition | this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition | this_SubTypeDefinition_9= ruleSubTypeDefinition | this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition | this_ClockTypeDefinition_11= ruleClockTypeDefinition ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:292:1: (this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition | this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition | this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition | this_RealTypeDefinition_3= ruleRealTypeDefinition | this_ArrayTypeDefinition_4= ruleArrayTypeDefinition | this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition | this_RecordTypeDefinition_6= ruleRecordTypeDefinition | this_TupleTypeDefinition_7= ruleTupleTypeDefinition | this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition | this_SubTypeDefinition_9= ruleSubTypeDefinition | this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition | this_ClockTypeDefinition_11= ruleClockTypeDefinition )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:292:1: (this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition | this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition | this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition | this_RealTypeDefinition_3= ruleRealTypeDefinition | this_ArrayTypeDefinition_4= ruleArrayTypeDefinition | this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition | this_RecordTypeDefinition_6= ruleRecordTypeDefinition | this_TupleTypeDefinition_7= ruleTupleTypeDefinition | this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition | this_SubTypeDefinition_9= ruleSubTypeDefinition | this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition | this_ClockTypeDefinition_11= ruleClockTypeDefinition )
            int alt5=12;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt5=1;
                }
                break;
            case 43:
                {
                alt5=2;
                }
                break;
            case 44:
                {
                alt5=3;
                }
                break;
            case 45:
                {
                alt5=4;
                }
                break;
            case 46:
                {
                alt5=5;
                }
                break;
            case 48:
                {
                alt5=6;
                }
                break;
            case 49:
                {
                alt5=7;
                }
                break;
            case 50:
                {
                alt5=8;
                }
                break;
            case 32:
                {
                alt5=9;
                }
                break;
            case 17:
                {
                alt5=10;
                }
                break;
            case 40:
                {
                alt5=11;
                }
                break;
            case 19:
                {
                alt5=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:293:5: this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getNaturalTypeDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalTypeDefinition_in_ruleTypeDefinition507);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:303:5: this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getIntegerTypeDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerTypeDefinition_in_ruleTypeDefinition534);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:313:5: this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getBooleanTypeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanTypeDefinition_in_ruleTypeDefinition561);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:323:5: this_RealTypeDefinition_3= ruleRealTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getRealTypeDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRealTypeDefinition_in_ruleTypeDefinition588);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:333:5: this_ArrayTypeDefinition_4= ruleArrayTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getArrayTypeDefinitionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayTypeDefinition_in_ruleTypeDefinition615);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:343:5: this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumerationTypeDefinitionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumerationTypeDefinition_in_ruleTypeDefinition642);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:353:5: this_RecordTypeDefinition_6= ruleRecordTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getRecordTypeDefinitionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRecordTypeDefinition_in_ruleTypeDefinition669);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:363:5: this_TupleTypeDefinition_7= ruleTupleTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTupleTypeDefinitionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTupleTypeDefinition_in_ruleTypeDefinition696);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:373:5: this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSubrangeTypeDefinitionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubrangeTypeDefinition_in_ruleTypeDefinition723);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:383:5: this_SubTypeDefinition_9= ruleSubTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSubTypeDefinitionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSubTypeDefinition_in_ruleTypeDefinition750);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:393:5: this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getFunctionTypeDefinitionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionTypeDefinition_in_ruleTypeDefinition777);
                    this_FunctionTypeDefinition_10=ruleFunctionTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FunctionTypeDefinition_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:403:5: this_ClockTypeDefinition_11= ruleClockTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getClockTypeDefinitionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleClockTypeDefinition_in_ruleTypeDefinition804);
                    this_ClockTypeDefinition_11=ruleClockTypeDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ClockTypeDefinition_11; 
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


    // $ANTLR start "entryRuleClockTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:419:1: entryRuleClockTypeDefinition returns [EObject current=null] : iv_ruleClockTypeDefinition= ruleClockTypeDefinition EOF ;
    public final EObject entryRuleClockTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClockTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:420:2: (iv_ruleClockTypeDefinition= ruleClockTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:421:2: iv_ruleClockTypeDefinition= ruleClockTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getClockTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleClockTypeDefinition_in_entryRuleClockTypeDefinition839);
            iv_ruleClockTypeDefinition=ruleClockTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleClockTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleClockTypeDefinition849); if (state.failed) return current;

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
    // $ANTLR end "entryRuleClockTypeDefinition"


    // $ANTLR start "ruleClockTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:428:1: ruleClockTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'clock' ) ;
    public final EObject ruleClockTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:431:28: ( ( () otherlv_1= 'clock' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:432:1: ( () otherlv_1= 'clock' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:432:1: ( () otherlv_1= 'clock' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:432:2: () otherlv_1= 'clock'
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:432:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:433:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getClockTypeDefinitionAccess().getClockTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleClockTypeDefinition895); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getClockTypeDefinitionAccess().getClockKeyword_1());
                  
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
    // $ANTLR end "ruleClockTypeDefinition"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:450:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:451:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:452:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression931);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression941); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:459:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ReferenceExpression_1= ruleReferenceExpression | this_LocationReferenceExpression_2= ruleLocationReferenceExpression | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_LiteralExpression_0 = null;

        EObject this_ReferenceExpression_1 = null;

        EObject this_LocationReferenceExpression_2 = null;

        EObject this_Expression_4 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:462:28: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ReferenceExpression_1= ruleReferenceExpression | this_LocationReferenceExpression_2= ruleLocationReferenceExpression | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:463:1: (this_LiteralExpression_0= ruleLiteralExpression | this_ReferenceExpression_1= ruleReferenceExpression | this_LocationReferenceExpression_2= ruleLocationReferenceExpression | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:463:1: (this_LiteralExpression_0= ruleLiteralExpression | this_ReferenceExpression_1= ruleReferenceExpression | this_LocationReferenceExpression_2= ruleLocationReferenceExpression | (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_DECIMAL:
            case 32:
            case 86:
            case 87:
            case 88:
            case 90:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 14:
                {
                alt6=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:464:5: this_LiteralExpression_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralExpression_in_rulePrimaryExpression988);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:474:5: this_ReferenceExpression_1= ruleReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getReferenceExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleReferenceExpression_in_rulePrimaryExpression1015);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:484:5: this_LocationReferenceExpression_2= ruleLocationReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLocationReferenceExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocationReferenceExpression_in_rulePrimaryExpression1042);
                    this_LocationReferenceExpression_2=ruleLocationReferenceExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocationReferenceExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:493:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:493:6: (otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')' )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:493:8: otherlv_3= '(' this_Expression_4= ruleExpression otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_rulePrimaryExpression1060); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_3_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimaryExpression1082);
                    this_Expression_4=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_5=(Token)match(input,16,FOLLOW_16_in_rulePrimaryExpression1093); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2());
                          
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


    // $ANTLR start "entryRuleLocationReferenceExpression"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:518:1: entryRuleLocationReferenceExpression returns [EObject current=null] : iv_ruleLocationReferenceExpression= ruleLocationReferenceExpression EOF ;
    public final EObject entryRuleLocationReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocationReferenceExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:519:2: (iv_ruleLocationReferenceExpression= ruleLocationReferenceExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:520:2: iv_ruleLocationReferenceExpression= ruleLocationReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLocationReferenceExpression_in_entryRuleLocationReferenceExpression1130);
            iv_ruleLocationReferenceExpression=ruleLocationReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocationReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationReferenceExpression1140); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocationReferenceExpression"


    // $ANTLR start "ruleLocationReferenceExpression"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:527:1: ruleLocationReferenceExpression returns [EObject current=null] : (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleLocationReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:530:28: ( (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:531:1: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:531:1: (otherlv_0= '@' ( (otherlv_1= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:531:3: otherlv_0= '@' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleLocationReferenceExpression1177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocationReferenceExpressionAccess().getCommercialAtKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:535:1: ( (otherlv_1= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:536:1: (otherlv_1= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:536:1: (otherlv_1= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:537:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getLocationReferenceExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocationReferenceExpression1197); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getLocationReferenceExpressionAccess().getLocationLocationCrossReference_1_0()); 
              	
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
    // $ANTLR end "ruleLocationReferenceExpression"


    // $ANTLR start "entryRuleSignumExpression"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:556:1: entryRuleSignumExpression returns [EObject current=null] : iv_ruleSignumExpression= ruleSignumExpression EOF ;
    public final EObject entryRuleSignumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignumExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:557:2: (iv_ruleSignumExpression= ruleSignumExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:558:2: iv_ruleSignumExpression= ruleSignumExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignumExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleSignumExpression_in_entryRuleSignumExpression1233);
            iv_ruleSignumExpression=ruleSignumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignumExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignumExpression1243); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:565:1: ruleSignumExpression returns [EObject current=null] : ( ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) ) | ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) ) | ( () ( ( 'd' )=>otherlv_7= 'd' ) ( (lv_operand_8_0= ruleSignumExpression ) ) ) | this_AccessExpression_9= ruleAccessExpression ) ;
    public final EObject ruleSignumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_operand_2_0 = null;

        EObject lv_operand_5_0 = null;

        EObject lv_operand_8_0 = null;

        EObject this_AccessExpression_9 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:568:28: ( ( ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) ) | ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) ) | ( () ( ( 'd' )=>otherlv_7= 'd' ) ( (lv_operand_8_0= ruleSignumExpression ) ) ) | this_AccessExpression_9= ruleAccessExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:569:1: ( ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) ) | ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) ) | ( () ( ( 'd' )=>otherlv_7= 'd' ) ( (lv_operand_8_0= ruleSignumExpression ) ) ) | this_AccessExpression_9= ruleAccessExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:569:1: ( ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) ) | ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) ) | ( () ( ( 'd' )=>otherlv_7= 'd' ) ( (lv_operand_8_0= ruleSignumExpression ) ) ) | this_AccessExpression_9= ruleAccessExpression )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
            case RULE_INTEGER:
            case RULE_DECIMAL:
            case 14:
            case 20:
            case 32:
            case 86:
            case 87:
            case 88:
            case 90:
                {
                alt7=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:569:2: ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:569:2: ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:569:3: () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:569:3: ()
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:570:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSignumExpressionAccess().getUnaryMinusExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:575:2: ( ( '-' )=>otherlv_1= '-' )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:575:3: ( '-' )=>otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSignumExpression1298); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSignumExpressionAccess().getHyphenMinusKeyword_0_1());
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:580:2: ( (lv_operand_2_0= ruleSignumExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:581:1: (lv_operand_2_0= ruleSignumExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:581:1: (lv_operand_2_0= ruleSignumExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:582:3: lv_operand_2_0= ruleSignumExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignumExpressionAccess().getOperandSignumExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignumExpression_in_ruleSignumExpression1320);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:599:6: ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:599:6: ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:599:7: () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:599:7: ()
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:600:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSignumExpressionAccess().getUnaryPlusExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:605:2: ( ( '+' )=>otherlv_4= '+' )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:605:3: ( '+' )=>otherlv_4= '+'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleSignumExpression1357); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSignumExpressionAccess().getPlusSignKeyword_1_1());
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:610:2: ( (lv_operand_5_0= ruleSignumExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:611:1: (lv_operand_5_0= ruleSignumExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:611:1: (lv_operand_5_0= ruleSignumExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:612:3: lv_operand_5_0= ruleSignumExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignumExpressionAccess().getOperandSignumExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignumExpression_in_ruleSignumExpression1379);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:629:6: ( () ( ( 'd' )=>otherlv_7= 'd' ) ( (lv_operand_8_0= ruleSignumExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:629:6: ( () ( ( 'd' )=>otherlv_7= 'd' ) ( (lv_operand_8_0= ruleSignumExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:629:7: () ( ( 'd' )=>otherlv_7= 'd' ) ( (lv_operand_8_0= ruleSignumExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:629:7: ()
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:630:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSignumExpressionAccess().getDotExpressionAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:635:2: ( ( 'd' )=>otherlv_7= 'd' )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:635:3: ( 'd' )=>otherlv_7= 'd'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleSignumExpression1416); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getSignumExpressionAccess().getDKeyword_2_1());
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:640:2: ( (lv_operand_8_0= ruleSignumExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:641:1: (lv_operand_8_0= ruleSignumExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:641:1: (lv_operand_8_0= ruleSignumExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:642:3: lv_operand_8_0= ruleSignumExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignumExpressionAccess().getOperandSignumExpressionParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSignumExpression_in_ruleSignumExpression1438);
                    lv_operand_8_0=ruleSignumExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSignumExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_8_0, 
                              		"SignumExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:660:5: this_AccessExpression_9= ruleAccessExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignumExpressionAccess().getAccessExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAccessExpression_in_ruleSignumExpression1467);
                    this_AccessExpression_9=ruleAccessExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AccessExpression_9; 
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


    // $ANTLR start "entryRuleHybridAutomatonDeclaration"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:676:1: entryRuleHybridAutomatonDeclaration returns [EObject current=null] : iv_ruleHybridAutomatonDeclaration= ruleHybridAutomatonDeclaration EOF ;
    public final EObject entryRuleHybridAutomatonDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHybridAutomatonDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:677:2: (iv_ruleHybridAutomatonDeclaration= ruleHybridAutomatonDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:678:2: iv_ruleHybridAutomatonDeclaration= ruleHybridAutomatonDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHybridAutomatonDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleHybridAutomatonDeclaration_in_entryRuleHybridAutomatonDeclaration1502);
            iv_ruleHybridAutomatonDeclaration=ruleHybridAutomatonDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHybridAutomatonDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHybridAutomatonDeclaration1512); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHybridAutomatonDeclaration"


    // $ANTLR start "ruleHybridAutomatonDeclaration"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:685:1: ruleHybridAutomatonDeclaration returns [EObject current=null] : (otherlv_0= 'automaton' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':=' ( (lv_hybridAutomaton_8_0= ruleHybridAutomaton ) ) ) ;
    public final EObject ruleHybridAutomatonDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameterDeclarations_3_0 = null;

        EObject lv_parameterDeclarations_5_0 = null;

        EObject lv_hybridAutomaton_8_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:688:28: ( (otherlv_0= 'automaton' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':=' ( (lv_hybridAutomaton_8_0= ruleHybridAutomaton ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:689:1: (otherlv_0= 'automaton' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':=' ( (lv_hybridAutomaton_8_0= ruleHybridAutomaton ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:689:1: (otherlv_0= 'automaton' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':=' ( (lv_hybridAutomaton_8_0= ruleHybridAutomaton ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:689:3: otherlv_0= 'automaton' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':=' ( (lv_hybridAutomaton_8_0= ruleHybridAutomaton ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleHybridAutomatonDeclaration1549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHybridAutomatonDeclarationAccess().getAutomatonKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:693:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:694:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:694:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:695:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHybridAutomatonDeclaration1566); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getHybridAutomatonDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHybridAutomatonDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:711:2: (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:711:4: otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleHybridAutomatonDeclaration1584); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getHybridAutomatonDeclarationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:715:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==RULE_ID) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:715:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            {
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:715:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:716:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            {
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:716:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:717:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getHybridAutomatonDeclarationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleHybridAutomatonDeclaration1606);
                            lv_parameterDeclarations_3_0=ruleParameterDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getHybridAutomatonDeclarationRule());
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

                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:733:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            loop8:
                            do {
                                int alt8=2;
                                int LA8_0 = input.LA(1);

                                if ( (LA8_0==15) ) {
                                    alt8=1;
                                }


                                switch (alt8) {
                            	case 1 :
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:733:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleHybridAutomatonDeclaration1619); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getHybridAutomatonDeclarationAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:737:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:738:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    {
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:738:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:739:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getHybridAutomatonDeclarationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleHybridAutomatonDeclaration1640);
                            	    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getHybridAutomatonDeclarationRule());
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
                            	    break loop8;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleHybridAutomatonDeclaration1656); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getHybridAutomatonDeclarationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleHybridAutomatonDeclaration1670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getHybridAutomatonDeclarationAccess().getColonEqualsSignKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:763:1: ( (lv_hybridAutomaton_8_0= ruleHybridAutomaton ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:764:1: (lv_hybridAutomaton_8_0= ruleHybridAutomaton )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:764:1: (lv_hybridAutomaton_8_0= ruleHybridAutomaton )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:765:3: lv_hybridAutomaton_8_0= ruleHybridAutomaton
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHybridAutomatonDeclarationAccess().getHybridAutomatonHybridAutomatonParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHybridAutomaton_in_ruleHybridAutomatonDeclaration1691);
            lv_hybridAutomaton_8_0=ruleHybridAutomaton();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHybridAutomatonDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"hybridAutomaton",
                      		lv_hybridAutomaton_8_0, 
                      		"HybridAutomaton");
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
    // $ANTLR end "ruleHybridAutomatonDeclaration"


    // $ANTLR start "entryRuleHybridAutomaton"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:789:1: entryRuleHybridAutomaton returns [EObject current=null] : iv_ruleHybridAutomaton= ruleHybridAutomaton EOF ;
    public final EObject entryRuleHybridAutomaton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHybridAutomaton = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:790:2: (iv_ruleHybridAutomaton= ruleHybridAutomaton EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:791:2: iv_ruleHybridAutomaton= ruleHybridAutomaton EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHybridAutomatonRule()); 
            }
            pushFollow(FOLLOW_ruleHybridAutomaton_in_entryRuleHybridAutomaton1727);
            iv_ruleHybridAutomaton=ruleHybridAutomaton();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHybridAutomaton; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHybridAutomaton1737); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHybridAutomaton"


    // $ANTLR start "ruleHybridAutomaton"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:798:1: ruleHybridAutomaton returns [EObject current=null] : this_HybridAutomatonDefinition_0= ruleHybridAutomatonDefinition ;
    public final EObject ruleHybridAutomaton() throws RecognitionException {
        EObject current = null;

        EObject this_HybridAutomatonDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:801:28: (this_HybridAutomatonDefinition_0= ruleHybridAutomatonDefinition )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:803:5: this_HybridAutomatonDefinition_0= ruleHybridAutomatonDefinition
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getHybridAutomatonAccess().getHybridAutomatonDefinitionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleHybridAutomatonDefinition_in_ruleHybridAutomaton1783);
            this_HybridAutomatonDefinition_0=ruleHybridAutomatonDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_HybridAutomatonDefinition_0; 
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
    // $ANTLR end "ruleHybridAutomaton"


    // $ANTLR start "entryRuleHybridAutomatonDefinition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:819:1: entryRuleHybridAutomatonDefinition returns [EObject current=null] : iv_ruleHybridAutomatonDefinition= ruleHybridAutomatonDefinition EOF ;
    public final EObject entryRuleHybridAutomatonDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHybridAutomatonDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:820:2: (iv_ruleHybridAutomatonDefinition= ruleHybridAutomatonDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:821:2: iv_ruleHybridAutomatonDefinition= ruleHybridAutomatonDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHybridAutomatonDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleHybridAutomatonDefinition_in_entryRuleHybridAutomatonDefinition1817);
            iv_ruleHybridAutomatonDefinition=ruleHybridAutomatonDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHybridAutomatonDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHybridAutomatonDefinition1827); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHybridAutomatonDefinition"


    // $ANTLR start "ruleHybridAutomatonDefinition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:828:1: ruleHybridAutomatonDefinition returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) ) | ( (lv_locations_3_0= ruleLocation ) ) | ( (lv_transitions_4_0= ruleTransition ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleHybridAutomatonDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_variableDeclarations_2_0 = null;

        EObject lv_locations_3_0 = null;

        EObject lv_transitions_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:831:28: ( ( () otherlv_1= '{' ( ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) ) | ( (lv_locations_3_0= ruleLocation ) ) | ( (lv_transitions_4_0= ruleTransition ) ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:832:1: ( () otherlv_1= '{' ( ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) ) | ( (lv_locations_3_0= ruleLocation ) ) | ( (lv_transitions_4_0= ruleTransition ) ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:832:1: ( () otherlv_1= '{' ( ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) ) | ( (lv_locations_3_0= ruleLocation ) ) | ( (lv_transitions_4_0= ruleTransition ) ) )* otherlv_5= '}' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:832:2: () otherlv_1= '{' ( ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) ) | ( (lv_locations_3_0= ruleLocation ) ) | ( (lv_transitions_4_0= ruleTransition ) ) )* otherlv_5= '}'
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:832:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:833:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getHybridAutomatonDefinitionAccess().getHybridAutomatonDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleHybridAutomatonDefinition1873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getHybridAutomatonDefinitionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:842:1: ( ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) ) | ( (lv_locations_3_0= ruleLocation ) ) | ( (lv_transitions_4_0= ruleTransition ) ) )*
            loop11:
            do {
                int alt11=4;
                switch ( input.LA(1) ) {
                case 26:
                case 28:
                    {
                    alt11=1;
                    }
                    break;
                case 29:
                    {
                    alt11=2;
                    }
                    break;
                case 30:
                    {
                    alt11=3;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:842:2: ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:842:2: ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:843:1: (lv_variableDeclarations_2_0= ruleVariableDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:843:1: (lv_variableDeclarations_2_0= ruleVariableDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:844:3: lv_variableDeclarations_2_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHybridAutomatonDefinitionAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVariableDeclaration_in_ruleHybridAutomatonDefinition1895);
            	    lv_variableDeclarations_2_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHybridAutomatonDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"variableDeclarations",
            	              		lv_variableDeclarations_2_0, 
            	              		"VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:861:6: ( (lv_locations_3_0= ruleLocation ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:861:6: ( (lv_locations_3_0= ruleLocation ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:862:1: (lv_locations_3_0= ruleLocation )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:862:1: (lv_locations_3_0= ruleLocation )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:863:3: lv_locations_3_0= ruleLocation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHybridAutomatonDefinitionAccess().getLocationsLocationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLocation_in_ruleHybridAutomatonDefinition1922);
            	    lv_locations_3_0=ruleLocation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHybridAutomatonDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"locations",
            	              		lv_locations_3_0, 
            	              		"Location");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:880:6: ( (lv_transitions_4_0= ruleTransition ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:880:6: ( (lv_transitions_4_0= ruleTransition ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:881:1: (lv_transitions_4_0= ruleTransition )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:881:1: (lv_transitions_4_0= ruleTransition )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:882:3: lv_transitions_4_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getHybridAutomatonDefinitionAccess().getTransitionsTransitionParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleHybridAutomatonDefinition1949);
            	    lv_transitions_4_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getHybridAutomatonDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transitions",
            	              		lv_transitions_4_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleHybridAutomatonDefinition1963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getHybridAutomatonDefinitionAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleHybridAutomatonDefinition"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:910:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:911:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:912:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1999);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableDeclaration2009); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:919:1: ruleVariableDeclaration returns [EObject current=null] : (this_GlobalVariableDeclaration_0= ruleGlobalVariableDeclaration | this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalVariableDeclaration_0 = null;

        EObject this_LocalVariableDeclaration_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:922:28: ( (this_GlobalVariableDeclaration_0= ruleGlobalVariableDeclaration | this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:923:1: (this_GlobalVariableDeclaration_0= ruleGlobalVariableDeclaration | this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:923:1: (this_GlobalVariableDeclaration_0= ruleGlobalVariableDeclaration | this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==28) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:924:5: this_GlobalVariableDeclaration_0= ruleGlobalVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getGlobalVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGlobalVariableDeclaration_in_ruleVariableDeclaration2056);
                    this_GlobalVariableDeclaration_0=ruleGlobalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GlobalVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:934:5: this_LocalVariableDeclaration_1= ruleLocalVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getLocalVariableDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLocalVariableDeclaration_in_ruleVariableDeclaration2083);
                    this_LocalVariableDeclaration_1=ruleLocalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalVariableDeclaration_1; 
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleGlobalVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:950:1: entryRuleGlobalVariableDeclaration returns [EObject current=null] : iv_ruleGlobalVariableDeclaration= ruleGlobalVariableDeclaration EOF ;
    public final EObject entryRuleGlobalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalVariableDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:951:2: (iv_ruleGlobalVariableDeclaration= ruleGlobalVariableDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:952:2: iv_ruleGlobalVariableDeclaration= ruleGlobalVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleGlobalVariableDeclaration_in_entryRuleGlobalVariableDeclaration2118);
            iv_ruleGlobalVariableDeclaration=ruleGlobalVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalVariableDeclaration2128); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGlobalVariableDeclaration"


    // $ANTLR start "ruleGlobalVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:959:1: ruleGlobalVariableDeclaration returns [EObject current=null] : (otherlv_0= 'global' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleGlobalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:962:28: ( (otherlv_0= 'global' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:963:1: (otherlv_0= 'global' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:963:1: (otherlv_0= 'global' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:963:3: otherlv_0= 'global' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleGlobalVariableDeclaration2165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalVariableDeclarationAccess().getGlobalKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:967:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:968:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:968:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:969:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalVariableDeclaration2182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getGlobalVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGlobalVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleGlobalVariableDeclaration2199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGlobalVariableDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:989:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:990:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:990:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:991:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGlobalVariableDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleGlobalVariableDeclaration2220);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGlobalVariableDeclarationRule());
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
    // $ANTLR end "ruleGlobalVariableDeclaration"


    // $ANTLR start "entryRuleLocalVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1015:1: entryRuleLocalVariableDeclaration returns [EObject current=null] : iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF ;
    public final EObject entryRuleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1016:2: (iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1017:2: iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLocalVariableDeclaration_in_entryRuleLocalVariableDeclaration2256);
            iv_ruleLocalVariableDeclaration=ruleLocalVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVariableDeclaration2266); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocalVariableDeclaration"


    // $ANTLR start "ruleLocalVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1024:1: ruleLocalVariableDeclaration returns [EObject current=null] : (otherlv_0= 'local' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1027:28: ( (otherlv_0= 'local' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1028:1: (otherlv_0= 'local' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1028:1: (otherlv_0= 'local' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1028:3: otherlv_0= 'local' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleLocalVariableDeclaration2303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocalVariableDeclarationAccess().getLocalKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1032:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1033:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1033:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1034:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration2320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLocalVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleLocalVariableDeclaration2337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLocalVariableDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1054:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1055:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1055:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1056:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleLocalVariableDeclaration2358);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalVariableDeclarationRule());
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
    // $ANTLR end "ruleLocalVariableDeclaration"


    // $ANTLR start "entryRuleLocation"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1080:1: entryRuleLocation returns [EObject current=null] : iv_ruleLocation= ruleLocation EOF ;
    public final EObject entryRuleLocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocation = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1081:2: (iv_ruleLocation= ruleLocation EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1082:2: iv_ruleLocation= ruleLocation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocationRule()); 
            }
            pushFollow(FOLLOW_ruleLocation_in_entryRuleLocation2394);
            iv_ruleLocation=ruleLocation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocation2404); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLocation"


    // $ANTLR start "ruleLocation"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1089:1: ruleLocation returns [EObject current=null] : (otherlv_0= 'location' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_conditions_3_0= ruleCondition ) )* otherlv_4= '}' )? ) ;
    public final EObject ruleLocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_conditions_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1092:28: ( (otherlv_0= 'location' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_conditions_3_0= ruleCondition ) )* otherlv_4= '}' )? ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1093:1: (otherlv_0= 'location' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_conditions_3_0= ruleCondition ) )* otherlv_4= '}' )? )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1093:1: (otherlv_0= 'location' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_conditions_3_0= ruleCondition ) )* otherlv_4= '}' )? )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1093:3: otherlv_0= 'location' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '{' ( (lv_conditions_3_0= ruleCondition ) )* otherlv_4= '}' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleLocation2441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocationAccess().getLocationKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1097:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1098:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1098:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1099:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocation2458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getLocationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1115:2: (otherlv_2= '{' ( (lv_conditions_3_0= ruleCondition ) )* otherlv_4= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1115:4: otherlv_2= '{' ( (lv_conditions_3_0= ruleCondition ) )* otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleLocation2476); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getLocationAccess().getLeftCurlyBracketKeyword_2_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1119:1: ( (lv_conditions_3_0= ruleCondition ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>=34 && LA13_0<=36)) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1120:1: (lv_conditions_3_0= ruleCondition )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1120:1: (lv_conditions_3_0= ruleCondition )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1121:3: lv_conditions_3_0= ruleCondition
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getLocationAccess().getConditionsConditionParserRuleCall_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleCondition_in_ruleLocation2497);
                    	    lv_conditions_3_0=ruleCondition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getLocationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"conditions",
                    	              		lv_conditions_3_0, 
                    	              		"Condition");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleLocation2510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getLocationAccess().getRightCurlyBracketKeyword_2_2());
                          
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
    // $ANTLR end "ruleLocation"


    // $ANTLR start "entryRuleTransition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1149:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1150:2: (iv_ruleTransition= ruleTransition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1151:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition2548);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition2558); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1158:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) (otherlv_6= ',' ( (lv_parameterDeclarations_7_0= ruleParameterDeclaration ) ) )* otherlv_8= ')' )? (otherlv_9= '[' ( (lv_guards_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_guards_12_0= ruleExpression ) ) )* otherlv_13= ']' )? (otherlv_14= '{' ( (lv_assignments_15_0= ruleAssignment ) ) (otherlv_16= ',' ( (lv_assignments_17_0= ruleAssignment ) ) )* otherlv_18= '}' )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_parameterDeclarations_5_0 = null;

        EObject lv_parameterDeclarations_7_0 = null;

        EObject lv_guards_10_0 = null;

        EObject lv_guards_12_0 = null;

        EObject lv_assignments_15_0 = null;

        EObject lv_assignments_17_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1161:28: ( (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) (otherlv_6= ',' ( (lv_parameterDeclarations_7_0= ruleParameterDeclaration ) ) )* otherlv_8= ')' )? (otherlv_9= '[' ( (lv_guards_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_guards_12_0= ruleExpression ) ) )* otherlv_13= ']' )? (otherlv_14= '{' ( (lv_assignments_15_0= ruleAssignment ) ) (otherlv_16= ',' ( (lv_assignments_17_0= ruleAssignment ) ) )* otherlv_18= '}' )? ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1162:1: (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) (otherlv_6= ',' ( (lv_parameterDeclarations_7_0= ruleParameterDeclaration ) ) )* otherlv_8= ')' )? (otherlv_9= '[' ( (lv_guards_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_guards_12_0= ruleExpression ) ) )* otherlv_13= ']' )? (otherlv_14= '{' ( (lv_assignments_15_0= ruleAssignment ) ) (otherlv_16= ',' ( (lv_assignments_17_0= ruleAssignment ) ) )* otherlv_18= '}' )? )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1162:1: (otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) (otherlv_6= ',' ( (lv_parameterDeclarations_7_0= ruleParameterDeclaration ) ) )* otherlv_8= ')' )? (otherlv_9= '[' ( (lv_guards_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_guards_12_0= ruleExpression ) ) )* otherlv_13= ']' )? (otherlv_14= '{' ( (lv_assignments_15_0= ruleAssignment ) ) (otherlv_16= ',' ( (lv_assignments_17_0= ruleAssignment ) ) )* otherlv_18= '}' )? )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1162:3: otherlv_0= 'transition' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'to' ( (otherlv_3= RULE_ID ) ) (otherlv_4= '(' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) (otherlv_6= ',' ( (lv_parameterDeclarations_7_0= ruleParameterDeclaration ) ) )* otherlv_8= ')' )? (otherlv_9= '[' ( (lv_guards_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_guards_12_0= ruleExpression ) ) )* otherlv_13= ']' )? (otherlv_14= '{' ( (lv_assignments_15_0= ruleAssignment ) ) (otherlv_16= ',' ( (lv_assignments_17_0= ruleAssignment ) ) )* otherlv_18= '}' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleTransition2595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1166:1: ( (otherlv_1= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1167:1: (otherlv_1= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1167:1: (otherlv_1= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1168:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition2615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getSourceLocationCrossReference_1_0()); 
              	
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_31_in_ruleTransition2627); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1183:1: ( (otherlv_3= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1184:1: (otherlv_3= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1184:1: (otherlv_3= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1185:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition2647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTargetLocationCrossReference_3_0()); 
              	
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1196:2: (otherlv_4= '(' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) (otherlv_6= ',' ( (lv_parameterDeclarations_7_0= ruleParameterDeclaration ) ) )* otherlv_8= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1196:4: otherlv_4= '(' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) (otherlv_6= ',' ( (lv_parameterDeclarations_7_0= ruleParameterDeclaration ) ) )* otherlv_8= ')'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTransition2660); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1200:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1201:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1201:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1202:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleTransition2681);
                    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
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

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1218:2: (otherlv_6= ',' ( (lv_parameterDeclarations_7_0= ruleParameterDeclaration ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==15) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1218:4: otherlv_6= ',' ( (lv_parameterDeclarations_7_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleTransition2694); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1222:1: ( (lv_parameterDeclarations_7_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1223:1: (lv_parameterDeclarations_7_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1223:1: (lv_parameterDeclarations_7_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1224:3: lv_parameterDeclarations_7_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleTransition2715);
                    	    lv_parameterDeclarations_7_0=ruleParameterDeclaration();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"parameterDeclarations",
                    	              		lv_parameterDeclarations_7_0, 
                    	              		"ParameterDeclaration");
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

                    otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleTransition2729); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_4_3());
                          
                    }

                    }
                    break;

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1244:3: (otherlv_9= '[' ( (lv_guards_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_guards_12_0= ruleExpression ) ) )* otherlv_13= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1244:5: otherlv_9= '[' ( (lv_guards_10_0= ruleExpression ) ) (otherlv_11= ',' ( (lv_guards_12_0= ruleExpression ) ) )* otherlv_13= ']'
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleTransition2744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getLeftSquareBracketKeyword_5_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1248:1: ( (lv_guards_10_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1249:1: (lv_guards_10_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1249:1: (lv_guards_10_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1250:3: lv_guards_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsExpressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleTransition2765);
                    lv_guards_10_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                      	        }
                             		add(
                             			current, 
                             			"guards",
                              		lv_guards_10_0, 
                              		"Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1266:2: (otherlv_11= ',' ( (lv_guards_12_0= ruleExpression ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1266:4: otherlv_11= ',' ( (lv_guards_12_0= ruleExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleTransition2778); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1270:1: ( (lv_guards_12_0= ruleExpression ) )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1271:1: (lv_guards_12_0= ruleExpression )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1271:1: (lv_guards_12_0= ruleExpression )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1272:3: lv_guards_12_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardsExpressionParserRuleCall_5_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleExpression_in_ruleTransition2799);
                    	    lv_guards_12_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"guards",
                    	              		lv_guards_12_0, 
                    	              		"Expression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,33,FOLLOW_33_in_ruleTransition2813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getRightSquareBracketKeyword_5_3());
                          
                    }

                    }
                    break;

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1292:3: (otherlv_14= '{' ( (lv_assignments_15_0= ruleAssignment ) ) (otherlv_16= ',' ( (lv_assignments_17_0= ruleAssignment ) ) )* otherlv_18= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1292:5: otherlv_14= '{' ( (lv_assignments_15_0= ruleAssignment ) ) (otherlv_16= ',' ( (lv_assignments_17_0= ruleAssignment ) ) )* otherlv_18= '}'
                    {
                    otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleTransition2828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_6_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1296:1: ( (lv_assignments_15_0= ruleAssignment ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1297:1: (lv_assignments_15_0= ruleAssignment )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1297:1: (lv_assignments_15_0= ruleAssignment )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1298:3: lv_assignments_15_0= ruleAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTransitionAccess().getAssignmentsAssignmentParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_ruleTransition2849);
                    lv_assignments_15_0=ruleAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                      	        }
                             		add(
                             			current, 
                             			"assignments",
                              		lv_assignments_15_0, 
                              		"Assignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1314:2: (otherlv_16= ',' ( (lv_assignments_17_0= ruleAssignment ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==15) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1314:4: otherlv_16= ',' ( (lv_assignments_17_0= ruleAssignment ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FOLLOW_15_in_ruleTransition2862); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_16, grammarAccess.getTransitionAccess().getCommaKeyword_6_2_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1318:1: ( (lv_assignments_17_0= ruleAssignment ) )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1319:1: (lv_assignments_17_0= ruleAssignment )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1319:1: (lv_assignments_17_0= ruleAssignment )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1320:3: lv_assignments_17_0= ruleAssignment
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionAccess().getAssignmentsAssignmentParserRuleCall_6_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAssignment_in_ruleTransition2883);
                    	    lv_assignments_17_0=ruleAssignment();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"assignments",
                    	              		lv_assignments_17_0, 
                    	              		"Assignment");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleTransition2897); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6_3());
                          
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleAssignment"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1348:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1349:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1350:2: iv_ruleAssignment= ruleAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment2935);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment2945); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1357:1: ruleAssignment returns [EObject current=null] : ( ( (lv_lhs_0_0= ruleExpression ) ) otherlv_1= ':=' ( (lv_rhs_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_lhs_0_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1360:28: ( ( ( (lv_lhs_0_0= ruleExpression ) ) otherlv_1= ':=' ( (lv_rhs_2_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1361:1: ( ( (lv_lhs_0_0= ruleExpression ) ) otherlv_1= ':=' ( (lv_rhs_2_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1361:1: ( ( (lv_lhs_0_0= ruleExpression ) ) otherlv_1= ':=' ( (lv_rhs_2_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1361:2: ( (lv_lhs_0_0= ruleExpression ) ) otherlv_1= ':=' ( (lv_rhs_2_0= ruleExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1361:2: ( (lv_lhs_0_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1362:1: (lv_lhs_0_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1362:1: (lv_lhs_0_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1363:3: lv_lhs_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getLhsExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment2991);
            lv_lhs_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"lhs",
                      		lv_lhs_0_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAssignment3003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getColonEqualsSignKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1383:1: ( (lv_rhs_2_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1384:1: (lv_rhs_2_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1384:1: (lv_rhs_2_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1385:3: lv_rhs_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssignmentAccess().getRhsExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleAssignment3024);
            lv_rhs_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
              	        }
                     		set(
                     			current, 
                     			"rhs",
                      		lv_rhs_2_0, 
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleCondition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1409:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1410:2: (iv_ruleCondition= ruleCondition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1411:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_ruleCondition_in_entryRuleCondition3060);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCondition3070); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1418:1: ruleCondition returns [EObject current=null] : (this_InitialCondition_0= ruleInitialCondition | this_InvariantCondition_1= ruleInvariantCondition | this_FlowCondition_2= ruleFlowCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_InitialCondition_0 = null;

        EObject this_InvariantCondition_1 = null;

        EObject this_FlowCondition_2 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1421:28: ( (this_InitialCondition_0= ruleInitialCondition | this_InvariantCondition_1= ruleInvariantCondition | this_FlowCondition_2= ruleFlowCondition ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1422:1: (this_InitialCondition_0= ruleInitialCondition | this_InvariantCondition_1= ruleInvariantCondition | this_FlowCondition_2= ruleFlowCondition )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1422:1: (this_InitialCondition_0= ruleInitialCondition | this_InvariantCondition_1= ruleInvariantCondition | this_FlowCondition_2= ruleFlowCondition )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt21=1;
                }
                break;
            case 35:
                {
                alt21=2;
                }
                break;
            case 36:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1423:5: this_InitialCondition_0= ruleInitialCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getInitialConditionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInitialCondition_in_ruleCondition3117);
                    this_InitialCondition_0=ruleInitialCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InitialCondition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1433:5: this_InvariantCondition_1= ruleInvariantCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getInvariantConditionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInvariantCondition_in_ruleCondition3144);
                    this_InvariantCondition_1=ruleInvariantCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvariantCondition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1443:5: this_FlowCondition_2= ruleFlowCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getFlowConditionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFlowCondition_in_ruleCondition3171);
                    this_FlowCondition_2=ruleFlowCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_FlowCondition_2; 
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleInitialCondition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1459:1: entryRuleInitialCondition returns [EObject current=null] : iv_ruleInitialCondition= ruleInitialCondition EOF ;
    public final EObject entryRuleInitialCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialCondition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1460:2: (iv_ruleInitialCondition= ruleInitialCondition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1461:2: iv_ruleInitialCondition= ruleInitialCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitialConditionRule()); 
            }
            pushFollow(FOLLOW_ruleInitialCondition_in_entryRuleInitialCondition3206);
            iv_ruleInitialCondition=ruleInitialCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitialCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitialCondition3216); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInitialCondition"


    // $ANTLR start "ruleInitialCondition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1468:1: ruleInitialCondition returns [EObject current=null] : (otherlv_0= 'initial' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleInitialCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1471:28: ( (otherlv_0= 'initial' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1472:1: (otherlv_0= 'initial' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1472:1: (otherlv_0= 'initial' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1472:3: otherlv_0= 'initial' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleInitialCondition3253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInitialConditionAccess().getInitialKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1476:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1477:1: (lv_expression_1_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1477:1: (lv_expression_1_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1478:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInitialConditionAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInitialCondition3274);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInitialConditionRule());
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
    // $ANTLR end "ruleInitialCondition"


    // $ANTLR start "entryRuleInvariantCondition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1502:1: entryRuleInvariantCondition returns [EObject current=null] : iv_ruleInvariantCondition= ruleInvariantCondition EOF ;
    public final EObject entryRuleInvariantCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantCondition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1503:2: (iv_ruleInvariantCondition= ruleInvariantCondition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1504:2: iv_ruleInvariantCondition= ruleInvariantCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvariantConditionRule()); 
            }
            pushFollow(FOLLOW_ruleInvariantCondition_in_entryRuleInvariantCondition3310);
            iv_ruleInvariantCondition=ruleInvariantCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariantCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvariantCondition3320); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInvariantCondition"


    // $ANTLR start "ruleInvariantCondition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1511:1: ruleInvariantCondition returns [EObject current=null] : (otherlv_0= 'invariant' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleInvariantCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1514:28: ( (otherlv_0= 'invariant' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1515:1: (otherlv_0= 'invariant' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1515:1: (otherlv_0= 'invariant' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1515:3: otherlv_0= 'invariant' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleInvariantCondition3357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInvariantConditionAccess().getInvariantKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1519:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1520:1: (lv_expression_1_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1520:1: (lv_expression_1_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1521:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInvariantConditionAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleInvariantCondition3378);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInvariantConditionRule());
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
    // $ANTLR end "ruleInvariantCondition"


    // $ANTLR start "entryRuleFlowCondition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1545:1: entryRuleFlowCondition returns [EObject current=null] : iv_ruleFlowCondition= ruleFlowCondition EOF ;
    public final EObject entryRuleFlowCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlowCondition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1546:2: (iv_ruleFlowCondition= ruleFlowCondition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1547:2: iv_ruleFlowCondition= ruleFlowCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowConditionRule()); 
            }
            pushFollow(FOLLOW_ruleFlowCondition_in_entryRuleFlowCondition3414);
            iv_ruleFlowCondition=ruleFlowCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlowCondition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlowCondition3424); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFlowCondition"


    // $ANTLR start "ruleFlowCondition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1554:1: ruleFlowCondition returns [EObject current=null] : (otherlv_0= 'flow' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleFlowCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1557:28: ( (otherlv_0= 'flow' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1558:1: (otherlv_0= 'flow' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1558:1: (otherlv_0= 'flow' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1558:3: otherlv_0= 'flow' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleFlowCondition3461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFlowConditionAccess().getFlowKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1562:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1563:1: (lv_expression_1_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1563:1: (lv_expression_1_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1564:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFlowConditionAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFlowCondition3482);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFlowConditionRule());
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
    // $ANTLR end "ruleFlowCondition"


    // $ANTLR start "entryRulePropertyDeclaration"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1588:1: entryRulePropertyDeclaration returns [EObject current=null] : iv_rulePropertyDeclaration= rulePropertyDeclaration EOF ;
    public final EObject entryRulePropertyDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1589:2: (iv_rulePropertyDeclaration= rulePropertyDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1590:2: iv_rulePropertyDeclaration= rulePropertyDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyDeclarationRule()); 
            }
            pushFollow(FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration3518);
            iv_rulePropertyDeclaration=rulePropertyDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDeclaration3528); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyDeclaration"


    // $ANTLR start "rulePropertyDeclaration"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1597:1: rulePropertyDeclaration returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_hybridAutomaton_3_0= ruleHybridAutomaton ) ) otherlv_4= 'models' ( (lv_expression_5_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_hybridAutomaton_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1600:28: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_hybridAutomaton_3_0= ruleHybridAutomaton ) ) otherlv_4= 'models' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1601:1: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_hybridAutomaton_3_0= ruleHybridAutomaton ) ) otherlv_4= 'models' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1601:1: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_hybridAutomaton_3_0= ruleHybridAutomaton ) ) otherlv_4= 'models' ( (lv_expression_5_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1601:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_hybridAutomaton_3_0= ruleHybridAutomaton ) ) otherlv_4= 'models' ( (lv_expression_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_rulePropertyDeclaration3565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyDeclarationAccess().getPropertyKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1605:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1606:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1606:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1607:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePropertyDeclaration3582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPropertyDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_rulePropertyDeclaration3599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1627:1: ( (lv_hybridAutomaton_3_0= ruleHybridAutomaton ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1628:1: (lv_hybridAutomaton_3_0= ruleHybridAutomaton )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1628:1: (lv_hybridAutomaton_3_0= ruleHybridAutomaton )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1629:3: lv_hybridAutomaton_3_0= ruleHybridAutomaton
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getHybridAutomatonHybridAutomatonParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHybridAutomaton_in_rulePropertyDeclaration3620);
            lv_hybridAutomaton_3_0=ruleHybridAutomaton();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"hybridAutomaton",
                      		lv_hybridAutomaton_3_0, 
                      		"HybridAutomaton");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_38_in_rulePropertyDeclaration3632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPropertyDeclarationAccess().getModelsKeyword_4());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1649:1: ( (lv_expression_5_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1650:1: (lv_expression_5_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1650:1: (lv_expression_5_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1651:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getExpressionExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_rulePropertyDeclaration3653);
            lv_expression_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyDeclarationRule());
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
    // $ANTLR end "rulePropertyDeclaration"


    // $ANTLR start "entryRuleParameterDeclaration"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1677:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1678:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1679:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration3691);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterDeclaration3701); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1686:1: ruleParameterDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1689:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1690:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1690:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1690:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1690:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1691:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterDeclarationAccess().getParameterDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1696:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1697:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1697:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1698:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleParameterDeclaration3752); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleParameterDeclaration3769); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParameterDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1718:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1719:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1719:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1720:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleParameterDeclaration3790);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1744:1: entryRuleFieldDeclaration returns [EObject current=null] : iv_ruleFieldDeclaration= ruleFieldDeclaration EOF ;
    public final EObject entryRuleFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1745:2: (iv_ruleFieldDeclaration= ruleFieldDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1746:2: iv_ruleFieldDeclaration= ruleFieldDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFieldDeclaration_in_entryRuleFieldDeclaration3826);
            iv_ruleFieldDeclaration=ruleFieldDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldDeclaration3836); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1753:1: ruleFieldDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1756:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1757:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1757:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1757:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1757:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1758:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFieldDeclarationAccess().getFieldDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1763:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1764:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1764:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1765:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldDeclaration3887); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleFieldDeclaration3904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFieldDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1785:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1786:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1786:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1787:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleFieldDeclaration3925);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1811:1: entryRuleLetDeclaration returns [EObject current=null] : iv_ruleLetDeclaration= ruleLetDeclaration EOF ;
    public final EObject entryRuleLetDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1812:2: (iv_ruleLetDeclaration= ruleLetDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1813:2: iv_ruleLetDeclaration= ruleLetDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleLetDeclaration_in_entryRuleLetDeclaration3961);
            iv_ruleLetDeclaration=ruleLetDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetDeclaration3971); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1820:1: ruleLetDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) ) ;
    public final EObject ruleLetDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1823:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1824:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1824:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1824:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1824:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1825:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLetDeclarationAccess().getLetDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1830:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1831:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1831:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1832:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLetDeclaration4022); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleLetDeclaration4039); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLetDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1852:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1853:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1853:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1854:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleLetDeclaration4060);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleLetDeclaration4072); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetDeclarationAccess().getColonEqualsSignKeyword_4());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1874:1: ( (lv_expression_5_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1875:1: (lv_expression_5_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1875:1: (lv_expression_5_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1876:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetDeclarationAccess().getExpressionExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleLetDeclaration4093);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1900:1: entryRuleConstantDeclaration returns [EObject current=null] : iv_ruleConstantDeclaration= ruleConstantDeclaration EOF ;
    public final EObject entryRuleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1901:2: (iv_ruleConstantDeclaration= ruleConstantDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1902:2: iv_ruleConstantDeclaration= ruleConstantDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration4129);
            iv_ruleConstantDeclaration=ruleConstantDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstantDeclaration4139); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1909:1: ruleConstantDeclaration returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1912:28: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1913:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1913:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )? )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1913:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleConstantDeclaration4176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDeclarationAccess().getConstKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1917:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1918:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1918:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1919:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConstantDeclaration4193); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleConstantDeclaration4210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstantDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1939:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1940:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1940:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1941:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleConstantDeclaration4231);
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

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1957:2: (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1957:4: otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleConstantDeclaration4244); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConstantDeclarationAccess().getColonEqualsSignKeyword_4_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1961:1: ( (lv_expression_5_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1962:1: (lv_expression_5_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1962:1: (lv_expression_5_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1963:3: lv_expression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantDeclarationAccess().getExpressionExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleConstantDeclaration4265);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1987:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1988:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1989:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration4303);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDeclaration4313); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1996:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )? ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:1999:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2000:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2000:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )? )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2000:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleFunctionDeclaration4350); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2004:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2005:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2005:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2006:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFunctionDeclaration4367); if (state.failed) return current;
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

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2022:2: (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==14) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2022:4: otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleFunctionDeclaration4385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2026:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_ID) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2026:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            {
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2026:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2027:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            {
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2027:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2028:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration4407);
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

                            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2044:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==15) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2044:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFunctionDeclaration4420); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2048:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2049:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    {
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2049:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2050:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration4441);
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
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleFunctionDeclaration4457); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleFunctionDeclaration4471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFunctionDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2074:1: ( (lv_type_8_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2075:1: (lv_type_8_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2075:1: (lv_type_8_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2076:3: lv_type_8_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getTypeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleFunctionDeclaration4492);
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

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2092:2: (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2092:4: otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) )
                    {
                    otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleFunctionDeclaration4505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getFunctionDeclarationAccess().getColonEqualsSignKeyword_5_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2096:1: ( (lv_expression_10_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2097:1: (lv_expression_10_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2097:1: (lv_expression_10_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2098:3: lv_expression_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getExpressionExpressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleFunctionDeclaration4526);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2122:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2123:2: (iv_ruleType= ruleType EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2124:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruleType_in_entryRuleType4564);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleType4574); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2131:1: ruleType returns [EObject current=null] : (this_TypeReference_0= ruleTypeReference | this_TypeDefinition_1= ruleTypeDefinition ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_TypeReference_0 = null;

        EObject this_TypeDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2134:28: ( (this_TypeReference_0= ruleTypeReference | this_TypeDefinition_1= ruleTypeDefinition ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2135:1: (this_TypeReference_0= ruleTypeReference | this_TypeDefinition_1= ruleTypeDefinition )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2135:1: (this_TypeReference_0= ruleTypeReference | this_TypeDefinition_1= ruleTypeDefinition )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            else if ( (LA27_0==17||LA27_0==19||LA27_0==32||LA27_0==40||(LA27_0>=42 && LA27_0<=46)||(LA27_0>=48 && LA27_0<=50)) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2136:5: this_TypeReference_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeReference_in_ruleType4621);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2146:5: this_TypeDefinition_1= ruleTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getTypeDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleType4648);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2162:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2163:2: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2164:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration4683);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDeclaration4693); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2171:1: ruleTypeDeclaration returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2174:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2175:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2175:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2175:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleTypeDeclaration4730); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2179:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2180:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2180:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2181:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeDeclaration4747); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleTypeDeclaration4764); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2201:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2202:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2202:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2203:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleTypeDeclaration4785);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2227:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2228:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2229:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleTypeReference_in_entryRuleTypeReference4821);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeReference4831); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2236:1: ruleTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2239:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2240:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2240:1: ( (otherlv_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2241:1: (otherlv_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2241:1: (otherlv_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2242:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTypeReference4875); if (state.failed) return current;
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


    // $ANTLR start "entryRuleNaturalTypeDefinition"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2261:1: entryRuleNaturalTypeDefinition returns [EObject current=null] : iv_ruleNaturalTypeDefinition= ruleNaturalTypeDefinition EOF ;
    public final EObject entryRuleNaturalTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2262:2: (iv_ruleNaturalTypeDefinition= ruleNaturalTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2263:2: iv_ruleNaturalTypeDefinition= ruleNaturalTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalTypeDefinition_in_entryRuleNaturalTypeDefinition4910);
            iv_ruleNaturalTypeDefinition=ruleNaturalTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalTypeDefinition4920); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2270:1: ruleNaturalTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'natural' ) ;
    public final EObject ruleNaturalTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2273:28: ( ( () otherlv_1= 'natural' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2274:1: ( () otherlv_1= 'natural' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2274:1: ( () otherlv_1= 'natural' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2274:2: () otherlv_1= 'natural'
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2274:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2275:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalTypeDefinitionAccess().getNaturalTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleNaturalTypeDefinition4966); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2292:1: entryRuleIntegerTypeDefinition returns [EObject current=null] : iv_ruleIntegerTypeDefinition= ruleIntegerTypeDefinition EOF ;
    public final EObject entryRuleIntegerTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2293:2: (iv_ruleIntegerTypeDefinition= ruleIntegerTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2294:2: iv_ruleIntegerTypeDefinition= ruleIntegerTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerTypeDefinition_in_entryRuleIntegerTypeDefinition5002);
            iv_ruleIntegerTypeDefinition=ruleIntegerTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerTypeDefinition5012); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2301:1: ruleIntegerTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'integer' ) ;
    public final EObject ruleIntegerTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2304:28: ( ( () otherlv_1= 'integer' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2305:1: ( () otherlv_1= 'integer' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2305:1: ( () otherlv_1= 'integer' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2305:2: () otherlv_1= 'integer'
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2305:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2306:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntegerTypeDefinitionAccess().getIntegerTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleIntegerTypeDefinition5058); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2323:1: entryRuleBooleanTypeDefinition returns [EObject current=null] : iv_ruleBooleanTypeDefinition= ruleBooleanTypeDefinition EOF ;
    public final EObject entryRuleBooleanTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2324:2: (iv_ruleBooleanTypeDefinition= ruleBooleanTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2325:2: iv_ruleBooleanTypeDefinition= ruleBooleanTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanTypeDefinition_in_entryRuleBooleanTypeDefinition5094);
            iv_ruleBooleanTypeDefinition=ruleBooleanTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanTypeDefinition5104); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2332:1: ruleBooleanTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'boolean' ) ;
    public final EObject ruleBooleanTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2335:28: ( ( () otherlv_1= 'boolean' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2336:1: ( () otherlv_1= 'boolean' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2336:1: ( () otherlv_1= 'boolean' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2336:2: () otherlv_1= 'boolean'
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2336:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2337:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanTypeDefinitionAccess().getBooleanTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleBooleanTypeDefinition5150); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2354:1: entryRuleRealTypeDefinition returns [EObject current=null] : iv_ruleRealTypeDefinition= ruleRealTypeDefinition EOF ;
    public final EObject entryRuleRealTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2355:2: (iv_ruleRealTypeDefinition= ruleRealTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2356:2: iv_ruleRealTypeDefinition= ruleRealTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleRealTypeDefinition_in_entryRuleRealTypeDefinition5186);
            iv_ruleRealTypeDefinition=ruleRealTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRealTypeDefinition5196); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2363:1: ruleRealTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'real' ) ;
    public final EObject ruleRealTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2366:28: ( ( () otherlv_1= 'real' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2367:1: ( () otherlv_1= 'real' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2367:1: ( () otherlv_1= 'real' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2367:2: () otherlv_1= 'real'
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2367:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2368:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealTypeDefinitionAccess().getRealTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleRealTypeDefinition5242); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2385:1: entryRuleArrayTypeDefinition returns [EObject current=null] : iv_ruleArrayTypeDefinition= ruleArrayTypeDefinition EOF ;
    public final EObject entryRuleArrayTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2386:2: (iv_ruleArrayTypeDefinition= ruleArrayTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2387:2: iv_ruleArrayTypeDefinition= ruleArrayTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleArrayTypeDefinition_in_entryRuleArrayTypeDefinition5278);
            iv_ruleArrayTypeDefinition=ruleArrayTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayTypeDefinition5288); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2394:1: ruleArrayTypeDefinition returns [EObject current=null] : (otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) ) ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2397:28: ( (otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2398:1: (otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2398:1: (otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2398:3: otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleArrayTypeDefinition5325); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayTypeDefinitionAccess().getArrayKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2402:1: ( (lv_indexTypes_1_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2403:1: (lv_indexTypes_1_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2403:1: (lv_indexTypes_1_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2404:3: lv_indexTypes_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefinitionAccess().getIndexTypesTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleArrayTypeDefinition5346);
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

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2420:2: (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2420:4: otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleArrayTypeDefinition5359); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayTypeDefinitionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2424:1: ( (lv_indexTypes_3_0= ruleType ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2425:1: (lv_indexTypes_3_0= ruleType )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2425:1: (lv_indexTypes_3_0= ruleType )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2426:3: lv_indexTypes_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayTypeDefinitionAccess().getIndexTypesTypeParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_in_ruleArrayTypeDefinition5380);
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
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleArrayTypeDefinition5394); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayTypeDefinitionAccess().getOfKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2446:1: ( (lv_elementType_5_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2447:1: (lv_elementType_5_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2447:1: (lv_elementType_5_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2448:3: lv_elementType_5_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefinitionAccess().getElementTypeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleArrayTypeDefinition5415);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2472:1: entryRuleEnumerationTypeDefinition returns [EObject current=null] : iv_ruleEnumerationTypeDefinition= ruleEnumerationTypeDefinition EOF ;
    public final EObject entryRuleEnumerationTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2473:2: (iv_ruleEnumerationTypeDefinition= ruleEnumerationTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2474:2: iv_ruleEnumerationTypeDefinition= ruleEnumerationTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerationTypeDefinition_in_entryRuleEnumerationTypeDefinition5451);
            iv_ruleEnumerationTypeDefinition=ruleEnumerationTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationTypeDefinition5461); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2481:1: ruleEnumerationTypeDefinition returns [EObject current=null] : (otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}' ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2484:28: ( (otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2485:1: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2485:1: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2485:3: otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleEnumerationTypeDefinition5498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeDefinitionAccess().getEnumKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleEnumerationTypeDefinition5510); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumerationTypeDefinitionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2493:1: ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2494:1: (lv_literals_2_0= ruleEnumerationLiteralDefinition )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2494:1: (lv_literals_2_0= ruleEnumerationLiteralDefinition )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2495:3: lv_literals_2_0= ruleEnumerationLiteralDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerationTypeDefinitionAccess().getLiteralsEnumerationLiteralDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEnumerationLiteralDefinition_in_ruleEnumerationTypeDefinition5531);
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

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2511:2: (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2511:4: otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleEnumerationTypeDefinition5544); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEnumerationTypeDefinitionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2515:1: ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2516:1: (lv_literals_4_0= ruleEnumerationLiteralDefinition )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2516:1: (lv_literals_4_0= ruleEnumerationLiteralDefinition )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2517:3: lv_literals_4_0= ruleEnumerationLiteralDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationTypeDefinitionAccess().getLiteralsEnumerationLiteralDefinitionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEnumerationLiteralDefinition_in_ruleEnumerationTypeDefinition5565);
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
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleEnumerationTypeDefinition5579); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2545:1: entryRuleEnumerationLiteralDefinition returns [EObject current=null] : iv_ruleEnumerationLiteralDefinition= ruleEnumerationLiteralDefinition EOF ;
    public final EObject entryRuleEnumerationLiteralDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteralDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2546:2: (iv_ruleEnumerationLiteralDefinition= ruleEnumerationLiteralDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2547:2: iv_ruleEnumerationLiteralDefinition= ruleEnumerationLiteralDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerationLiteralDefinition_in_entryRuleEnumerationLiteralDefinition5615);
            iv_ruleEnumerationLiteralDefinition=ruleEnumerationLiteralDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteralDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteralDefinition5625); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2554:1: ruleEnumerationLiteralDefinition returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumerationLiteralDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2557:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2558:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2558:1: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2559:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2559:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2560:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteralDefinition5666); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2584:1: entryRuleRecordTypeDefinition returns [EObject current=null] : iv_ruleRecordTypeDefinition= ruleRecordTypeDefinition EOF ;
    public final EObject entryRuleRecordTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2585:2: (iv_ruleRecordTypeDefinition= ruleRecordTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2586:2: iv_ruleRecordTypeDefinition= ruleRecordTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleRecordTypeDefinition_in_entryRuleRecordTypeDefinition5706);
            iv_ruleRecordTypeDefinition=ruleRecordTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordTypeDefinition5716); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2593:1: ruleRecordTypeDefinition returns [EObject current=null] : (otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}' ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2596:28: ( (otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2597:1: (otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2597:1: (otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2597:3: otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleRecordTypeDefinition5753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordTypeDefinitionAccess().getRecordKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleRecordTypeDefinition5765); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRecordTypeDefinitionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2605:1: ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2606:1: (lv_fieldDeclarations_2_0= ruleFieldDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2606:1: (lv_fieldDeclarations_2_0= ruleFieldDeclaration )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2607:3: lv_fieldDeclarations_2_0= ruleFieldDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecordTypeDefinitionAccess().getFieldDeclarationsFieldDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldDeclaration_in_ruleRecordTypeDefinition5786);
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

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2623:2: (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==15) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2623:4: otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleRecordTypeDefinition5799); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRecordTypeDefinitionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2627:1: ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2628:1: (lv_fieldDeclarations_4_0= ruleFieldDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2628:1: (lv_fieldDeclarations_4_0= ruleFieldDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2629:3: lv_fieldDeclarations_4_0= ruleFieldDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordTypeDefinitionAccess().getFieldDeclarationsFieldDeclarationParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFieldDeclaration_in_ruleRecordTypeDefinition5820);
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
            	    break loop30;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleRecordTypeDefinition5834); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2657:1: entryRuleTupleTypeDefinition returns [EObject current=null] : iv_ruleTupleTypeDefinition= ruleTupleTypeDefinition EOF ;
    public final EObject entryRuleTupleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2658:2: (iv_ruleTupleTypeDefinition= ruleTupleTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2659:2: iv_ruleTupleTypeDefinition= ruleTupleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleTupleTypeDefinition_in_entryRuleTupleTypeDefinition5870);
            iv_ruleTupleTypeDefinition=ruleTupleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleTypeDefinition5880); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2666:1: ruleTupleTypeDefinition returns [EObject current=null] : (otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}' ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2669:28: ( (otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2670:1: (otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2670:1: (otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2670:3: otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleTupleTypeDefinition5917); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleTypeDefinitionAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleTupleTypeDefinition5929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleTypeDefinitionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2678:1: ( (lv_types_2_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2679:1: (lv_types_2_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2679:1: (lv_types_2_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2680:3: lv_types_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleTypeDefinitionAccess().getTypesTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleTupleTypeDefinition5950);
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

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2696:2: (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==15) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2696:4: otherlv_3= ',' ( (lv_types_4_0= ruleType ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleTupleTypeDefinition5963); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeDefinitionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2700:1: ( (lv_types_4_0= ruleType ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2701:1: (lv_types_4_0= ruleType )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2701:1: (lv_types_4_0= ruleType )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2702:3: lv_types_4_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleTypeDefinitionAccess().getTypesTypeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleType_in_ruleTupleTypeDefinition5984);
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
            	    break loop31;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleTupleTypeDefinition5998); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2730:1: entryRuleSubrangeTypeDefinition returns [EObject current=null] : iv_ruleSubrangeTypeDefinition= ruleSubrangeTypeDefinition EOF ;
    public final EObject entryRuleSubrangeTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangeTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2731:2: (iv_ruleSubrangeTypeDefinition= ruleSubrangeTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2732:2: iv_ruleSubrangeTypeDefinition= ruleSubrangeTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubrangeTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSubrangeTypeDefinition_in_entryRuleSubrangeTypeDefinition6034);
            iv_ruleSubrangeTypeDefinition=ruleSubrangeTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubrangeTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubrangeTypeDefinition6044); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2739:1: ruleSubrangeTypeDefinition returns [EObject current=null] : ( () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']' ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2742:28: ( ( () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2743:1: ( () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2743:1: ( () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2743:2: () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']'
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2743:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2744:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubrangeTypeDefinitionAccess().getSubrangeTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleSubrangeTypeDefinition6090); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubrangeTypeDefinitionAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2753:1: ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                int LA32_1 = input.LA(2);

                if ( ((LA32_1>=RULE_ID && LA32_1<=RULE_DECIMAL)||LA32_1==14||(LA32_1>=20 && LA32_1<=23)||LA32_1==32||(LA32_1>=86 && LA32_1<=88)||LA32_1==90) ) {
                    alt32=2;
                }
                else if ( (LA32_1==51) ) {
                    alt32=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_DECIMAL)||LA32_0==14||LA32_0==20||(LA32_0>=22 && LA32_0<=23)||LA32_0==32||LA32_0==40||LA32_0==53||(LA32_0>=62 && LA32_0<=70)||(LA32_0>=86 && LA32_0<=88)||LA32_0==90) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2753:2: (otherlv_2= '-' otherlv_3= 'inf' )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2753:2: (otherlv_2= '-' otherlv_3= 'inf' )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2753:4: otherlv_2= '-' otherlv_3= 'inf'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleSubrangeTypeDefinition6104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSubrangeTypeDefinitionAccess().getHyphenMinusKeyword_2_0_0());
                          
                    }
                    otherlv_3=(Token)match(input,51,FOLLOW_51_in_ruleSubrangeTypeDefinition6116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSubrangeTypeDefinitionAccess().getInfKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2762:6: ( (lv_lowerBound_4_0= ruleExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2762:6: ( (lv_lowerBound_4_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2763:1: (lv_lowerBound_4_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2763:1: (lv_lowerBound_4_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2764:3: lv_lowerBound_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubrangeTypeDefinitionAccess().getLowerBoundExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleSubrangeTypeDefinition6144);
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

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleSubrangeTypeDefinition6157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSubrangeTypeDefinitionAccess().getToKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2784:1: (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==51) ) {
                alt33=1;
            }
            else if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_DECIMAL)||LA33_0==14||(LA33_0>=20 && LA33_0<=23)||LA33_0==32||LA33_0==40||LA33_0==53||(LA33_0>=62 && LA33_0<=70)||(LA33_0>=86 && LA33_0<=88)||LA33_0==90) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2784:3: otherlv_6= 'inf'
                    {
                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleSubrangeTypeDefinition6170); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSubrangeTypeDefinitionAccess().getInfKeyword_4_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2789:6: ( (lv_upperBound_7_0= ruleExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2789:6: ( (lv_upperBound_7_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2790:1: (lv_upperBound_7_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2790:1: (lv_upperBound_7_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2791:3: lv_upperBound_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubrangeTypeDefinitionAccess().getUpperBoundExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleSubrangeTypeDefinition6197);
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

            otherlv_8=(Token)match(input,33,FOLLOW_33_in_ruleSubrangeTypeDefinition6210); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2819:1: entryRuleSubTypeDefinition returns [EObject current=null] : iv_ruleSubTypeDefinition= ruleSubTypeDefinition EOF ;
    public final EObject entryRuleSubTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2820:2: (iv_ruleSubTypeDefinition= ruleSubTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2821:2: iv_ruleSubTypeDefinition= ruleSubTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleSubTypeDefinition_in_entryRuleSubTypeDefinition6246);
            iv_ruleSubTypeDefinition=ruleSubTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubTypeDefinition6256); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2828:1: ruleSubTypeDefinition returns [EObject current=null] : (otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleSubTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDeclaration_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2831:28: ( (otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2832:1: (otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2832:1: (otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2832:3: otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSubTypeDefinition6293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSubTypeDefinitionAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2836:1: ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2837:1: (lv_parameterDeclaration_1_0= ruleParameterDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2837:1: (lv_parameterDeclaration_1_0= ruleParameterDeclaration )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2838:3: lv_parameterDeclaration_1_0= ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubTypeDefinitionAccess().getParameterDeclarationParameterDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleSubTypeDefinition6314);
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

            otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleSubTypeDefinition6326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSubTypeDefinitionAccess().getVerticalLineKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2858:1: ( (lv_expression_3_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2859:1: (lv_expression_3_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2859:1: (lv_expression_3_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2860:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubTypeDefinitionAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleSubTypeDefinition6347);
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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleSubTypeDefinition6359); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2888:1: entryRuleFunctionTypeDefinition returns [EObject current=null] : iv_ruleFunctionTypeDefinition= ruleFunctionTypeDefinition EOF ;
    public final EObject entryRuleFunctionTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2889:2: (iv_ruleFunctionTypeDefinition= ruleFunctionTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2890:2: iv_ruleFunctionTypeDefinition= ruleFunctionTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionTypeDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionTypeDefinition_in_entryRuleFunctionTypeDefinition6395);
            iv_ruleFunctionTypeDefinition=ruleFunctionTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionTypeDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionTypeDefinition6405); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2897:1: ruleFunctionTypeDefinition returns [EObject current=null] : (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) ) ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2900:28: ( (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2901:1: (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2901:1: (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2901:3: otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleFunctionTypeDefinition6442); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionTypeDefinitionAccess().getFunctionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleFunctionTypeDefinition6454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionTypeDefinitionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2909:1: ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==17||LA35_0==19||LA35_0==32||LA35_0==40||(LA35_0>=42 && LA35_0<=46)||(LA35_0>=48 && LA35_0<=50)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2909:2: ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2909:2: ( (lv_parameterTypes_2_0= ruleType ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2910:1: (lv_parameterTypes_2_0= ruleType )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2910:1: (lv_parameterTypes_2_0= ruleType )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2911:3: lv_parameterTypes_2_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionTypeDefinitionAccess().getParameterTypesTypeParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleFunctionTypeDefinition6476);
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

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2927:2: (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==15) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2927:4: otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleFunctionTypeDefinition6489); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getFunctionTypeDefinitionAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2931:1: ( (lv_parameterTypes_4_0= ruleType ) )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2932:1: (lv_parameterTypes_4_0= ruleType )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2932:1: (lv_parameterTypes_4_0= ruleType )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2933:3: lv_parameterTypes_4_0= ruleType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionTypeDefinitionAccess().getParameterTypesTypeParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleType_in_ruleFunctionTypeDefinition6510);
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
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleFunctionTypeDefinition6526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFunctionTypeDefinitionAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleFunctionTypeDefinition6538); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionTypeDefinitionAccess().getColonKeyword_4());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2957:1: ( (lv_returnType_7_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2958:1: (lv_returnType_7_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2958:1: (lv_returnType_7_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2959:3: lv_returnType_7_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionTypeDefinitionAccess().getReturnTypeTypeParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleFunctionTypeDefinition6559);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2983:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2984:2: (iv_ruleExpression= ruleExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2985:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression6595);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression6605); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2992:1: ruleExpression returns [EObject current=null] : this_IfThenElseExpression_0= ruleIfThenElseExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfThenElseExpression_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2995:28: (this_IfThenElseExpression_0= ruleIfThenElseExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:2997:5: this_IfThenElseExpression_0= ruleIfThenElseExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getIfThenElseExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleIfThenElseExpression_in_ruleExpression6651);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3013:1: entryRuleIfThenElseExpression returns [EObject current=null] : iv_ruleIfThenElseExpression= ruleIfThenElseExpression EOF ;
    public final EObject entryRuleIfThenElseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElseExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3014:2: (iv_ruleIfThenElseExpression= ruleIfThenElseExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3015:2: iv_ruleIfThenElseExpression= ruleIfThenElseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfThenElseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIfThenElseExpression_in_entryRuleIfThenElseExpression6685);
            iv_ruleIfThenElseExpression=ruleIfThenElseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfThenElseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfThenElseExpression6695); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3022:1: ruleIfThenElseExpression returns [EObject current=null] : ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) ) | this_EqualExpression_7= ruleEqualExpression ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3025:28: ( ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) ) | this_EqualExpression_7= ruleEqualExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3026:1: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) ) | this_EqualExpression_7= ruleEqualExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3026:1: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) ) | this_EqualExpression_7= ruleEqualExpression )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==53) ) {
                alt36=1;
            }
            else if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_DECIMAL)||LA36_0==14||(LA36_0>=20 && LA36_0<=23)||LA36_0==32||LA36_0==40||(LA36_0>=62 && LA36_0<=70)||(LA36_0>=86 && LA36_0<=88)||LA36_0==90) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3026:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3026:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3026:3: () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3026:3: ()
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3027:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getIfThenElseExpressionAccess().getIfThenElseExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleIfThenElseExpression6742); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIfThenElseExpressionAccess().getIfKeyword_0_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3036:1: ( (lv_condition_2_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3037:1: (lv_condition_2_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3037:1: (lv_condition_2_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3038:3: lv_condition_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseExpressionAccess().getConditionExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIfThenElseExpression6763);
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

                    otherlv_3=(Token)match(input,54,FOLLOW_54_in_ruleIfThenElseExpression6775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIfThenElseExpressionAccess().getThenKeyword_0_3());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3058:1: ( (lv_then_4_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3059:1: (lv_then_4_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3059:1: (lv_then_4_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3060:3: lv_then_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseExpressionAccess().getThenExpressionParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIfThenElseExpression6796);
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

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3076:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3076:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3076:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3076:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleIfThenElseExpression6817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfThenElseExpressionAccess().getElseKeyword_0_5_0());
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3081:2: ( (lv_else_6_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3082:1: (lv_else_6_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3082:1: (lv_else_6_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3083:3: lv_else_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseExpressionAccess().getElseExpressionParserRuleCall_0_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleIfThenElseExpression6839);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3101:5: this_EqualExpression_7= ruleEqualExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIfThenElseExpressionAccess().getEqualExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEqualExpression_in_ruleIfThenElseExpression6869);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3117:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3118:2: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3119:2: iv_ruleEqualExpression= ruleEqualExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression6904);
            iv_ruleEqualExpression=ruleEqualExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualExpression6914); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3126:1: ruleEqualExpression returns [EObject current=null] : (this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )? ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ImplyExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3129:28: ( (this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3130:1: (this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3130:1: (this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )? )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3131:5: this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualExpressionAccess().getImplyExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleImplyExpression_in_ruleEqualExpression6961);
            this_ImplyExpression_0=ruleImplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ImplyExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3139:1: ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==56) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3139:2: () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3139:2: ()
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3140:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEqualExpressionAccess().getEqualExpressionLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,56,FOLLOW_56_in_ruleEqualExpression6982); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEqualExpressionAccess().getEqualKeyword_1_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3149:1: ( (lv_rightOperand_3_0= ruleEqualExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3150:1: (lv_rightOperand_3_0= ruleEqualExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3150:1: (lv_rightOperand_3_0= ruleEqualExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3151:3: lv_rightOperand_3_0= ruleEqualExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualExpressionAccess().getRightOperandEqualExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEqualExpression_in_ruleEqualExpression7003);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3175:1: entryRuleImplyExpression returns [EObject current=null] : iv_ruleImplyExpression= ruleImplyExpression EOF ;
    public final EObject entryRuleImplyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplyExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3176:2: (iv_ruleImplyExpression= ruleImplyExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3177:2: iv_ruleImplyExpression= ruleImplyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleImplyExpression_in_entryRuleImplyExpression7041);
            iv_ruleImplyExpression=ruleImplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplyExpression7051); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3184:1: ruleImplyExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )? ) ;
    public final EObject ruleImplyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3187:28: ( (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3188:1: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3188:1: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )? )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3189:5: this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplyExpressionAccess().getOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpression_in_ruleImplyExpression7098);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3197:1: ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==57) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3197:2: () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3197:2: ()
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3198:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImplyExpressionAccess().getImplyExpressionLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleImplyExpression7119); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImplyExpressionAccess().getImplyKeyword_1_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3207:1: ( (lv_rightOperand_3_0= ruleImplyExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3208:1: (lv_rightOperand_3_0= ruleImplyExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3208:1: (lv_rightOperand_3_0= ruleImplyExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3209:3: lv_rightOperand_3_0= ruleImplyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplyExpressionAccess().getRightOperandImplyExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplyExpression_in_ruleImplyExpression7140);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3233:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3234:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3235:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpression_in_entryRuleOrExpression7178);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpression7188); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3242:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_operands_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3245:28: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )? ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3246:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )? )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3246:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )? )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3247:5: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression7235);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3255:1: ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==58) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3255:2: () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3255:2: ()
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3256:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getOrExpressionAccess().getOrExpressionOperandsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3261:2: (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+
                    int cnt39=0;
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==58) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3261:4: otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleOrExpression7257); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3265:1: ( (lv_operands_3_0= ruleAndExpression ) )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3266:1: (lv_operands_3_0= ruleAndExpression )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3266:1: (lv_operands_3_0= ruleAndExpression )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3267:3: lv_operands_3_0= ruleAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getOperandsAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAndExpression_in_ruleOrExpression7278);
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
                    	    if ( cnt39 >= 1 ) break loop39;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(39, input);
                                throw eee;
                        }
                        cnt39++;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3291:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3292:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3293:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpression_in_entryRuleAndExpression7318);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpression7328); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3300:1: ruleAndExpression returns [EObject current=null] : (this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ReleaseExpression_0 = null;

        EObject lv_operands_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3303:28: ( (this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )? ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3304:1: (this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )? )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3304:1: (this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )? )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3305:5: this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getReleaseExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleReleaseExpression_in_ruleAndExpression7375);
            this_ReleaseExpression_0=ruleReleaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ReleaseExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3313:1: ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==59) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3313:2: () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3313:2: ()
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3314:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getAndExpressionAccess().getAndExpressionOperandsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3319:2: (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==59) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3319:4: otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleAndExpression7397); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3323:1: ( (lv_operands_3_0= ruleReleaseExpression ) )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3324:1: (lv_operands_3_0= ruleReleaseExpression )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3324:1: (lv_operands_3_0= ruleReleaseExpression )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3325:3: lv_operands_3_0= ruleReleaseExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getOperandsReleaseExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleReleaseExpression_in_ruleAndExpression7418);
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
                    	    if ( cnt41 >= 1 ) break loop41;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3349:1: entryRuleReleaseExpression returns [EObject current=null] : iv_ruleReleaseExpression= ruleReleaseExpression EOF ;
    public final EObject entryRuleReleaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReleaseExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3350:2: (iv_ruleReleaseExpression= ruleReleaseExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3351:2: iv_ruleReleaseExpression= ruleReleaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReleaseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleReleaseExpression_in_entryRuleReleaseExpression7458);
            iv_ruleReleaseExpression=ruleReleaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReleaseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReleaseExpression7468); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3358:1: ruleReleaseExpression returns [EObject current=null] : (this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )* ) ;
    public final EObject ruleReleaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UntilExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3361:28: ( (this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3362:1: (this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3362:1: (this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )* )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3363:5: this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getReleaseExpressionAccess().getUntilExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUntilExpression_in_ruleReleaseExpression7515);
            this_UntilExpression_0=ruleUntilExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UntilExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3371:1: ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==60) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3371:2: () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3371:2: ()
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3372:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getReleaseExpressionAccess().getReleaseExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleReleaseExpression7536); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReleaseExpressionAccess().getRKeyword_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3381:1: ( (lv_rightOperand_3_0= ruleUntilExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3382:1: (lv_rightOperand_3_0= ruleUntilExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3382:1: (lv_rightOperand_3_0= ruleUntilExpression )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3383:3: lv_rightOperand_3_0= ruleUntilExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReleaseExpressionAccess().getRightOperandUntilExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUntilExpression_in_ruleReleaseExpression7557);
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
            	    break loop43;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3407:1: entryRuleUntilExpression returns [EObject current=null] : iv_ruleUntilExpression= ruleUntilExpression EOF ;
    public final EObject entryRuleUntilExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntilExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3408:2: (iv_ruleUntilExpression= ruleUntilExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3409:2: iv_ruleUntilExpression= ruleUntilExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUntilExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUntilExpression_in_entryRuleUntilExpression7595);
            iv_ruleUntilExpression=ruleUntilExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUntilExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUntilExpression7605); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3416:1: ruleUntilExpression returns [EObject current=null] : (this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )* ) ;
    public final EObject ruleUntilExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryLogicExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3419:28: ( (this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3420:1: (this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3420:1: (this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )* )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3421:5: this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUntilExpressionAccess().getUnaryLogicExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleUnaryLogicExpression_in_ruleUntilExpression7652);
            this_UnaryLogicExpression_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryLogicExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3429:1: ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==61) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3429:2: () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3429:2: ()
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3430:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getUntilExpressionAccess().getUntilExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleUntilExpression7673); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getUntilExpressionAccess().getUKeyword_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3439:1: ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3440:1: (lv_rightOperand_3_0= ruleUnaryLogicExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3440:1: (lv_rightOperand_3_0= ruleUnaryLogicExpression )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3441:3: lv_rightOperand_3_0= ruleUnaryLogicExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUntilExpressionAccess().getRightOperandUnaryLogicExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleUnaryLogicExpression_in_ruleUntilExpression7694);
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
            	    break loop44;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3465:1: entryRuleUnaryLogicExpression returns [EObject current=null] : iv_ruleUnaryLogicExpression= ruleUnaryLogicExpression EOF ;
    public final EObject entryRuleUnaryLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryLogicExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3466:2: (iv_ruleUnaryLogicExpression= ruleUnaryLogicExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3467:2: iv_ruleUnaryLogicExpression= ruleUnaryLogicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryLogicExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleUnaryLogicExpression_in_entryRuleUnaryLogicExpression7732);
            iv_ruleUnaryLogicExpression=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryLogicExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryLogicExpression7742); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3474:1: ruleUnaryLogicExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3477:28: ( (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3478:1: (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3478:1: (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression )
            int alt45=11;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3479:5: this_NotExpression_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getNotExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNotExpression_in_ruleUnaryLogicExpression7789);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3489:5: this_ForallExpression_1= ruleForallExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getForallExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleForallExpression_in_ruleUnaryLogicExpression7816);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3499:5: this_ExistsExpression_2= ruleExistsExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getExistsExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExistsExpression_in_ruleUnaryLogicExpression7843);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3509:5: this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getFunctionLiteralExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionLiteralExpression_in_ruleUnaryLogicExpression7870);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3519:5: this_GloballyExpression_4= ruleGloballyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getGloballyExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGloballyExpression_in_ruleUnaryLogicExpression7897);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3529:5: this_FinallyExpression_5= ruleFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getFinallyExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFinallyExpression_in_ruleUnaryLogicExpression7924);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3539:5: this_NextExpression_6= ruleNextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getNextExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNextExpression_in_ruleUnaryLogicExpression7951);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3549:5: this_TemporalForallExpression_7= ruleTemporalForallExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getTemporalForallExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTemporalForallExpression_in_ruleUnaryLogicExpression7978);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3559:5: this_TemporalExistsExpression_8= ruleTemporalExistsExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getTemporalExistsExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTemporalExistsExpression_in_ruleUnaryLogicExpression8005);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3569:5: this_LetExpression_9= ruleLetExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getLetExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLetExpression_in_ruleUnaryLogicExpression8032);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3579:5: this_InExpression_10= ruleInExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getInExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInExpression_in_ruleUnaryLogicExpression8059);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3595:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3596:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3597:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNotExpression_in_entryRuleNotExpression8094);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotExpression8104); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3604:1: ruleNotExpression returns [EObject current=null] : ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3607:28: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3608:1: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3608:1: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3608:2: () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3608:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3609:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotExpressionAccess().getNotExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3614:2: ( ( 'not' )=>otherlv_1= 'not' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3614:3: ( 'not' )=>otherlv_1= 'not'
            {
            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleNotExpression8158); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNotExpressionAccess().getNotKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3619:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3620:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3620:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3621:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryLogicExpression_in_ruleNotExpression8180);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3645:1: entryRuleForallExpression returns [EObject current=null] : iv_ruleForallExpression= ruleForallExpression EOF ;
    public final EObject entryRuleForallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForallExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3646:2: (iv_ruleForallExpression= ruleForallExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3647:2: iv_ruleForallExpression= ruleForallExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForallExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleForallExpression_in_entryRuleForallExpression8216);
            iv_ruleForallExpression=ruleForallExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForallExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleForallExpression8226); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3654:1: ruleForallExpression returns [EObject current=null] : ( () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3657:28: ( ( () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3658:1: ( () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3658:1: ( () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3658:2: () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3658:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3659:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getForallExpressionAccess().getForallExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3664:2: ( ( 'forall' )=>otherlv_1= 'forall' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3664:3: ( 'forall' )=>otherlv_1= 'forall'
            {
            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleForallExpression8280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForallExpressionAccess().getForallKeyword_1());
                  
            }

            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleForallExpression8293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForallExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3673:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3673:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3673:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3674:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3674:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3675:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForallExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleForallExpression8315);
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

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3691:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==15) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3691:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleForallExpression8328); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getForallExpressionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3695:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3696:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3696:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3697:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getForallExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleForallExpression8349);
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
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleForallExpression8365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getForallExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleForallExpression8377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForallExpressionAccess().getColonKeyword_5());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3721:1: ( (lv_operand_8_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3722:1: (lv_operand_8_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3722:1: (lv_operand_8_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3723:3: lv_operand_8_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForallExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryLogicExpression_in_ruleForallExpression8398);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3747:1: entryRuleExistsExpression returns [EObject current=null] : iv_ruleExistsExpression= ruleExistsExpression EOF ;
    public final EObject entryRuleExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3748:2: (iv_ruleExistsExpression= ruleExistsExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3749:2: iv_ruleExistsExpression= ruleExistsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression8434);
            iv_ruleExistsExpression=ruleExistsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExistsExpression8444); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3756:1: ruleExistsExpression returns [EObject current=null] : ( () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3759:28: ( ( () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3760:1: ( () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3760:1: ( () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3760:2: () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3760:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3761:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExistsExpressionAccess().getExistsExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3766:2: ( ( 'exists' )=>otherlv_1= 'exists' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3766:3: ( 'exists' )=>otherlv_1= 'exists'
            {
            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleExistsExpression8498); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExistsExpressionAccess().getExistsKeyword_1());
                  
            }

            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleExistsExpression8511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExistsExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3775:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3775:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3775:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3776:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3776:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3777:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleExistsExpression8533);
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

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3793:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==15) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3793:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleExistsExpression8546); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getExistsExpressionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3797:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3798:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3798:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3799:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleExistsExpression8567);
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
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleExistsExpression8583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getExistsExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleExistsExpression8595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getExistsExpressionAccess().getColonKeyword_5());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3823:1: ( (lv_operand_8_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3824:1: (lv_operand_8_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3824:1: (lv_operand_8_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3825:3: lv_operand_8_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryLogicExpression_in_ruleExistsExpression8616);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3849:1: entryRuleFunctionLiteralExpression returns [EObject current=null] : iv_ruleFunctionLiteralExpression= ruleFunctionLiteralExpression EOF ;
    public final EObject entryRuleFunctionLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3850:2: (iv_ruleFunctionLiteralExpression= ruleFunctionLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3851:2: iv_ruleFunctionLiteralExpression= ruleFunctionLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionLiteralExpression_in_entryRuleFunctionLiteralExpression8652);
            iv_ruleFunctionLiteralExpression=ruleFunctionLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionLiteralExpression8662); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3858:1: ruleFunctionLiteralExpression returns [EObject current=null] : ( () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) ) ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3861:28: ( ( () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3862:1: ( () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3862:1: ( () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3862:2: () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3862:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3863:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionLiteralExpressionAccess().getFunctionLiteralExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3868:2: ( ( 'function' )=>otherlv_1= 'function' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3868:3: ( 'function' )=>otherlv_1= 'function'
            {
            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleFunctionLiteralExpression8716); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionLiteralExpressionAccess().getFunctionKeyword_1());
                  
            }

            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleFunctionLiteralExpression8729); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionLiteralExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3877:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3877:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3877:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3878:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3878:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3879:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionLiteralExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionLiteralExpression8751);
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

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3895:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==15) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3895:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleFunctionLiteralExpression8764); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionLiteralExpressionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3899:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3900:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3900:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3901:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionLiteralExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleFunctionLiteralExpression8785);
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
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleFunctionLiteralExpression8801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionLiteralExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleFunctionLiteralExpression8813); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFunctionLiteralExpressionAccess().getColonKeyword_5());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3925:1: ( (lv_returnType_8_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3926:1: (lv_returnType_8_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3926:1: (lv_returnType_8_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3927:3: lv_returnType_8_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionLiteralExpressionAccess().getReturnTypeTypeParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleType_in_ruleFunctionLiteralExpression8834);
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

            otherlv_9=(Token)match(input,25,FOLLOW_25_in_ruleFunctionLiteralExpression8846); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFunctionLiteralExpressionAccess().getColonEqualsSignKeyword_7());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3947:1: ( (lv_operand_10_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3948:1: (lv_operand_10_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3948:1: (lv_operand_10_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3949:3: lv_operand_10_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionLiteralExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryLogicExpression_in_ruleFunctionLiteralExpression8867);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3973:1: entryRuleGloballyExpression returns [EObject current=null] : iv_ruleGloballyExpression= ruleGloballyExpression EOF ;
    public final EObject entryRuleGloballyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGloballyExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3974:2: (iv_ruleGloballyExpression= ruleGloballyExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3975:2: iv_ruleGloballyExpression= ruleGloballyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGloballyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGloballyExpression_in_entryRuleGloballyExpression8903);
            iv_ruleGloballyExpression=ruleGloballyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGloballyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGloballyExpression8913); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3982:1: ruleGloballyExpression returns [EObject current=null] : ( () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleGloballyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3985:28: ( ( () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3986:1: ( () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3986:1: ( () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3986:2: () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3986:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3987:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGloballyExpressionAccess().getGloballyExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3992:2: ( ( 'G' )=>otherlv_1= 'G' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3992:3: ( 'G' )=>otherlv_1= 'G'
            {
            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleGloballyExpression8967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGloballyExpressionAccess().getGKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3997:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3998:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3998:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:3999:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGloballyExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryLogicExpression_in_ruleGloballyExpression8989);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4023:1: entryRuleFinallyExpression returns [EObject current=null] : iv_ruleFinallyExpression= ruleFinallyExpression EOF ;
    public final EObject entryRuleFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinallyExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4024:2: (iv_ruleFinallyExpression= ruleFinallyExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4025:2: iv_ruleFinallyExpression= ruleFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFinallyExpression_in_entryRuleFinallyExpression9025);
            iv_ruleFinallyExpression=ruleFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFinallyExpression9035); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4032:1: ruleFinallyExpression returns [EObject current=null] : ( () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4035:28: ( ( () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4036:1: ( () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4036:1: ( () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4036:2: () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4036:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4037:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFinallyExpressionAccess().getFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4042:2: ( ( 'F' )=>otherlv_1= 'F' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4042:3: ( 'F' )=>otherlv_1= 'F'
            {
            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleFinallyExpression9089); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFinallyExpressionAccess().getFKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4047:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4048:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4048:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4049:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFinallyExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryLogicExpression_in_ruleFinallyExpression9111);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4073:1: entryRuleNextExpression returns [EObject current=null] : iv_ruleNextExpression= ruleNextExpression EOF ;
    public final EObject entryRuleNextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4074:2: (iv_ruleNextExpression= ruleNextExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4075:2: iv_ruleNextExpression= ruleNextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNextExpression_in_entryRuleNextExpression9147);
            iv_ruleNextExpression=ruleNextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNextExpression9157); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4082:1: ruleNextExpression returns [EObject current=null] : ( () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleNextExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4085:28: ( ( () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4086:1: ( () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4086:1: ( () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4086:2: () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4086:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4087:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNextExpressionAccess().getNextExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4092:2: ( ( 'X' )=>otherlv_1= 'X' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4092:3: ( 'X' )=>otherlv_1= 'X'
            {
            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleNextExpression9211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNextExpressionAccess().getXKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4097:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4098:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4098:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4099:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNextExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryLogicExpression_in_ruleNextExpression9233);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4123:1: entryRuleTemporalForallExpression returns [EObject current=null] : iv_ruleTemporalForallExpression= ruleTemporalForallExpression EOF ;
    public final EObject entryRuleTemporalForallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalForallExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4124:2: (iv_ruleTemporalForallExpression= ruleTemporalForallExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4125:2: iv_ruleTemporalForallExpression= ruleTemporalForallExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalForallExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalForallExpression_in_entryRuleTemporalForallExpression9269);
            iv_ruleTemporalForallExpression=ruleTemporalForallExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalForallExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalForallExpression9279); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4132:1: ruleTemporalForallExpression returns [EObject current=null] : ( () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleTemporalForallExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4135:28: ( ( () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4136:1: ( () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4136:1: ( () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4136:2: () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4136:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4137:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTemporalForallExpressionAccess().getTemporalForallExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4142:2: ( ( 'A' )=>otherlv_1= 'A' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4142:3: ( 'A' )=>otherlv_1= 'A'
            {
            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleTemporalForallExpression9333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemporalForallExpressionAccess().getAKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4147:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4148:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4148:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4149:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemporalForallExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryLogicExpression_in_ruleTemporalForallExpression9355);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4173:1: entryRuleTemporalExistsExpression returns [EObject current=null] : iv_ruleTemporalExistsExpression= ruleTemporalExistsExpression EOF ;
    public final EObject entryRuleTemporalExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalExistsExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4174:2: (iv_ruleTemporalExistsExpression= ruleTemporalExistsExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4175:2: iv_ruleTemporalExistsExpression= ruleTemporalExistsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalExistsExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTemporalExistsExpression_in_entryRuleTemporalExistsExpression9391);
            iv_ruleTemporalExistsExpression=ruleTemporalExistsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalExistsExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalExistsExpression9401); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4182:1: ruleTemporalExistsExpression returns [EObject current=null] : ( () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleTemporalExistsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4185:28: ( ( () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4186:1: ( () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4186:1: ( () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4186:2: () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4186:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4187:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTemporalExistsExpressionAccess().getTemporalExistsExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4192:2: ( ( 'E' )=>otherlv_1= 'E' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4192:3: ( 'E' )=>otherlv_1= 'E'
            {
            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleTemporalExistsExpression9455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemporalExistsExpressionAccess().getEKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4197:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4198:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4198:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4199:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemporalExistsExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryLogicExpression_in_ruleTemporalExistsExpression9477);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4223:1: entryRuleLetExpression returns [EObject current=null] : iv_ruleLetExpression= ruleLetExpression EOF ;
    public final EObject entryRuleLetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4224:2: (iv_ruleLetExpression= ruleLetExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4225:2: iv_ruleLetExpression= ruleLetExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLetExpression_in_entryRuleLetExpression9513);
            iv_ruleLetExpression=ruleLetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLetExpression9523); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4232:1: ruleLetExpression returns [EObject current=null] : ( () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) ) ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4235:28: ( ( () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4236:1: ( () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4236:1: ( () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4236:2: () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4236:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4237:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLetExpressionAccess().getLetExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleLetExpression9569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLetExpressionAccess().getLetKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleLetExpression9581); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLetExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4250:1: ( (lv_letDeclarations_3_0= ruleLetDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4251:1: (lv_letDeclarations_3_0= ruleLetDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4251:1: (lv_letDeclarations_3_0= ruleLetDeclaration )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4252:3: lv_letDeclarations_3_0= ruleLetDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpressionAccess().getLetDeclarationsLetDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLetDeclaration_in_ruleLetExpression9602);
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

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4268:2: (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==15) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4268:4: otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleLetExpression9615); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getLetExpressionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4272:1: ( (lv_letDeclarations_5_0= ruleLetDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4273:1: (lv_letDeclarations_5_0= ruleLetDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4273:1: (lv_letDeclarations_5_0= ruleLetDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4274:3: lv_letDeclarations_5_0= ruleLetDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpressionAccess().getLetDeclarationsLetDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLetDeclaration_in_ruleLetExpression9636);
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
            	    break loop52;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleLetExpression9650); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLetExpressionAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,71,FOLLOW_71_in_ruleLetExpression9662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getLetExpressionAccess().getInKeyword_6());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4298:1: ( (lv_expression_8_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4299:1: (lv_expression_8_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4299:1: (lv_expression_8_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4300:3: lv_expression_8_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpressionAccess().getExpressionUnaryLogicExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleUnaryLogicExpression_in_ruleLetExpression9683);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4324:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4325:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4326:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInExpression_in_entryRuleInExpression9719);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInExpression9729); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4333:1: ruleInExpression returns [EObject current=null] : (this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )? ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EquivalenceExpression_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4336:28: ( (this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4337:1: (this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4337:1: (this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )? )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4338:5: this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInExpressionAccess().getEquivalenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEquivalenceExpression_in_ruleInExpression9776);
            this_EquivalenceExpression_0=ruleEquivalenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EquivalenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4346:1: ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==71) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4346:2: () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4346:2: ()
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4347:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getInExpressionAccess().getInExpressionOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,71,FOLLOW_71_in_ruleInExpression9797); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInExpressionAccess().getInKeyword_1_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4356:1: ( (lv_type_3_0= ruleType ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4357:1: (lv_type_3_0= ruleType )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4357:1: (lv_type_3_0= ruleType )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4358:3: lv_type_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInExpressionAccess().getTypeTypeParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleType_in_ruleInExpression9818);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4382:1: entryRuleEquivalenceExpression returns [EObject current=null] : iv_ruleEquivalenceExpression= ruleEquivalenceExpression EOF ;
    public final EObject entryRuleEquivalenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivalenceExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4383:2: (iv_ruleEquivalenceExpression= ruleEquivalenceExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4384:2: iv_ruleEquivalenceExpression= ruleEquivalenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquivalenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEquivalenceExpression_in_entryRuleEquivalenceExpression9856);
            iv_ruleEquivalenceExpression=ruleEquivalenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquivalenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquivalenceExpression9866); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4391:1: ruleEquivalenceExpression returns [EObject current=null] : (this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )? ) ;
    public final EObject ruleEquivalenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ComparisionExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4394:28: ( (this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4395:1: (this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4395:1: (this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )? )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4396:5: this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEquivalenceExpressionAccess().getComparisionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression9913);
            this_ComparisionExpression_0=ruleComparisionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparisionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4404:1: ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )?
            int alt54=3;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==72) ) {
                alt54=1;
            }
            else if ( (LA54_0==73) ) {
                alt54=2;
            }
            switch (alt54) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4404:2: ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4404:2: ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4404:3: () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4404:3: ()
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4405:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEquivalenceExpressionAccess().getEqualityExpressionLeftOperandAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,72,FOLLOW_72_in_ruleEquivalenceExpression9935); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEquivalenceExpressionAccess().getEqualsSignKeyword_1_0_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4414:1: ( (lv_rightOperand_3_0= ruleComparisionExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4415:1: (lv_rightOperand_3_0= ruleComparisionExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4415:1: (lv_rightOperand_3_0= ruleComparisionExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4416:3: lv_rightOperand_3_0= ruleComparisionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquivalenceExpressionAccess().getRightOperandComparisionExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression9956);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4433:6: ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4433:6: ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4433:7: () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4433:7: ()
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4434:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEquivalenceExpressionAccess().getInequalityExpressionLeftOperandAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,73,FOLLOW_73_in_ruleEquivalenceExpression9985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEquivalenceExpressionAccess().getSolidusEqualsSignKeyword_1_1_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4443:1: ( (lv_rightOperand_6_0= ruleComparisionExpression ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4444:1: (lv_rightOperand_6_0= ruleComparisionExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4444:1: (lv_rightOperand_6_0= ruleComparisionExpression )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4445:3: lv_rightOperand_6_0= ruleComparisionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquivalenceExpressionAccess().getRightOperandComparisionExpressionParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression10006);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4469:1: entryRuleComparisionExpression returns [EObject current=null] : iv_ruleComparisionExpression= ruleComparisionExpression EOF ;
    public final EObject entryRuleComparisionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisionExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4470:2: (iv_ruleComparisionExpression= ruleComparisionExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4471:2: iv_ruleComparisionExpression= ruleComparisionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisionExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparisionExpression_in_entryRuleComparisionExpression10045);
            iv_ruleComparisionExpression=ruleComparisionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisionExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparisionExpression10055); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4478:1: ruleComparisionExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )* ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4481:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4482:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4482:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )* )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4483:5: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisionExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleComparisionExpression10102);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4491:1: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=74 && LA56_0<=77)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4491:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4491:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) )
            	    int alt55=4;
            	    switch ( input.LA(1) ) {
            	    case 74:
            	        {
            	        alt55=1;
            	        }
            	        break;
            	    case 75:
            	        {
            	        alt55=2;
            	        }
            	        break;
            	    case 76:
            	        {
            	        alt55=3;
            	        }
            	        break;
            	    case 77:
            	        {
            	        alt55=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 55, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt55) {
            	        case 1 :
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4491:3: ( () otherlv_2= '>' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4491:3: ( () otherlv_2= '>' )
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4491:4: () otherlv_2= '>'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4491:4: ()
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4492:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisionExpressionAccess().getGreaterExpressionLeftOperandAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,74,FOLLOW_74_in_ruleComparisionExpression10125); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getComparisionExpressionAccess().getGreaterThanSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4502:6: ( () otherlv_4= '>=' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4502:6: ( () otherlv_4= '>=' )
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4502:7: () otherlv_4= '>='
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4502:7: ()
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4503:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisionExpressionAccess().getGreaterEqualExpressionLeftOperandAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,75,FOLLOW_75_in_ruleComparisionExpression10154); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getComparisionExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4513:6: ( () otherlv_6= '<' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4513:6: ( () otherlv_6= '<' )
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4513:7: () otherlv_6= '<'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4513:7: ()
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4514:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisionExpressionAccess().getLessExpressionLeftOperandAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_6=(Token)match(input,76,FOLLOW_76_in_ruleComparisionExpression10183); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getComparisionExpressionAccess().getLessThanSignKeyword_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4524:6: ( () otherlv_8= '<=' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4524:6: ( () otherlv_8= '<=' )
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4524:7: () otherlv_8= '<='
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4524:7: ()
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4525:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisionExpressionAccess().getLessEqualExpressionLeftOperandAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_8=(Token)match(input,77,FOLLOW_77_in_ruleComparisionExpression10212); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getComparisionExpressionAccess().getLessThanSignEqualsSignKeyword_1_0_3_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4534:3: ( (lv_rightOperand_9_0= ruleAdditiveExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4535:1: (lv_rightOperand_9_0= ruleAdditiveExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4535:1: (lv_rightOperand_9_0= ruleAdditiveExpression )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4536:3: lv_rightOperand_9_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisionExpressionAccess().getRightOperandAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleComparisionExpression10235);
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
            	    break loop56;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4560:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4561:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4562:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression10273);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression10283); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4569:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operands_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4572:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4573:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4573:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )* )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4574:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression10330);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4582:1: ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )*
            loop58:
            do {
                int alt58=3;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==22) ) {
                    alt58=1;
                }
                else if ( (LA58_0==21) ) {
                    alt58=2;
                }


                switch (alt58) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4582:2: ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4582:2: ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4582:3: () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4582:3: ()
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4583:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getAdditiveExpressionAccess().getAddExpressionOperandsAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4588:2: ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+
            	    int cnt57=0;
            	    loop57:
            	    do {
            	        int alt57=2;
            	        int LA57_0 = input.LA(1);

            	        if ( (LA57_0==22) ) {
            	            int LA57_2 = input.LA(2);

            	            if ( (synpred14_InternalTTMCHybridLanguage()) ) {
            	                alt57=1;
            	            }


            	        }


            	        switch (alt57) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4588:3: ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4593:6: (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) )
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4593:8: otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAdditiveExpression10372); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_2, grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_1_0_0());
            	    	          
            	    	    }
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4597:1: ( (lv_operands_3_0= ruleMultiplicativeExpression ) )
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4598:1: (lv_operands_3_0= ruleMultiplicativeExpression )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4598:1: (lv_operands_3_0= ruleMultiplicativeExpression )
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4599:3: lv_operands_3_0= ruleMultiplicativeExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperandsMultiplicativeExpressionParserRuleCall_1_0_1_0_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression10393);
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
            	    	    if ( cnt57 >= 1 ) break loop57;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(57, input);
            	                throw eee;
            	        }
            	        cnt57++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4616:6: ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4616:6: ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4616:7: () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4616:7: ()
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4617:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getSubtractExpressionLeftOperandAction_1_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleAdditiveExpression10425); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4626:1: ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4627:1: (lv_rightOperand_6_0= ruleMultiplicativeExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4627:1: (lv_rightOperand_6_0= ruleMultiplicativeExpression )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4628:3: lv_rightOperand_6_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightOperandMultiplicativeExpressionParserRuleCall_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression10446);
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
            	    break loop58;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4652:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4653:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4654:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression10485);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression10495); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4661:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )* ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4664:28: ( (this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4665:1: (this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4665:1: (this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )* )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4666:5: this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getSignumExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression10542);
            this_SignumExpression_0=ruleSignumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SignumExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4674:1: ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )*
            loop61:
            do {
                int alt61=3;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==78) ) {
                    alt61=1;
                }
                else if ( ((LA61_0>=79 && LA61_0<=81)) ) {
                    alt61=2;
                }


                switch (alt61) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4674:2: ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4674:2: ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4674:3: () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4674:3: ()
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4675:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplyExpressionOperandsAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4680:2: ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+
            	    int cnt59=0;
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==78) ) {
            	            int LA59_2 = input.LA(2);

            	            if ( (synpred15_InternalTTMCHybridLanguage()) ) {
            	                alt59=1;
            	            }


            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4680:3: ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4685:6: (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) )
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4685:8: otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,78,FOLLOW_78_in_ruleMultiplicativeExpression10584); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_2, grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_1_0_1_0_0());
            	    	          
            	    	    }
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4689:1: ( (lv_operands_3_0= ruleSignumExpression ) )
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4690:1: (lv_operands_3_0= ruleSignumExpression )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4690:1: (lv_operands_3_0= ruleSignumExpression )
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4691:3: lv_operands_3_0= ruleSignumExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperandsSignumExpressionParserRuleCall_1_0_1_0_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression10605);
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
            	    	    if ( cnt59 >= 1 ) break loop59;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(59, input);
            	                throw eee;
            	        }
            	        cnt59++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4708:6: ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4708:6: ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4708:7: ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4708:7: ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) )
            	    int alt60=3;
            	    switch ( input.LA(1) ) {
            	    case 79:
            	        {
            	        alt60=1;
            	        }
            	        break;
            	    case 80:
            	        {
            	        alt60=2;
            	        }
            	        break;
            	    case 81:
            	        {
            	        alt60=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 60, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt60) {
            	        case 1 :
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4708:8: ( () otherlv_5= '/' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4708:8: ( () otherlv_5= '/' )
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4708:9: () otherlv_5= '/'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4708:9: ()
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4709:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicativeExpressionAccess().getDivideExpressionLeftOperandAction_1_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_5=(Token)match(input,79,FOLLOW_79_in_ruleMultiplicativeExpression10639); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_5, grammarAccess.getMultiplicativeExpressionAccess().getSolidusKeyword_1_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4719:6: ( () otherlv_7= 'div' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4719:6: ( () otherlv_7= 'div' )
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4719:7: () otherlv_7= 'div'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4719:7: ()
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4720:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicativeExpressionAccess().getDivExpressionLeftOperandAction_1_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleMultiplicativeExpression10668); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getMultiplicativeExpressionAccess().getDivKeyword_1_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4730:6: ( () otherlv_9= 'mod' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4730:6: ( () otherlv_9= 'mod' )
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4730:7: () otherlv_9= 'mod'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4730:7: ()
            	            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4731:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicativeExpressionAccess().getModExpressionLeftOperandAction_1_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_9=(Token)match(input,81,FOLLOW_81_in_ruleMultiplicativeExpression10697); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_9, grammarAccess.getMultiplicativeExpressionAccess().getModKeyword_1_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4740:3: ( (lv_rightOperand_10_0= ruleSignumExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4741:1: (lv_rightOperand_10_0= ruleSignumExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4741:1: (lv_rightOperand_10_0= ruleSignumExpression )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4742:3: lv_rightOperand_10_0= ruleSignumExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandSignumExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression10720);
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
            	    break loop61;
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


    // $ANTLR start "entryRuleAccessExpression"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4766:1: entryRuleAccessExpression returns [EObject current=null] : iv_ruleAccessExpression= ruleAccessExpression EOF ;
    public final EObject entryRuleAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4767:2: (iv_ruleAccessExpression= ruleAccessExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4768:2: iv_ruleAccessExpression= ruleAccessExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAccessExpression_in_entryRuleAccessExpression10759);
            iv_ruleAccessExpression=ruleAccessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAccessExpression10769); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4775:1: ruleAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )* ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4778:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )* ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4779:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4779:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )* )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4780:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleAccessExpression10816);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4788:1: ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )*
            loop64:
            do {
                int alt64=6;
                switch ( input.LA(1) ) {
                case 32:
                    {
                    alt64=1;
                    }
                    break;
                case 14:
                    {
                    alt64=2;
                    }
                    break;
                case 82:
                    {
                    alt64=3;
                    }
                    break;
                case 83:
                    {
                    alt64=4;
                    }
                    break;
                case 84:
                    {
                    alt64=5;
                    }
                    break;

                }

                switch (alt64) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4788:2: ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4788:2: ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4788:3: () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']'
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4788:3: ()
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4789:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getArrayAccessExpressionOperandAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleAccessExpression10838); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAccessExpressionAccess().getLeftSquareBracketKeyword_1_0_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4798:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4798:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )*
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4798:2: ( (lv_parameters_3_0= ruleExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4799:1: (lv_parameters_3_0= ruleExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4799:1: (lv_parameters_3_0= ruleExpression )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4800:3: lv_parameters_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAccessExpressionAccess().getParametersExpressionParserRuleCall_1_0_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleAccessExpression10860);
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

            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4816:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )*
            	    loop62:
            	    do {
            	        int alt62=2;
            	        int LA62_0 = input.LA(1);

            	        if ( (LA62_0==15) ) {
            	            alt62=1;
            	        }


            	        switch (alt62) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4816:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleAccessExpression10873); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_4, grammarAccess.getAccessExpressionAccess().getCommaKeyword_1_0_2_1_0());
            	    	          
            	    	    }
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4820:1: ( (lv_parameters_5_0= ruleExpression ) )
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4821:1: (lv_parameters_5_0= ruleExpression )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4821:1: (lv_parameters_5_0= ruleExpression )
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4822:3: lv_parameters_5_0= ruleExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAccessExpressionAccess().getParametersExpressionParserRuleCall_1_0_2_1_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleExpression_in_ruleAccessExpression10894);
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
            	    	    break loop62;
            	        }
            	    } while (true);


            	    }

            	    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleAccessExpression10909); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getAccessExpressionAccess().getRightSquareBracketKeyword_1_0_3());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4843:6: ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4843:6: ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4843:7: () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')'
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4843:7: ()
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4844:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getFunctionAccessExpressionOperandAction_1_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleAccessExpression10938); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getAccessExpressionAccess().getLeftParenthesisKeyword_1_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4853:1: ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4853:2: ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )*
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4853:2: ( (lv_parameters_9_0= ruleExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4854:1: (lv_parameters_9_0= ruleExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4854:1: (lv_parameters_9_0= ruleExpression )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4855:3: lv_parameters_9_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAccessExpressionAccess().getParametersExpressionParserRuleCall_1_1_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleAccessExpression10960);
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

            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4871:2: (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )*
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==15) ) {
            	            alt63=1;
            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4871:4: otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleAccessExpression10973); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_10, grammarAccess.getAccessExpressionAccess().getCommaKeyword_1_1_2_1_0());
            	    	          
            	    	    }
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4875:1: ( (lv_parameters_11_0= ruleExpression ) )
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4876:1: (lv_parameters_11_0= ruleExpression )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4876:1: (lv_parameters_11_0= ruleExpression )
            	    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4877:3: lv_parameters_11_0= ruleExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAccessExpressionAccess().getParametersExpressionParserRuleCall_1_1_2_1_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleExpression_in_ruleAccessExpression10994);
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
            	    	    break loop63;
            	        }
            	    } while (true);


            	    }

            	    otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleAccessExpression11009); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getAccessExpressionAccess().getRightParenthesisKeyword_1_1_3());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4898:6: ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4898:6: ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4898:7: () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4898:7: ()
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4899:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getRecordAccessExpressionOperandAction_1_2_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_14=(Token)match(input,82,FOLLOW_82_in_ruleAccessExpression11038); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getAccessExpressionAccess().getFullStopKeyword_1_2_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4908:1: ( (lv_field_15_0= RULE_ID ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4909:1: (lv_field_15_0= RULE_ID )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4909:1: (lv_field_15_0= RULE_ID )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4910:3: lv_field_15_0= RULE_ID
            	    {
            	    lv_field_15_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAccessExpression11055); if (state.failed) return current;
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
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4927:6: ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4927:6: ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4927:7: () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4927:7: ()
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4928:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getTupleAccessExpressionOperandAction_1_3_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_17=(Token)match(input,83,FOLLOW_83_in_ruleAccessExpression11089); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getAccessExpressionAccess().getExclamationMarkKeyword_1_3_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4937:1: ( (lv_index_18_0= RULE_INTEGER ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4938:1: (lv_index_18_0= RULE_INTEGER )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4938:1: (lv_index_18_0= RULE_INTEGER )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4939:3: lv_index_18_0= RULE_INTEGER
            	    {
            	    lv_index_18_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleAccessExpression11106); if (state.failed) return current;
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
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4956:6: ( () otherlv_20= '\\'' )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4956:6: ( () otherlv_20= '\\'' )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4956:7: () otherlv_20= '\\''
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4956:7: ()
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4957:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getPrimedExpressionOperandAction_1_4_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_20=(Token)match(input,84,FOLLOW_84_in_ruleAccessExpression11140); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_20, grammarAccess.getAccessExpressionAccess().getApostropheKeyword_1_4_1());
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
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


    // $ANTLR start "entryRuleReferenceExpression"
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4974:1: entryRuleReferenceExpression returns [EObject current=null] : iv_ruleReferenceExpression= ruleReferenceExpression EOF ;
    public final EObject entryRuleReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4975:2: (iv_ruleReferenceExpression= ruleReferenceExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4976:2: iv_ruleReferenceExpression= ruleReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceExpression_in_entryRuleReferenceExpression11179);
            iv_ruleReferenceExpression=ruleReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceExpression11189); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4983:1: ruleReferenceExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4986:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4987:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4987:1: ( (otherlv_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4988:1: (otherlv_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4988:1: (otherlv_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4989:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleReferenceExpression11233); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5008:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5009:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5010:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression11268);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralExpression11278); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5017:1: ruleLiteralExpression returns [EObject current=null] : (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5020:28: ( (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5021:1: (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5021:1: (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression )
            int alt65=8;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5022:5: this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getIntegerLiteralExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIntegerLiteralExpression_in_ruleLiteralExpression11325);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5032:5: this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getDecimalLiteralExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleDecimalLiteralExpression_in_ruleLiteralExpression11352);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5042:5: this_RationalLiteralExpression_2= ruleRationalLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getRationalLiteralExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRationalLiteralExpression_in_ruleLiteralExpression11379);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5052:5: this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteralExpression_in_ruleLiteralExpression11406);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5062:5: this_ArrayLiteralExpression_4= ruleArrayLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getArrayLiteralExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArrayLiteralExpression_in_ruleLiteralExpression11433);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5072:5: this_RecordLiteralExpression_5= ruleRecordLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getRecordLiteralExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRecordLiteralExpression_in_ruleLiteralExpression11460);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5082:5: this_TupleLiteralExpression_6= ruleTupleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getTupleLiteralExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTupleLiteralExpression_in_ruleLiteralExpression11487);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5092:5: this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getEnumerationLiteralExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEnumerationLiteralExpression_in_ruleLiteralExpression11514);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5108:1: entryRuleIntegerLiteralExpression returns [EObject current=null] : iv_ruleIntegerLiteralExpression= ruleIntegerLiteralExpression EOF ;
    public final EObject entryRuleIntegerLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5109:2: (iv_ruleIntegerLiteralExpression= ruleIntegerLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5110:2: iv_ruleIntegerLiteralExpression= ruleIntegerLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleIntegerLiteralExpression_in_entryRuleIntegerLiteralExpression11549);
            iv_ruleIntegerLiteralExpression=ruleIntegerLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntegerLiteralExpression11559); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5117:1: ruleIntegerLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INTEGER ) ) ;
    public final EObject ruleIntegerLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5120:28: ( ( (lv_value_0_0= RULE_INTEGER ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5121:1: ( (lv_value_0_0= RULE_INTEGER ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5121:1: ( (lv_value_0_0= RULE_INTEGER ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5122:1: (lv_value_0_0= RULE_INTEGER )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5122:1: (lv_value_0_0= RULE_INTEGER )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5123:3: lv_value_0_0= RULE_INTEGER
            {
            lv_value_0_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleIntegerLiteralExpression11600); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5147:1: entryRuleDecimalLiteralExpression returns [EObject current=null] : iv_ruleDecimalLiteralExpression= ruleDecimalLiteralExpression EOF ;
    public final EObject entryRuleDecimalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5148:2: (iv_ruleDecimalLiteralExpression= ruleDecimalLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5149:2: iv_ruleDecimalLiteralExpression= ruleDecimalLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleDecimalLiteralExpression_in_entryRuleDecimalLiteralExpression11640);
            iv_ruleDecimalLiteralExpression=ruleDecimalLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecimalLiteralExpression11650); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5156:1: ruleDecimalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5159:28: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5160:1: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5160:1: ( (lv_value_0_0= RULE_DECIMAL ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5161:1: (lv_value_0_0= RULE_DECIMAL )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5161:1: (lv_value_0_0= RULE_DECIMAL )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5162:3: lv_value_0_0= RULE_DECIMAL
            {
            lv_value_0_0=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleDecimalLiteralExpression11691); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5186:1: entryRuleRationalLiteralExpression returns [EObject current=null] : iv_ruleRationalLiteralExpression= ruleRationalLiteralExpression EOF ;
    public final EObject entryRuleRationalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRationalLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5187:2: (iv_ruleRationalLiteralExpression= ruleRationalLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5188:2: iv_ruleRationalLiteralExpression= ruleRationalLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRationalLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRationalLiteralExpression_in_entryRuleRationalLiteralExpression11731);
            iv_ruleRationalLiteralExpression=ruleRationalLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRationalLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRationalLiteralExpression11741); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5195:1: ruleRationalLiteralExpression returns [EObject current=null] : ( ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleRationalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_numerator_0_0=null;
        Token otherlv_1=null;
        Token lv_denominator_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5198:28: ( ( ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5199:1: ( ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5199:1: ( ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5199:2: ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5199:2: ( (lv_numerator_0_0= RULE_INTEGER ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5200:1: (lv_numerator_0_0= RULE_INTEGER )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5200:1: (lv_numerator_0_0= RULE_INTEGER )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5201:3: lv_numerator_0_0= RULE_INTEGER
            {
            lv_numerator_0_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleRationalLiteralExpression11783); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,85,FOLLOW_85_in_ruleRationalLiteralExpression11800); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRationalLiteralExpressionAccess().getPercentSignKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5221:1: ( (lv_denominator_2_0= RULE_INTEGER ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5222:1: (lv_denominator_2_0= RULE_INTEGER )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5222:1: (lv_denominator_2_0= RULE_INTEGER )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5223:3: lv_denominator_2_0= RULE_INTEGER
            {
            lv_denominator_2_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleRationalLiteralExpression11817); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5247:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5248:2: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5249:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteralExpression_in_entryRuleBooleanLiteralExpression11858);
            iv_ruleBooleanLiteralExpression=ruleBooleanLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteralExpression11868); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5256:1: ruleBooleanLiteralExpression returns [EObject current=null] : (this_TrueExpression_0= ruleTrueExpression | this_FalseExpression_1= ruleFalseExpression ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TrueExpression_0 = null;

        EObject this_FalseExpression_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5259:28: ( (this_TrueExpression_0= ruleTrueExpression | this_FalseExpression_1= ruleFalseExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5260:1: (this_TrueExpression_0= ruleTrueExpression | this_FalseExpression_1= ruleFalseExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5260:1: (this_TrueExpression_0= ruleTrueExpression | this_FalseExpression_1= ruleFalseExpression )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==86) ) {
                alt66=1;
            }
            else if ( (LA66_0==87) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5261:5: this_TrueExpression_0= ruleTrueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanLiteralExpressionAccess().getTrueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleTrueExpression_in_ruleBooleanLiteralExpression11915);
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
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5271:5: this_FalseExpression_1= ruleFalseExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanLiteralExpressionAccess().getFalseExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFalseExpression_in_ruleBooleanLiteralExpression11942);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5287:1: entryRuleTrueExpression returns [EObject current=null] : iv_ruleTrueExpression= ruleTrueExpression EOF ;
    public final EObject entryRuleTrueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5288:2: (iv_ruleTrueExpression= ruleTrueExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5289:2: iv_ruleTrueExpression= ruleTrueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTrueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTrueExpression_in_entryRuleTrueExpression11977);
            iv_ruleTrueExpression=ruleTrueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTrueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrueExpression11987); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5296:1: ruleTrueExpression returns [EObject current=null] : ( () otherlv_1= 'true' ) ;
    public final EObject ruleTrueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5299:28: ( ( () otherlv_1= 'true' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5300:1: ( () otherlv_1= 'true' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5300:1: ( () otherlv_1= 'true' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5300:2: () otherlv_1= 'true'
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5300:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5301:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTrueExpressionAccess().getTrueExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleTrueExpression12033); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5318:1: entryRuleFalseExpression returns [EObject current=null] : iv_ruleFalseExpression= ruleFalseExpression EOF ;
    public final EObject entryRuleFalseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5319:2: (iv_ruleFalseExpression= ruleFalseExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5320:2: iv_ruleFalseExpression= ruleFalseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFalseExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleFalseExpression_in_entryRuleFalseExpression12069);
            iv_ruleFalseExpression=ruleFalseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFalseExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFalseExpression12079); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5327:1: ruleFalseExpression returns [EObject current=null] : ( () otherlv_1= 'false' ) ;
    public final EObject ruleFalseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5330:28: ( ( () otherlv_1= 'false' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5331:1: ( () otherlv_1= 'false' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5331:1: ( () otherlv_1= 'false' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5331:2: () otherlv_1= 'false'
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5331:2: ()
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5332:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFalseExpressionAccess().getFalseExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,87,FOLLOW_87_in_ruleFalseExpression12125); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5349:1: entryRuleArrayLiteralExpression returns [EObject current=null] : iv_ruleArrayLiteralExpression= ruleArrayLiteralExpression EOF ;
    public final EObject entryRuleArrayLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5350:2: (iv_ruleArrayLiteralExpression= ruleArrayLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5351:2: iv_ruleArrayLiteralExpression= ruleArrayLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArrayLiteralExpression_in_entryRuleArrayLiteralExpression12161);
            iv_ruleArrayLiteralExpression=ruleArrayLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArrayLiteralExpression12171); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5358:1: ruleArrayLiteralExpression returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']' ) ;
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
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5361:28: ( (otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5362:1: (otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5362:1: (otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5362:3: otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleArrayLiteralExpression12208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayLiteralExpressionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5366:1: ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_ID) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5366:2: ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5366:2: ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5367:1: (lv_parameterDeclarations_1_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5367:1: (lv_parameterDeclarations_1_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5368:3: lv_parameterDeclarations_1_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayLiteralExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleArrayLiteralExpression12230);
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

                    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5384:2: (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==15) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5384:4: otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleArrayLiteralExpression12243); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getArrayLiteralExpressionAccess().getCommaKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5388:1: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5389:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5389:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5390:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArrayLiteralExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleParameterDeclaration_in_ruleArrayLiteralExpression12264);
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
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,52,FOLLOW_52_in_ruleArrayLiteralExpression12280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayLiteralExpressionAccess().getVerticalLineKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5410:1: ( (lv_operand_5_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5411:1: (lv_operand_5_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5411:1: (lv_operand_5_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5412:3: lv_operand_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayLiteralExpressionAccess().getOperandExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleArrayLiteralExpression12301);
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

            otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleArrayLiteralExpression12313); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5440:1: entryRuleRecordLiteralExpression returns [EObject current=null] : iv_ruleRecordLiteralExpression= ruleRecordLiteralExpression EOF ;
    public final EObject entryRuleRecordLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5441:2: (iv_ruleRecordLiteralExpression= ruleRecordLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5442:2: iv_ruleRecordLiteralExpression= ruleRecordLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRecordLiteralExpression_in_entryRuleRecordLiteralExpression12349);
            iv_ruleRecordLiteralExpression=ruleRecordLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordLiteralExpression12359); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5449:1: ruleRecordLiteralExpression returns [EObject current=null] : (otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)' ) ;
    public final EObject ruleRecordLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fieldAssignments_1_0 = null;

        EObject lv_fieldAssignments_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5452:28: ( (otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5453:1: (otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5453:1: (otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5453:3: otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_88_in_ruleRecordLiteralExpression12396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordLiteralExpressionAccess().getLeftParenthesisNumberSignKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5457:1: ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5458:1: (lv_fieldAssignments_1_0= ruleFieldAssignment )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5458:1: (lv_fieldAssignments_1_0= ruleFieldAssignment )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5459:3: lv_fieldAssignments_1_0= ruleFieldAssignment
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecordLiteralExpressionAccess().getFieldAssignmentsFieldAssignmentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFieldAssignment_in_ruleRecordLiteralExpression12417);
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

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5475:2: (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==15) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5475:4: otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleRecordLiteralExpression12430); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getRecordLiteralExpressionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5479:1: ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5480:1: (lv_fieldAssignments_3_0= ruleFieldAssignment )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5480:1: (lv_fieldAssignments_3_0= ruleFieldAssignment )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5481:3: lv_fieldAssignments_3_0= ruleFieldAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordLiteralExpressionAccess().getFieldAssignmentsFieldAssignmentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFieldAssignment_in_ruleRecordLiteralExpression12451);
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
            	    break loop69;
                }
            } while (true);

            otherlv_4=(Token)match(input,89,FOLLOW_89_in_ruleRecordLiteralExpression12465); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5509:1: entryRuleFieldAssignment returns [EObject current=null] : iv_ruleFieldAssignment= ruleFieldAssignment EOF ;
    public final EObject entryRuleFieldAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldAssignment = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5510:2: (iv_ruleFieldAssignment= ruleFieldAssignment EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5511:2: iv_ruleFieldAssignment= ruleFieldAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleFieldAssignment_in_entryRuleFieldAssignment12501);
            iv_ruleFieldAssignment=ruleFieldAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFieldAssignment12511); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5518:1: ruleFieldAssignment returns [EObject current=null] : ( ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleFieldAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_reference_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5521:28: ( ( ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5522:1: ( ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5522:1: ( ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5522:2: ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5522:2: ( (lv_reference_0_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5523:1: (lv_reference_0_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5523:1: (lv_reference_0_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5524:3: lv_reference_0_0= RULE_ID
            {
            lv_reference_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFieldAssignment12553); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleFieldAssignment12570); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFieldAssignmentAccess().getColonEqualsSignKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5544:1: ( (lv_value_2_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5545:1: (lv_value_2_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5545:1: (lv_value_2_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5546:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleFieldAssignment12591);
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5570:1: entryRuleTupleLiteralExpression returns [EObject current=null] : iv_ruleTupleLiteralExpression= ruleTupleLiteralExpression EOF ;
    public final EObject entryRuleTupleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5571:2: (iv_ruleTupleLiteralExpression= ruleTupleLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5572:2: iv_ruleTupleLiteralExpression= ruleTupleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleTupleLiteralExpression_in_entryRuleTupleLiteralExpression12627);
            iv_ruleTupleLiteralExpression=ruleTupleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTupleLiteralExpression12637); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5579:1: ruleTupleLiteralExpression returns [EObject current=null] : (otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)' ) ;
    public final EObject ruleTupleLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5582:28: ( (otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)' ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5583:1: (otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)' )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5583:1: (otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)' )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5583:3: otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_88_in_ruleTupleLiteralExpression12674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpressionAccess().getLeftParenthesisNumberSignKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5587:1: ( (lv_expressions_1_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5588:1: (lv_expressions_1_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5588:1: (lv_expressions_1_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5589:3: lv_expressions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpressionAccess().getExpressionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleTupleLiteralExpression12695);
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

            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5605:2: (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==15) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5605:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleTupleLiteralExpression12708); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTupleLiteralExpressionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5609:1: ( (lv_expressions_3_0= ruleExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5610:1: (lv_expressions_3_0= ruleExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5610:1: (lv_expressions_3_0= ruleExpression )
            	    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5611:3: lv_expressions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpressionAccess().getExpressionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpression_in_ruleTupleLiteralExpression12729);
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
            	    break loop70;
                }
            } while (true);

            otherlv_4=(Token)match(input,89,FOLLOW_89_in_ruleTupleLiteralExpression12743); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5639:1: entryRuleEnumerationLiteralExpression returns [EObject current=null] : iv_ruleEnumerationLiteralExpression= ruleEnumerationLiteralExpression EOF ;
    public final EObject entryRuleEnumerationLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5640:2: (iv_ruleEnumerationLiteralExpression= ruleEnumerationLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5641:2: iv_ruleEnumerationLiteralExpression= ruleEnumerationLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleEnumerationLiteralExpression_in_entryRuleEnumerationLiteralExpression12779);
            iv_ruleEnumerationLiteralExpression=ruleEnumerationLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteralExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEnumerationLiteralExpression12789); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5648:1: ruleEnumerationLiteralExpression returns [EObject current=null] : (otherlv_0= '::' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEnumerationLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5651:28: ( (otherlv_0= '::' ( (otherlv_1= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5652:1: (otherlv_0= '::' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5652:1: (otherlv_0= '::' ( (otherlv_1= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5652:3: otherlv_0= '::' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,90,FOLLOW_90_in_ruleEnumerationLiteralExpression12826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumerationLiteralExpressionAccess().getColonColonKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5656:1: ( (otherlv_1= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5657:1: (otherlv_1= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5657:1: (otherlv_1= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5658:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationLiteralExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEnumerationLiteralExpression12846); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5677:1: entryRuleBasicConstraintDefinition returns [EObject current=null] : iv_ruleBasicConstraintDefinition= ruleBasicConstraintDefinition EOF ;
    public final EObject entryRuleBasicConstraintDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicConstraintDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5678:2: (iv_ruleBasicConstraintDefinition= ruleBasicConstraintDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5679:2: iv_ruleBasicConstraintDefinition= ruleBasicConstraintDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicConstraintDefinitionRule()); 
            }
            pushFollow(FOLLOW_ruleBasicConstraintDefinition_in_entryRuleBasicConstraintDefinition12882);
            iv_ruleBasicConstraintDefinition=ruleBasicConstraintDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicConstraintDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicConstraintDefinition12892); if (state.failed) return current;

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
    // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5686:1: ruleBasicConstraintDefinition returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleBasicConstraintDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5689:28: ( (otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5690:1: (otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5690:1: (otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5690:3: otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleBasicConstraintDefinition12929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBasicConstraintDefinitionAccess().getConstraintKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5694:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5695:1: (lv_expression_1_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5695:1: (lv_expression_1_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:5696:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicConstraintDefinitionAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleBasicConstraintDefinition12950);
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

    // $ANTLR start synpred14_InternalTTMCHybridLanguage
    public final void synpred14_InternalTTMCHybridLanguage_fragment() throws RecognitionException {   
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4588:3: ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4588:4: ( '+' ( ( ruleMultiplicativeExpression ) ) )
        {
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4588:4: ( '+' ( ( ruleMultiplicativeExpression ) ) )
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4588:6: '+' ( ( ruleMultiplicativeExpression ) )
        {
        match(input,22,FOLLOW_22_in_synpred14_InternalTTMCHybridLanguage10353); if (state.failed) return ;
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4589:1: ( ( ruleMultiplicativeExpression ) )
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4590:1: ( ruleMultiplicativeExpression )
        {
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4590:1: ( ruleMultiplicativeExpression )
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4591:1: ruleMultiplicativeExpression
        {
        pushFollow(FOLLOW_ruleMultiplicativeExpression_in_synpred14_InternalTTMCHybridLanguage10360);
        ruleMultiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalTTMCHybridLanguage

    // $ANTLR start synpred15_InternalTTMCHybridLanguage
    public final void synpred15_InternalTTMCHybridLanguage_fragment() throws RecognitionException {   
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4680:3: ( ( '*' ( ( ruleSignumExpression ) ) ) )
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4680:4: ( '*' ( ( ruleSignumExpression ) ) )
        {
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4680:4: ( '*' ( ( ruleSignumExpression ) ) )
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4680:6: '*' ( ( ruleSignumExpression ) )
        {
        match(input,78,FOLLOW_78_in_synpred15_InternalTTMCHybridLanguage10565); if (state.failed) return ;
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4681:1: ( ( ruleSignumExpression ) )
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4682:1: ( ruleSignumExpression )
        {
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4682:1: ( ruleSignumExpression )
        // ../hu.bme.mit.inf.ttmc.hybrid.language/src-gen/hu/bme/mit/inf/ttmc/hybrid/language/parser/antlr/internal/InternalTTMCHybridLanguage.g:4683:1: ruleSignumExpression
        {
        pushFollow(FOLLOW_ruleSignumExpression_in_synpred15_InternalTTMCHybridLanguage10572);
        ruleSignumExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred15_InternalTTMCHybridLanguage

    // Delegated rules

    public final boolean synpred15_InternalTTMCHybridLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalTTMCHybridLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalTTMCHybridLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalTTMCHybridLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA45 dfa45 = new DFA45(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String DFA45_eotS =
        "\14\uffff";
    static final String DFA45_eofS =
        "\14\uffff";
    static final String DFA45_minS =
        "\1\4\13\uffff";
    static final String DFA45_maxS =
        "\1\132\13\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA45_specialS =
        "\14\uffff}>";
    static final String[] DFA45_transitionS = {
            "\3\13\7\uffff\1\13\5\uffff\4\13\10\uffff\1\13\7\uffff\1\4\25\uffff\1\1\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12\17\uffff\3\13\1\uffff\1\13",
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

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "3478:1: (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression )";
        }
    }
    static final String DFA65_eotS =
        "\14\uffff";
    static final String DFA65_eofS =
        "\1\uffff\1\10\12\uffff";
    static final String DFA65_minS =
        "\1\5\1\16\3\uffff\1\4\3\uffff\1\16\2\uffff";
    static final String DFA65_maxS =
        "\1\132\1\133\3\uffff\1\132\3\uffff\1\131\2\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\uffff\1\10\1\3\1\1\1\uffff\1\7\1\6";
    static final String DFA65_specialS =
        "\14\uffff}>";
    static final String[] DFA65_transitionS = {
            "\1\1\1\2\31\uffff\1\4\65\uffff\2\3\1\5\1\uffff\1\6",
            "\3\10\1\uffff\1\10\2\uffff\2\10\1\uffff\2\10\5\uffff\7\10\1\uffff\3\10\14\uffff\10\10\11\uffff\16\10\1\7\3\uffff\1\10\1\uffff\1\10",
            "",
            "",
            "",
            "\1\11\2\12\7\uffff\1\12\5\uffff\4\12\10\uffff\1\12\7\uffff\1\12\14\uffff\1\12\10\uffff\11\12\17\uffff\3\12\1\uffff\1\12",
            "",
            "",
            "",
            "\2\12\5\uffff\2\12\2\uffff\1\13\6\uffff\1\12\27\uffff\6\12\11\uffff\16\12\4\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "5021:1: (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleHybridSpecification_in_entryRuleHybridSpecification75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHybridSpecification85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleHybridSpecification122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHybridSpecification139 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleHybridSpecification157 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleHybridSpecification179 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleHybridSpecification192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleHybridSpecification213 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleHybridSpecification229 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHybridSpecification243 = new BitSet(new long[]{0x000003A001040000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_ruleHybridSpecification265 = new BitSet(new long[]{0x000003A001040000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleHybridSpecification292 = new BitSet(new long[]{0x000003A001040000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleConstantDeclaration_in_ruleHybridSpecification319 = new BitSet(new long[]{0x000003A001040000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleBasicConstraintDefinition_in_ruleHybridSpecification346 = new BitSet(new long[]{0x000003A001040000L,0x0000000008000000L});
    public static final BitSet FOLLOW_ruleHybridAutomatonDeclaration_in_ruleHybridSpecification373 = new BitSet(new long[]{0x000003A001040000L,0x0000000008000000L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_ruleHybridSpecification400 = new BitSet(new long[]{0x000003A001040000L,0x0000000008000000L});
    public static final BitSet FOLLOW_18_in_ruleHybridSpecification414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalTypeDefinition_in_ruleTypeDefinition507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerTypeDefinition_in_ruleTypeDefinition534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanTypeDefinition_in_ruleTypeDefinition561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealTypeDefinition_in_ruleTypeDefinition588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayTypeDefinition_in_ruleTypeDefinition615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationTypeDefinition_in_ruleTypeDefinition642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTypeDefinition_in_ruleTypeDefinition669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleTypeDefinition_in_ruleTypeDefinition696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubrangeTypeDefinition_in_ruleTypeDefinition723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubTypeDefinition_in_ruleTypeDefinition750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionTypeDefinition_in_ruleTypeDefinition777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClockTypeDefinition_in_ruleTypeDefinition804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClockTypeDefinition_in_entryRuleClockTypeDefinition839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClockTypeDefinition849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleClockTypeDefinition895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_rulePrimaryExpression988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceExpression_in_rulePrimaryExpression1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationReferenceExpression_in_rulePrimaryExpression1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePrimaryExpression1060 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression1082 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePrimaryExpression1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationReferenceExpression_in_entryRuleLocationReferenceExpression1130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationReferenceExpression1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleLocationReferenceExpression1177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocationReferenceExpression1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignumExpression_in_entryRuleSignumExpression1233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignumExpression1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSignumExpression1298 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleSignumExpression_in_ruleSignumExpression1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSignumExpression1357 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleSignumExpression_in_ruleSignumExpression1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSignumExpression1416 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleSignumExpression_in_ruleSignumExpression1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAccessExpression_in_ruleSignumExpression1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHybridAutomatonDeclaration_in_entryRuleHybridAutomatonDeclaration1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHybridAutomatonDeclaration1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleHybridAutomatonDeclaration1549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHybridAutomatonDeclaration1566 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_14_in_ruleHybridAutomatonDeclaration1584 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleHybridAutomatonDeclaration1606 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleHybridAutomatonDeclaration1619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleHybridAutomatonDeclaration1640 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleHybridAutomatonDeclaration1656 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleHybridAutomatonDeclaration1670 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleHybridAutomaton_in_ruleHybridAutomatonDeclaration1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHybridAutomaton_in_entryRuleHybridAutomaton1727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHybridAutomaton1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHybridAutomatonDefinition_in_ruleHybridAutomaton1783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHybridAutomatonDefinition_in_entryRuleHybridAutomatonDefinition1817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHybridAutomatonDefinition1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleHybridAutomatonDefinition1873 = new BitSet(new long[]{0x0000000074040000L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleHybridAutomatonDefinition1895 = new BitSet(new long[]{0x0000000074040000L});
    public static final BitSet FOLLOW_ruleLocation_in_ruleHybridAutomatonDefinition1922 = new BitSet(new long[]{0x0000000074040000L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleHybridAutomatonDefinition1949 = new BitSet(new long[]{0x0000000074040000L});
    public static final BitSet FOLLOW_18_in_ruleHybridAutomatonDefinition1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration1999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalVariableDeclaration_in_ruleVariableDeclaration2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariableDeclaration_in_ruleVariableDeclaration2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalVariableDeclaration_in_entryRuleGlobalVariableDeclaration2118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalVariableDeclaration2128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleGlobalVariableDeclaration2165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalVariableDeclaration2182 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleGlobalVariableDeclaration2199 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleGlobalVariableDeclaration2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVariableDeclaration_in_entryRuleLocalVariableDeclaration2256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariableDeclaration2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleLocalVariableDeclaration2303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration2320 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLocalVariableDeclaration2337 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleLocalVariableDeclaration2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocation_in_entryRuleLocation2394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocation2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLocation2441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocation2458 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleLocation2476 = new BitSet(new long[]{0x0000001C00040000L});
    public static final BitSet FOLLOW_ruleCondition_in_ruleLocation2497 = new BitSet(new long[]{0x0000001C00040000L});
    public static final BitSet FOLLOW_18_in_ruleLocation2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition2548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTransition2595 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition2615 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTransition2627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition2647 = new BitSet(new long[]{0x0000000100024002L});
    public static final BitSet FOLLOW_14_in_ruleTransition2660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleTransition2681 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleTransition2694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleTransition2715 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleTransition2729 = new BitSet(new long[]{0x0000000100020002L});
    public static final BitSet FOLLOW_32_in_ruleTransition2744 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTransition2765 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_15_in_ruleTransition2778 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTransition2799 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_33_in_ruleTransition2813 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleTransition2828 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleTransition2849 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleTransition2862 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleTransition2883 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleTransition2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment2935 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment2991 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAssignment3003 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAssignment3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition3060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCondition3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialCondition_in_ruleCondition3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantCondition_in_ruleCondition3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlowCondition_in_ruleCondition3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitialCondition_in_entryRuleInitialCondition3206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitialCondition3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInitialCondition3253 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInitialCondition3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvariantCondition_in_entryRuleInvariantCondition3310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvariantCondition3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleInvariantCondition3357 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleInvariantCondition3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlowCondition_in_entryRuleFlowCondition3414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlowCondition3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFlowCondition3461 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFlowCondition3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration3518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePropertyDeclaration3565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePropertyDeclaration3582 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePropertyDeclaration3599 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleHybridAutomaton_in_rulePropertyDeclaration3620 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_rulePropertyDeclaration3632 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_rulePropertyDeclaration3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration3691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration3701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration3752 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleParameterDeclaration3769 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterDeclaration3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldDeclaration_in_entryRuleFieldDeclaration3826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldDeclaration3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldDeclaration3887 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFieldDeclaration3904 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFieldDeclaration3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_entryRuleLetDeclaration3961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetDeclaration3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLetDeclaration4022 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLetDeclaration4039 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleLetDeclaration4060 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleLetDeclaration4072 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleLetDeclaration4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration4129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstantDeclaration4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleConstantDeclaration4176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDeclaration4193 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleConstantDeclaration4210 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleConstantDeclaration4231 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleConstantDeclaration4244 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleConstantDeclaration4265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration4303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration4313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFunctionDeclaration4350 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration4367 = new BitSet(new long[]{0x0000000008004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionDeclaration4385 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration4407 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionDeclaration4420 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration4441 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionDeclaration4457 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionDeclaration4471 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionDeclaration4492 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleFunctionDeclaration4505 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionDeclaration4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType4564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType4574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_ruleType4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleType4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration4683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDeclaration4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTypeDeclaration4730 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDeclaration4747 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTypeDeclaration4764 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeDeclaration4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference4821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTypeReference4875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalTypeDefinition_in_entryRuleNaturalTypeDefinition4910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalTypeDefinition4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNaturalTypeDefinition4966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerTypeDefinition_in_entryRuleIntegerTypeDefinition5002 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerTypeDefinition5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleIntegerTypeDefinition5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanTypeDefinition_in_entryRuleBooleanTypeDefinition5094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanTypeDefinition5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBooleanTypeDefinition5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRealTypeDefinition_in_entryRuleRealTypeDefinition5186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRealTypeDefinition5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRealTypeDefinition5242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayTypeDefinition_in_entryRuleArrayTypeDefinition5278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayTypeDefinition5288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleArrayTypeDefinition5325 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleArrayTypeDefinition5346 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_15_in_ruleArrayTypeDefinition5359 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleArrayTypeDefinition5380 = new BitSet(new long[]{0x0000800000008000L});
    public static final BitSet FOLLOW_47_in_ruleArrayTypeDefinition5394 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleArrayTypeDefinition5415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationTypeDefinition_in_entryRuleEnumerationTypeDefinition5451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationTypeDefinition5461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleEnumerationTypeDefinition5498 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEnumerationTypeDefinition5510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumerationLiteralDefinition_in_ruleEnumerationTypeDefinition5531 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleEnumerationTypeDefinition5544 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleEnumerationLiteralDefinition_in_ruleEnumerationTypeDefinition5565 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleEnumerationTypeDefinition5579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteralDefinition_in_entryRuleEnumerationLiteralDefinition5615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteralDefinition5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteralDefinition5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTypeDefinition_in_entryRuleRecordTypeDefinition5706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordTypeDefinition5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRecordTypeDefinition5753 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRecordTypeDefinition5765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldDeclaration_in_ruleRecordTypeDefinition5786 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleRecordTypeDefinition5799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldDeclaration_in_ruleRecordTypeDefinition5820 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleRecordTypeDefinition5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleTypeDefinition_in_entryRuleTupleTypeDefinition5870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeDefinition5880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleTupleTypeDefinition5917 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTupleTypeDefinition5929 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleTypeDefinition5950 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_ruleTupleTypeDefinition5963 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleTupleTypeDefinition5984 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_18_in_ruleTupleTypeDefinition5998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubrangeTypeDefinition_in_entryRuleSubrangeTypeDefinition6034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubrangeTypeDefinition6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleSubrangeTypeDefinition6090 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_21_in_ruleSubrangeTypeDefinition6104 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleSubrangeTypeDefinition6116 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSubrangeTypeDefinition6144 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleSubrangeTypeDefinition6157 = new BitSet(new long[]{0xC028010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_51_in_ruleSubrangeTypeDefinition6170 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSubrangeTypeDefinition6197 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSubrangeTypeDefinition6210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubTypeDefinition_in_entryRuleSubTypeDefinition6246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubTypeDefinition6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSubTypeDefinition6293 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleSubTypeDefinition6314 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleSubTypeDefinition6326 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleSubTypeDefinition6347 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSubTypeDefinition6359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionTypeDefinition_in_entryRuleFunctionTypeDefinition6395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionTypeDefinition6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFunctionTypeDefinition6442 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionTypeDefinition6454 = new BitSet(new long[]{0x00077D01000B0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionTypeDefinition6476 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionTypeDefinition6489 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionTypeDefinition6510 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionTypeDefinition6526 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionTypeDefinition6538 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionTypeDefinition6559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression6605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElseExpression_in_ruleExpression6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfThenElseExpression_in_entryRuleIfThenElseExpression6685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElseExpression6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleIfThenElseExpression6742 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElseExpression6763 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleIfThenElseExpression6775 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElseExpression6796 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleIfThenElseExpression6817 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElseExpression6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualExpression_in_ruleIfThenElseExpression6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression6904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression6914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplyExpression_in_ruleEqualExpression6961 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEqualExpression6982 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleEqualExpression_in_ruleEqualExpression7003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplyExpression_in_entryRuleImplyExpression7041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplyExpression7051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_ruleImplyExpression7098 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_ruleImplyExpression7119 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleImplyExpression_in_ruleImplyExpression7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression7178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression7188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression7235 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOrExpression7257 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression7278 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression7318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReleaseExpression_in_ruleAndExpression7375 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_ruleAndExpression7397 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleReleaseExpression_in_ruleAndExpression7418 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_ruleReleaseExpression_in_entryRuleReleaseExpression7458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReleaseExpression7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUntilExpression_in_ruleReleaseExpression7515 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleReleaseExpression7536 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleUntilExpression_in_ruleReleaseExpression7557 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleUntilExpression_in_entryRuleUntilExpression7595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUntilExpression7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleUntilExpression7652 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleUntilExpression7673 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleUntilExpression7694 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_entryRuleUnaryLogicExpression7732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryLogicExpression7742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_ruleUnaryLogicExpression7789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForallExpression_in_ruleUnaryLogicExpression7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_ruleUnaryLogicExpression7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionLiteralExpression_in_ruleUnaryLogicExpression7870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGloballyExpression_in_ruleUnaryLogicExpression7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinallyExpression_in_ruleUnaryLogicExpression7924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextExpression_in_ruleUnaryLogicExpression7951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalForallExpression_in_ruleUnaryLogicExpression7978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalExistsExpression_in_ruleUnaryLogicExpression8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpression_in_ruleUnaryLogicExpression8032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_ruleUnaryLogicExpression8059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression8094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleNotExpression8158 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleNotExpression8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForallExpression_in_entryRuleForallExpression8216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForallExpression8226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleForallExpression8280 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleForallExpression8293 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleForallExpression8315 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleForallExpression8328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleForallExpression8349 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleForallExpression8365 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleForallExpression8377 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleForallExpression8398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression8434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExistsExpression8444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleExistsExpression8498 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleExistsExpression8511 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleExistsExpression8533 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleExistsExpression8546 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleExistsExpression8567 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleExistsExpression8583 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleExistsExpression8595 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleExistsExpression8616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionLiteralExpression_in_entryRuleFunctionLiteralExpression8652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionLiteralExpression8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFunctionLiteralExpression8716 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleFunctionLiteralExpression8729 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionLiteralExpression8751 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleFunctionLiteralExpression8764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionLiteralExpression8785 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleFunctionLiteralExpression8801 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionLiteralExpression8813 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionLiteralExpression8834 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFunctionLiteralExpression8846 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleFunctionLiteralExpression8867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGloballyExpression_in_entryRuleGloballyExpression8903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGloballyExpression8913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleGloballyExpression8967 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleGloballyExpression8989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFinallyExpression_in_entryRuleFinallyExpression9025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFinallyExpression9035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleFinallyExpression9089 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleFinallyExpression9111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextExpression_in_entryRuleNextExpression9147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNextExpression9157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleNextExpression9211 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleNextExpression9233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalForallExpression_in_entryRuleTemporalForallExpression9269 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalForallExpression9279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleTemporalForallExpression9333 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleTemporalForallExpression9355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalExistsExpression_in_entryRuleTemporalExistsExpression9391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalExistsExpression9401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleTemporalExistsExpression9455 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleTemporalExistsExpression9477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLetExpression_in_entryRuleLetExpression9513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLetExpression9523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleLetExpression9569 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleLetExpression9581 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_ruleLetExpression9602 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleLetExpression9615 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLetDeclaration_in_ruleLetExpression9636 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleLetExpression9650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleLetExpression9662 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleLetExpression9683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression9719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInExpression9729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalenceExpression_in_ruleInExpression9776 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleInExpression9797 = new BitSet(new long[]{0x00077D01000A0010L});
    public static final BitSet FOLLOW_ruleType_in_ruleInExpression9818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalenceExpression_in_entryRuleEquivalenceExpression9856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquivalenceExpression9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression9913 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_72_in_ruleEquivalenceExpression9935 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression9956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleEquivalenceExpression9985 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression10006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparisionExpression_in_entryRuleComparisionExpression10045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparisionExpression10055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleComparisionExpression10102 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_74_in_ruleComparisionExpression10125 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_75_in_ruleComparisionExpression10154 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_76_in_ruleComparisionExpression10183 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_77_in_ruleComparisionExpression10212 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleComparisionExpression10235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003C00L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression10273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression10283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression10330 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_22_in_ruleAdditiveExpression10372 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression10393 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_21_in_ruleAdditiveExpression10425 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression10446 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression10485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression10495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression10542 = new BitSet(new long[]{0x0000000000000002L,0x000000000003C000L});
    public static final BitSet FOLLOW_78_in_ruleMultiplicativeExpression10584 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression10605 = new BitSet(new long[]{0x0000000000000002L,0x000000000003C000L});
    public static final BitSet FOLLOW_79_in_ruleMultiplicativeExpression10639 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_80_in_ruleMultiplicativeExpression10668 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_81_in_ruleMultiplicativeExpression10697 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression10720 = new BitSet(new long[]{0x0000000000000002L,0x000000000003C000L});
    public static final BitSet FOLLOW_ruleAccessExpression_in_entryRuleAccessExpression10759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAccessExpression10769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleAccessExpression10816 = new BitSet(new long[]{0x0000000100004002L,0x00000000001C0000L});
    public static final BitSet FOLLOW_32_in_ruleAccessExpression10838 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpression10860 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_15_in_ruleAccessExpression10873 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpression10894 = new BitSet(new long[]{0x0000000200008000L});
    public static final BitSet FOLLOW_33_in_ruleAccessExpression10909 = new BitSet(new long[]{0x0000000100004002L,0x00000000001C0000L});
    public static final BitSet FOLLOW_14_in_ruleAccessExpression10938 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpression10960 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleAccessExpression10973 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpression10994 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleAccessExpression11009 = new BitSet(new long[]{0x0000000100004002L,0x00000000001C0000L});
    public static final BitSet FOLLOW_82_in_ruleAccessExpression11038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAccessExpression11055 = new BitSet(new long[]{0x0000000100004002L,0x00000000001C0000L});
    public static final BitSet FOLLOW_83_in_ruleAccessExpression11089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleAccessExpression11106 = new BitSet(new long[]{0x0000000100004002L,0x00000000001C0000L});
    public static final BitSet FOLLOW_84_in_ruleAccessExpression11140 = new BitSet(new long[]{0x0000000100004002L,0x00000000001C0000L});
    public static final BitSet FOLLOW_ruleReferenceExpression_in_entryRuleReferenceExpression11179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceExpression11189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceExpression11233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression11268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression11278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteralExpression_in_ruleLiteralExpression11325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalLiteralExpression_in_ruleLiteralExpression11352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRationalLiteralExpression_in_ruleLiteralExpression11379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteralExpression_in_ruleLiteralExpression11406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteralExpression_in_ruleLiteralExpression11433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordLiteralExpression_in_ruleLiteralExpression11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteralExpression_in_ruleLiteralExpression11487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteralExpression_in_ruleLiteralExpression11514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntegerLiteralExpression_in_entryRuleIntegerLiteralExpression11549 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteralExpression11559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleIntegerLiteralExpression11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecimalLiteralExpression_in_entryRuleDecimalLiteralExpression11640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecimalLiteralExpression11650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleDecimalLiteralExpression11691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRationalLiteralExpression_in_entryRuleRationalLiteralExpression11731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRationalLiteralExpression11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleRationalLiteralExpression11783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_ruleRationalLiteralExpression11800 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleRationalLiteralExpression11817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteralExpression_in_entryRuleBooleanLiteralExpression11858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpression11868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueExpression_in_ruleBooleanLiteralExpression11915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFalseExpression_in_ruleBooleanLiteralExpression11942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrueExpression_in_entryRuleTrueExpression11977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrueExpression11987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleTrueExpression12033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFalseExpression_in_entryRuleFalseExpression12069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFalseExpression12079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleFalseExpression12125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArrayLiteralExpression_in_entryRuleArrayLiteralExpression12161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteralExpression12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleArrayLiteralExpression12208 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleArrayLiteralExpression12230 = new BitSet(new long[]{0x0010000000008000L});
    public static final BitSet FOLLOW_15_in_ruleArrayLiteralExpression12243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleArrayLiteralExpression12264 = new BitSet(new long[]{0x0010000000008000L});
    public static final BitSet FOLLOW_52_in_ruleArrayLiteralExpression12280 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteralExpression12301 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleArrayLiteralExpression12313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordLiteralExpression_in_entryRuleRecordLiteralExpression12349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordLiteralExpression12359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleRecordLiteralExpression12396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldAssignment_in_ruleRecordLiteralExpression12417 = new BitSet(new long[]{0x0000000000008000L,0x0000000002000000L});
    public static final BitSet FOLLOW_15_in_ruleRecordLiteralExpression12430 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleFieldAssignment_in_ruleRecordLiteralExpression12451 = new BitSet(new long[]{0x0000000000008000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleRecordLiteralExpression12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFieldAssignment_in_entryRuleFieldAssignment12501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFieldAssignment12511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFieldAssignment12553 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleFieldAssignment12570 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleFieldAssignment12591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTupleLiteralExpression_in_entryRuleTupleLiteralExpression12627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpression12637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleTupleLiteralExpression12674 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTupleLiteralExpression12695 = new BitSet(new long[]{0x0000000000008000L,0x0000000002000000L});
    public static final BitSet FOLLOW_15_in_ruleTupleLiteralExpression12708 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleTupleLiteralExpression12729 = new BitSet(new long[]{0x0000000000008000L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleTupleLiteralExpression12743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEnumerationLiteralExpression_in_entryRuleEnumerationLiteralExpression12779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteralExpression12789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleEnumerationLiteralExpression12826 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteralExpression12846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicConstraintDefinition_in_entryRuleBasicConstraintDefinition12882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicConstraintDefinition12892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleBasicConstraintDefinition12929 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleExpression_in_ruleBasicConstraintDefinition12950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred14_InternalTTMCHybridLanguage10353 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_synpred14_InternalTTMCHybridLanguage10360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_synpred15_InternalTTMCHybridLanguage10565 = new BitSet(new long[]{0xC020010100F04070L,0x0000000005C0007FL});
    public static final BitSet FOLLOW_ruleSignumExpression_in_synpred15_InternalTTMCHybridLanguage10572 = new BitSet(new long[]{0x0000000000000002L});

}
package hu.bme.mit.inf.ttmc.system.language.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.inf.ttmc.system.language.services.TTMCSystemLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTTMCSystemLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INTEGER", "RULE_DECIMAL", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'specification'", "'('", "','", "')'", "'{'", "'}'", "'system'", "':='", "'[]'", "'||'", "'sync'", "':'", "'async'", "'definition'", "'local'", "'var'", "'global'", "'input'", "'output'", "'invariant'", "'initial'", "'transition'", "'property'", "'models'", "'const'", "'function'", "'type'", "'natural'", "'integer'", "'boolean'", "'real'", "'array'", "'of'", "'enum'", "'record'", "'tuple'", "'['", "'-'", "'inf'", "'to'", "']'", "'|'", "'if'", "'then'", "'else'", "'equal'", "'imply'", "'or'", "'and'", "'R'", "'U'", "'not'", "'forall'", "'exists'", "'G'", "'F'", "'X'", "'A'", "'E'", "'let'", "'in'", "'='", "'/='", "'>'", "'>='", "'<'", "'<='", "'+'", "'*'", "'/'", "'div'", "'mod'", "'.'", "'!'", "'\\''", "'%'", "'true'", "'false'", "'(#'", "'#)'", "'::'", "'constraint'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_DECIMAL=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int RULE_INTEGER=5;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalTTMCSystemLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTTMCSystemLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTTMCSystemLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g"; }



     	private TTMCSystemLanguageGrammarAccess grammarAccess;
     	
        public InternalTTMCSystemLanguageParser(TokenStream input, TTMCSystemLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SystemSpecification";	
       	}
       	
       	@Override
       	protected TTMCSystemLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSystemSpecification"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:67:1: entryRuleSystemSpecification returns [EObject current=null] : iv_ruleSystemSpecification= ruleSystemSpecification EOF ;
    public final EObject entryRuleSystemSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemSpecification = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:68:2: (iv_ruleSystemSpecification= ruleSystemSpecification EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:69:2: iv_ruleSystemSpecification= ruleSystemSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemSpecificationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSystemSpecification_in_entryRuleSystemSpecification75);
            iv_ruleSystemSpecification=ruleSystemSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemSpecification; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSystemSpecification85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemSpecification"


    // $ANTLR start "ruleSystemSpecification"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:76:1: ruleSystemSpecification returns [EObject current=null] : (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) ) | ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) | ( (lv_systemDeclarations_12_0= ruleSystemDeclaration ) ) | ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) ) )* otherlv_14= '}' ) ;
    public final EObject ruleSystemSpecification() throws RecognitionException {
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

        EObject lv_systemDeclarations_12_0 = null;

        EObject lv_propertyDeclarations_13_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:79:28: ( (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) ) | ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) | ( (lv_systemDeclarations_12_0= ruleSystemDeclaration ) ) | ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) ) )* otherlv_14= '}' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:80:1: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) ) | ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) | ( (lv_systemDeclarations_12_0= ruleSystemDeclaration ) ) | ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) ) )* otherlv_14= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:80:1: (otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) ) | ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) | ( (lv_systemDeclarations_12_0= ruleSystemDeclaration ) ) | ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) ) )* otherlv_14= '}' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:80:3: otherlv_0= 'specification' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= '{' ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) ) | ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) | ( (lv_systemDeclarations_12_0= ruleSystemDeclaration ) ) | ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) ) )* otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSystemSpecification122); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSystemSpecificationAccess().getSpecificationKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSystemSpecification139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSystemSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSystemSpecificationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:102:2: (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:102:4: otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSystemSpecification157); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSystemSpecificationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:106:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_ID) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:106:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            {
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:106:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:107:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            {
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:107:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:108:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSystemSpecificationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleSystemSpecification179);
                            lv_parameterDeclarations_3_0=ruleParameterDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSystemSpecificationRule());
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

                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:124:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            loop1:
                            do {
                                int alt1=2;
                                int LA1_0 = input.LA(1);

                                if ( (LA1_0==15) ) {
                                    alt1=1;
                                }


                                switch (alt1) {
                            	case 1 :
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:124:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSystemSpecification192); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getSystemSpecificationAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:128:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:129:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    {
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:129:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:130:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSystemSpecificationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleSystemSpecification213);
                            	    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSystemSpecificationRule());
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

                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSystemSpecification229); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSystemSpecificationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSystemSpecification243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getSystemSpecificationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:154:1: ( ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) ) | ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) ) | ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) ) | ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) ) | ( (lv_systemDeclarations_12_0= ruleSystemDeclaration ) ) | ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) ) )*
            loop4:
            do {
                int alt4=7;
                switch ( input.LA(1) ) {
                case 39:
                    {
                    alt4=1;
                    }
                    break;
                case 38:
                    {
                    alt4=2;
                    }
                    break;
                case 37:
                    {
                    alt4=3;
                    }
                    break;
                case 94:
                    {
                    alt4=4;
                    }
                    break;
                case 19:
                    {
                    alt4=5;
                    }
                    break;
                case 35:
                    {
                    alt4=6;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:154:2: ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:154:2: ( (lv_typeDeclarations_8_0= ruleTypeDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:155:1: (lv_typeDeclarations_8_0= ruleTypeDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:155:1: (lv_typeDeclarations_8_0= ruleTypeDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:156:3: lv_typeDeclarations_8_0= ruleTypeDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemSpecificationAccess().getTypeDeclarationsTypeDeclarationParserRuleCall_4_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleTypeDeclaration_in_ruleSystemSpecification265);
            	    lv_typeDeclarations_8_0=ruleTypeDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemSpecificationRule());
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
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:173:6: ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:173:6: ( (lv_functionDeclarations_9_0= ruleFunctionDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:174:1: (lv_functionDeclarations_9_0= ruleFunctionDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:174:1: (lv_functionDeclarations_9_0= ruleFunctionDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:175:3: lv_functionDeclarations_9_0= ruleFunctionDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemSpecificationAccess().getFunctionDeclarationsFunctionDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFunctionDeclaration_in_ruleSystemSpecification292);
            	    lv_functionDeclarations_9_0=ruleFunctionDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemSpecificationRule());
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
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:192:6: ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:192:6: ( (lv_constantDeclarations_10_0= ruleConstantDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:193:1: (lv_constantDeclarations_10_0= ruleConstantDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:193:1: (lv_constantDeclarations_10_0= ruleConstantDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:194:3: lv_constantDeclarations_10_0= ruleConstantDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemSpecificationAccess().getConstantDeclarationsConstantDeclarationParserRuleCall_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleConstantDeclaration_in_ruleSystemSpecification319);
            	    lv_constantDeclarations_10_0=ruleConstantDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemSpecificationRule());
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
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:211:6: ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:211:6: ( (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:212:1: (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:212:1: (lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:213:3: lv_basicConstraintDefinitions_11_0= ruleBasicConstraintDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemSpecificationAccess().getBasicConstraintDefinitionsBasicConstraintDefinitionParserRuleCall_4_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleBasicConstraintDefinition_in_ruleSystemSpecification346);
            	    lv_basicConstraintDefinitions_11_0=ruleBasicConstraintDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemSpecificationRule());
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
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:230:6: ( (lv_systemDeclarations_12_0= ruleSystemDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:230:6: ( (lv_systemDeclarations_12_0= ruleSystemDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:231:1: (lv_systemDeclarations_12_0= ruleSystemDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:231:1: (lv_systemDeclarations_12_0= ruleSystemDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:232:3: lv_systemDeclarations_12_0= ruleSystemDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemSpecificationAccess().getSystemDeclarationsSystemDeclarationParserRuleCall_4_4_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSystemDeclaration_in_ruleSystemSpecification373);
            	    lv_systemDeclarations_12_0=ruleSystemDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemSpecificationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"systemDeclarations",
            	              		lv_systemDeclarations_12_0, 
            	              		"SystemDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:249:6: ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:249:6: ( (lv_propertyDeclarations_13_0= rulePropertyDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:250:1: (lv_propertyDeclarations_13_0= rulePropertyDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:250:1: (lv_propertyDeclarations_13_0= rulePropertyDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:251:3: lv_propertyDeclarations_13_0= rulePropertyDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemSpecificationAccess().getPropertyDeclarationsPropertyDeclarationParserRuleCall_4_5_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePropertyDeclaration_in_ruleSystemSpecification400);
            	    lv_propertyDeclarations_13_0=rulePropertyDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemSpecificationRule());
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

            otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSystemSpecification414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getSystemSpecificationAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleSystemSpecification"


    // $ANTLR start "entryRuleSystemDeclaration"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:279:1: entryRuleSystemDeclaration returns [EObject current=null] : iv_ruleSystemDeclaration= ruleSystemDeclaration EOF ;
    public final EObject entryRuleSystemDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:280:2: (iv_ruleSystemDeclaration= ruleSystemDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:281:2: iv_ruleSystemDeclaration= ruleSystemDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSystemDeclaration_in_entryRuleSystemDeclaration450);
            iv_ruleSystemDeclaration=ruleSystemDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSystemDeclaration460); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemDeclaration"


    // $ANTLR start "ruleSystemDeclaration"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:288:1: ruleSystemDeclaration returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':=' ( (lv_system_8_0= ruleSystem ) ) ) ;
    public final EObject ruleSystemDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameterDeclarations_3_0 = null;

        EObject lv_parameterDeclarations_5_0 = null;

        EObject lv_system_8_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:291:28: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':=' ( (lv_system_8_0= ruleSystem ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:292:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':=' ( (lv_system_8_0= ruleSystem ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:292:1: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':=' ( (lv_system_8_0= ruleSystem ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:292:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':=' ( (lv_system_8_0= ruleSystem ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSystemDeclaration497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSystemDeclarationAccess().getSystemKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:296:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:297:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:297:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:298:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSystemDeclaration514); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSystemDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSystemDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:314:2: (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:314:4: otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSystemDeclaration532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSystemDeclarationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:318:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:318:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            {
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:318:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:319:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            {
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:319:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:320:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSystemDeclarationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleSystemDeclaration554);
                            lv_parameterDeclarations_3_0=ruleParameterDeclaration();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSystemDeclarationRule());
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

                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:336:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==15) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:336:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSystemDeclaration567); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getSystemDeclarationAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:340:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:341:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    {
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:341:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:342:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSystemDeclarationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleSystemDeclaration588);
                            	    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSystemDeclarationRule());
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
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSystemDeclaration604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSystemDeclarationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSystemDeclaration618); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getSystemDeclarationAccess().getColonEqualsSignKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:366:1: ( (lv_system_8_0= ruleSystem ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:367:1: (lv_system_8_0= ruleSystem )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:367:1: (lv_system_8_0= ruleSystem )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:368:3: lv_system_8_0= ruleSystem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSystemDeclarationAccess().getSystemSystemParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleSystem_in_ruleSystemDeclaration639);
            lv_system_8_0=ruleSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSystemDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"system",
                      		lv_system_8_0, 
                      		"System");
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
    // $ANTLR end "ruleSystemDeclaration"


    // $ANTLR start "entryRuleSystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:392:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:393:2: (iv_ruleSystem= ruleSystem EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:394:2: iv_ruleSystem= ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSystem_in_entryRuleSystem675);
            iv_ruleSystem=ruleSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystem; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSystem685); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:401:1: ruleSystem returns [EObject current=null] : this_AsynchronousCompositeSystem_0= ruleAsynchronousCompositeSystem ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        EObject this_AsynchronousCompositeSystem_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:404:28: (this_AsynchronousCompositeSystem_0= ruleAsynchronousCompositeSystem )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:406:5: this_AsynchronousCompositeSystem_0= ruleAsynchronousCompositeSystem
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSystemAccess().getAsynchronousCompositeSystemParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAsynchronousCompositeSystem_in_ruleSystem731);
            this_AsynchronousCompositeSystem_0=ruleAsynchronousCompositeSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AsynchronousCompositeSystem_0; 
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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleAsynchronousCompositeSystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:422:1: entryRuleAsynchronousCompositeSystem returns [EObject current=null] : iv_ruleAsynchronousCompositeSystem= ruleAsynchronousCompositeSystem EOF ;
    public final EObject entryRuleAsynchronousCompositeSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsynchronousCompositeSystem = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:423:2: (iv_ruleAsynchronousCompositeSystem= ruleAsynchronousCompositeSystem EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:424:2: iv_ruleAsynchronousCompositeSystem= ruleAsynchronousCompositeSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAsynchronousCompositeSystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAsynchronousCompositeSystem_in_entryRuleAsynchronousCompositeSystem765);
            iv_ruleAsynchronousCompositeSystem=ruleAsynchronousCompositeSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAsynchronousCompositeSystem; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsynchronousCompositeSystem775); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsynchronousCompositeSystem"


    // $ANTLR start "ruleAsynchronousCompositeSystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:431:1: ruleAsynchronousCompositeSystem returns [EObject current=null] : (this_SynchronousCompositeSystem_0= ruleSynchronousCompositeSystem ( () otherlv_2= '[]' ( (lv_rightSystem_3_0= ruleSynchronousCompositeSystem ) ) )* ) ;
    public final EObject ruleAsynchronousCompositeSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_SynchronousCompositeSystem_0 = null;

        EObject lv_rightSystem_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:434:28: ( (this_SynchronousCompositeSystem_0= ruleSynchronousCompositeSystem ( () otherlv_2= '[]' ( (lv_rightSystem_3_0= ruleSynchronousCompositeSystem ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:435:1: (this_SynchronousCompositeSystem_0= ruleSynchronousCompositeSystem ( () otherlv_2= '[]' ( (lv_rightSystem_3_0= ruleSynchronousCompositeSystem ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:435:1: (this_SynchronousCompositeSystem_0= ruleSynchronousCompositeSystem ( () otherlv_2= '[]' ( (lv_rightSystem_3_0= ruleSynchronousCompositeSystem ) ) )* )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:436:5: this_SynchronousCompositeSystem_0= ruleSynchronousCompositeSystem ( () otherlv_2= '[]' ( (lv_rightSystem_3_0= ruleSynchronousCompositeSystem ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAsynchronousCompositeSystemAccess().getSynchronousCompositeSystemParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSynchronousCompositeSystem_in_ruleAsynchronousCompositeSystem822);
            this_SynchronousCompositeSystem_0=ruleSynchronousCompositeSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SynchronousCompositeSystem_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:444:1: ( () otherlv_2= '[]' ( (lv_rightSystem_3_0= ruleSynchronousCompositeSystem ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:444:2: () otherlv_2= '[]' ( (lv_rightSystem_3_0= ruleSynchronousCompositeSystem ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:444:2: ()
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:445:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAsynchronousCompositeSystemAccess().getAsynchronousCompositeSystemLeftSystemAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAsynchronousCompositeSystem843); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAsynchronousCompositeSystemAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:454:1: ( (lv_rightSystem_3_0= ruleSynchronousCompositeSystem ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:455:1: (lv_rightSystem_3_0= ruleSynchronousCompositeSystem )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:455:1: (lv_rightSystem_3_0= ruleSynchronousCompositeSystem )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:456:3: lv_rightSystem_3_0= ruleSynchronousCompositeSystem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAsynchronousCompositeSystemAccess().getRightSystemSynchronousCompositeSystemParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSynchronousCompositeSystem_in_ruleAsynchronousCompositeSystem864);
            	    lv_rightSystem_3_0=ruleSynchronousCompositeSystem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAsynchronousCompositeSystemRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightSystem",
            	              		lv_rightSystem_3_0, 
            	              		"SynchronousCompositeSystem");
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
    // $ANTLR end "ruleAsynchronousCompositeSystem"


    // $ANTLR start "entryRuleSynchronousCompositeSystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:480:1: entryRuleSynchronousCompositeSystem returns [EObject current=null] : iv_ruleSynchronousCompositeSystem= ruleSynchronousCompositeSystem EOF ;
    public final EObject entryRuleSynchronousCompositeSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynchronousCompositeSystem = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:481:2: (iv_ruleSynchronousCompositeSystem= ruleSynchronousCompositeSystem EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:482:2: iv_ruleSynchronousCompositeSystem= ruleSynchronousCompositeSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSynchronousCompositeSystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSynchronousCompositeSystem_in_entryRuleSynchronousCompositeSystem902);
            iv_ruleSynchronousCompositeSystem=ruleSynchronousCompositeSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSynchronousCompositeSystem; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSynchronousCompositeSystem912); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSynchronousCompositeSystem"


    // $ANTLR start "ruleSynchronousCompositeSystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:489:1: ruleSynchronousCompositeSystem returns [EObject current=null] : (this_MultiSystem_0= ruleMultiSystem ( () otherlv_2= '||' ( (lv_rightSystem_3_0= ruleMultiSystem ) ) )* ) ;
    public final EObject ruleSynchronousCompositeSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_MultiSystem_0 = null;

        EObject lv_rightSystem_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:492:28: ( (this_MultiSystem_0= ruleMultiSystem ( () otherlv_2= '||' ( (lv_rightSystem_3_0= ruleMultiSystem ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:493:1: (this_MultiSystem_0= ruleMultiSystem ( () otherlv_2= '||' ( (lv_rightSystem_3_0= ruleMultiSystem ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:493:1: (this_MultiSystem_0= ruleMultiSystem ( () otherlv_2= '||' ( (lv_rightSystem_3_0= ruleMultiSystem ) ) )* )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:494:5: this_MultiSystem_0= ruleMultiSystem ( () otherlv_2= '||' ( (lv_rightSystem_3_0= ruleMultiSystem ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getSynchronousCompositeSystemAccess().getMultiSystemParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiSystem_in_ruleSynchronousCompositeSystem959);
            this_MultiSystem_0=ruleMultiSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiSystem_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:502:1: ( () otherlv_2= '||' ( (lv_rightSystem_3_0= ruleMultiSystem ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:502:2: () otherlv_2= '||' ( (lv_rightSystem_3_0= ruleMultiSystem ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:502:2: ()
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:503:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getSynchronousCompositeSystemAccess().getSynchronousCompositeSystemLeftSystemAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSynchronousCompositeSystem980); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getSynchronousCompositeSystemAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:512:1: ( (lv_rightSystem_3_0= ruleMultiSystem ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:513:1: (lv_rightSystem_3_0= ruleMultiSystem )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:513:1: (lv_rightSystem_3_0= ruleMultiSystem )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:514:3: lv_rightSystem_3_0= ruleMultiSystem
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSynchronousCompositeSystemAccess().getRightSystemMultiSystemParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiSystem_in_ruleSynchronousCompositeSystem1001);
            	    lv_rightSystem_3_0=ruleMultiSystem();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSynchronousCompositeSystemRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightSystem",
            	              		lv_rightSystem_3_0, 
            	              		"MultiSystem");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleSynchronousCompositeSystem"


    // $ANTLR start "entryRuleMultiSystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:538:1: entryRuleMultiSystem returns [EObject current=null] : iv_ruleMultiSystem= ruleMultiSystem EOF ;
    public final EObject entryRuleMultiSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiSystem = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:539:2: (iv_ruleMultiSystem= ruleMultiSystem EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:540:2: iv_ruleMultiSystem= ruleMultiSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiSystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiSystem_in_entryRuleMultiSystem1039);
            iv_ruleMultiSystem=ruleMultiSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiSystem; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiSystem1049); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiSystem"


    // $ANTLR start "ruleMultiSystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:547:1: ruleMultiSystem returns [EObject current=null] : (this_SynchronousMultiSystem_0= ruleSynchronousMultiSystem | this_AsynchronousMultiSystem_1= ruleAsynchronousMultiSystem | this_PrimarySystem_2= rulePrimarySystem ) ;
    public final EObject ruleMultiSystem() throws RecognitionException {
        EObject current = null;

        EObject this_SynchronousMultiSystem_0 = null;

        EObject this_AsynchronousMultiSystem_1 = null;

        EObject this_PrimarySystem_2 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:550:28: ( (this_SynchronousMultiSystem_0= ruleSynchronousMultiSystem | this_AsynchronousMultiSystem_1= ruleAsynchronousMultiSystem | this_PrimarySystem_2= rulePrimarySystem ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:551:1: (this_SynchronousMultiSystem_0= ruleSynchronousMultiSystem | this_AsynchronousMultiSystem_1= ruleAsynchronousMultiSystem | this_PrimarySystem_2= rulePrimarySystem )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:551:1: (this_SynchronousMultiSystem_0= ruleSynchronousMultiSystem | this_AsynchronousMultiSystem_1= ruleAsynchronousMultiSystem | this_PrimarySystem_2= rulePrimarySystem )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case RULE_ID:
            case 14:
            case 17:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:552:5: this_SynchronousMultiSystem_0= ruleSynchronousMultiSystem
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiSystemAccess().getSynchronousMultiSystemParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSynchronousMultiSystem_in_ruleMultiSystem1096);
                    this_SynchronousMultiSystem_0=ruleSynchronousMultiSystem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SynchronousMultiSystem_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:562:5: this_AsynchronousMultiSystem_1= ruleAsynchronousMultiSystem
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiSystemAccess().getAsynchronousMultiSystemParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAsynchronousMultiSystem_in_ruleMultiSystem1123);
                    this_AsynchronousMultiSystem_1=ruleAsynchronousMultiSystem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AsynchronousMultiSystem_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:572:5: this_PrimarySystem_2= rulePrimarySystem
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getMultiSystemAccess().getPrimarySystemParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_rulePrimarySystem_in_ruleMultiSystem1150);
                    this_PrimarySystem_2=rulePrimarySystem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_PrimarySystem_2; 
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
    // $ANTLR end "ruleMultiSystem"


    // $ANTLR start "entryRuleSynchronousMultiSystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:588:1: entryRuleSynchronousMultiSystem returns [EObject current=null] : iv_ruleSynchronousMultiSystem= ruleSynchronousMultiSystem EOF ;
    public final EObject entryRuleSynchronousMultiSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynchronousMultiSystem = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:589:2: (iv_ruleSynchronousMultiSystem= ruleSynchronousMultiSystem EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:590:2: iv_ruleSynchronousMultiSystem= ruleSynchronousMultiSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSynchronousMultiSystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSynchronousMultiSystem_in_entryRuleSynchronousMultiSystem1185);
            iv_ruleSynchronousMultiSystem=ruleSynchronousMultiSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSynchronousMultiSystem; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSynchronousMultiSystem1195); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSynchronousMultiSystem"


    // $ANTLR start "ruleSynchronousMultiSystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:597:1: ruleSynchronousMultiSystem returns [EObject current=null] : ( () ( ( 'sync' )=>otherlv_1= 'sync' ) otherlv_2= '(' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_system_8_0= ruleMultiSystem ) ) ) ;
    public final EObject ruleSynchronousMultiSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameterDeclarations_3_0 = null;

        EObject lv_parameterDeclarations_5_0 = null;

        EObject lv_system_8_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:600:28: ( ( () ( ( 'sync' )=>otherlv_1= 'sync' ) otherlv_2= '(' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_system_8_0= ruleMultiSystem ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:601:1: ( () ( ( 'sync' )=>otherlv_1= 'sync' ) otherlv_2= '(' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_system_8_0= ruleMultiSystem ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:601:1: ( () ( ( 'sync' )=>otherlv_1= 'sync' ) otherlv_2= '(' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_system_8_0= ruleMultiSystem ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:601:2: () ( ( 'sync' )=>otherlv_1= 'sync' ) otherlv_2= '(' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_system_8_0= ruleMultiSystem ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:601:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:602:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSynchronousMultiSystemAccess().getSynchronousMultiSystemAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:607:2: ( ( 'sync' )=>otherlv_1= 'sync' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:607:3: ( 'sync' )=>otherlv_1= 'sync'
            {
            otherlv_1=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSynchronousMultiSystem1249); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSynchronousMultiSystemAccess().getSyncKeyword_1());
                  
            }

            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSynchronousMultiSystem1262); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSynchronousMultiSystemAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:616:1: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:617:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:617:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:618:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSynchronousMultiSystemAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleSynchronousMultiSystem1283);
            lv_parameterDeclarations_3_0=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSynchronousMultiSystemRule());
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

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:634:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:634:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSynchronousMultiSystem1296); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getSynchronousMultiSystemAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:638:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:639:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:639:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:640:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSynchronousMultiSystemAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleSynchronousMultiSystem1317);
            	    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSynchronousMultiSystemRule());
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
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSynchronousMultiSystem1331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSynchronousMultiSystemAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleSynchronousMultiSystem1343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getSynchronousMultiSystemAccess().getColonKeyword_6());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:664:1: ( (lv_system_8_0= ruleMultiSystem ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:665:1: (lv_system_8_0= ruleMultiSystem )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:665:1: (lv_system_8_0= ruleMultiSystem )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:666:3: lv_system_8_0= ruleMultiSystem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSynchronousMultiSystemAccess().getSystemMultiSystemParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiSystem_in_ruleSynchronousMultiSystem1364);
            lv_system_8_0=ruleMultiSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSynchronousMultiSystemRule());
              	        }
                     		set(
                     			current, 
                     			"system",
                      		lv_system_8_0, 
                      		"MultiSystem");
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
    // $ANTLR end "ruleSynchronousMultiSystem"


    // $ANTLR start "entryRuleAsynchronousMultiSystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:690:1: entryRuleAsynchronousMultiSystem returns [EObject current=null] : iv_ruleAsynchronousMultiSystem= ruleAsynchronousMultiSystem EOF ;
    public final EObject entryRuleAsynchronousMultiSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAsynchronousMultiSystem = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:691:2: (iv_ruleAsynchronousMultiSystem= ruleAsynchronousMultiSystem EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:692:2: iv_ruleAsynchronousMultiSystem= ruleAsynchronousMultiSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAsynchronousMultiSystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAsynchronousMultiSystem_in_entryRuleAsynchronousMultiSystem1400);
            iv_ruleAsynchronousMultiSystem=ruleAsynchronousMultiSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAsynchronousMultiSystem; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAsynchronousMultiSystem1410); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAsynchronousMultiSystem"


    // $ANTLR start "ruleAsynchronousMultiSystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:699:1: ruleAsynchronousMultiSystem returns [EObject current=null] : ( () ( ( 'async' )=>otherlv_1= 'async' ) otherlv_2= '(' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_system_8_0= ruleMultiSystem ) ) ) ;
    public final EObject ruleAsynchronousMultiSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_parameterDeclarations_3_0 = null;

        EObject lv_parameterDeclarations_5_0 = null;

        EObject lv_system_8_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:702:28: ( ( () ( ( 'async' )=>otherlv_1= 'async' ) otherlv_2= '(' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_system_8_0= ruleMultiSystem ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:703:1: ( () ( ( 'async' )=>otherlv_1= 'async' ) otherlv_2= '(' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_system_8_0= ruleMultiSystem ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:703:1: ( () ( ( 'async' )=>otherlv_1= 'async' ) otherlv_2= '(' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_system_8_0= ruleMultiSystem ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:703:2: () ( ( 'async' )=>otherlv_1= 'async' ) otherlv_2= '(' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* otherlv_6= ')' otherlv_7= ':' ( (lv_system_8_0= ruleMultiSystem ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:703:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:704:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAsynchronousMultiSystemAccess().getAsynchronousMultiSystemAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:709:2: ( ( 'async' )=>otherlv_1= 'async' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:709:3: ( 'async' )=>otherlv_1= 'async'
            {
            otherlv_1=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAsynchronousMultiSystem1464); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAsynchronousMultiSystemAccess().getAsyncKeyword_1());
                  
            }

            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAsynchronousMultiSystem1477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAsynchronousMultiSystemAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:718:1: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:719:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:719:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:720:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAsynchronousMultiSystemAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleAsynchronousMultiSystem1498);
            lv_parameterDeclarations_3_0=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAsynchronousMultiSystemRule());
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

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:736:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:736:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAsynchronousMultiSystem1511); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getAsynchronousMultiSystemAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:740:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:741:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:741:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:742:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAsynchronousMultiSystemAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleAsynchronousMultiSystem1532);
            	    lv_parameterDeclarations_5_0=ruleParameterDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAsynchronousMultiSystemRule());
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
            	    break loop12;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAsynchronousMultiSystem1546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAsynchronousMultiSystemAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAsynchronousMultiSystem1558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAsynchronousMultiSystemAccess().getColonKeyword_6());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:766:1: ( (lv_system_8_0= ruleMultiSystem ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:767:1: (lv_system_8_0= ruleMultiSystem )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:767:1: (lv_system_8_0= ruleMultiSystem )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:768:3: lv_system_8_0= ruleMultiSystem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAsynchronousMultiSystemAccess().getSystemMultiSystemParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiSystem_in_ruleAsynchronousMultiSystem1579);
            lv_system_8_0=ruleMultiSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAsynchronousMultiSystemRule());
              	        }
                     		set(
                     			current, 
                     			"system",
                      		lv_system_8_0, 
                      		"MultiSystem");
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
    // $ANTLR end "ruleAsynchronousMultiSystem"


    // $ANTLR start "entryRulePrimarySystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:792:1: entryRulePrimarySystem returns [EObject current=null] : iv_rulePrimarySystem= rulePrimarySystem EOF ;
    public final EObject entryRulePrimarySystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimarySystem = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:793:2: (iv_rulePrimarySystem= rulePrimarySystem EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:794:2: iv_rulePrimarySystem= rulePrimarySystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimarySystemRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimarySystem_in_entryRulePrimarySystem1615);
            iv_rulePrimarySystem=rulePrimarySystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimarySystem; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimarySystem1625); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimarySystem"


    // $ANTLR start "rulePrimarySystem"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:801:1: rulePrimarySystem returns [EObject current=null] : (this_SystemReference_0= ruleSystemReference | this_SystemDefinition_1= ruleSystemDefinition | (otherlv_2= '(' this_System_3= ruleSystem otherlv_4= ')' ) ) ;
    public final EObject rulePrimarySystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_SystemReference_0 = null;

        EObject this_SystemDefinition_1 = null;

        EObject this_System_3 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:804:28: ( (this_SystemReference_0= ruleSystemReference | this_SystemDefinition_1= ruleSystemDefinition | (otherlv_2= '(' this_System_3= ruleSystem otherlv_4= ')' ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:805:1: (this_SystemReference_0= ruleSystemReference | this_SystemDefinition_1= ruleSystemDefinition | (otherlv_2= '(' this_System_3= ruleSystem otherlv_4= ')' ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:805:1: (this_SystemReference_0= ruleSystemReference | this_SystemDefinition_1= ruleSystemDefinition | (otherlv_2= '(' this_System_3= ruleSystem otherlv_4= ')' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case 17:
                {
                alt13=2;
                }
                break;
            case 14:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:806:5: this_SystemReference_0= ruleSystemReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimarySystemAccess().getSystemReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSystemReference_in_rulePrimarySystem1672);
                    this_SystemReference_0=ruleSystemReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SystemReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:816:5: this_SystemDefinition_1= ruleSystemDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimarySystemAccess().getSystemDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSystemDefinition_in_rulePrimarySystem1699);
                    this_SystemDefinition_1=ruleSystemDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SystemDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:825:6: (otherlv_2= '(' this_System_3= ruleSystem otherlv_4= ')' )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:825:6: (otherlv_2= '(' this_System_3= ruleSystem otherlv_4= ')' )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:825:8: otherlv_2= '(' this_System_3= ruleSystem otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePrimarySystem1717); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimarySystemAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimarySystemAccess().getSystemParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSystem_in_rulePrimarySystem1739);
                    this_System_3=ruleSystem();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_System_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePrimarySystem1750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimarySystemAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "rulePrimarySystem"


    // $ANTLR start "entryRuleSystemReference"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:850:1: entryRuleSystemReference returns [EObject current=null] : iv_ruleSystemReference= ruleSystemReference EOF ;
    public final EObject entryRuleSystemReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemReference = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:851:2: (iv_ruleSystemReference= ruleSystemReference EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:852:2: iv_ruleSystemReference= ruleSystemReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSystemReference_in_entryRuleSystemReference1787);
            iv_ruleSystemReference=ruleSystemReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSystemReference1797); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemReference"


    // $ANTLR start "ruleSystemReference"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:859:1: ruleSystemReference returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) ;
    public final EObject ruleSystemReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:862:28: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:863:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:863:1: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )? )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:863:2: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:863:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:864:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSystemReferenceAccess().getSystemReferenceAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:869:2: ( (otherlv_1= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:870:1: (otherlv_1= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:870:1: (otherlv_1= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:871:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSystemReferenceRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSystemReference1851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_1, grammarAccess.getSystemReferenceAccess().getReferenceSystemDeclarationCrossReference_1_0()); 
              	
            }

            }


            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:882:2: (otherlv_2= '(' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:882:4: otherlv_2= '(' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSystemReference1864); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSystemReferenceAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:886:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_DECIMAL)||LA15_0==14||LA15_0==38||(LA15_0>=49 && LA15_0<=50)||LA15_0==55||(LA15_0>=64 && LA15_0<=72)||LA15_0==80||(LA15_0>=89 && LA15_0<=91)||LA15_0==93) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:886:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )*
                            {
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:886:2: ( (lv_parameters_3_0= ruleExpression ) )
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:887:1: (lv_parameters_3_0= ruleExpression )
                            {
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:887:1: (lv_parameters_3_0= ruleExpression )
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:888:3: lv_parameters_3_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getSystemReferenceAccess().getParametersExpressionParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSystemReference1886);
                            lv_parameters_3_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getSystemReferenceRule());
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

                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:904:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==15) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:904:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleSystemReference1899); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getSystemReferenceAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:908:1: ( (lv_parameters_5_0= ruleExpression ) )
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:909:1: (lv_parameters_5_0= ruleExpression )
                            	    {
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:909:1: (lv_parameters_5_0= ruleExpression )
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:910:3: lv_parameters_5_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getSystemReferenceAccess().getParametersExpressionParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSystemReference1920);
                            	    lv_parameters_5_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getSystemReferenceRule());
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
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSystemReference1936); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSystemReferenceAccess().getRightParenthesisKeyword_2_2());
                          
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
    // $ANTLR end "ruleSystemReference"


    // $ANTLR start "entryRuleSystemDefinition"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:938:1: entryRuleSystemDefinition returns [EObject current=null] : iv_ruleSystemDefinition= ruleSystemDefinition EOF ;
    public final EObject entryRuleSystemDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:939:2: (iv_ruleSystemDefinition= ruleSystemDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:940:2: iv_ruleSystemDefinition= ruleSystemDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSystemDefinition_in_entryRuleSystemDefinition1974);
            iv_ruleSystemDefinition=ruleSystemDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSystemDefinition1984); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemDefinition"


    // $ANTLR start "ruleSystemDefinition"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:947:1: ruleSystemDefinition returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) ) | ( (lv_definitionDeclarations_3_0= ruleDefinitionDeclaration ) ) | ( (lv_systemConstraintDefinitions_4_0= ruleSystemConstraintDefinition ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleSystemDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_variableDeclarations_2_0 = null;

        EObject lv_definitionDeclarations_3_0 = null;

        EObject lv_systemConstraintDefinitions_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:950:28: ( ( () otherlv_1= '{' ( ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) ) | ( (lv_definitionDeclarations_3_0= ruleDefinitionDeclaration ) ) | ( (lv_systemConstraintDefinitions_4_0= ruleSystemConstraintDefinition ) ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:951:1: ( () otherlv_1= '{' ( ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) ) | ( (lv_definitionDeclarations_3_0= ruleDefinitionDeclaration ) ) | ( (lv_systemConstraintDefinitions_4_0= ruleSystemConstraintDefinition ) ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:951:1: ( () otherlv_1= '{' ( ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) ) | ( (lv_definitionDeclarations_3_0= ruleDefinitionDeclaration ) ) | ( (lv_systemConstraintDefinitions_4_0= ruleSystemConstraintDefinition ) ) )* otherlv_5= '}' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:951:2: () otherlv_1= '{' ( ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) ) | ( (lv_definitionDeclarations_3_0= ruleDefinitionDeclaration ) ) | ( (lv_systemConstraintDefinitions_4_0= ruleSystemConstraintDefinition ) ) )* otherlv_5= '}'
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:951:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:952:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSystemDefinitionAccess().getSystemDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSystemDefinition2030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSystemDefinitionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:961:1: ( ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) ) | ( (lv_definitionDeclarations_3_0= ruleDefinitionDeclaration ) ) | ( (lv_systemConstraintDefinitions_4_0= ruleSystemConstraintDefinition ) ) )*
            loop17:
            do {
                int alt17=4;
                switch ( input.LA(1) ) {
                case 27:
                case 29:
                case 30:
                case 31:
                    {
                    alt17=1;
                    }
                    break;
                case 26:
                    {
                    alt17=2;
                    }
                    break;
                case 32:
                case 33:
                case 34:
                    {
                    alt17=3;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:961:2: ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:961:2: ( (lv_variableDeclarations_2_0= ruleVariableDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:962:1: (lv_variableDeclarations_2_0= ruleVariableDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:962:1: (lv_variableDeclarations_2_0= ruleVariableDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:963:3: lv_variableDeclarations_2_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemDefinitionAccess().getVariableDeclarationsVariableDeclarationParserRuleCall_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_ruleSystemDefinition2052);
            	    lv_variableDeclarations_2_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemDefinitionRule());
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
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:980:6: ( (lv_definitionDeclarations_3_0= ruleDefinitionDeclaration ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:980:6: ( (lv_definitionDeclarations_3_0= ruleDefinitionDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:981:1: (lv_definitionDeclarations_3_0= ruleDefinitionDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:981:1: (lv_definitionDeclarations_3_0= ruleDefinitionDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:982:3: lv_definitionDeclarations_3_0= ruleDefinitionDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemDefinitionAccess().getDefinitionDeclarationsDefinitionDeclarationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleDefinitionDeclaration_in_ruleSystemDefinition2079);
            	    lv_definitionDeclarations_3_0=ruleDefinitionDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"definitionDeclarations",
            	              		lv_definitionDeclarations_3_0, 
            	              		"DefinitionDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:999:6: ( (lv_systemConstraintDefinitions_4_0= ruleSystemConstraintDefinition ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:999:6: ( (lv_systemConstraintDefinitions_4_0= ruleSystemConstraintDefinition ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1000:1: (lv_systemConstraintDefinitions_4_0= ruleSystemConstraintDefinition )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1000:1: (lv_systemConstraintDefinitions_4_0= ruleSystemConstraintDefinition )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1001:3: lv_systemConstraintDefinitions_4_0= ruleSystemConstraintDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemDefinitionAccess().getSystemConstraintDefinitionsSystemConstraintDefinitionParserRuleCall_2_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSystemConstraintDefinition_in_ruleSystemDefinition2106);
            	    lv_systemConstraintDefinitions_4_0=ruleSystemConstraintDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemDefinitionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"systemConstraintDefinitions",
            	              		lv_systemConstraintDefinitions_4_0, 
            	              		"SystemConstraintDefinition");
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

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSystemDefinition2120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSystemDefinitionAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleSystemDefinition"


    // $ANTLR start "entryRuleDefinitionDeclaration"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1029:1: entryRuleDefinitionDeclaration returns [EObject current=null] : iv_ruleDefinitionDeclaration= ruleDefinitionDeclaration EOF ;
    public final EObject entryRuleDefinitionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1030:2: (iv_ruleDefinitionDeclaration= ruleDefinitionDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1031:2: iv_ruleDefinitionDeclaration= ruleDefinitionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDefinitionDeclaration_in_entryRuleDefinitionDeclaration2156);
            iv_ruleDefinitionDeclaration=ruleDefinitionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefinitionDeclaration2166); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinitionDeclaration"


    // $ANTLR start "ruleDefinitionDeclaration"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1038:1: ruleDefinitionDeclaration returns [EObject current=null] : (otherlv_0= 'definition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) ) ;
    public final EObject ruleDefinitionDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1041:28: ( (otherlv_0= 'definition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1042:1: (otherlv_0= 'definition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1042:1: (otherlv_0= 'definition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1042:3: otherlv_0= 'definition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleDefinitionDeclaration2203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefinitionDeclarationAccess().getDefinitionKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1046:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1047:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1047:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1048:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDefinitionDeclaration2220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDefinitionDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDefinitionDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleDefinitionDeclaration2237); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDefinitionDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1068:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1069:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1069:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1070:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleDefinitionDeclaration2258);
            lv_type_3_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitionDeclarationRule());
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

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleDefinitionDeclaration2270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDefinitionDeclarationAccess().getColonEqualsSignKeyword_4());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1090:1: ( (lv_expression_5_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1091:1: (lv_expression_5_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1091:1: (lv_expression_5_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1092:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitionDeclarationAccess().getExpressionExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleDefinitionDeclaration2291);
            lv_expression_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitionDeclarationRule());
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
    // $ANTLR end "ruleDefinitionDeclaration"


    // $ANTLR start "entryRuleVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1116:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1117:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1118:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2327);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVariableDeclaration2337); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1125:1: ruleVariableDeclaration returns [EObject current=null] : (this_LocalVariableDeclaration_0= ruleLocalVariableDeclaration | this_GlobalVariableDeclaration_1= ruleGlobalVariableDeclaration | this_InputVariableDeclaration_2= ruleInputVariableDeclaration | this_OutputVariableDeclaration_3= ruleOutputVariableDeclaration ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_LocalVariableDeclaration_0 = null;

        EObject this_GlobalVariableDeclaration_1 = null;

        EObject this_InputVariableDeclaration_2 = null;

        EObject this_OutputVariableDeclaration_3 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1128:28: ( (this_LocalVariableDeclaration_0= ruleLocalVariableDeclaration | this_GlobalVariableDeclaration_1= ruleGlobalVariableDeclaration | this_InputVariableDeclaration_2= ruleInputVariableDeclaration | this_OutputVariableDeclaration_3= ruleOutputVariableDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1129:1: (this_LocalVariableDeclaration_0= ruleLocalVariableDeclaration | this_GlobalVariableDeclaration_1= ruleGlobalVariableDeclaration | this_InputVariableDeclaration_2= ruleInputVariableDeclaration | this_OutputVariableDeclaration_3= ruleOutputVariableDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1129:1: (this_LocalVariableDeclaration_0= ruleLocalVariableDeclaration | this_GlobalVariableDeclaration_1= ruleGlobalVariableDeclaration | this_InputVariableDeclaration_2= ruleInputVariableDeclaration | this_OutputVariableDeclaration_3= ruleOutputVariableDeclaration )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt18=1;
                }
                break;
            case 29:
                {
                alt18=2;
                }
                break;
            case 30:
                {
                alt18=3;
                }
                break;
            case 31:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1130:5: this_LocalVariableDeclaration_0= ruleLocalVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getLocalVariableDeclarationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLocalVariableDeclaration_in_ruleVariableDeclaration2384);
                    this_LocalVariableDeclaration_0=ruleLocalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LocalVariableDeclaration_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1140:5: this_GlobalVariableDeclaration_1= ruleGlobalVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getGlobalVariableDeclarationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGlobalVariableDeclaration_in_ruleVariableDeclaration2411);
                    this_GlobalVariableDeclaration_1=ruleGlobalVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GlobalVariableDeclaration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1150:5: this_InputVariableDeclaration_2= ruleInputVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getInputVariableDeclarationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInputVariableDeclaration_in_ruleVariableDeclaration2438);
                    this_InputVariableDeclaration_2=ruleInputVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InputVariableDeclaration_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1160:5: this_OutputVariableDeclaration_3= ruleOutputVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVariableDeclarationAccess().getOutputVariableDeclarationParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleOutputVariableDeclaration_in_ruleVariableDeclaration2465);
                    this_OutputVariableDeclaration_3=ruleOutputVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OutputVariableDeclaration_3; 
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


    // $ANTLR start "entryRuleLocalVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1176:1: entryRuleLocalVariableDeclaration returns [EObject current=null] : iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF ;
    public final EObject entryRuleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVariableDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1177:2: (iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1178:2: iv_ruleLocalVariableDeclaration= ruleLocalVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLocalVariableDeclaration_in_entryRuleLocalVariableDeclaration2500);
            iv_ruleLocalVariableDeclaration=ruleLocalVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalVariableDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLocalVariableDeclaration2510); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1185:1: ruleLocalVariableDeclaration returns [EObject current=null] : (otherlv_0= 'local' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) ;
    public final EObject ruleLocalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1188:28: ( (otherlv_0= 'local' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1189:1: (otherlv_0= 'local' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1189:1: (otherlv_0= 'local' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1189:3: otherlv_0= 'local' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleLocalVariableDeclaration2547); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLocalVariableDeclarationAccess().getLocalKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLocalVariableDeclaration2559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLocalVariableDeclarationAccess().getVarKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1197:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1198:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1198:1: (lv_name_2_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1199:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration2576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getLocalVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLocalVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLocalVariableDeclaration2593); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLocalVariableDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1219:1: ( (lv_type_4_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1220:1: (lv_type_4_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1220:1: (lv_type_4_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1221:3: lv_type_4_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLocalVariableDeclarationAccess().getTypeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleLocalVariableDeclaration2614);
            lv_type_4_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLocalVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
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


    // $ANTLR start "entryRuleGlobalVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1245:1: entryRuleGlobalVariableDeclaration returns [EObject current=null] : iv_ruleGlobalVariableDeclaration= ruleGlobalVariableDeclaration EOF ;
    public final EObject entryRuleGlobalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalVariableDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1246:2: (iv_ruleGlobalVariableDeclaration= ruleGlobalVariableDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1247:2: iv_ruleGlobalVariableDeclaration= ruleGlobalVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGlobalVariableDeclaration_in_entryRuleGlobalVariableDeclaration2650);
            iv_ruleGlobalVariableDeclaration=ruleGlobalVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalVariableDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGlobalVariableDeclaration2660); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1254:1: ruleGlobalVariableDeclaration returns [EObject current=null] : (otherlv_0= 'global' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) ;
    public final EObject ruleGlobalVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1257:28: ( (otherlv_0= 'global' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1258:1: (otherlv_0= 'global' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1258:1: (otherlv_0= 'global' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1258:3: otherlv_0= 'global' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleGlobalVariableDeclaration2697); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGlobalVariableDeclarationAccess().getGlobalKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleGlobalVariableDeclaration2709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGlobalVariableDeclarationAccess().getVarKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1266:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1267:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1267:1: (lv_name_2_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1268:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleGlobalVariableDeclaration2726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getGlobalVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGlobalVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleGlobalVariableDeclaration2743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGlobalVariableDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1288:1: ( (lv_type_4_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1289:1: (lv_type_4_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1289:1: (lv_type_4_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1290:3: lv_type_4_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGlobalVariableDeclarationAccess().getTypeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleGlobalVariableDeclaration2764);
            lv_type_4_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGlobalVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
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


    // $ANTLR start "entryRuleInputVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1314:1: entryRuleInputVariableDeclaration returns [EObject current=null] : iv_ruleInputVariableDeclaration= ruleInputVariableDeclaration EOF ;
    public final EObject entryRuleInputVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputVariableDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1315:2: (iv_ruleInputVariableDeclaration= ruleInputVariableDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1316:2: iv_ruleInputVariableDeclaration= ruleInputVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInputVariableDeclaration_in_entryRuleInputVariableDeclaration2800);
            iv_ruleInputVariableDeclaration=ruleInputVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputVariableDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInputVariableDeclaration2810); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputVariableDeclaration"


    // $ANTLR start "ruleInputVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1323:1: ruleInputVariableDeclaration returns [EObject current=null] : (otherlv_0= 'input' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) ;
    public final EObject ruleInputVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1326:28: ( (otherlv_0= 'input' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1327:1: (otherlv_0= 'input' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1327:1: (otherlv_0= 'input' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1327:3: otherlv_0= 'input' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleInputVariableDeclaration2847); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInputVariableDeclarationAccess().getInputKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleInputVariableDeclaration2859); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getInputVariableDeclarationAccess().getVarKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1335:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1336:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1336:1: (lv_name_2_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1337:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleInputVariableDeclaration2876); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getInputVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInputVariableDeclaration2893); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInputVariableDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1357:1: ( (lv_type_4_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1358:1: (lv_type_4_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1358:1: (lv_type_4_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1359:3: lv_type_4_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInputVariableDeclarationAccess().getTypeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleInputVariableDeclaration2914);
            lv_type_4_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInputVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
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
    // $ANTLR end "ruleInputVariableDeclaration"


    // $ANTLR start "entryRuleOutputVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1383:1: entryRuleOutputVariableDeclaration returns [EObject current=null] : iv_ruleOutputVariableDeclaration= ruleOutputVariableDeclaration EOF ;
    public final EObject entryRuleOutputVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputVariableDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1384:2: (iv_ruleOutputVariableDeclaration= ruleOutputVariableDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1385:2: iv_ruleOutputVariableDeclaration= ruleOutputVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputVariableDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOutputVariableDeclaration_in_entryRuleOutputVariableDeclaration2950);
            iv_ruleOutputVariableDeclaration=ruleOutputVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputVariableDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOutputVariableDeclaration2960); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputVariableDeclaration"


    // $ANTLR start "ruleOutputVariableDeclaration"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1392:1: ruleOutputVariableDeclaration returns [EObject current=null] : (otherlv_0= 'output' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) ;
    public final EObject ruleOutputVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1395:28: ( (otherlv_0= 'output' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1396:1: (otherlv_0= 'output' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1396:1: (otherlv_0= 'output' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1396:3: otherlv_0= 'output' otherlv_1= 'var' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleOutputVariableDeclaration2997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOutputVariableDeclarationAccess().getOutputKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleOutputVariableDeclaration3009); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getOutputVariableDeclarationAccess().getVarKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1404:1: ( (lv_name_2_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1405:1: (lv_name_2_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1405:1: (lv_name_2_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1406:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleOutputVariableDeclaration3026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getOutputVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleOutputVariableDeclaration3043); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOutputVariableDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1426:1: ( (lv_type_4_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1427:1: (lv_type_4_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1427:1: (lv_type_4_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1428:3: lv_type_4_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOutputVariableDeclarationAccess().getTypeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleOutputVariableDeclaration3064);
            lv_type_4_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOutputVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
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
    // $ANTLR end "ruleOutputVariableDeclaration"


    // $ANTLR start "entryRuleSystemConstraintDefinition"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1452:1: entryRuleSystemConstraintDefinition returns [EObject current=null] : iv_ruleSystemConstraintDefinition= ruleSystemConstraintDefinition EOF ;
    public final EObject entryRuleSystemConstraintDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemConstraintDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1453:2: (iv_ruleSystemConstraintDefinition= ruleSystemConstraintDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1454:2: iv_ruleSystemConstraintDefinition= ruleSystemConstraintDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemConstraintDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSystemConstraintDefinition_in_entryRuleSystemConstraintDefinition3100);
            iv_ruleSystemConstraintDefinition=ruleSystemConstraintDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemConstraintDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSystemConstraintDefinition3110); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystemConstraintDefinition"


    // $ANTLR start "ruleSystemConstraintDefinition"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1461:1: ruleSystemConstraintDefinition returns [EObject current=null] : (this_InvariantConstraintDefinition_0= ruleInvariantConstraintDefinition | this_InitialConstraintDefinition_1= ruleInitialConstraintDefinition | this_TransitionConstraintDefinition_2= ruleTransitionConstraintDefinition ) ;
    public final EObject ruleSystemConstraintDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_InvariantConstraintDefinition_0 = null;

        EObject this_InitialConstraintDefinition_1 = null;

        EObject this_TransitionConstraintDefinition_2 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1464:28: ( (this_InvariantConstraintDefinition_0= ruleInvariantConstraintDefinition | this_InitialConstraintDefinition_1= ruleInitialConstraintDefinition | this_TransitionConstraintDefinition_2= ruleTransitionConstraintDefinition ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1465:1: (this_InvariantConstraintDefinition_0= ruleInvariantConstraintDefinition | this_InitialConstraintDefinition_1= ruleInitialConstraintDefinition | this_TransitionConstraintDefinition_2= ruleTransitionConstraintDefinition )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1465:1: (this_InvariantConstraintDefinition_0= ruleInvariantConstraintDefinition | this_InitialConstraintDefinition_1= ruleInitialConstraintDefinition | this_TransitionConstraintDefinition_2= ruleTransitionConstraintDefinition )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt19=1;
                }
                break;
            case 33:
                {
                alt19=2;
                }
                break;
            case 34:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1466:5: this_InvariantConstraintDefinition_0= ruleInvariantConstraintDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSystemConstraintDefinitionAccess().getInvariantConstraintDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInvariantConstraintDefinition_in_ruleSystemConstraintDefinition3157);
                    this_InvariantConstraintDefinition_0=ruleInvariantConstraintDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InvariantConstraintDefinition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1476:5: this_InitialConstraintDefinition_1= ruleInitialConstraintDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSystemConstraintDefinitionAccess().getInitialConstraintDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInitialConstraintDefinition_in_ruleSystemConstraintDefinition3184);
                    this_InitialConstraintDefinition_1=ruleInitialConstraintDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InitialConstraintDefinition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1486:5: this_TransitionConstraintDefinition_2= ruleTransitionConstraintDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSystemConstraintDefinitionAccess().getTransitionConstraintDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTransitionConstraintDefinition_in_ruleSystemConstraintDefinition3211);
                    this_TransitionConstraintDefinition_2=ruleTransitionConstraintDefinition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TransitionConstraintDefinition_2; 
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
    // $ANTLR end "ruleSystemConstraintDefinition"


    // $ANTLR start "entryRuleInvariantConstraintDefinition"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1502:1: entryRuleInvariantConstraintDefinition returns [EObject current=null] : iv_ruleInvariantConstraintDefinition= ruleInvariantConstraintDefinition EOF ;
    public final EObject entryRuleInvariantConstraintDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantConstraintDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1503:2: (iv_ruleInvariantConstraintDefinition= ruleInvariantConstraintDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1504:2: iv_ruleInvariantConstraintDefinition= ruleInvariantConstraintDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvariantConstraintDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInvariantConstraintDefinition_in_entryRuleInvariantConstraintDefinition3246);
            iv_ruleInvariantConstraintDefinition=ruleInvariantConstraintDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariantConstraintDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInvariantConstraintDefinition3256); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariantConstraintDefinition"


    // $ANTLR start "ruleInvariantConstraintDefinition"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1511:1: ruleInvariantConstraintDefinition returns [EObject current=null] : (otherlv_0= 'invariant' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleInvariantConstraintDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1514:28: ( (otherlv_0= 'invariant' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1515:1: (otherlv_0= 'invariant' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1515:1: (otherlv_0= 'invariant' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1515:3: otherlv_0= 'invariant' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleInvariantConstraintDefinition3293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInvariantConstraintDefinitionAccess().getInvariantKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1519:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1520:1: (lv_expression_1_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1520:1: (lv_expression_1_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1521:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInvariantConstraintDefinitionAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleInvariantConstraintDefinition3314);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInvariantConstraintDefinitionRule());
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
    // $ANTLR end "ruleInvariantConstraintDefinition"


    // $ANTLR start "entryRuleInitialConstraintDefinition"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1545:1: entryRuleInitialConstraintDefinition returns [EObject current=null] : iv_ruleInitialConstraintDefinition= ruleInitialConstraintDefinition EOF ;
    public final EObject entryRuleInitialConstraintDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialConstraintDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1546:2: (iv_ruleInitialConstraintDefinition= ruleInitialConstraintDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1547:2: iv_ruleInitialConstraintDefinition= ruleInitialConstraintDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitialConstraintDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInitialConstraintDefinition_in_entryRuleInitialConstraintDefinition3350);
            iv_ruleInitialConstraintDefinition=ruleInitialConstraintDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitialConstraintDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInitialConstraintDefinition3360); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialConstraintDefinition"


    // $ANTLR start "ruleInitialConstraintDefinition"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1554:1: ruleInitialConstraintDefinition returns [EObject current=null] : (otherlv_0= 'initial' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleInitialConstraintDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1557:28: ( (otherlv_0= 'initial' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1558:1: (otherlv_0= 'initial' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1558:1: (otherlv_0= 'initial' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1558:3: otherlv_0= 'initial' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleInitialConstraintDefinition3397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInitialConstraintDefinitionAccess().getInitialKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1562:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1563:1: (lv_expression_1_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1563:1: (lv_expression_1_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1564:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInitialConstraintDefinitionAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleInitialConstraintDefinition3418);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInitialConstraintDefinitionRule());
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
    // $ANTLR end "ruleInitialConstraintDefinition"


    // $ANTLR start "entryRuleTransitionConstraintDefinition"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1588:1: entryRuleTransitionConstraintDefinition returns [EObject current=null] : iv_ruleTransitionConstraintDefinition= ruleTransitionConstraintDefinition EOF ;
    public final EObject entryRuleTransitionConstraintDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionConstraintDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1589:2: (iv_ruleTransitionConstraintDefinition= ruleTransitionConstraintDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1590:2: iv_ruleTransitionConstraintDefinition= ruleTransitionConstraintDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionConstraintDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTransitionConstraintDefinition_in_entryRuleTransitionConstraintDefinition3454);
            iv_ruleTransitionConstraintDefinition=ruleTransitionConstraintDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransitionConstraintDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransitionConstraintDefinition3464); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitionConstraintDefinition"


    // $ANTLR start "ruleTransitionConstraintDefinition"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1597:1: ruleTransitionConstraintDefinition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleTransitionConstraintDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1600:28: ( (otherlv_0= 'transition' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1601:1: (otherlv_0= 'transition' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1601:1: (otherlv_0= 'transition' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1601:3: otherlv_0= 'transition' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTransitionConstraintDefinition3501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransitionConstraintDefinitionAccess().getTransitionKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1605:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1606:1: (lv_expression_1_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1606:1: (lv_expression_1_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1607:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransitionConstraintDefinitionAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTransitionConstraintDefinition3522);
            lv_expression_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTransitionConstraintDefinitionRule());
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
    // $ANTLR end "ruleTransitionConstraintDefinition"


    // $ANTLR start "entryRulePropertyDeclaration"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1631:1: entryRulePropertyDeclaration returns [EObject current=null] : iv_rulePropertyDeclaration= rulePropertyDeclaration EOF ;
    public final EObject entryRulePropertyDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1632:2: (iv_rulePropertyDeclaration= rulePropertyDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1633:2: iv_rulePropertyDeclaration= rulePropertyDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration3558);
            iv_rulePropertyDeclaration=rulePropertyDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePropertyDeclaration3568); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1640:1: rulePropertyDeclaration returns [EObject current=null] : (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_system_3_0= ruleSystem ) ) otherlv_4= 'models' ( (lv_expression_5_0= ruleExpression ) ) ) ;
    public final EObject rulePropertyDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_system_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1643:28: ( (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_system_3_0= ruleSystem ) ) otherlv_4= 'models' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1644:1: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_system_3_0= ruleSystem ) ) otherlv_4= 'models' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1644:1: (otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_system_3_0= ruleSystem ) ) otherlv_4= 'models' ( (lv_expression_5_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1644:3: otherlv_0= 'property' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_system_3_0= ruleSystem ) ) otherlv_4= 'models' ( (lv_expression_5_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,35,FollowSets000.FOLLOW_35_in_rulePropertyDeclaration3605); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPropertyDeclarationAccess().getPropertyKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1648:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1649:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1649:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1650:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rulePropertyDeclaration3622); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePropertyDeclaration3639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPropertyDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1670:1: ( (lv_system_3_0= ruleSystem ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1671:1: (lv_system_3_0= ruleSystem )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1671:1: (lv_system_3_0= ruleSystem )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1672:3: lv_system_3_0= ruleSystem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getSystemSystemParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleSystem_in_rulePropertyDeclaration3660);
            lv_system_3_0=ruleSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"system",
                      		lv_system_3_0, 
                      		"System");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePropertyDeclaration3672); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPropertyDeclarationAccess().getModelsKeyword_4());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1692:1: ( (lv_expression_5_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1693:1: (lv_expression_5_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1693:1: (lv_expression_5_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1694:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyDeclarationAccess().getExpressionExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePropertyDeclaration3693);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1720:1: entryRuleParameterDeclaration returns [EObject current=null] : iv_ruleParameterDeclaration= ruleParameterDeclaration EOF ;
    public final EObject entryRuleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1721:2: (iv_ruleParameterDeclaration= ruleParameterDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1722:2: iv_ruleParameterDeclaration= ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration3731);
            iv_ruleParameterDeclaration=ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterDeclaration3741); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1729:1: ruleParameterDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleParameterDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1732:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1733:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1733:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1733:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1733:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1734:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParameterDeclarationAccess().getParameterDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1739:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1740:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1740:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1741:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleParameterDeclaration3792); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleParameterDeclaration3809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParameterDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1761:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1762:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1762:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1763:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleParameterDeclaration3830);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1787:1: entryRuleFieldDeclaration returns [EObject current=null] : iv_ruleFieldDeclaration= ruleFieldDeclaration EOF ;
    public final EObject entryRuleFieldDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1788:2: (iv_ruleFieldDeclaration= ruleFieldDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1789:2: iv_ruleFieldDeclaration= ruleFieldDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldDeclaration_in_entryRuleFieldDeclaration3866);
            iv_ruleFieldDeclaration=ruleFieldDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldDeclaration3876); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1796:1: ruleFieldDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleFieldDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1799:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1800:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1800:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1800:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1800:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1801:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFieldDeclarationAccess().getFieldDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1806:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1807:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1807:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1808:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFieldDeclaration3927); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFieldDeclaration3944); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFieldDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1828:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1829:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1829:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1830:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFieldDeclaration3965);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1854:1: entryRuleLetDeclaration returns [EObject current=null] : iv_ruleLetDeclaration= ruleLetDeclaration EOF ;
    public final EObject entryRuleLetDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1855:2: (iv_ruleLetDeclaration= ruleLetDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1856:2: iv_ruleLetDeclaration= ruleLetDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetDeclaration_in_entryRuleLetDeclaration4001);
            iv_ruleLetDeclaration=ruleLetDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetDeclaration4011); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1863:1: ruleLetDeclaration returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) ) ;
    public final EObject ruleLetDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1866:28: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1867:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1867:1: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1867:2: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1867:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1868:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLetDeclarationAccess().getLetDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1873:2: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1874:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1874:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1875:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLetDeclaration4062); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleLetDeclaration4079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLetDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1895:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1896:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1896:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1897:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleLetDeclaration4100);
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

            otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleLetDeclaration4112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLetDeclarationAccess().getColonEqualsSignKeyword_4());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1917:1: ( (lv_expression_5_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1918:1: (lv_expression_5_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1918:1: (lv_expression_5_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1919:3: lv_expression_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetDeclarationAccess().getExpressionExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleLetDeclaration4133);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1943:1: entryRuleConstantDeclaration returns [EObject current=null] : iv_ruleConstantDeclaration= ruleConstantDeclaration EOF ;
    public final EObject entryRuleConstantDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstantDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1944:2: (iv_ruleConstantDeclaration= ruleConstantDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1945:2: iv_ruleConstantDeclaration= ruleConstantDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration4169);
            iv_ruleConstantDeclaration=ruleConstantDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstantDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstantDeclaration4179); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1952:1: ruleConstantDeclaration returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )? ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1955:28: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1956:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1956:1: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )? )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1956:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleConstantDeclaration4216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstantDeclarationAccess().getConstKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1960:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1961:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1961:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1962:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstantDeclaration4233); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleConstantDeclaration4250); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstantDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1982:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1983:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1983:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:1984:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstantDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleConstantDeclaration4271);
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

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2000:2: (otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2000:4: otherlv_4= ':=' ( (lv_expression_5_0= ruleExpression ) )
                    {
                    otherlv_4=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleConstantDeclaration4284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getConstantDeclarationAccess().getColonEqualsSignKeyword_4_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2004:1: ( (lv_expression_5_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2005:1: (lv_expression_5_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2005:1: (lv_expression_5_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2006:3: lv_expression_5_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantDeclarationAccess().getExpressionExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleConstantDeclaration4305);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2030:1: entryRuleFunctionDeclaration returns [EObject current=null] : iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF ;
    public final EObject entryRuleFunctionDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2031:2: (iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2032:2: iv_ruleFunctionDeclaration= ruleFunctionDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration4343);
            iv_ruleFunctionDeclaration=ruleFunctionDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionDeclaration4353); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2039:1: ruleFunctionDeclaration returns [EObject current=null] : (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )? ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2042:28: ( (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2043:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2043:1: (otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )? )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2043:3: otherlv_0= 'function' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )? otherlv_7= ':' ( (lv_type_8_0= ruleType ) ) (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )?
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleFunctionDeclaration4390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionDeclarationAccess().getFunctionKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2047:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2048:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2048:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2049:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFunctionDeclaration4407); if (state.failed) return current;
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

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2065:2: (otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==14) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2065:4: otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFunctionDeclaration4425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getFunctionDeclarationAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2069:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_ID) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2069:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            {
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2069:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2070:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            {
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2070:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2071:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0_0()); 
                              	    
                            }
                            pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration4447);
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

                            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2087:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( (LA21_0==15) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2087:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    {
                            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFunctionDeclaration4460); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_4, grammarAccess.getFunctionDeclarationAccess().getCommaKeyword_2_1_1_0());
                            	          
                            	    }
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2091:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2092:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    {
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2092:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2093:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration4481);
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
                            	    break loop21;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionDeclaration4497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getFunctionDeclarationAccess().getRightParenthesisKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFunctionDeclaration4511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFunctionDeclarationAccess().getColonKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2117:1: ( (lv_type_8_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2118:1: (lv_type_8_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2118:1: (lv_type_8_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2119:3: lv_type_8_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getTypeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFunctionDeclaration4532);
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

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2135:2: (otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2135:4: otherlv_9= ':=' ( (lv_expression_10_0= ruleExpression ) )
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFunctionDeclaration4545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getFunctionDeclarationAccess().getColonEqualsSignKeyword_5_0());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2139:1: ( (lv_expression_10_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2140:1: (lv_expression_10_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2140:1: (lv_expression_10_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2141:3: lv_expression_10_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionDeclarationAccess().getExpressionExpressionParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleFunctionDeclaration4566);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2165:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2166:2: (iv_ruleType= ruleType EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2167:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType4604);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType4614); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2174:1: ruleType returns [EObject current=null] : (this_TypeReference_0= ruleTypeReference | this_TypeDefinition_1= ruleTypeDefinition ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_TypeReference_0 = null;

        EObject this_TypeDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2177:28: ( (this_TypeReference_0= ruleTypeReference | this_TypeDefinition_1= ruleTypeDefinition ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2178:1: (this_TypeReference_0= ruleTypeReference | this_TypeDefinition_1= ruleTypeDefinition )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2178:1: (this_TypeReference_0= ruleTypeReference | this_TypeDefinition_1= ruleTypeDefinition )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==17||LA25_0==38||(LA25_0>=40 && LA25_0<=44)||(LA25_0>=46 && LA25_0<=49)) ) {
                alt25=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2179:5: this_TypeReference_0= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_ruleType4661);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2189:5: this_TypeDefinition_1= ruleTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeAccess().getTypeDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_ruleType4688);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2205:1: entryRuleTypeDeclaration returns [EObject current=null] : iv_ruleTypeDeclaration= ruleTypeDeclaration EOF ;
    public final EObject entryRuleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclaration = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2206:2: (iv_ruleTypeDeclaration= ruleTypeDeclaration EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2207:2: iv_ruleTypeDeclaration= ruleTypeDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclarationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration4723);
            iv_ruleTypeDeclaration=ruleTypeDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDeclaration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeDeclaration4733); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2214:1: ruleTypeDeclaration returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) ;
    public final EObject ruleTypeDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2217:28: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2218:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2218:1: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2218:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleTypeDeclaration4770); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDeclarationAccess().getTypeKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2222:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2223:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2223:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2224:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeDeclaration4787); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleTypeDeclaration4804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTypeDeclarationAccess().getColonKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2244:1: ( (lv_type_3_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2245:1: (lv_type_3_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2245:1: (lv_type_3_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2246:3: lv_type_3_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDeclarationAccess().getTypeTypeParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleTypeDeclaration4825);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2270:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2271:2: (iv_ruleTypeReference= ruleTypeReference EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2272:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeReference_in_entryRuleTypeReference4861);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeReference4871); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2279:1: ruleTypeReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2282:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2283:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2283:1: ( (otherlv_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2284:1: (otherlv_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2284:1: (otherlv_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2285:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTypeReferenceRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTypeReference4915); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2304:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2305:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2306:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition4950);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTypeDefinition4960); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2313:1: ruleTypeDefinition returns [EObject current=null] : (this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition | this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition | this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition | this_RealTypeDefinition_3= ruleRealTypeDefinition | this_ArrayTypeDefinition_4= ruleArrayTypeDefinition | this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition | this_RecordTypeDefinition_6= ruleRecordTypeDefinition | this_TupleTypeDefinition_7= ruleTupleTypeDefinition | this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition | this_SubTypeDefinition_9= ruleSubTypeDefinition | this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2316:28: ( (this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition | this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition | this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition | this_RealTypeDefinition_3= ruleRealTypeDefinition | this_ArrayTypeDefinition_4= ruleArrayTypeDefinition | this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition | this_RecordTypeDefinition_6= ruleRecordTypeDefinition | this_TupleTypeDefinition_7= ruleTupleTypeDefinition | this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition | this_SubTypeDefinition_9= ruleSubTypeDefinition | this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2317:1: (this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition | this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition | this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition | this_RealTypeDefinition_3= ruleRealTypeDefinition | this_ArrayTypeDefinition_4= ruleArrayTypeDefinition | this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition | this_RecordTypeDefinition_6= ruleRecordTypeDefinition | this_TupleTypeDefinition_7= ruleTupleTypeDefinition | this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition | this_SubTypeDefinition_9= ruleSubTypeDefinition | this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2317:1: (this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition | this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition | this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition | this_RealTypeDefinition_3= ruleRealTypeDefinition | this_ArrayTypeDefinition_4= ruleArrayTypeDefinition | this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition | this_RecordTypeDefinition_6= ruleRecordTypeDefinition | this_TupleTypeDefinition_7= ruleTupleTypeDefinition | this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition | this_SubTypeDefinition_9= ruleSubTypeDefinition | this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition )
            int alt26=11;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt26=1;
                }
                break;
            case 41:
                {
                alt26=2;
                }
                break;
            case 42:
                {
                alt26=3;
                }
                break;
            case 43:
                {
                alt26=4;
                }
                break;
            case 44:
                {
                alt26=5;
                }
                break;
            case 46:
                {
                alt26=6;
                }
                break;
            case 47:
                {
                alt26=7;
                }
                break;
            case 48:
                {
                alt26=8;
                }
                break;
            case 49:
                {
                alt26=9;
                }
                break;
            case 17:
                {
                alt26=10;
                }
                break;
            case 38:
                {
                alt26=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2318:5: this_NaturalTypeDefinition_0= ruleNaturalTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getNaturalTypeDefinitionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNaturalTypeDefinition_in_ruleTypeDefinition5007);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2328:5: this_IntegerTypeDefinition_1= ruleIntegerTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getIntegerTypeDefinitionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerTypeDefinition_in_ruleTypeDefinition5034);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2338:5: this_BooleanTypeDefinition_2= ruleBooleanTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getBooleanTypeDefinitionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanTypeDefinition_in_ruleTypeDefinition5061);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2348:5: this_RealTypeDefinition_3= ruleRealTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getRealTypeDefinitionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRealTypeDefinition_in_ruleTypeDefinition5088);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2358:5: this_ArrayTypeDefinition_4= ruleArrayTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getArrayTypeDefinitionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArrayTypeDefinition_in_ruleTypeDefinition5115);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2368:5: this_EnumerationTypeDefinition_5= ruleEnumerationTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getEnumerationTypeDefinitionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerationTypeDefinition_in_ruleTypeDefinition5142);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2378:5: this_RecordTypeDefinition_6= ruleRecordTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getRecordTypeDefinitionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRecordTypeDefinition_in_ruleTypeDefinition5169);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2388:5: this_TupleTypeDefinition_7= ruleTupleTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getTupleTypeDefinitionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleTypeDefinition_in_ruleTypeDefinition5196);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2398:5: this_SubrangeTypeDefinition_8= ruleSubrangeTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSubrangeTypeDefinitionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubrangeTypeDefinition_in_ruleTypeDefinition5223);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2408:5: this_SubTypeDefinition_9= ruleSubTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getSubTypeDefinitionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSubTypeDefinition_in_ruleTypeDefinition5250);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2418:5: this_FunctionTypeDefinition_10= ruleFunctionTypeDefinition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getTypeDefinitionAccess().getFunctionTypeDefinitionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionTypeDefinition_in_ruleTypeDefinition5277);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2434:1: entryRuleNaturalTypeDefinition returns [EObject current=null] : iv_ruleNaturalTypeDefinition= ruleNaturalTypeDefinition EOF ;
    public final EObject entryRuleNaturalTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2435:2: (iv_ruleNaturalTypeDefinition= ruleNaturalTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2436:2: iv_ruleNaturalTypeDefinition= ruleNaturalTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNaturalTypeDefinition_in_entryRuleNaturalTypeDefinition5312);
            iv_ruleNaturalTypeDefinition=ruleNaturalTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNaturalTypeDefinition5322); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2443:1: ruleNaturalTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'natural' ) ;
    public final EObject ruleNaturalTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2446:28: ( ( () otherlv_1= 'natural' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2447:1: ( () otherlv_1= 'natural' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2447:1: ( () otherlv_1= 'natural' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2447:2: () otherlv_1= 'natural'
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2447:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2448:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalTypeDefinitionAccess().getNaturalTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleNaturalTypeDefinition5368); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2465:1: entryRuleIntegerTypeDefinition returns [EObject current=null] : iv_ruleIntegerTypeDefinition= ruleIntegerTypeDefinition EOF ;
    public final EObject entryRuleIntegerTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2466:2: (iv_ruleIntegerTypeDefinition= ruleIntegerTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2467:2: iv_ruleIntegerTypeDefinition= ruleIntegerTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntegerTypeDefinition_in_entryRuleIntegerTypeDefinition5404);
            iv_ruleIntegerTypeDefinition=ruleIntegerTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerTypeDefinition5414); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2474:1: ruleIntegerTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'integer' ) ;
    public final EObject ruleIntegerTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2477:28: ( ( () otherlv_1= 'integer' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2478:1: ( () otherlv_1= 'integer' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2478:1: ( () otherlv_1= 'integer' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2478:2: () otherlv_1= 'integer'
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2478:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2479:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getIntegerTypeDefinitionAccess().getIntegerTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleIntegerTypeDefinition5460); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2496:1: entryRuleBooleanTypeDefinition returns [EObject current=null] : iv_ruleBooleanTypeDefinition= ruleBooleanTypeDefinition EOF ;
    public final EObject entryRuleBooleanTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2497:2: (iv_ruleBooleanTypeDefinition= ruleBooleanTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2498:2: iv_ruleBooleanTypeDefinition= ruleBooleanTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanTypeDefinition_in_entryRuleBooleanTypeDefinition5496);
            iv_ruleBooleanTypeDefinition=ruleBooleanTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanTypeDefinition5506); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2505:1: ruleBooleanTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'boolean' ) ;
    public final EObject ruleBooleanTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2508:28: ( ( () otherlv_1= 'boolean' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2509:1: ( () otherlv_1= 'boolean' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2509:1: ( () otherlv_1= 'boolean' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2509:2: () otherlv_1= 'boolean'
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2509:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2510:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBooleanTypeDefinitionAccess().getBooleanTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleBooleanTypeDefinition5552); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2527:1: entryRuleRealTypeDefinition returns [EObject current=null] : iv_ruleRealTypeDefinition= ruleRealTypeDefinition EOF ;
    public final EObject entryRuleRealTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2528:2: (iv_ruleRealTypeDefinition= ruleRealTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2529:2: iv_ruleRealTypeDefinition= ruleRealTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRealTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRealTypeDefinition_in_entryRuleRealTypeDefinition5588);
            iv_ruleRealTypeDefinition=ruleRealTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRealTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRealTypeDefinition5598); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2536:1: ruleRealTypeDefinition returns [EObject current=null] : ( () otherlv_1= 'real' ) ;
    public final EObject ruleRealTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2539:28: ( ( () otherlv_1= 'real' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2540:1: ( () otherlv_1= 'real' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2540:1: ( () otherlv_1= 'real' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2540:2: () otherlv_1= 'real'
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2540:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2541:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRealTypeDefinitionAccess().getRealTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleRealTypeDefinition5644); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2558:1: entryRuleArrayTypeDefinition returns [EObject current=null] : iv_ruleArrayTypeDefinition= ruleArrayTypeDefinition EOF ;
    public final EObject entryRuleArrayTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2559:2: (iv_ruleArrayTypeDefinition= ruleArrayTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2560:2: iv_ruleArrayTypeDefinition= ruleArrayTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArrayTypeDefinition_in_entryRuleArrayTypeDefinition5680);
            iv_ruleArrayTypeDefinition=ruleArrayTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayTypeDefinition5690); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2567:1: ruleArrayTypeDefinition returns [EObject current=null] : (otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) ) ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2570:28: ( (otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2571:1: (otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2571:1: (otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2571:3: otherlv_0= 'array' ( (lv_indexTypes_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )* otherlv_4= 'of' ( (lv_elementType_5_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleArrayTypeDefinition5727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayTypeDefinitionAccess().getArrayKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2575:1: ( (lv_indexTypes_1_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2576:1: (lv_indexTypes_1_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2576:1: (lv_indexTypes_1_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2577:3: lv_indexTypes_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefinitionAccess().getIndexTypesTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleArrayTypeDefinition5748);
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

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2593:2: (otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==15) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2593:4: otherlv_2= ',' ( (lv_indexTypes_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArrayTypeDefinition5761); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getArrayTypeDefinitionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2597:1: ( (lv_indexTypes_3_0= ruleType ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2598:1: (lv_indexTypes_3_0= ruleType )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2598:1: (lv_indexTypes_3_0= ruleType )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2599:3: lv_indexTypes_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArrayTypeDefinitionAccess().getIndexTypesTypeParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleArrayTypeDefinition5782);
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
            	    break loop27;
                }
            } while (true);

            otherlv_4=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleArrayTypeDefinition5796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayTypeDefinitionAccess().getOfKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2619:1: ( (lv_elementType_5_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2620:1: (lv_elementType_5_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2620:1: (lv_elementType_5_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2621:3: lv_elementType_5_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayTypeDefinitionAccess().getElementTypeTypeParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleArrayTypeDefinition5817);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2645:1: entryRuleEnumerationTypeDefinition returns [EObject current=null] : iv_ruleEnumerationTypeDefinition= ruleEnumerationTypeDefinition EOF ;
    public final EObject entryRuleEnumerationTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2646:2: (iv_ruleEnumerationTypeDefinition= ruleEnumerationTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2647:2: iv_ruleEnumerationTypeDefinition= ruleEnumerationTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationTypeDefinition_in_entryRuleEnumerationTypeDefinition5853);
            iv_ruleEnumerationTypeDefinition=ruleEnumerationTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationTypeDefinition5863); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2654:1: ruleEnumerationTypeDefinition returns [EObject current=null] : (otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}' ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2657:28: ( (otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2658:1: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2658:1: (otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2658:3: otherlv_0= 'enum' otherlv_1= '{' ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) ) (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleEnumerationTypeDefinition5900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumerationTypeDefinitionAccess().getEnumKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleEnumerationTypeDefinition5912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEnumerationTypeDefinitionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2666:1: ( (lv_literals_2_0= ruleEnumerationLiteralDefinition ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2667:1: (lv_literals_2_0= ruleEnumerationLiteralDefinition )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2667:1: (lv_literals_2_0= ruleEnumerationLiteralDefinition )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2668:3: lv_literals_2_0= ruleEnumerationLiteralDefinition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerationTypeDefinitionAccess().getLiteralsEnumerationLiteralDefinitionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralDefinition_in_ruleEnumerationTypeDefinition5933);
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

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2684:2: (otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==15) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2684:4: otherlv_3= ',' ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEnumerationTypeDefinition5946); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getEnumerationTypeDefinitionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2688:1: ( (lv_literals_4_0= ruleEnumerationLiteralDefinition ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2689:1: (lv_literals_4_0= ruleEnumerationLiteralDefinition )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2689:1: (lv_literals_4_0= ruleEnumerationLiteralDefinition )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2690:3: lv_literals_4_0= ruleEnumerationLiteralDefinition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationTypeDefinitionAccess().getLiteralsEnumerationLiteralDefinitionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralDefinition_in_ruleEnumerationTypeDefinition5967);
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
            	    break loop28;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleEnumerationTypeDefinition5981); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2718:1: entryRuleEnumerationLiteralDefinition returns [EObject current=null] : iv_ruleEnumerationLiteralDefinition= ruleEnumerationLiteralDefinition EOF ;
    public final EObject entryRuleEnumerationLiteralDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteralDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2719:2: (iv_ruleEnumerationLiteralDefinition= ruleEnumerationLiteralDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2720:2: iv_ruleEnumerationLiteralDefinition= ruleEnumerationLiteralDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralDefinition_in_entryRuleEnumerationLiteralDefinition6017);
            iv_ruleEnumerationLiteralDefinition=ruleEnumerationLiteralDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteralDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationLiteralDefinition6027); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2727:1: ruleEnumerationLiteralDefinition returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEnumerationLiteralDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2730:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2731:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2731:1: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2732:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2732:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2733:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumerationLiteralDefinition6068); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2757:1: entryRuleRecordTypeDefinition returns [EObject current=null] : iv_ruleRecordTypeDefinition= ruleRecordTypeDefinition EOF ;
    public final EObject entryRuleRecordTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2758:2: (iv_ruleRecordTypeDefinition= ruleRecordTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2759:2: iv_ruleRecordTypeDefinition= ruleRecordTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRecordTypeDefinition_in_entryRuleRecordTypeDefinition6108);
            iv_ruleRecordTypeDefinition=ruleRecordTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecordTypeDefinition6118); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2766:1: ruleRecordTypeDefinition returns [EObject current=null] : (otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}' ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2769:28: ( (otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2770:1: (otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2770:1: (otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2770:3: otherlv_0= 'record' otherlv_1= '{' ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) ) (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleRecordTypeDefinition6155); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordTypeDefinitionAccess().getRecordKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleRecordTypeDefinition6167); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRecordTypeDefinitionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2778:1: ( (lv_fieldDeclarations_2_0= ruleFieldDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2779:1: (lv_fieldDeclarations_2_0= ruleFieldDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2779:1: (lv_fieldDeclarations_2_0= ruleFieldDeclaration )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2780:3: lv_fieldDeclarations_2_0= ruleFieldDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecordTypeDefinitionAccess().getFieldDeclarationsFieldDeclarationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldDeclaration_in_ruleRecordTypeDefinition6188);
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

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2796:2: (otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2796:4: otherlv_3= ',' ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRecordTypeDefinition6201); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRecordTypeDefinitionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2800:1: ( (lv_fieldDeclarations_4_0= ruleFieldDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2801:1: (lv_fieldDeclarations_4_0= ruleFieldDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2801:1: (lv_fieldDeclarations_4_0= ruleFieldDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2802:3: lv_fieldDeclarations_4_0= ruleFieldDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordTypeDefinitionAccess().getFieldDeclarationsFieldDeclarationParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFieldDeclaration_in_ruleRecordTypeDefinition6222);
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
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleRecordTypeDefinition6236); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2830:1: entryRuleTupleTypeDefinition returns [EObject current=null] : iv_ruleTupleTypeDefinition= ruleTupleTypeDefinition EOF ;
    public final EObject entryRuleTupleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2831:2: (iv_ruleTupleTypeDefinition= ruleTupleTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2832:2: iv_ruleTupleTypeDefinition= ruleTupleTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleTypeDefinition_in_entryRuleTupleTypeDefinition6272);
            iv_ruleTupleTypeDefinition=ruleTupleTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleTypeDefinition6282); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2839:1: ruleTupleTypeDefinition returns [EObject current=null] : (otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}' ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2842:28: ( (otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2843:1: (otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2843:1: (otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2843:3: otherlv_0= 'tuple' otherlv_1= '{' ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTupleTypeDefinition6319); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleTypeDefinitionAccess().getTupleKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTupleTypeDefinition6331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleTypeDefinitionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2851:1: ( (lv_types_2_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2852:1: (lv_types_2_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2852:1: (lv_types_2_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2853:3: lv_types_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleTypeDefinitionAccess().getTypesTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleTupleTypeDefinition6352);
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

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2869:2: (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==15) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2869:4: otherlv_3= ',' ( (lv_types_4_0= ruleType ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTupleTypeDefinition6365); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getTupleTypeDefinitionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2873:1: ( (lv_types_4_0= ruleType ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2874:1: (lv_types_4_0= ruleType )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2874:1: (lv_types_4_0= ruleType )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2875:3: lv_types_4_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleTypeDefinitionAccess().getTypesTypeParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleTupleTypeDefinition6386);
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
            	    break loop30;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTupleTypeDefinition6400); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2903:1: entryRuleSubrangeTypeDefinition returns [EObject current=null] : iv_ruleSubrangeTypeDefinition= ruleSubrangeTypeDefinition EOF ;
    public final EObject entryRuleSubrangeTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubrangeTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2904:2: (iv_ruleSubrangeTypeDefinition= ruleSubrangeTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2905:2: iv_ruleSubrangeTypeDefinition= ruleSubrangeTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubrangeTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubrangeTypeDefinition_in_entryRuleSubrangeTypeDefinition6436);
            iv_ruleSubrangeTypeDefinition=ruleSubrangeTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubrangeTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubrangeTypeDefinition6446); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2912:1: ruleSubrangeTypeDefinition returns [EObject current=null] : ( () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']' ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2915:28: ( ( () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2916:1: ( () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2916:1: ( () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2916:2: () otherlv_1= '[' ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) ) otherlv_5= 'to' (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) ) otherlv_8= ']'
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2916:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2917:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubrangeTypeDefinitionAccess().getSubrangeTypeDefinitionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleSubrangeTypeDefinition6492); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubrangeTypeDefinitionAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2926:1: ( (otherlv_2= '-' otherlv_3= 'inf' ) | ( (lv_lowerBound_4_0= ruleExpression ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==50) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==51) ) {
                    alt31=1;
                }
                else if ( ((LA31_1>=RULE_ID && LA31_1<=RULE_DECIMAL)||LA31_1==14||(LA31_1>=49 && LA31_1<=50)||LA31_1==80||(LA31_1>=89 && LA31_1<=91)||LA31_1==93) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_DECIMAL)||LA31_0==14||LA31_0==38||LA31_0==49||LA31_0==55||(LA31_0>=64 && LA31_0<=72)||LA31_0==80||(LA31_0>=89 && LA31_0<=91)||LA31_0==93) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2926:2: (otherlv_2= '-' otherlv_3= 'inf' )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2926:2: (otherlv_2= '-' otherlv_3= 'inf' )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2926:4: otherlv_2= '-' otherlv_3= 'inf'
                    {
                    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSubrangeTypeDefinition6506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSubrangeTypeDefinitionAccess().getHyphenMinusKeyword_2_0_0());
                          
                    }
                    otherlv_3=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSubrangeTypeDefinition6518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getSubrangeTypeDefinitionAccess().getInfKeyword_2_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2935:6: ( (lv_lowerBound_4_0= ruleExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2935:6: ( (lv_lowerBound_4_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2936:1: (lv_lowerBound_4_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2936:1: (lv_lowerBound_4_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2937:3: lv_lowerBound_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubrangeTypeDefinitionAccess().getLowerBoundExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSubrangeTypeDefinition6546);
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

            otherlv_5=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleSubrangeTypeDefinition6559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSubrangeTypeDefinitionAccess().getToKeyword_3());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2957:1: (otherlv_6= 'inf' | ( (lv_upperBound_7_0= ruleExpression ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            else if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_DECIMAL)||LA32_0==14||LA32_0==38||(LA32_0>=49 && LA32_0<=50)||LA32_0==55||(LA32_0>=64 && LA32_0<=72)||LA32_0==80||(LA32_0>=89 && LA32_0<=91)||LA32_0==93) ) {
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2957:3: otherlv_6= 'inf'
                    {
                    otherlv_6=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleSubrangeTypeDefinition6572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getSubrangeTypeDefinitionAccess().getInfKeyword_4_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2962:6: ( (lv_upperBound_7_0= ruleExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2962:6: ( (lv_upperBound_7_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2963:1: (lv_upperBound_7_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2963:1: (lv_upperBound_7_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2964:3: lv_upperBound_7_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubrangeTypeDefinitionAccess().getUpperBoundExpressionParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSubrangeTypeDefinition6599);
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

            otherlv_8=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleSubrangeTypeDefinition6612); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2992:1: entryRuleSubTypeDefinition returns [EObject current=null] : iv_ruleSubTypeDefinition= ruleSubTypeDefinition EOF ;
    public final EObject entryRuleSubTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2993:2: (iv_ruleSubTypeDefinition= ruleSubTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:2994:2: iv_ruleSubTypeDefinition= ruleSubTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSubTypeDefinition_in_entryRuleSubTypeDefinition6648);
            iv_ruleSubTypeDefinition=ruleSubTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubTypeDefinition6658); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3001:1: ruleSubTypeDefinition returns [EObject current=null] : (otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleSubTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDeclaration_1_0 = null;

        EObject lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3004:28: ( (otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3005:1: (otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3005:1: (otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3005:3: otherlv_0= '{' ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) ) otherlv_2= '|' ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleSubTypeDefinition6695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSubTypeDefinitionAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3009:1: ( (lv_parameterDeclaration_1_0= ruleParameterDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3010:1: (lv_parameterDeclaration_1_0= ruleParameterDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3010:1: (lv_parameterDeclaration_1_0= ruleParameterDeclaration )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3011:3: lv_parameterDeclaration_1_0= ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubTypeDefinitionAccess().getParameterDeclarationParameterDeclarationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleSubTypeDefinition6716);
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

            otherlv_2=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleSubTypeDefinition6728); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSubTypeDefinitionAccess().getVerticalLineKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3031:1: ( (lv_expression_3_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3032:1: (lv_expression_3_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3032:1: (lv_expression_3_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3033:3: lv_expression_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSubTypeDefinitionAccess().getExpressionExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleSubTypeDefinition6749);
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

            otherlv_4=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleSubTypeDefinition6761); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3061:1: entryRuleFunctionTypeDefinition returns [EObject current=null] : iv_ruleFunctionTypeDefinition= ruleFunctionTypeDefinition EOF ;
    public final EObject entryRuleFunctionTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionTypeDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3062:2: (iv_ruleFunctionTypeDefinition= ruleFunctionTypeDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3063:2: iv_ruleFunctionTypeDefinition= ruleFunctionTypeDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionTypeDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionTypeDefinition_in_entryRuleFunctionTypeDefinition6797);
            iv_ruleFunctionTypeDefinition=ruleFunctionTypeDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionTypeDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionTypeDefinition6807); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3070:1: ruleFunctionTypeDefinition returns [EObject current=null] : (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) ) ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3073:28: ( (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3074:1: (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3074:1: (otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3074:3: otherlv_0= 'function' otherlv_1= '(' ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )? otherlv_5= ')' otherlv_6= ':' ( (lv_returnType_7_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleFunctionTypeDefinition6844); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionTypeDefinitionAccess().getFunctionKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFunctionTypeDefinition6856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionTypeDefinitionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3082:1: ( ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID||LA34_0==17||LA34_0==38||(LA34_0>=40 && LA34_0<=44)||(LA34_0>=46 && LA34_0<=49)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3082:2: ( (lv_parameterTypes_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3082:2: ( (lv_parameterTypes_2_0= ruleType ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3083:1: (lv_parameterTypes_2_0= ruleType )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3083:1: (lv_parameterTypes_2_0= ruleType )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3084:3: lv_parameterTypes_2_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionTypeDefinitionAccess().getParameterTypesTypeParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFunctionTypeDefinition6878);
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

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3100:2: (otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==15) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3100:4: otherlv_3= ',' ( (lv_parameterTypes_4_0= ruleType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFunctionTypeDefinition6891); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getFunctionTypeDefinitionAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3104:1: ( (lv_parameterTypes_4_0= ruleType ) )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3105:1: (lv_parameterTypes_4_0= ruleType )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3105:1: (lv_parameterTypes_4_0= ruleType )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3106:3: lv_parameterTypes_4_0= ruleType
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionTypeDefinitionAccess().getParameterTypesTypeParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFunctionTypeDefinition6912);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionTypeDefinition6928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFunctionTypeDefinitionAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFunctionTypeDefinition6940); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionTypeDefinitionAccess().getColonKeyword_4());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3130:1: ( (lv_returnType_7_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3131:1: (lv_returnType_7_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3131:1: (lv_returnType_7_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3132:3: lv_returnType_7_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionTypeDefinitionAccess().getReturnTypeTypeParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFunctionTypeDefinition6961);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3156:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3157:2: (iv_ruleExpression= ruleExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3158:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_entryRuleExpression6997);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExpression7007); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3165:1: ruleExpression returns [EObject current=null] : this_IfThenElseExpression_0= ruleIfThenElseExpression ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_IfThenElseExpression_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3168:28: (this_IfThenElseExpression_0= ruleIfThenElseExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3170:5: this_IfThenElseExpression_0= ruleIfThenElseExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getIfThenElseExpressionParserRuleCall()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfThenElseExpression_in_ruleExpression7053);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3186:1: entryRuleIfThenElseExpression returns [EObject current=null] : iv_ruleIfThenElseExpression= ruleIfThenElseExpression EOF ;
    public final EObject entryRuleIfThenElseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfThenElseExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3187:2: (iv_ruleIfThenElseExpression= ruleIfThenElseExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3188:2: iv_ruleIfThenElseExpression= ruleIfThenElseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfThenElseExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIfThenElseExpression_in_entryRuleIfThenElseExpression7087);
            iv_ruleIfThenElseExpression=ruleIfThenElseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfThenElseExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIfThenElseExpression7097); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3195:1: ruleIfThenElseExpression returns [EObject current=null] : ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) ) | this_EqualExpression_7= ruleEqualExpression ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3198:28: ( ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) ) | this_EqualExpression_7= ruleEqualExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3199:1: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) ) | this_EqualExpression_7= ruleEqualExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3199:1: ( ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) ) | this_EqualExpression_7= ruleEqualExpression )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==55) ) {
                alt35=1;
            }
            else if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_DECIMAL)||LA35_0==14||LA35_0==38||(LA35_0>=49 && LA35_0<=50)||(LA35_0>=64 && LA35_0<=72)||LA35_0==80||(LA35_0>=89 && LA35_0<=91)||LA35_0==93) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3199:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3199:2: ( () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3199:3: () otherlv_1= 'if' ( (lv_condition_2_0= ruleExpression ) ) otherlv_3= 'then' ( (lv_then_4_0= ruleExpression ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3199:3: ()
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3200:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getIfThenElseExpressionAccess().getIfThenElseExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleIfThenElseExpression7144); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIfThenElseExpressionAccess().getIfKeyword_0_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3209:1: ( (lv_condition_2_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3210:1: (lv_condition_2_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3210:1: (lv_condition_2_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3211:3: lv_condition_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseExpressionAccess().getConditionExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfThenElseExpression7165);
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

                    otherlv_3=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleIfThenElseExpression7177); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIfThenElseExpressionAccess().getThenKeyword_0_3());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3231:1: ( (lv_then_4_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3232:1: (lv_then_4_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3232:1: (lv_then_4_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3233:3: lv_then_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseExpressionAccess().getThenExpressionParserRuleCall_0_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfThenElseExpression7198);
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

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3249:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3249:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3249:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3249:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleIfThenElseExpression7219); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfThenElseExpressionAccess().getElseKeyword_0_5_0());
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3254:2: ( (lv_else_6_0= ruleExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3255:1: (lv_else_6_0= ruleExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3255:1: (lv_else_6_0= ruleExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3256:3: lv_else_6_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfThenElseExpressionAccess().getElseExpressionParserRuleCall_0_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleIfThenElseExpression7241);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3274:5: this_EqualExpression_7= ruleEqualExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getIfThenElseExpressionAccess().getEqualExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleIfThenElseExpression7271);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3290:1: entryRuleEqualExpression returns [EObject current=null] : iv_ruleEqualExpression= ruleEqualExpression EOF ;
    public final EObject entryRuleEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3291:2: (iv_ruleEqualExpression= ruleEqualExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3292:2: iv_ruleEqualExpression= ruleEqualExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression7306);
            iv_ruleEqualExpression=ruleEqualExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEqualExpression7316); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3299:1: ruleEqualExpression returns [EObject current=null] : (this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )? ) ;
    public final EObject ruleEqualExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ImplyExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3302:28: ( (this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3303:1: (this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3303:1: (this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )? )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3304:5: this_ImplyExpression_0= ruleImplyExpression ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualExpressionAccess().getImplyExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleImplyExpression_in_ruleEqualExpression7363);
            this_ImplyExpression_0=ruleImplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ImplyExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3312:1: ( () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==58) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3312:2: () otherlv_2= 'equal' ( (lv_rightOperand_3_0= ruleEqualExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3312:2: ()
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3313:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEqualExpressionAccess().getEqualExpressionLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleEqualExpression7384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEqualExpressionAccess().getEqualKeyword_1_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3322:1: ( (lv_rightOperand_3_0= ruleEqualExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3323:1: (lv_rightOperand_3_0= ruleEqualExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3323:1: (lv_rightOperand_3_0= ruleEqualExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3324:3: lv_rightOperand_3_0= ruleEqualExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualExpressionAccess().getRightOperandEqualExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEqualExpression_in_ruleEqualExpression7405);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3348:1: entryRuleImplyExpression returns [EObject current=null] : iv_ruleImplyExpression= ruleImplyExpression EOF ;
    public final EObject entryRuleImplyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplyExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3349:2: (iv_ruleImplyExpression= ruleImplyExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3350:2: iv_ruleImplyExpression= ruleImplyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleImplyExpression_in_entryRuleImplyExpression7443);
            iv_ruleImplyExpression=ruleImplyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplyExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplyExpression7453); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3357:1: ruleImplyExpression returns [EObject current=null] : (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )? ) ;
    public final EObject ruleImplyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_OrExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3360:28: ( (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3361:1: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3361:1: (this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )? )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3362:5: this_OrExpression_0= ruleOrExpression ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplyExpressionAccess().getOrExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_ruleImplyExpression7500);
            this_OrExpression_0=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3370:1: ( () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==59) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3370:2: () otherlv_2= 'imply' ( (lv_rightOperand_3_0= ruleImplyExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3370:2: ()
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3371:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImplyExpressionAccess().getImplyExpressionLeftOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleImplyExpression7521); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImplyExpressionAccess().getImplyKeyword_1_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3380:1: ( (lv_rightOperand_3_0= ruleImplyExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3381:1: (lv_rightOperand_3_0= ruleImplyExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3381:1: (lv_rightOperand_3_0= ruleImplyExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3382:3: lv_rightOperand_3_0= ruleImplyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplyExpressionAccess().getRightOperandImplyExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleImplyExpression_in_ruleImplyExpression7542);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3406:1: entryRuleOrExpression returns [EObject current=null] : iv_ruleOrExpression= ruleOrExpression EOF ;
    public final EObject entryRuleOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3407:2: (iv_ruleOrExpression= ruleOrExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3408:2: iv_ruleOrExpression= ruleOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleOrExpression_in_entryRuleOrExpression7580);
            iv_ruleOrExpression=ruleOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOrExpression7590); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3415:1: ruleOrExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )? ) ;
    public final EObject ruleOrExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_operands_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3418:28: ( (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )? ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3419:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )? )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3419:1: (this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )? )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3420:5: this_AndExpression_0= ruleAndExpression ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression7637);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3428:1: ( () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+ )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==60) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3428:2: () (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3428:2: ()
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3429:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getOrExpressionAccess().getOrExpressionOperandsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3434:2: (otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==60) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3434:4: otherlv_2= 'or' ( (lv_operands_3_0= ruleAndExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleOrExpression7659); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3438:1: ( (lv_operands_3_0= ruleAndExpression ) )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3439:1: (lv_operands_3_0= ruleAndExpression )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3439:1: (lv_operands_3_0= ruleAndExpression )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3440:3: lv_operands_3_0= ruleAndExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getOrExpressionAccess().getOperandsAndExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_ruleOrExpression7680);
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
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3464:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3465:2: (iv_ruleAndExpression= ruleAndExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3466:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAndExpression_in_entryRuleAndExpression7720);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAndExpression7730); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3473:1: ruleAndExpression returns [EObject current=null] : (this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )? ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_ReleaseExpression_0 = null;

        EObject lv_operands_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3476:28: ( (this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )? ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3477:1: (this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )? )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3477:1: (this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )? )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3478:5: this_ReleaseExpression_0= ruleReleaseExpression ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExpressionAccess().getReleaseExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleReleaseExpression_in_ruleAndExpression7777);
            this_ReleaseExpression_0=ruleReleaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ReleaseExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3486:1: ( () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+ )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==61) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3486:2: () (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3486:2: ()
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3487:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndAdd(
                                  grammarAccess.getAndExpressionAccess().getAndExpressionOperandsAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3492:2: (otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) ) )+
                    int cnt40=0;
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==61) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3492:4: otherlv_2= 'and' ( (lv_operands_3_0= ruleReleaseExpression ) )
                    	    {
                    	    otherlv_2=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleAndExpression7799); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3496:1: ( (lv_operands_3_0= ruleReleaseExpression ) )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3497:1: (lv_operands_3_0= ruleReleaseExpression )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3497:1: (lv_operands_3_0= ruleReleaseExpression )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3498:3: lv_operands_3_0= ruleReleaseExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAndExpressionAccess().getOperandsReleaseExpressionParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleReleaseExpression_in_ruleAndExpression7820);
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
                    	    if ( cnt40 >= 1 ) break loop40;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(40, input);
                                throw eee;
                        }
                        cnt40++;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3522:1: entryRuleReleaseExpression returns [EObject current=null] : iv_ruleReleaseExpression= ruleReleaseExpression EOF ;
    public final EObject entryRuleReleaseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReleaseExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3523:2: (iv_ruleReleaseExpression= ruleReleaseExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3524:2: iv_ruleReleaseExpression= ruleReleaseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReleaseExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleReleaseExpression_in_entryRuleReleaseExpression7860);
            iv_ruleReleaseExpression=ruleReleaseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReleaseExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReleaseExpression7870); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3531:1: ruleReleaseExpression returns [EObject current=null] : (this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )* ) ;
    public final EObject ruleReleaseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UntilExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3534:28: ( (this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3535:1: (this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3535:1: (this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )* )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3536:5: this_UntilExpression_0= ruleUntilExpression ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getReleaseExpressionAccess().getUntilExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleUntilExpression_in_ruleReleaseExpression7917);
            this_UntilExpression_0=ruleUntilExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UntilExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3544:1: ( () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==62) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3544:2: () otherlv_2= 'R' ( (lv_rightOperand_3_0= ruleUntilExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3544:2: ()
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3545:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getReleaseExpressionAccess().getReleaseExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleReleaseExpression7938); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getReleaseExpressionAccess().getRKeyword_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3554:1: ( (lv_rightOperand_3_0= ruleUntilExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3555:1: (lv_rightOperand_3_0= ruleUntilExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3555:1: (lv_rightOperand_3_0= ruleUntilExpression )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3556:3: lv_rightOperand_3_0= ruleUntilExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getReleaseExpressionAccess().getRightOperandUntilExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleUntilExpression_in_ruleReleaseExpression7959);
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
    // $ANTLR end "ruleReleaseExpression"


    // $ANTLR start "entryRuleUntilExpression"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3580:1: entryRuleUntilExpression returns [EObject current=null] : iv_ruleUntilExpression= ruleUntilExpression EOF ;
    public final EObject entryRuleUntilExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUntilExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3581:2: (iv_ruleUntilExpression= ruleUntilExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3582:2: iv_ruleUntilExpression= ruleUntilExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUntilExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUntilExpression_in_entryRuleUntilExpression7997);
            iv_ruleUntilExpression=ruleUntilExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUntilExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUntilExpression8007); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3589:1: ruleUntilExpression returns [EObject current=null] : (this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )* ) ;
    public final EObject ruleUntilExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_UnaryLogicExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3592:28: ( (this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3593:1: (this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3593:1: (this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )* )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3594:5: this_UnaryLogicExpression_0= ruleUnaryLogicExpression ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getUntilExpressionAccess().getUnaryLogicExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleUntilExpression8054);
            this_UnaryLogicExpression_0=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_UnaryLogicExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3602:1: ( () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==63) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3602:2: () otherlv_2= 'U' ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3602:2: ()
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3603:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getUntilExpressionAccess().getUntilExpressionLeftOperandAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleUntilExpression8075); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getUntilExpressionAccess().getUKeyword_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3612:1: ( (lv_rightOperand_3_0= ruleUnaryLogicExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3613:1: (lv_rightOperand_3_0= ruleUnaryLogicExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3613:1: (lv_rightOperand_3_0= ruleUnaryLogicExpression )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3614:3: lv_rightOperand_3_0= ruleUnaryLogicExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUntilExpressionAccess().getRightOperandUnaryLogicExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleUntilExpression8096);
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
    // $ANTLR end "ruleUntilExpression"


    // $ANTLR start "entryRuleUnaryLogicExpression"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3638:1: entryRuleUnaryLogicExpression returns [EObject current=null] : iv_ruleUnaryLogicExpression= ruleUnaryLogicExpression EOF ;
    public final EObject entryRuleUnaryLogicExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryLogicExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3639:2: (iv_ruleUnaryLogicExpression= ruleUnaryLogicExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3640:2: iv_ruleUnaryLogicExpression= ruleUnaryLogicExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryLogicExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_entryRuleUnaryLogicExpression8134);
            iv_ruleUnaryLogicExpression=ruleUnaryLogicExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryLogicExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleUnaryLogicExpression8144); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3647:1: ruleUnaryLogicExpression returns [EObject current=null] : (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3650:28: ( (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3651:1: (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3651:1: (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression )
            int alt44=11;
            alt44 = dfa44.predict(input);
            switch (alt44) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3652:5: this_NotExpression_0= ruleNotExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getNotExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_ruleUnaryLogicExpression8191);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3662:5: this_ForallExpression_1= ruleForallExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getForallExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleForallExpression_in_ruleUnaryLogicExpression8218);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3672:5: this_ExistsExpression_2= ruleExistsExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getExistsExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExistsExpression_in_ruleUnaryLogicExpression8245);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3682:5: this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getFunctionLiteralExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFunctionLiteralExpression_in_ruleUnaryLogicExpression8272);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3692:5: this_GloballyExpression_4= ruleGloballyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getGloballyExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleGloballyExpression_in_ruleUnaryLogicExpression8299);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3702:5: this_FinallyExpression_5= ruleFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getFinallyExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFinallyExpression_in_ruleUnaryLogicExpression8326);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3712:5: this_NextExpression_6= ruleNextExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getNextExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleNextExpression_in_ruleUnaryLogicExpression8353);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3722:5: this_TemporalForallExpression_7= ruleTemporalForallExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getTemporalForallExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTemporalForallExpression_in_ruleUnaryLogicExpression8380);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3732:5: this_TemporalExistsExpression_8= ruleTemporalExistsExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getTemporalExistsExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTemporalExistsExpression_in_ruleUnaryLogicExpression8407);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3742:5: this_LetExpression_9= ruleLetExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getLetExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLetExpression_in_ruleUnaryLogicExpression8434);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3752:5: this_InExpression_10= ruleInExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getUnaryLogicExpressionAccess().getInExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleInExpression_in_ruleUnaryLogicExpression8461);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3768:1: entryRuleNotExpression returns [EObject current=null] : iv_ruleNotExpression= ruleNotExpression EOF ;
    public final EObject entryRuleNotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3769:2: (iv_ruleNotExpression= ruleNotExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3770:2: iv_ruleNotExpression= ruleNotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNotExpression_in_entryRuleNotExpression8496);
            iv_ruleNotExpression=ruleNotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNotExpression8506); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3777:1: ruleNotExpression returns [EObject current=null] : ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleNotExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3780:28: ( ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3781:1: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3781:1: ( () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3781:2: () ( ( 'not' )=>otherlv_1= 'not' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3781:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3782:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotExpressionAccess().getNotExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3787:2: ( ( 'not' )=>otherlv_1= 'not' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3787:3: ( 'not' )=>otherlv_1= 'not'
            {
            otherlv_1=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleNotExpression8560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNotExpressionAccess().getNotKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3792:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3793:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3793:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3794:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNotExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleNotExpression8582);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3818:1: entryRuleForallExpression returns [EObject current=null] : iv_ruleForallExpression= ruleForallExpression EOF ;
    public final EObject entryRuleForallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForallExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3819:2: (iv_ruleForallExpression= ruleForallExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3820:2: iv_ruleForallExpression= ruleForallExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForallExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForallExpression_in_entryRuleForallExpression8618);
            iv_ruleForallExpression=ruleForallExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForallExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForallExpression8628); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3827:1: ruleForallExpression returns [EObject current=null] : ( () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3830:28: ( ( () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3831:1: ( () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3831:1: ( () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3831:2: () ( ( 'forall' )=>otherlv_1= 'forall' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3831:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3832:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getForallExpressionAccess().getForallExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3837:2: ( ( 'forall' )=>otherlv_1= 'forall' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3837:3: ( 'forall' )=>otherlv_1= 'forall'
            {
            otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleForallExpression8682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForallExpressionAccess().getForallKeyword_1());
                  
            }

            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleForallExpression8695); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getForallExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3846:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3846:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3846:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3847:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3847:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3848:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getForallExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleForallExpression8717);
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

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3864:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==15) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3864:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleForallExpression8730); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getForallExpressionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3868:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3869:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3869:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3870:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getForallExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleForallExpression8751);
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
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleForallExpression8767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getForallExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleForallExpression8779); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForallExpressionAccess().getColonKeyword_5());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3894:1: ( (lv_operand_8_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3895:1: (lv_operand_8_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3895:1: (lv_operand_8_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3896:3: lv_operand_8_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForallExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleForallExpression8800);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3920:1: entryRuleExistsExpression returns [EObject current=null] : iv_ruleExistsExpression= ruleExistsExpression EOF ;
    public final EObject entryRuleExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExistsExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3921:2: (iv_ruleExistsExpression= ruleExistsExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3922:2: iv_ruleExistsExpression= ruleExistsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExistsExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression8836);
            iv_ruleExistsExpression=ruleExistsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExistsExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExistsExpression8846); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3929:1: ruleExistsExpression returns [EObject current=null] : ( () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3932:28: ( ( () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3933:1: ( () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3933:1: ( () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3933:2: () ( ( 'exists' )=>otherlv_1= 'exists' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_operand_8_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3933:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3934:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExistsExpressionAccess().getExistsExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3939:2: ( ( 'exists' )=>otherlv_1= 'exists' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3939:3: ( 'exists' )=>otherlv_1= 'exists'
            {
            otherlv_1=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleExistsExpression8900); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExistsExpressionAccess().getExistsKeyword_1());
                  
            }

            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleExistsExpression8913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExistsExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3948:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3948:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3948:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3949:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3949:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3950:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleExistsExpression8935);
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

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3966:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==15) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3966:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExistsExpression8948); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getExistsExpressionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3970:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3971:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3971:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3972:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleExistsExpression8969);
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
                    	    break loop47;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExistsExpression8985); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getExistsExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleExistsExpression8997); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getExistsExpressionAccess().getColonKeyword_5());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3996:1: ( (lv_operand_8_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3997:1: (lv_operand_8_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3997:1: (lv_operand_8_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:3998:3: lv_operand_8_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExistsExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleExistsExpression9018);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4022:1: entryRuleFunctionLiteralExpression returns [EObject current=null] : iv_ruleFunctionLiteralExpression= ruleFunctionLiteralExpression EOF ;
    public final EObject entryRuleFunctionLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4023:2: (iv_ruleFunctionLiteralExpression= ruleFunctionLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4024:2: iv_ruleFunctionLiteralExpression= ruleFunctionLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFunctionLiteralExpression_in_entryRuleFunctionLiteralExpression9054);
            iv_ruleFunctionLiteralExpression=ruleFunctionLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFunctionLiteralExpression9064); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4031:1: ruleFunctionLiteralExpression returns [EObject current=null] : ( () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) ) ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4034:28: ( ( () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4035:1: ( () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4035:1: ( () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4035:2: () ( ( 'function' )=>otherlv_1= 'function' ) otherlv_2= '(' ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )? otherlv_6= ')' otherlv_7= ':' ( (lv_returnType_8_0= ruleType ) ) otherlv_9= ':=' ( (lv_operand_10_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4035:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4036:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFunctionLiteralExpressionAccess().getFunctionLiteralExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4041:2: ( ( 'function' )=>otherlv_1= 'function' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4041:3: ( 'function' )=>otherlv_1= 'function'
            {
            otherlv_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleFunctionLiteralExpression9118); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFunctionLiteralExpressionAccess().getFunctionKeyword_1());
                  
            }

            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleFunctionLiteralExpression9131); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getFunctionLiteralExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4050:1: ( ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )* )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ID) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4050:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4050:2: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4051:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4051:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4052:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFunctionLiteralExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleFunctionLiteralExpression9153);
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

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4068:2: (otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==15) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4068:4: otherlv_4= ',' ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleFunctionLiteralExpression9166); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getFunctionLiteralExpressionAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4072:1: ( (lv_parameterDeclarations_5_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4073:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4073:1: (lv_parameterDeclarations_5_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4074:3: lv_parameterDeclarations_5_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getFunctionLiteralExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleFunctionLiteralExpression9187);
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
                    	    break loop49;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleFunctionLiteralExpression9203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFunctionLiteralExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            otherlv_7=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleFunctionLiteralExpression9215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFunctionLiteralExpressionAccess().getColonKeyword_5());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4098:1: ( (lv_returnType_8_0= ruleType ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4099:1: (lv_returnType_8_0= ruleType )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4099:1: (lv_returnType_8_0= ruleType )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4100:3: lv_returnType_8_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionLiteralExpressionAccess().getReturnTypeTypeParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleFunctionLiteralExpression9236);
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

            otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFunctionLiteralExpression9248); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFunctionLiteralExpressionAccess().getColonEqualsSignKeyword_7());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4120:1: ( (lv_operand_10_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4121:1: (lv_operand_10_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4121:1: (lv_operand_10_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4122:3: lv_operand_10_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionLiteralExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleFunctionLiteralExpression9269);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4146:1: entryRuleGloballyExpression returns [EObject current=null] : iv_ruleGloballyExpression= ruleGloballyExpression EOF ;
    public final EObject entryRuleGloballyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGloballyExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4147:2: (iv_ruleGloballyExpression= ruleGloballyExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4148:2: iv_ruleGloballyExpression= ruleGloballyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGloballyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleGloballyExpression_in_entryRuleGloballyExpression9305);
            iv_ruleGloballyExpression=ruleGloballyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGloballyExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGloballyExpression9315); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4155:1: ruleGloballyExpression returns [EObject current=null] : ( () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleGloballyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4158:28: ( ( () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4159:1: ( () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4159:1: ( () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4159:2: () ( ( 'G' )=>otherlv_1= 'G' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4159:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4160:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGloballyExpressionAccess().getGloballyExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4165:2: ( ( 'G' )=>otherlv_1= 'G' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4165:3: ( 'G' )=>otherlv_1= 'G'
            {
            otherlv_1=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleGloballyExpression9369); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGloballyExpressionAccess().getGKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4170:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4171:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4171:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4172:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGloballyExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleGloballyExpression9391);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4196:1: entryRuleFinallyExpression returns [EObject current=null] : iv_ruleFinallyExpression= ruleFinallyExpression EOF ;
    public final EObject entryRuleFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinallyExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4197:2: (iv_ruleFinallyExpression= ruleFinallyExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4198:2: iv_ruleFinallyExpression= ruleFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFinallyExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFinallyExpression_in_entryRuleFinallyExpression9427);
            iv_ruleFinallyExpression=ruleFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFinallyExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFinallyExpression9437); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4205:1: ruleFinallyExpression returns [EObject current=null] : ( () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4208:28: ( ( () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4209:1: ( () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4209:1: ( () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4209:2: () ( ( 'F' )=>otherlv_1= 'F' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4209:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4210:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFinallyExpressionAccess().getFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4215:2: ( ( 'F' )=>otherlv_1= 'F' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4215:3: ( 'F' )=>otherlv_1= 'F'
            {
            otherlv_1=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleFinallyExpression9491); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFinallyExpressionAccess().getFKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4220:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4221:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4221:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4222:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFinallyExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleFinallyExpression9513);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4246:1: entryRuleNextExpression returns [EObject current=null] : iv_ruleNextExpression= ruleNextExpression EOF ;
    public final EObject entryRuleNextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4247:2: (iv_ruleNextExpression= ruleNextExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4248:2: iv_ruleNextExpression= ruleNextExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleNextExpression_in_entryRuleNextExpression9549);
            iv_ruleNextExpression=ruleNextExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleNextExpression9559); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4255:1: ruleNextExpression returns [EObject current=null] : ( () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleNextExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4258:28: ( ( () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4259:1: ( () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4259:1: ( () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4259:2: () ( ( 'X' )=>otherlv_1= 'X' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4259:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4260:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNextExpressionAccess().getNextExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4265:2: ( ( 'X' )=>otherlv_1= 'X' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4265:3: ( 'X' )=>otherlv_1= 'X'
            {
            otherlv_1=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleNextExpression9613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNextExpressionAccess().getXKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4270:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4271:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4271:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4272:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNextExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleNextExpression9635);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4296:1: entryRuleTemporalForallExpression returns [EObject current=null] : iv_ruleTemporalForallExpression= ruleTemporalForallExpression EOF ;
    public final EObject entryRuleTemporalForallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalForallExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4297:2: (iv_ruleTemporalForallExpression= ruleTemporalForallExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4298:2: iv_ruleTemporalForallExpression= ruleTemporalForallExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalForallExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemporalForallExpression_in_entryRuleTemporalForallExpression9671);
            iv_ruleTemporalForallExpression=ruleTemporalForallExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalForallExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemporalForallExpression9681); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4305:1: ruleTemporalForallExpression returns [EObject current=null] : ( () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleTemporalForallExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4308:28: ( ( () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4309:1: ( () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4309:1: ( () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4309:2: () ( ( 'A' )=>otherlv_1= 'A' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4309:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4310:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTemporalForallExpressionAccess().getTemporalForallExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4315:2: ( ( 'A' )=>otherlv_1= 'A' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4315:3: ( 'A' )=>otherlv_1= 'A'
            {
            otherlv_1=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleTemporalForallExpression9735); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemporalForallExpressionAccess().getAKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4320:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4321:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4321:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4322:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemporalForallExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleTemporalForallExpression9757);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4346:1: entryRuleTemporalExistsExpression returns [EObject current=null] : iv_ruleTemporalExistsExpression= ruleTemporalExistsExpression EOF ;
    public final EObject entryRuleTemporalExistsExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalExistsExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4347:2: (iv_ruleTemporalExistsExpression= ruleTemporalExistsExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4348:2: iv_ruleTemporalExistsExpression= ruleTemporalExistsExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalExistsExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTemporalExistsExpression_in_entryRuleTemporalExistsExpression9793);
            iv_ruleTemporalExistsExpression=ruleTemporalExistsExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalExistsExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemporalExistsExpression9803); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4355:1: ruleTemporalExistsExpression returns [EObject current=null] : ( () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) ;
    public final EObject ruleTemporalExistsExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4358:28: ( ( () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4359:1: ( () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4359:1: ( () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4359:2: () ( ( 'E' )=>otherlv_1= 'E' ) ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4359:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4360:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTemporalExistsExpressionAccess().getTemporalExistsExpressionAction_0(),
                          current);
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4365:2: ( ( 'E' )=>otherlv_1= 'E' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4365:3: ( 'E' )=>otherlv_1= 'E'
            {
            otherlv_1=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleTemporalExistsExpression9857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTemporalExistsExpressionAccess().getEKeyword_1());
                  
            }

            }

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4370:2: ( (lv_operand_2_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4371:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4371:1: (lv_operand_2_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4372:3: lv_operand_2_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTemporalExistsExpressionAccess().getOperandUnaryLogicExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleTemporalExistsExpression9879);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4396:1: entryRuleLetExpression returns [EObject current=null] : iv_ruleLetExpression= ruleLetExpression EOF ;
    public final EObject entryRuleLetExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4397:2: (iv_ruleLetExpression= ruleLetExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4398:2: iv_ruleLetExpression= ruleLetExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLetExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetExpression_in_entryRuleLetExpression9915);
            iv_ruleLetExpression=ruleLetExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLetExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLetExpression9925); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4405:1: ruleLetExpression returns [EObject current=null] : ( () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) ) ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4408:28: ( ( () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4409:1: ( () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4409:1: ( () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4409:2: () otherlv_1= 'let' otherlv_2= '(' ( (lv_letDeclarations_3_0= ruleLetDeclaration ) ) (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )* otherlv_6= ')' otherlv_7= 'in' ( (lv_expression_8_0= ruleUnaryLogicExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4409:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4410:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLetExpressionAccess().getLetExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleLetExpression9971); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLetExpressionAccess().getLetKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleLetExpression9983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLetExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4423:1: ( (lv_letDeclarations_3_0= ruleLetDeclaration ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4424:1: (lv_letDeclarations_3_0= ruleLetDeclaration )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4424:1: (lv_letDeclarations_3_0= ruleLetDeclaration )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4425:3: lv_letDeclarations_3_0= ruleLetDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpressionAccess().getLetDeclarationsLetDeclarationParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLetDeclaration_in_ruleLetExpression10004);
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

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4441:2: (otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==15) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4441:4: otherlv_4= ',' ( (lv_letDeclarations_5_0= ruleLetDeclaration ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLetExpression10017); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getLetExpressionAccess().getCommaKeyword_4_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4445:1: ( (lv_letDeclarations_5_0= ruleLetDeclaration ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4446:1: (lv_letDeclarations_5_0= ruleLetDeclaration )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4446:1: (lv_letDeclarations_5_0= ruleLetDeclaration )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4447:3: lv_letDeclarations_5_0= ruleLetDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLetExpressionAccess().getLetDeclarationsLetDeclarationParserRuleCall_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLetDeclaration_in_ruleLetExpression10038);
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
            	    break loop51;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLetExpression10052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getLetExpressionAccess().getRightParenthesisKeyword_5());
                  
            }
            otherlv_7=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleLetExpression10064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getLetExpressionAccess().getInKeyword_6());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4471:1: ( (lv_expression_8_0= ruleUnaryLogicExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4472:1: (lv_expression_8_0= ruleUnaryLogicExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4472:1: (lv_expression_8_0= ruleUnaryLogicExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4473:3: lv_expression_8_0= ruleUnaryLogicExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLetExpressionAccess().getExpressionUnaryLogicExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleUnaryLogicExpression_in_ruleLetExpression10085);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4497:1: entryRuleInExpression returns [EObject current=null] : iv_ruleInExpression= ruleInExpression EOF ;
    public final EObject entryRuleInExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4498:2: (iv_ruleInExpression= ruleInExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4499:2: iv_ruleInExpression= ruleInExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleInExpression_in_entryRuleInExpression10121);
            iv_ruleInExpression=ruleInExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInExpression10131); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4506:1: ruleInExpression returns [EObject current=null] : (this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )? ) ;
    public final EObject ruleInExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EquivalenceExpression_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4509:28: ( (this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4510:1: (this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4510:1: (this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )? )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4511:5: this_EquivalenceExpression_0= ruleEquivalenceExpression ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getInExpressionAccess().getEquivalenceExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquivalenceExpression_in_ruleInExpression10178);
            this_EquivalenceExpression_0=ruleEquivalenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EquivalenceExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4519:1: ( () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==73) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4519:2: () otherlv_2= 'in' ( (lv_type_3_0= ruleType ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4519:2: ()
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4520:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getInExpressionAccess().getInExpressionOperandAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleInExpression10199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getInExpressionAccess().getInKeyword_1_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4529:1: ( (lv_type_3_0= ruleType ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4530:1: (lv_type_3_0= ruleType )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4530:1: (lv_type_3_0= ruleType )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4531:3: lv_type_3_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInExpressionAccess().getTypeTypeParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleInExpression10220);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4555:1: entryRuleEquivalenceExpression returns [EObject current=null] : iv_ruleEquivalenceExpression= ruleEquivalenceExpression EOF ;
    public final EObject entryRuleEquivalenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivalenceExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4556:2: (iv_ruleEquivalenceExpression= ruleEquivalenceExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4557:2: iv_ruleEquivalenceExpression= ruleEquivalenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquivalenceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEquivalenceExpression_in_entryRuleEquivalenceExpression10258);
            iv_ruleEquivalenceExpression=ruleEquivalenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquivalenceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEquivalenceExpression10268); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4564:1: ruleEquivalenceExpression returns [EObject current=null] : (this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )? ) ;
    public final EObject ruleEquivalenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_ComparisionExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4567:28: ( (this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )? ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4568:1: (this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )? )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4568:1: (this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )? )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4569:5: this_ComparisionExpression_0= ruleComparisionExpression ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEquivalenceExpressionAccess().getComparisionExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression10315);
            this_ComparisionExpression_0=ruleComparisionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparisionExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4577:1: ( ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) ) | ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) ) )?
            int alt53=3;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==74) ) {
                alt53=1;
            }
            else if ( (LA53_0==75) ) {
                alt53=2;
            }
            switch (alt53) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4577:2: ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4577:2: ( () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4577:3: () otherlv_2= '=' ( (lv_rightOperand_3_0= ruleComparisionExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4577:3: ()
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4578:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEquivalenceExpressionAccess().getEqualityExpressionLeftOperandAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleEquivalenceExpression10337); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEquivalenceExpressionAccess().getEqualsSignKeyword_1_0_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4587:1: ( (lv_rightOperand_3_0= ruleComparisionExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4588:1: (lv_rightOperand_3_0= ruleComparisionExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4588:1: (lv_rightOperand_3_0= ruleComparisionExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4589:3: lv_rightOperand_3_0= ruleComparisionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquivalenceExpressionAccess().getRightOperandComparisionExpressionParserRuleCall_1_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression10358);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4606:6: ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4606:6: ( () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4606:7: () otherlv_5= '/=' ( (lv_rightOperand_6_0= ruleComparisionExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4606:7: ()
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4607:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEquivalenceExpressionAccess().getInequalityExpressionLeftOperandAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_5=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleEquivalenceExpression10387); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEquivalenceExpressionAccess().getSolidusEqualsSignKeyword_1_1_1());
                          
                    }
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4616:1: ( (lv_rightOperand_6_0= ruleComparisionExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4617:1: (lv_rightOperand_6_0= ruleComparisionExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4617:1: (lv_rightOperand_6_0= ruleComparisionExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4618:3: lv_rightOperand_6_0= ruleComparisionExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquivalenceExpressionAccess().getRightOperandComparisionExpressionParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression10408);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4642:1: entryRuleComparisionExpression returns [EObject current=null] : iv_ruleComparisionExpression= ruleComparisionExpression EOF ;
    public final EObject entryRuleComparisionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisionExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4643:2: (iv_ruleComparisionExpression= ruleComparisionExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4644:2: iv_ruleComparisionExpression= ruleComparisionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisionExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleComparisionExpression_in_entryRuleComparisionExpression10447);
            iv_ruleComparisionExpression=ruleComparisionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparisionExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparisionExpression10457); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4651:1: ruleComparisionExpression returns [EObject current=null] : (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )* ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4654:28: ( (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4655:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4655:1: (this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )* )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4656:5: this_AdditiveExpression_0= ruleAdditiveExpression ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisionExpressionAccess().getAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleComparisionExpression10504);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4664:1: ( ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=76 && LA55_0<=79)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4664:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) ) ( (lv_rightOperand_9_0= ruleAdditiveExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4664:2: ( ( () otherlv_2= '>' ) | ( () otherlv_4= '>=' ) | ( () otherlv_6= '<' ) | ( () otherlv_8= '<=' ) )
            	    int alt54=4;
            	    switch ( input.LA(1) ) {
            	    case 76:
            	        {
            	        alt54=1;
            	        }
            	        break;
            	    case 77:
            	        {
            	        alt54=2;
            	        }
            	        break;
            	    case 78:
            	        {
            	        alt54=3;
            	        }
            	        break;
            	    case 79:
            	        {
            	        alt54=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 54, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt54) {
            	        case 1 :
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4664:3: ( () otherlv_2= '>' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4664:3: ( () otherlv_2= '>' )
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4664:4: () otherlv_2= '>'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4664:4: ()
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4665:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisionExpressionAccess().getGreaterExpressionLeftOperandAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleComparisionExpression10527); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getComparisionExpressionAccess().getGreaterThanSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4675:6: ( () otherlv_4= '>=' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4675:6: ( () otherlv_4= '>=' )
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4675:7: () otherlv_4= '>='
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4675:7: ()
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4676:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisionExpressionAccess().getGreaterEqualExpressionLeftOperandAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleComparisionExpression10556); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getComparisionExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4686:6: ( () otherlv_6= '<' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4686:6: ( () otherlv_6= '<' )
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4686:7: () otherlv_6= '<'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4686:7: ()
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4687:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisionExpressionAccess().getLessExpressionLeftOperandAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_6=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleComparisionExpression10585); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getComparisionExpressionAccess().getLessThanSignKeyword_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4697:6: ( () otherlv_8= '<=' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4697:6: ( () otherlv_8= '<=' )
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4697:7: () otherlv_8= '<='
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4697:7: ()
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4698:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getComparisionExpressionAccess().getLessEqualExpressionLeftOperandAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_8=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleComparisionExpression10614); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_8, grammarAccess.getComparisionExpressionAccess().getLessThanSignEqualsSignKeyword_1_0_3_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4707:3: ( (lv_rightOperand_9_0= ruleAdditiveExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4708:1: (lv_rightOperand_9_0= ruleAdditiveExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4708:1: (lv_rightOperand_9_0= ruleAdditiveExpression )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4709:3: lv_rightOperand_9_0= ruleAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisionExpressionAccess().getRightOperandAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_ruleComparisionExpression10637);
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
            	    break loop55;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4733:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4734:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4735:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression10675);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAdditiveExpression10685); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4742:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operands_3_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4745:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4746:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4746:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )* )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4747:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression10732);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4755:1: ( ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ ) | ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) ) )*
            loop57:
            do {
                int alt57=3;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==80) ) {
                    alt57=1;
                }
                else if ( (LA57_0==50) ) {
                    alt57=2;
                }


                switch (alt57) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4755:2: ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4755:2: ( () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+ )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4755:3: () ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4755:3: ()
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4756:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getAdditiveExpressionAccess().getAddExpressionOperandsAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4761:2: ( ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) ) )+
            	    int cnt56=0;
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==80) ) {
            	            int LA56_2 = input.LA(2);

            	            if ( (synpred13_InternalTTMCSystemLanguage()) ) {
            	                alt56=1;
            	            }


            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4761:3: ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )=> (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4766:6: (otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) ) )
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4766:8: otherlv_2= '+' ( (lv_operands_3_0= ruleMultiplicativeExpression ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleAdditiveExpression10774); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_2, grammarAccess.getAdditiveExpressionAccess().getPlusSignKeyword_1_0_1_0_0());
            	    	          
            	    	    }
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4770:1: ( (lv_operands_3_0= ruleMultiplicativeExpression ) )
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4771:1: (lv_operands_3_0= ruleMultiplicativeExpression )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4771:1: (lv_operands_3_0= ruleMultiplicativeExpression )
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4772:3: lv_operands_3_0= ruleMultiplicativeExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperandsMultiplicativeExpressionParserRuleCall_1_0_1_0_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression10795);
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
            	    	    if ( cnt56 >= 1 ) break loop56;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(56, input);
            	                throw eee;
            	        }
            	        cnt56++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4789:6: ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4789:6: ( () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4789:7: () otherlv_5= '-' ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4789:7: ()
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4790:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getSubtractExpressionLeftOperandAction_1_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_5=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleAdditiveExpression10827); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getAdditiveExpressionAccess().getHyphenMinusKeyword_1_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4799:1: ( (lv_rightOperand_6_0= ruleMultiplicativeExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4800:1: (lv_rightOperand_6_0= ruleMultiplicativeExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4800:1: (lv_rightOperand_6_0= ruleMultiplicativeExpression )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4801:3: lv_rightOperand_6_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightOperandMultiplicativeExpressionParserRuleCall_1_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression10848);
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
            	    break loop57;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4825:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4826:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4827:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression10887);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMultiplicativeExpression10897); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4834:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )* ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4837:28: ( (this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )* ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4838:1: (this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4838:1: (this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )* )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4839:5: this_SignumExpression_0= ruleSignumExpression ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getSignumExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression10944);
            this_SignumExpression_0=ruleSignumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SignumExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4847:1: ( ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ ) | ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) ) )*
            loop60:
            do {
                int alt60=3;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==81) ) {
                    alt60=1;
                }
                else if ( ((LA60_0>=82 && LA60_0<=84)) ) {
                    alt60=2;
                }


                switch (alt60) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4847:2: ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4847:2: ( () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+ )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4847:3: () ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4847:3: ()
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4848:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndAdd(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplyExpressionOperandsAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4853:2: ( ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) ) )+
            	    int cnt58=0;
            	    loop58:
            	    do {
            	        int alt58=2;
            	        int LA58_0 = input.LA(1);

            	        if ( (LA58_0==81) ) {
            	            int LA58_2 = input.LA(2);

            	            if ( (synpred14_InternalTTMCSystemLanguage()) ) {
            	                alt58=1;
            	            }


            	        }


            	        switch (alt58) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4853:3: ( ( '*' ( ( ruleSignumExpression ) ) ) )=> (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4858:6: (otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) ) )
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4858:8: otherlv_2= '*' ( (lv_operands_3_0= ruleSignumExpression ) )
            	    	    {
            	    	    otherlv_2=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleMultiplicativeExpression10986); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_2, grammarAccess.getMultiplicativeExpressionAccess().getAsteriskKeyword_1_0_1_0_0());
            	    	          
            	    	    }
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4862:1: ( (lv_operands_3_0= ruleSignumExpression ) )
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4863:1: (lv_operands_3_0= ruleSignumExpression )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4863:1: (lv_operands_3_0= ruleSignumExpression )
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4864:3: lv_operands_3_0= ruleSignumExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperandsSignumExpressionParserRuleCall_1_0_1_0_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression11007);
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
            	    	    if ( cnt58 >= 1 ) break loop58;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(58, input);
            	                throw eee;
            	        }
            	        cnt58++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4881:6: ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4881:6: ( ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4881:7: ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) ) ( (lv_rightOperand_10_0= ruleSignumExpression ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4881:7: ( ( () otherlv_5= '/' ) | ( () otherlv_7= 'div' ) | ( () otherlv_9= 'mod' ) )
            	    int alt59=3;
            	    switch ( input.LA(1) ) {
            	    case 82:
            	        {
            	        alt59=1;
            	        }
            	        break;
            	    case 83:
            	        {
            	        alt59=2;
            	        }
            	        break;
            	    case 84:
            	        {
            	        alt59=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 59, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt59) {
            	        case 1 :
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4881:8: ( () otherlv_5= '/' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4881:8: ( () otherlv_5= '/' )
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4881:9: () otherlv_5= '/'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4881:9: ()
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4882:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicativeExpressionAccess().getDivideExpressionLeftOperandAction_1_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_5=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleMultiplicativeExpression11041); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_5, grammarAccess.getMultiplicativeExpressionAccess().getSolidusKeyword_1_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4892:6: ( () otherlv_7= 'div' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4892:6: ( () otherlv_7= 'div' )
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4892:7: () otherlv_7= 'div'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4892:7: ()
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4893:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicativeExpressionAccess().getDivExpressionLeftOperandAction_1_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_7=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleMultiplicativeExpression11070); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getMultiplicativeExpressionAccess().getDivKeyword_1_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4903:6: ( () otherlv_9= 'mod' )
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4903:6: ( () otherlv_9= 'mod' )
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4903:7: () otherlv_9= 'mod'
            	            {
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4903:7: ()
            	            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4904:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicativeExpressionAccess().getModExpressionLeftOperandAction_1_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_9=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleMultiplicativeExpression11099); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_9, grammarAccess.getMultiplicativeExpressionAccess().getModKeyword_1_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4913:3: ( (lv_rightOperand_10_0= ruleSignumExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4914:1: (lv_rightOperand_10_0= ruleSignumExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4914:1: (lv_rightOperand_10_0= ruleSignumExpression )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4915:3: lv_rightOperand_10_0= ruleSignumExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightOperandSignumExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression11122);
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
            	    break loop60;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4939:1: entryRuleSignumExpression returns [EObject current=null] : iv_ruleSignumExpression= ruleSignumExpression EOF ;
    public final EObject entryRuleSignumExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignumExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4940:2: (iv_ruleSignumExpression= ruleSignumExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4941:2: iv_ruleSignumExpression= ruleSignumExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSignumExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_entryRuleSignumExpression11161);
            iv_ruleSignumExpression=ruleSignumExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSignumExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSignumExpression11171); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4948:1: ruleSignumExpression returns [EObject current=null] : ( ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) ) | ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) ) | this_AccessExpression_6= ruleAccessExpression ) ;
    public final EObject ruleSignumExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_operand_2_0 = null;

        EObject lv_operand_5_0 = null;

        EObject this_AccessExpression_6 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4951:28: ( ( ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) ) | ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) ) | this_AccessExpression_6= ruleAccessExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4952:1: ( ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) ) | ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) ) | this_AccessExpression_6= ruleAccessExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4952:1: ( ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) ) | ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) ) | this_AccessExpression_6= ruleAccessExpression )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt61=1;
                }
                break;
            case 80:
                {
                alt61=2;
                }
                break;
            case RULE_ID:
            case RULE_INTEGER:
            case RULE_DECIMAL:
            case 14:
            case 49:
            case 89:
            case 90:
            case 91:
            case 93:
                {
                alt61=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4952:2: ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4952:2: ( () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4952:3: () ( ( '-' )=>otherlv_1= '-' ) ( (lv_operand_2_0= ruleSignumExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4952:3: ()
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4953:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSignumExpressionAccess().getUnaryMinusExpressionAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4958:2: ( ( '-' )=>otherlv_1= '-' )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4958:3: ( '-' )=>otherlv_1= '-'
                    {
                    otherlv_1=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleSignumExpression11226); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getSignumExpressionAccess().getHyphenMinusKeyword_0_1());
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4963:2: ( (lv_operand_2_0= ruleSignumExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4964:1: (lv_operand_2_0= ruleSignumExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4964:1: (lv_operand_2_0= ruleSignumExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4965:3: lv_operand_2_0= ruleSignumExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignumExpressionAccess().getOperandSignumExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_ruleSignumExpression11248);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4982:6: ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4982:6: ( () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4982:7: () ( ( '+' )=>otherlv_4= '+' ) ( (lv_operand_5_0= ruleSignumExpression ) )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4982:7: ()
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4983:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getSignumExpressionAccess().getUnaryPlusExpressionAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4988:2: ( ( '+' )=>otherlv_4= '+' )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4988:3: ( '+' )=>otherlv_4= '+'
                    {
                    otherlv_4=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleSignumExpression11285); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSignumExpressionAccess().getPlusSignKeyword_1_1());
                          
                    }

                    }

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4993:2: ( (lv_operand_5_0= ruleSignumExpression ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4994:1: (lv_operand_5_0= ruleSignumExpression )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4994:1: (lv_operand_5_0= ruleSignumExpression )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4995:3: lv_operand_5_0= ruleSignumExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSignumExpressionAccess().getOperandSignumExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_ruleSignumExpression11307);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5013:5: this_AccessExpression_6= ruleAccessExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSignumExpressionAccess().getAccessExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAccessExpression_in_ruleSignumExpression11336);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5029:1: entryRuleAccessExpression returns [EObject current=null] : iv_ruleAccessExpression= ruleAccessExpression EOF ;
    public final EObject entryRuleAccessExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAccessExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5030:2: (iv_ruleAccessExpression= ruleAccessExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5031:2: iv_ruleAccessExpression= ruleAccessExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAccessExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAccessExpression_in_entryRuleAccessExpression11371);
            iv_ruleAccessExpression=ruleAccessExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAccessExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAccessExpression11381); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5038:1: ruleAccessExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )* ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5041:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )* ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5042:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )* )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5042:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )* )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5043:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAccessExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleAccessExpression11428);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5051:1: ( ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' ) | ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' ) | ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) ) | ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) ) | ( () otherlv_20= '\\'' ) )*
            loop64:
            do {
                int alt64=6;
                switch ( input.LA(1) ) {
                case 49:
                    {
                    alt64=1;
                    }
                    break;
                case 14:
                    {
                    alt64=2;
                    }
                    break;
                case 85:
                    {
                    alt64=3;
                    }
                    break;
                case 86:
                    {
                    alt64=4;
                    }
                    break;
                case 87:
                    {
                    alt64=5;
                    }
                    break;

                }

                switch (alt64) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5051:2: ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5051:2: ( () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']' )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5051:3: () otherlv_2= '[' ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* ) otherlv_6= ']'
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5051:3: ()
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5052:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getArrayAccessExpressionOperandAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleAccessExpression11450); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAccessExpressionAccess().getLeftSquareBracketKeyword_1_0_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5061:1: ( ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )* )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5061:2: ( (lv_parameters_3_0= ruleExpression ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )*
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5061:2: ( (lv_parameters_3_0= ruleExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5062:1: (lv_parameters_3_0= ruleExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5062:1: (lv_parameters_3_0= ruleExpression )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5063:3: lv_parameters_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAccessExpressionAccess().getParametersExpressionParserRuleCall_1_0_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAccessExpression11472);
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

            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5079:2: (otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) ) )*
            	    loop62:
            	    do {
            	        int alt62=2;
            	        int LA62_0 = input.LA(1);

            	        if ( (LA62_0==15) ) {
            	            alt62=1;
            	        }


            	        switch (alt62) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5079:4: otherlv_4= ',' ( (lv_parameters_5_0= ruleExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAccessExpression11485); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_4, grammarAccess.getAccessExpressionAccess().getCommaKeyword_1_0_2_1_0());
            	    	          
            	    	    }
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5083:1: ( (lv_parameters_5_0= ruleExpression ) )
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5084:1: (lv_parameters_5_0= ruleExpression )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5084:1: (lv_parameters_5_0= ruleExpression )
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5085:3: lv_parameters_5_0= ruleExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAccessExpressionAccess().getParametersExpressionParserRuleCall_1_0_2_1_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAccessExpression11506);
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

            	    otherlv_6=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleAccessExpression11521); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getAccessExpressionAccess().getRightSquareBracketKeyword_1_0_3());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5106:6: ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5106:6: ( () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')' )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5106:7: () otherlv_8= '(' ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* ) otherlv_12= ')'
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5106:7: ()
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5107:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getFunctionAccessExpressionOperandAction_1_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAccessExpression11550); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getAccessExpressionAccess().getLeftParenthesisKeyword_1_1_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5116:1: ( ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )* )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5116:2: ( (lv_parameters_9_0= ruleExpression ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )*
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5116:2: ( (lv_parameters_9_0= ruleExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5117:1: (lv_parameters_9_0= ruleExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5117:1: (lv_parameters_9_0= ruleExpression )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5118:3: lv_parameters_9_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAccessExpressionAccess().getParametersExpressionParserRuleCall_1_1_2_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAccessExpression11572);
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

            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5134:2: (otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) ) )*
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==15) ) {
            	            alt63=1;
            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5134:4: otherlv_10= ',' ( (lv_parameters_11_0= ruleExpression ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAccessExpression11585); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_10, grammarAccess.getAccessExpressionAccess().getCommaKeyword_1_1_2_1_0());
            	    	          
            	    	    }
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5138:1: ( (lv_parameters_11_0= ruleExpression ) )
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5139:1: (lv_parameters_11_0= ruleExpression )
            	    	    {
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5139:1: (lv_parameters_11_0= ruleExpression )
            	    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5140:3: lv_parameters_11_0= ruleExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getAccessExpressionAccess().getParametersExpressionParserRuleCall_1_1_2_1_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleAccessExpression11606);
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

            	    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAccessExpression11621); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getAccessExpressionAccess().getRightParenthesisKeyword_1_1_3());
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5161:6: ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5161:6: ( () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5161:7: () otherlv_14= '.' ( (lv_field_15_0= RULE_ID ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5161:7: ()
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5162:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getRecordAccessExpressionOperandAction_1_2_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_14=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleAccessExpression11650); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getAccessExpressionAccess().getFullStopKeyword_1_2_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5171:1: ( (lv_field_15_0= RULE_ID ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5172:1: (lv_field_15_0= RULE_ID )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5172:1: (lv_field_15_0= RULE_ID )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5173:3: lv_field_15_0= RULE_ID
            	    {
            	    lv_field_15_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAccessExpression11667); if (state.failed) return current;
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
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5190:6: ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5190:6: ( () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5190:7: () otherlv_17= '!' ( (lv_index_18_0= RULE_INTEGER ) )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5190:7: ()
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5191:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getTupleAccessExpressionOperandAction_1_3_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_17=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleAccessExpression11701); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getAccessExpressionAccess().getExclamationMarkKeyword_1_3_1());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5200:1: ( (lv_index_18_0= RULE_INTEGER ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5201:1: (lv_index_18_0= RULE_INTEGER )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5201:1: (lv_index_18_0= RULE_INTEGER )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5202:3: lv_index_18_0= RULE_INTEGER
            	    {
            	    lv_index_18_0=(Token)match(input,RULE_INTEGER,FollowSets000.FOLLOW_RULE_INTEGER_in_ruleAccessExpression11718); if (state.failed) return current;
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
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5219:6: ( () otherlv_20= '\\'' )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5219:6: ( () otherlv_20= '\\'' )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5219:7: () otherlv_20= '\\''
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5219:7: ()
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5220:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAccessExpressionAccess().getPrimedExpressionOperandAction_1_4_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_20=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleAccessExpression11752); if (state.failed) return current;
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


    // $ANTLR start "entryRulePrimaryExpression"
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5237:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5238:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5239:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression11791);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression11801); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5246:1: rulePrimaryExpression returns [EObject current=null] : (this_LiteralExpression_0= ruleLiteralExpression | this_ReferenceExpression_1= ruleReferenceExpression | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_LiteralExpression_0 = null;

        EObject this_ReferenceExpression_1 = null;

        EObject this_Expression_3 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5249:28: ( (this_LiteralExpression_0= ruleLiteralExpression | this_ReferenceExpression_1= ruleReferenceExpression | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5250:1: (this_LiteralExpression_0= ruleLiteralExpression | this_ReferenceExpression_1= ruleReferenceExpression | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5250:1: (this_LiteralExpression_0= ruleLiteralExpression | this_ReferenceExpression_1= ruleReferenceExpression | (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_DECIMAL:
            case 49:
            case 89:
            case 90:
            case 91:
            case 93:
                {
                alt65=1;
                }
                break;
            case RULE_ID:
                {
                alt65=2;
                }
                break;
            case 14:
                {
                alt65=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5251:5: this_LiteralExpression_0= ruleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLiteralExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_rulePrimaryExpression11848);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5261:5: this_ReferenceExpression_1= ruleReferenceExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getReferenceExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleReferenceExpression_in_rulePrimaryExpression11875);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5270:6: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5270:6: (otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')' )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5270:8: otherlv_2= '(' this_Expression_3= ruleExpression otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePrimaryExpression11893); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_rulePrimaryExpression11915);
                    this_Expression_3=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePrimaryExpression11926); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5295:1: entryRuleReferenceExpression returns [EObject current=null] : iv_ruleReferenceExpression= ruleReferenceExpression EOF ;
    public final EObject entryRuleReferenceExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReferenceExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5296:2: (iv_ruleReferenceExpression= ruleReferenceExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5297:2: iv_ruleReferenceExpression= ruleReferenceExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReferenceExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleReferenceExpression_in_entryRuleReferenceExpression11963);
            iv_ruleReferenceExpression=ruleReferenceExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReferenceExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferenceExpression11973); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5304:1: ruleReferenceExpression returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleReferenceExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5307:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5308:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5308:1: ( (otherlv_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5309:1: (otherlv_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5309:1: (otherlv_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5310:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getReferenceExpressionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleReferenceExpression12017); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5329:1: entryRuleLiteralExpression returns [EObject current=null] : iv_ruleLiteralExpression= ruleLiteralExpression EOF ;
    public final EObject entryRuleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5330:2: (iv_ruleLiteralExpression= ruleLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5331:2: iv_ruleLiteralExpression= ruleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression12052);
            iv_ruleLiteralExpression=ruleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralExpression12062); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5338:1: ruleLiteralExpression returns [EObject current=null] : (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5341:28: ( (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5342:1: (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5342:1: (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression )
            int alt66=8;
            alt66 = dfa66.predict(input);
            switch (alt66) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5343:5: this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getIntegerLiteralExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteralExpression_in_ruleLiteralExpression12109);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5353:5: this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getDecimalLiteralExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDecimalLiteralExpression_in_ruleLiteralExpression12136);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5363:5: this_RationalLiteralExpression_2= ruleRationalLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getRationalLiteralExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRationalLiteralExpression_in_ruleLiteralExpression12163);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5373:5: this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getBooleanLiteralExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpression_in_ruleLiteralExpression12190);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5383:5: this_ArrayLiteralExpression_4= ruleArrayLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getArrayLiteralExpressionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleArrayLiteralExpression_in_ruleLiteralExpression12217);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5393:5: this_RecordLiteralExpression_5= ruleRecordLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getRecordLiteralExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRecordLiteralExpression_in_ruleLiteralExpression12244);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5403:5: this_TupleLiteralExpression_6= ruleTupleLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getTupleLiteralExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpression_in_ruleLiteralExpression12271);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5413:5: this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralExpressionAccess().getEnumerationLiteralExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralExpression_in_ruleLiteralExpression12298);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5429:1: entryRuleIntegerLiteralExpression returns [EObject current=null] : iv_ruleIntegerLiteralExpression= ruleIntegerLiteralExpression EOF ;
    public final EObject entryRuleIntegerLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5430:2: (iv_ruleIntegerLiteralExpression= ruleIntegerLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5431:2: iv_ruleIntegerLiteralExpression= ruleIntegerLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleIntegerLiteralExpression_in_entryRuleIntegerLiteralExpression12333);
            iv_ruleIntegerLiteralExpression=ruleIntegerLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIntegerLiteralExpression12343); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5438:1: ruleIntegerLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_INTEGER ) ) ;
    public final EObject ruleIntegerLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5441:28: ( ( (lv_value_0_0= RULE_INTEGER ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5442:1: ( (lv_value_0_0= RULE_INTEGER ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5442:1: ( (lv_value_0_0= RULE_INTEGER ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5443:1: (lv_value_0_0= RULE_INTEGER )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5443:1: (lv_value_0_0= RULE_INTEGER )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5444:3: lv_value_0_0= RULE_INTEGER
            {
            lv_value_0_0=(Token)match(input,RULE_INTEGER,FollowSets000.FOLLOW_RULE_INTEGER_in_ruleIntegerLiteralExpression12384); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5468:1: entryRuleDecimalLiteralExpression returns [EObject current=null] : iv_ruleDecimalLiteralExpression= ruleDecimalLiteralExpression EOF ;
    public final EObject entryRuleDecimalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5469:2: (iv_ruleDecimalLiteralExpression= ruleDecimalLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5470:2: iv_ruleDecimalLiteralExpression= ruleDecimalLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDecimalLiteralExpression_in_entryRuleDecimalLiteralExpression12424);
            iv_ruleDecimalLiteralExpression=ruleDecimalLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDecimalLiteralExpression12434); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5477:1: ruleDecimalLiteralExpression returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5480:28: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5481:1: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5481:1: ( (lv_value_0_0= RULE_DECIMAL ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5482:1: (lv_value_0_0= RULE_DECIMAL )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5482:1: (lv_value_0_0= RULE_DECIMAL )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5483:3: lv_value_0_0= RULE_DECIMAL
            {
            lv_value_0_0=(Token)match(input,RULE_DECIMAL,FollowSets000.FOLLOW_RULE_DECIMAL_in_ruleDecimalLiteralExpression12475); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5507:1: entryRuleRationalLiteralExpression returns [EObject current=null] : iv_ruleRationalLiteralExpression= ruleRationalLiteralExpression EOF ;
    public final EObject entryRuleRationalLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRationalLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5508:2: (iv_ruleRationalLiteralExpression= ruleRationalLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5509:2: iv_ruleRationalLiteralExpression= ruleRationalLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRationalLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRationalLiteralExpression_in_entryRuleRationalLiteralExpression12515);
            iv_ruleRationalLiteralExpression=ruleRationalLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRationalLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRationalLiteralExpression12525); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5516:1: ruleRationalLiteralExpression returns [EObject current=null] : ( ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleRationalLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token lv_numerator_0_0=null;
        Token otherlv_1=null;
        Token lv_denominator_2_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5519:28: ( ( ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5520:1: ( ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5520:1: ( ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5520:2: ( (lv_numerator_0_0= RULE_INTEGER ) ) otherlv_1= '%' ( (lv_denominator_2_0= RULE_INTEGER ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5520:2: ( (lv_numerator_0_0= RULE_INTEGER ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5521:1: (lv_numerator_0_0= RULE_INTEGER )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5521:1: (lv_numerator_0_0= RULE_INTEGER )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5522:3: lv_numerator_0_0= RULE_INTEGER
            {
            lv_numerator_0_0=(Token)match(input,RULE_INTEGER,FollowSets000.FOLLOW_RULE_INTEGER_in_ruleRationalLiteralExpression12567); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleRationalLiteralExpression12584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRationalLiteralExpressionAccess().getPercentSignKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5542:1: ( (lv_denominator_2_0= RULE_INTEGER ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5543:1: (lv_denominator_2_0= RULE_INTEGER )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5543:1: (lv_denominator_2_0= RULE_INTEGER )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5544:3: lv_denominator_2_0= RULE_INTEGER
            {
            lv_denominator_2_0=(Token)match(input,RULE_INTEGER,FollowSets000.FOLLOW_RULE_INTEGER_in_ruleRationalLiteralExpression12601); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5568:1: entryRuleBooleanLiteralExpression returns [EObject current=null] : iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF ;
    public final EObject entryRuleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5569:2: (iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5570:2: iv_ruleBooleanLiteralExpression= ruleBooleanLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBooleanLiteralExpression_in_entryRuleBooleanLiteralExpression12642);
            iv_ruleBooleanLiteralExpression=ruleBooleanLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBooleanLiteralExpression12652); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5577:1: ruleBooleanLiteralExpression returns [EObject current=null] : (this_TrueExpression_0= ruleTrueExpression | this_FalseExpression_1= ruleFalseExpression ) ;
    public final EObject ruleBooleanLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject this_TrueExpression_0 = null;

        EObject this_FalseExpression_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5580:28: ( (this_TrueExpression_0= ruleTrueExpression | this_FalseExpression_1= ruleFalseExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5581:1: (this_TrueExpression_0= ruleTrueExpression | this_FalseExpression_1= ruleFalseExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5581:1: (this_TrueExpression_0= ruleTrueExpression | this_FalseExpression_1= ruleFalseExpression )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==89) ) {
                alt67=1;
            }
            else if ( (LA67_0==90) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5582:5: this_TrueExpression_0= ruleTrueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanLiteralExpressionAccess().getTrueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTrueExpression_in_ruleBooleanLiteralExpression12699);
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
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5592:5: this_FalseExpression_1= ruleFalseExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanLiteralExpressionAccess().getFalseExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleFalseExpression_in_ruleBooleanLiteralExpression12726);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5608:1: entryRuleTrueExpression returns [EObject current=null] : iv_ruleTrueExpression= ruleTrueExpression EOF ;
    public final EObject entryRuleTrueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrueExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5609:2: (iv_ruleTrueExpression= ruleTrueExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5610:2: iv_ruleTrueExpression= ruleTrueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTrueExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTrueExpression_in_entryRuleTrueExpression12761);
            iv_ruleTrueExpression=ruleTrueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTrueExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTrueExpression12771); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5617:1: ruleTrueExpression returns [EObject current=null] : ( () otherlv_1= 'true' ) ;
    public final EObject ruleTrueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5620:28: ( ( () otherlv_1= 'true' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5621:1: ( () otherlv_1= 'true' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5621:1: ( () otherlv_1= 'true' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5621:2: () otherlv_1= 'true'
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5621:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5622:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTrueExpressionAccess().getTrueExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleTrueExpression12817); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5639:1: entryRuleFalseExpression returns [EObject current=null] : iv_ruleFalseExpression= ruleFalseExpression EOF ;
    public final EObject entryRuleFalseExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFalseExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5640:2: (iv_ruleFalseExpression= ruleFalseExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5641:2: iv_ruleFalseExpression= ruleFalseExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFalseExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFalseExpression_in_entryRuleFalseExpression12853);
            iv_ruleFalseExpression=ruleFalseExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFalseExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFalseExpression12863); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5648:1: ruleFalseExpression returns [EObject current=null] : ( () otherlv_1= 'false' ) ;
    public final EObject ruleFalseExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5651:28: ( ( () otherlv_1= 'false' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5652:1: ( () otherlv_1= 'false' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5652:1: ( () otherlv_1= 'false' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5652:2: () otherlv_1= 'false'
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5652:2: ()
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5653:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFalseExpressionAccess().getFalseExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleFalseExpression12909); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5670:1: entryRuleArrayLiteralExpression returns [EObject current=null] : iv_ruleArrayLiteralExpression= ruleArrayLiteralExpression EOF ;
    public final EObject entryRuleArrayLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5671:2: (iv_ruleArrayLiteralExpression= ruleArrayLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5672:2: iv_ruleArrayLiteralExpression= ruleArrayLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleArrayLiteralExpression_in_entryRuleArrayLiteralExpression12945);
            iv_ruleArrayLiteralExpression=ruleArrayLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleArrayLiteralExpression12955); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5679:1: ruleArrayLiteralExpression returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']' ) ;
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
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5682:28: ( (otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5683:1: (otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5683:1: (otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5683:3: otherlv_0= '[' ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )? otherlv_4= '|' ( (lv_operand_5_0= ruleExpression ) ) otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleArrayLiteralExpression12992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getArrayLiteralExpressionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5687:1: ( ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_ID) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5687:2: ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) ) (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )*
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5687:2: ( (lv_parameterDeclarations_1_0= ruleParameterDeclaration ) )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5688:1: (lv_parameterDeclarations_1_0= ruleParameterDeclaration )
                    {
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5688:1: (lv_parameterDeclarations_1_0= ruleParameterDeclaration )
                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5689:3: lv_parameterDeclarations_1_0= ruleParameterDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getArrayLiteralExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleArrayLiteralExpression13014);
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

                    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5705:2: (otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==15) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5705:4: otherlv_2= ',' ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    	    {
                    	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleArrayLiteralExpression13027); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getArrayLiteralExpressionAccess().getCommaKeyword_1_1_0());
                    	          
                    	    }
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5709:1: ( (lv_parameterDeclarations_3_0= ruleParameterDeclaration ) )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5710:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    	    {
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5710:1: (lv_parameterDeclarations_3_0= ruleParameterDeclaration )
                    	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5711:3: lv_parameterDeclarations_3_0= ruleParameterDeclaration
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getArrayLiteralExpressionAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterDeclaration_in_ruleArrayLiteralExpression13048);
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
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleArrayLiteralExpression13064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getArrayLiteralExpressionAccess().getVerticalLineKeyword_2());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5731:1: ( (lv_operand_5_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5732:1: (lv_operand_5_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5732:1: (lv_operand_5_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5733:3: lv_operand_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArrayLiteralExpressionAccess().getOperandExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleArrayLiteralExpression13085);
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

            otherlv_6=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleArrayLiteralExpression13097); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5761:1: entryRuleRecordLiteralExpression returns [EObject current=null] : iv_ruleRecordLiteralExpression= ruleRecordLiteralExpression EOF ;
    public final EObject entryRuleRecordLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5762:2: (iv_ruleRecordLiteralExpression= ruleRecordLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5763:2: iv_ruleRecordLiteralExpression= ruleRecordLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRecordLiteralExpression_in_entryRuleRecordLiteralExpression13133);
            iv_ruleRecordLiteralExpression=ruleRecordLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRecordLiteralExpression13143); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5770:1: ruleRecordLiteralExpression returns [EObject current=null] : (otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)' ) ;
    public final EObject ruleRecordLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fieldAssignments_1_0 = null;

        EObject lv_fieldAssignments_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5773:28: ( (otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5774:1: (otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5774:1: (otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5774:3: otherlv_0= '(#' ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) ) (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )* otherlv_4= '#)'
            {
            otherlv_0=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleRecordLiteralExpression13180); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRecordLiteralExpressionAccess().getLeftParenthesisNumberSignKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5778:1: ( (lv_fieldAssignments_1_0= ruleFieldAssignment ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5779:1: (lv_fieldAssignments_1_0= ruleFieldAssignment )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5779:1: (lv_fieldAssignments_1_0= ruleFieldAssignment )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5780:3: lv_fieldAssignments_1_0= ruleFieldAssignment
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRecordLiteralExpressionAccess().getFieldAssignmentsFieldAssignmentParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldAssignment_in_ruleRecordLiteralExpression13201);
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

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5796:2: (otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==15) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5796:4: otherlv_2= ',' ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRecordLiteralExpression13214); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getRecordLiteralExpressionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5800:1: ( (lv_fieldAssignments_3_0= ruleFieldAssignment ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5801:1: (lv_fieldAssignments_3_0= ruleFieldAssignment )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5801:1: (lv_fieldAssignments_3_0= ruleFieldAssignment )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5802:3: lv_fieldAssignments_3_0= ruleFieldAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRecordLiteralExpressionAccess().getFieldAssignmentsFieldAssignmentParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFieldAssignment_in_ruleRecordLiteralExpression13235);
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
            	    break loop70;
                }
            } while (true);

            otherlv_4=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleRecordLiteralExpression13249); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5830:1: entryRuleFieldAssignment returns [EObject current=null] : iv_ruleFieldAssignment= ruleFieldAssignment EOF ;
    public final EObject entryRuleFieldAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldAssignment = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5831:2: (iv_ruleFieldAssignment= ruleFieldAssignment EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5832:2: iv_ruleFieldAssignment= ruleFieldAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFieldAssignmentRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFieldAssignment_in_entryRuleFieldAssignment13285);
            iv_ruleFieldAssignment=ruleFieldAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFieldAssignment; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFieldAssignment13295); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5839:1: ruleFieldAssignment returns [EObject current=null] : ( ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleFieldAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_reference_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5842:28: ( ( ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5843:1: ( ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5843:1: ( ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5843:2: ( (lv_reference_0_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5843:2: ( (lv_reference_0_0= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5844:1: (lv_reference_0_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5844:1: (lv_reference_0_0= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5845:3: lv_reference_0_0= RULE_ID
            {
            lv_reference_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleFieldAssignment13337); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleFieldAssignment13354); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFieldAssignmentAccess().getColonEqualsSignKeyword_1());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5865:1: ( (lv_value_2_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5866:1: (lv_value_2_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5866:1: (lv_value_2_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5867:3: lv_value_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFieldAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleFieldAssignment13375);
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5891:1: entryRuleTupleLiteralExpression returns [EObject current=null] : iv_ruleTupleLiteralExpression= ruleTupleLiteralExpression EOF ;
    public final EObject entryRuleTupleLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5892:2: (iv_ruleTupleLiteralExpression= ruleTupleLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5893:2: iv_ruleTupleLiteralExpression= ruleTupleLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTupleLiteralExpression_in_entryRuleTupleLiteralExpression13411);
            iv_ruleTupleLiteralExpression=ruleTupleLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTupleLiteralExpression13421); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5900:1: ruleTupleLiteralExpression returns [EObject current=null] : (otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)' ) ;
    public final EObject ruleTupleLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expressions_1_0 = null;

        EObject lv_expressions_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5903:28: ( (otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)' ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5904:1: (otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)' )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5904:1: (otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)' )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5904:3: otherlv_0= '(#' ( (lv_expressions_1_0= ruleExpression ) ) (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )* otherlv_4= '#)'
            {
            otherlv_0=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleTupleLiteralExpression13458); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleLiteralExpressionAccess().getLeftParenthesisNumberSignKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5908:1: ( (lv_expressions_1_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5909:1: (lv_expressions_1_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5909:1: (lv_expressions_1_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5910:3: lv_expressions_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleLiteralExpressionAccess().getExpressionsExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTupleLiteralExpression13479);
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

            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5926:2: (otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==15) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5926:4: otherlv_2= ',' ( (lv_expressions_3_0= ruleExpression ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTupleLiteralExpression13492); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTupleLiteralExpressionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5930:1: ( (lv_expressions_3_0= ruleExpression ) )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5931:1: (lv_expressions_3_0= ruleExpression )
            	    {
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5931:1: (lv_expressions_3_0= ruleExpression )
            	    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5932:3: lv_expressions_3_0= ruleExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleLiteralExpressionAccess().getExpressionsExpressionParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleTupleLiteralExpression13513);
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
            	    break loop71;
                }
            } while (true);

            otherlv_4=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleTupleLiteralExpression13527); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5960:1: entryRuleEnumerationLiteralExpression returns [EObject current=null] : iv_ruleEnumerationLiteralExpression= ruleEnumerationLiteralExpression EOF ;
    public final EObject entryRuleEnumerationLiteralExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteralExpression = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5961:2: (iv_ruleEnumerationLiteralExpression= ruleEnumerationLiteralExpression EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5962:2: iv_ruleEnumerationLiteralExpression= ruleEnumerationLiteralExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationLiteralExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumerationLiteralExpression_in_entryRuleEnumerationLiteralExpression13563);
            iv_ruleEnumerationLiteralExpression=ruleEnumerationLiteralExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumerationLiteralExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumerationLiteralExpression13573); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5969:1: ruleEnumerationLiteralExpression returns [EObject current=null] : (otherlv_0= '::' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleEnumerationLiteralExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5972:28: ( (otherlv_0= '::' ( (otherlv_1= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5973:1: (otherlv_0= '::' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5973:1: (otherlv_0= '::' ( (otherlv_1= RULE_ID ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5973:3: otherlv_0= '::' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleEnumerationLiteralExpression13610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumerationLiteralExpressionAccess().getColonColonKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5977:1: ( (otherlv_1= RULE_ID ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5978:1: (otherlv_1= RULE_ID )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5978:1: (otherlv_1= RULE_ID )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5979:3: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationLiteralExpressionRule());
              	        }
                      
            }
            otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumerationLiteralExpression13630); if (state.failed) return current;
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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5998:1: entryRuleBasicConstraintDefinition returns [EObject current=null] : iv_ruleBasicConstraintDefinition= ruleBasicConstraintDefinition EOF ;
    public final EObject entryRuleBasicConstraintDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicConstraintDefinition = null;


        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:5999:2: (iv_ruleBasicConstraintDefinition= ruleBasicConstraintDefinition EOF )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:6000:2: iv_ruleBasicConstraintDefinition= ruleBasicConstraintDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicConstraintDefinitionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleBasicConstraintDefinition_in_entryRuleBasicConstraintDefinition13666);
            iv_ruleBasicConstraintDefinition=ruleBasicConstraintDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicConstraintDefinition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBasicConstraintDefinition13676); if (state.failed) return current;

            }

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
    // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:6007:1: ruleBasicConstraintDefinition returns [EObject current=null] : (otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleBasicConstraintDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expression_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:6010:28: ( (otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:6011:1: (otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:6011:1: (otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:6011:3: otherlv_0= 'constraint' ( (lv_expression_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleBasicConstraintDefinition13713); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBasicConstraintDefinitionAccess().getConstraintKeyword_0());
                  
            }
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:6015:1: ( (lv_expression_1_0= ruleExpression ) )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:6016:1: (lv_expression_1_0= ruleExpression )
            {
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:6016:1: (lv_expression_1_0= ruleExpression )
            // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:6017:3: lv_expression_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBasicConstraintDefinitionAccess().getExpressionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleExpression_in_ruleBasicConstraintDefinition13734);
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

    // $ANTLR start synpred13_InternalTTMCSystemLanguage
    public final void synpred13_InternalTTMCSystemLanguage_fragment() throws RecognitionException {   
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4761:3: ( ( '+' ( ( ruleMultiplicativeExpression ) ) ) )
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4761:4: ( '+' ( ( ruleMultiplicativeExpression ) ) )
        {
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4761:4: ( '+' ( ( ruleMultiplicativeExpression ) ) )
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4761:6: '+' ( ( ruleMultiplicativeExpression ) )
        {
        match(input,80,FollowSets000.FOLLOW_80_in_synpred13_InternalTTMCSystemLanguage10755); if (state.failed) return ;
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4762:1: ( ( ruleMultiplicativeExpression ) )
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4763:1: ( ruleMultiplicativeExpression )
        {
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4763:1: ( ruleMultiplicativeExpression )
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4764:1: ruleMultiplicativeExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleMultiplicativeExpression_in_synpred13_InternalTTMCSystemLanguage10762);
        ruleMultiplicativeExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred13_InternalTTMCSystemLanguage

    // $ANTLR start synpred14_InternalTTMCSystemLanguage
    public final void synpred14_InternalTTMCSystemLanguage_fragment() throws RecognitionException {   
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4853:3: ( ( '*' ( ( ruleSignumExpression ) ) ) )
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4853:4: ( '*' ( ( ruleSignumExpression ) ) )
        {
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4853:4: ( '*' ( ( ruleSignumExpression ) ) )
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4853:6: '*' ( ( ruleSignumExpression ) )
        {
        match(input,81,FollowSets000.FOLLOW_81_in_synpred14_InternalTTMCSystemLanguage10967); if (state.failed) return ;
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4854:1: ( ( ruleSignumExpression ) )
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4855:1: ( ruleSignumExpression )
        {
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4855:1: ( ruleSignumExpression )
        // ../hu.bme.mit.inf.ttmc.system.language/src-gen/hu/bme/mit/inf/ttmc/system/language/parser/antlr/internal/InternalTTMCSystemLanguage.g:4856:1: ruleSignumExpression
        {
        pushFollow(FollowSets000.FOLLOW_ruleSignumExpression_in_synpred14_InternalTTMCSystemLanguage10974);
        ruleSignumExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred14_InternalTTMCSystemLanguage

    // Delegated rules

    public final boolean synpred14_InternalTTMCSystemLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalTTMCSystemLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalTTMCSystemLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalTTMCSystemLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA44 dfa44 = new DFA44(this);
    protected DFA66 dfa66 = new DFA66(this);
    static final String DFA44_eotS =
        "\14\uffff";
    static final String DFA44_eofS =
        "\14\uffff";
    static final String DFA44_minS =
        "\1\4\13\uffff";
    static final String DFA44_maxS =
        "\1\135\13\uffff";
    static final String DFA44_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13";
    static final String DFA44_specialS =
        "\14\uffff}>";
    static final String[] DFA44_transitionS = {
            "\3\13\7\uffff\1\13\27\uffff\1\4\12\uffff\2\13\15\uffff\1\1"+
            "\1\2\1\3\1\5\1\6\1\7\1\10\1\11\1\12\7\uffff\1\13\10\uffff\3"+
            "\13\1\uffff\1\13",
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

    static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
    static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
    static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
    static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
    static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
    static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
    static final short[][] DFA44_transition;

    static {
        int numStates = DFA44_transitionS.length;
        DFA44_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
        }
    }

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = DFA44_eot;
            this.eof = DFA44_eof;
            this.min = DFA44_min;
            this.max = DFA44_max;
            this.accept = DFA44_accept;
            this.special = DFA44_special;
            this.transition = DFA44_transition;
        }
        public String getDescription() {
            return "3651:1: (this_NotExpression_0= ruleNotExpression | this_ForallExpression_1= ruleForallExpression | this_ExistsExpression_2= ruleExistsExpression | this_FunctionLiteralExpression_3= ruleFunctionLiteralExpression | this_GloballyExpression_4= ruleGloballyExpression | this_FinallyExpression_5= ruleFinallyExpression | this_NextExpression_6= ruleNextExpression | this_TemporalForallExpression_7= ruleTemporalForallExpression | this_TemporalExistsExpression_8= ruleTemporalExistsExpression | this_LetExpression_9= ruleLetExpression | this_InExpression_10= ruleInExpression )";
        }
    }
    static final String DFA66_eotS =
        "\14\uffff";
    static final String DFA66_eofS =
        "\1\uffff\1\7\12\uffff";
    static final String DFA66_minS =
        "\1\5\1\16\3\uffff\1\4\3\uffff\1\16\2\uffff";
    static final String DFA66_maxS =
        "\1\135\1\136\3\uffff\1\135\3\uffff\1\134\2\uffff";
    static final String DFA66_acceptS =
        "\2\uffff\1\2\1\4\1\5\1\uffff\1\10\1\1\1\3\1\uffff\1\7\1\6";
    static final String DFA66_specialS =
        "\14\uffff}>";
    static final String[] DFA66_transitionS = {
            "\1\1\1\2\52\uffff\1\4\47\uffff\2\3\1\5\1\uffff\1\6",
            "\3\7\1\uffff\2\7\6\uffff\2\7\1\uffff\7\7\1\uffff\3\7\11\uffff"+
            "\2\7\1\uffff\2\7\2\uffff\10\7\11\uffff\17\7\1\10\3\uffff\1\7"+
            "\1\uffff\1\7",
            "",
            "",
            "",
            "\1\11\2\12\7\uffff\1\12\27\uffff\1\12\12\uffff\2\12\4\uffff"+
            "\1\12\10\uffff\11\12\7\uffff\1\12\10\uffff\3\12\1\uffff\1\12",
            "",
            "",
            "",
            "\2\12\4\uffff\1\13\34\uffff\2\12\7\uffff\6\12\11\uffff\17"+
            "\12\4\uffff\1\12",
            "",
            ""
    };

    static final short[] DFA66_eot = DFA.unpackEncodedString(DFA66_eotS);
    static final short[] DFA66_eof = DFA.unpackEncodedString(DFA66_eofS);
    static final char[] DFA66_min = DFA.unpackEncodedStringToUnsignedChars(DFA66_minS);
    static final char[] DFA66_max = DFA.unpackEncodedStringToUnsignedChars(DFA66_maxS);
    static final short[] DFA66_accept = DFA.unpackEncodedString(DFA66_acceptS);
    static final short[] DFA66_special = DFA.unpackEncodedString(DFA66_specialS);
    static final short[][] DFA66_transition;

    static {
        int numStates = DFA66_transitionS.length;
        DFA66_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA66_transition[i] = DFA.unpackEncodedString(DFA66_transitionS[i]);
        }
    }

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = DFA66_eot;
            this.eof = DFA66_eof;
            this.min = DFA66_min;
            this.max = DFA66_max;
            this.accept = DFA66_accept;
            this.special = DFA66_special;
            this.transition = DFA66_transition;
        }
        public String getDescription() {
            return "5342:1: (this_IntegerLiteralExpression_0= ruleIntegerLiteralExpression | this_DecimalLiteralExpression_1= ruleDecimalLiteralExpression | this_RationalLiteralExpression_2= ruleRationalLiteralExpression | this_BooleanLiteralExpression_3= ruleBooleanLiteralExpression | this_ArrayLiteralExpression_4= ruleArrayLiteralExpression | this_RecordLiteralExpression_5= ruleRecordLiteralExpression | this_TupleLiteralExpression_6= ruleTupleLiteralExpression | this_EnumerationLiteralExpression_7= ruleEnumerationLiteralExpression )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleSystemSpecification_in_entryRuleSystemSpecification75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSystemSpecification85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_ruleSystemSpecification122 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSystemSpecification139 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleSystemSpecification157 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleSystemSpecification179 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSystemSpecification192 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleSystemSpecification213 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSystemSpecification229 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleSystemSpecification243 = new BitSet(new long[]{0x000000E8000C0000L,0x0000000040000000L});
        public static final BitSet FOLLOW_ruleTypeDeclaration_in_ruleSystemSpecification265 = new BitSet(new long[]{0x000000E8000C0000L,0x0000000040000000L});
        public static final BitSet FOLLOW_ruleFunctionDeclaration_in_ruleSystemSpecification292 = new BitSet(new long[]{0x000000E8000C0000L,0x0000000040000000L});
        public static final BitSet FOLLOW_ruleConstantDeclaration_in_ruleSystemSpecification319 = new BitSet(new long[]{0x000000E8000C0000L,0x0000000040000000L});
        public static final BitSet FOLLOW_ruleBasicConstraintDefinition_in_ruleSystemSpecification346 = new BitSet(new long[]{0x000000E8000C0000L,0x0000000040000000L});
        public static final BitSet FOLLOW_ruleSystemDeclaration_in_ruleSystemSpecification373 = new BitSet(new long[]{0x000000E8000C0000L,0x0000000040000000L});
        public static final BitSet FOLLOW_rulePropertyDeclaration_in_ruleSystemSpecification400 = new BitSet(new long[]{0x000000E8000C0000L,0x0000000040000000L});
        public static final BitSet FOLLOW_18_in_ruleSystemSpecification414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSystemDeclaration_in_entryRuleSystemDeclaration450 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSystemDeclaration460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleSystemDeclaration497 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSystemDeclaration514 = new BitSet(new long[]{0x0000000000104000L});
        public static final BitSet FOLLOW_14_in_ruleSystemDeclaration532 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleSystemDeclaration554 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSystemDeclaration567 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleSystemDeclaration588 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSystemDeclaration604 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleSystemDeclaration618 = new BitSet(new long[]{0x0000000002824010L});
        public static final BitSet FOLLOW_ruleSystem_in_ruleSystemDeclaration639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSystem685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsynchronousCompositeSystem_in_ruleSystem731 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsynchronousCompositeSystem_in_entryRuleAsynchronousCompositeSystem765 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsynchronousCompositeSystem775 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSynchronousCompositeSystem_in_ruleAsynchronousCompositeSystem822 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleAsynchronousCompositeSystem843 = new BitSet(new long[]{0x0000000002824010L});
        public static final BitSet FOLLOW_ruleSynchronousCompositeSystem_in_ruleAsynchronousCompositeSystem864 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_ruleSynchronousCompositeSystem_in_entryRuleSynchronousCompositeSystem902 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSynchronousCompositeSystem912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiSystem_in_ruleSynchronousCompositeSystem959 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_22_in_ruleSynchronousCompositeSystem980 = new BitSet(new long[]{0x0000000002824010L});
        public static final BitSet FOLLOW_ruleMultiSystem_in_ruleSynchronousCompositeSystem1001 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleMultiSystem_in_entryRuleMultiSystem1039 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiSystem1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSynchronousMultiSystem_in_ruleMultiSystem1096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsynchronousMultiSystem_in_ruleMultiSystem1123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimarySystem_in_ruleMultiSystem1150 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSynchronousMultiSystem_in_entryRuleSynchronousMultiSystem1185 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSynchronousMultiSystem1195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleSynchronousMultiSystem1249 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSynchronousMultiSystem1262 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleSynchronousMultiSystem1283 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSynchronousMultiSystem1296 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleSynchronousMultiSystem1317 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSynchronousMultiSystem1331 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleSynchronousMultiSystem1343 = new BitSet(new long[]{0x0000000002824010L});
        public static final BitSet FOLLOW_ruleMultiSystem_in_ruleSynchronousMultiSystem1364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAsynchronousMultiSystem_in_entryRuleAsynchronousMultiSystem1400 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAsynchronousMultiSystem1410 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleAsynchronousMultiSystem1464 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleAsynchronousMultiSystem1477 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleAsynchronousMultiSystem1498 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleAsynchronousMultiSystem1511 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleAsynchronousMultiSystem1532 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleAsynchronousMultiSystem1546 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleAsynchronousMultiSystem1558 = new BitSet(new long[]{0x0000000002824010L});
        public static final BitSet FOLLOW_ruleMultiSystem_in_ruleAsynchronousMultiSystem1579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimarySystem_in_entryRulePrimarySystem1615 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimarySystem1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSystemReference_in_rulePrimarySystem1672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSystemDefinition_in_rulePrimarySystem1699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rulePrimarySystem1717 = new BitSet(new long[]{0x0000000002824010L});
        public static final BitSet FOLLOW_ruleSystem_in_rulePrimarySystem1739 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePrimarySystem1750 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSystemReference_in_entryRuleSystemReference1787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSystemReference1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSystemReference1851 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleSystemReference1864 = new BitSet(new long[]{0x0086004000014070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSystemReference1886 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleSystemReference1899 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSystemReference1920 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleSystemReference1936 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSystemDefinition_in_entryRuleSystemDefinition1974 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSystemDefinition1984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleSystemDefinition2030 = new BitSet(new long[]{0x00000007EC040000L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_ruleSystemDefinition2052 = new BitSet(new long[]{0x00000007EC040000L});
        public static final BitSet FOLLOW_ruleDefinitionDeclaration_in_ruleSystemDefinition2079 = new BitSet(new long[]{0x00000007EC040000L});
        public static final BitSet FOLLOW_ruleSystemConstraintDefinition_in_ruleSystemDefinition2106 = new BitSet(new long[]{0x00000007EC040000L});
        public static final BitSet FOLLOW_18_in_ruleSystemDefinition2120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefinitionDeclaration_in_entryRuleDefinitionDeclaration2156 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionDeclaration2166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleDefinitionDeclaration2203 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDefinitionDeclaration2220 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleDefinitionDeclaration2237 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleDefinitionDeclaration2258 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleDefinitionDeclaration2270 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleDefinitionDeclaration2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVariableDeclaration_in_entryRuleVariableDeclaration2327 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVariableDeclaration2337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableDeclaration_in_ruleVariableDeclaration2384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGlobalVariableDeclaration_in_ruleVariableDeclaration2411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputVariableDeclaration_in_ruleVariableDeclaration2438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputVariableDeclaration_in_ruleVariableDeclaration2465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLocalVariableDeclaration_in_entryRuleLocalVariableDeclaration2500 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLocalVariableDeclaration2510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleLocalVariableDeclaration2547 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleLocalVariableDeclaration2559 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVariableDeclaration2576 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleLocalVariableDeclaration2593 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleLocalVariableDeclaration2614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGlobalVariableDeclaration_in_entryRuleGlobalVariableDeclaration2650 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGlobalVariableDeclaration2660 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleGlobalVariableDeclaration2697 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleGlobalVariableDeclaration2709 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalVariableDeclaration2726 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleGlobalVariableDeclaration2743 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleGlobalVariableDeclaration2764 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInputVariableDeclaration_in_entryRuleInputVariableDeclaration2800 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInputVariableDeclaration2810 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleInputVariableDeclaration2847 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleInputVariableDeclaration2859 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleInputVariableDeclaration2876 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleInputVariableDeclaration2893 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleInputVariableDeclaration2914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOutputVariableDeclaration_in_entryRuleOutputVariableDeclaration2950 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOutputVariableDeclaration2960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleOutputVariableDeclaration2997 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_28_in_ruleOutputVariableDeclaration3009 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleOutputVariableDeclaration3026 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleOutputVariableDeclaration3043 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleOutputVariableDeclaration3064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSystemConstraintDefinition_in_entryRuleSystemConstraintDefinition3100 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSystemConstraintDefinition3110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariantConstraintDefinition_in_ruleSystemConstraintDefinition3157 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitialConstraintDefinition_in_ruleSystemConstraintDefinition3184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionConstraintDefinition_in_ruleSystemConstraintDefinition3211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInvariantConstraintDefinition_in_entryRuleInvariantConstraintDefinition3246 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInvariantConstraintDefinition3256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleInvariantConstraintDefinition3293 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleInvariantConstraintDefinition3314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInitialConstraintDefinition_in_entryRuleInitialConstraintDefinition3350 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInitialConstraintDefinition3360 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleInitialConstraintDefinition3397 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleInitialConstraintDefinition3418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionConstraintDefinition_in_entryRuleTransitionConstraintDefinition3454 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransitionConstraintDefinition3464 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleTransitionConstraintDefinition3501 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTransitionConstraintDefinition3522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePropertyDeclaration_in_entryRulePropertyDeclaration3558 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePropertyDeclaration3568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rulePropertyDeclaration3605 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_rulePropertyDeclaration3622 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_rulePropertyDeclaration3639 = new BitSet(new long[]{0x0000000002824010L});
        public static final BitSet FOLLOW_ruleSystem_in_rulePropertyDeclaration3660 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_36_in_rulePropertyDeclaration3672 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_rulePropertyDeclaration3693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_entryRuleParameterDeclaration3731 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterDeclaration3741 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleParameterDeclaration3792 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleParameterDeclaration3809 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleParameterDeclaration3830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldDeclaration_in_entryRuleFieldDeclaration3866 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldDeclaration3876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFieldDeclaration3927 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFieldDeclaration3944 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleFieldDeclaration3965 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetDeclaration_in_entryRuleLetDeclaration4001 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetDeclaration4011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLetDeclaration4062 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleLetDeclaration4079 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleLetDeclaration4100 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleLetDeclaration4112 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleLetDeclaration4133 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstantDeclaration_in_entryRuleConstantDeclaration4169 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstantDeclaration4179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleConstantDeclaration4216 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstantDeclaration4233 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleConstantDeclaration4250 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleConstantDeclaration4271 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleConstantDeclaration4284 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleConstantDeclaration4305 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionDeclaration_in_entryRuleFunctionDeclaration4343 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDeclaration4353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleFunctionDeclaration4390 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFunctionDeclaration4407 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_ruleFunctionDeclaration4425 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration4447 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFunctionDeclaration4460 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionDeclaration4481 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionDeclaration4497 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFunctionDeclaration4511 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleFunctionDeclaration4532 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_20_in_ruleFunctionDeclaration4545 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleFunctionDeclaration4566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType4604 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType4614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReference_in_ruleType4661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleType4688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDeclaration_in_entryRuleTypeDeclaration4723 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeDeclaration4733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleTypeDeclaration4770 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeDeclaration4787 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleTypeDeclaration4804 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleTypeDeclaration4825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeReference_in_entryRuleTypeReference4861 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeReference4871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTypeReference4915 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition4950 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition4960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNaturalTypeDefinition_in_ruleTypeDefinition5007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerTypeDefinition_in_ruleTypeDefinition5034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanTypeDefinition_in_ruleTypeDefinition5061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRealTypeDefinition_in_ruleTypeDefinition5088 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayTypeDefinition_in_ruleTypeDefinition5115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationTypeDefinition_in_ruleTypeDefinition5142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordTypeDefinition_in_ruleTypeDefinition5169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeDefinition_in_ruleTypeDefinition5196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangeTypeDefinition_in_ruleTypeDefinition5223 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubTypeDefinition_in_ruleTypeDefinition5250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionTypeDefinition_in_ruleTypeDefinition5277 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNaturalTypeDefinition_in_entryRuleNaturalTypeDefinition5312 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNaturalTypeDefinition5322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleNaturalTypeDefinition5368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerTypeDefinition_in_entryRuleIntegerTypeDefinition5404 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerTypeDefinition5414 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleIntegerTypeDefinition5460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanTypeDefinition_in_entryRuleBooleanTypeDefinition5496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanTypeDefinition5506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleBooleanTypeDefinition5552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRealTypeDefinition_in_entryRuleRealTypeDefinition5588 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRealTypeDefinition5598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleRealTypeDefinition5644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayTypeDefinition_in_entryRuleArrayTypeDefinition5680 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayTypeDefinition5690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleArrayTypeDefinition5727 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleArrayTypeDefinition5748 = new BitSet(new long[]{0x0000200000008000L});
        public static final BitSet FOLLOW_15_in_ruleArrayTypeDefinition5761 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleArrayTypeDefinition5782 = new BitSet(new long[]{0x0000200000008000L});
        public static final BitSet FOLLOW_45_in_ruleArrayTypeDefinition5796 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleArrayTypeDefinition5817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationTypeDefinition_in_entryRuleEnumerationTypeDefinition5853 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationTypeDefinition5863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleEnumerationTypeDefinition5900 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleEnumerationTypeDefinition5912 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralDefinition_in_ruleEnumerationTypeDefinition5933 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_15_in_ruleEnumerationTypeDefinition5946 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralDefinition_in_ruleEnumerationTypeDefinition5967 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleEnumerationTypeDefinition5981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralDefinition_in_entryRuleEnumerationLiteralDefinition6017 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteralDefinition6027 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteralDefinition6068 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordTypeDefinition_in_entryRuleRecordTypeDefinition6108 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecordTypeDefinition6118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleRecordTypeDefinition6155 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleRecordTypeDefinition6167 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFieldDeclaration_in_ruleRecordTypeDefinition6188 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_15_in_ruleRecordTypeDefinition6201 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFieldDeclaration_in_ruleRecordTypeDefinition6222 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleRecordTypeDefinition6236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleTypeDefinition_in_entryRuleTupleTypeDefinition6272 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleTypeDefinition6282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleTupleTypeDefinition6319 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTupleTypeDefinition6331 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleTupleTypeDefinition6352 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_15_in_ruleTupleTypeDefinition6365 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleTupleTypeDefinition6386 = new BitSet(new long[]{0x0000000000048000L});
        public static final BitSet FOLLOW_18_in_ruleTupleTypeDefinition6400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubrangeTypeDefinition_in_entryRuleSubrangeTypeDefinition6436 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubrangeTypeDefinition6446 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleSubrangeTypeDefinition6492 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_50_in_ruleSubrangeTypeDefinition6506 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_51_in_ruleSubrangeTypeDefinition6518 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSubrangeTypeDefinition6546 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_52_in_ruleSubrangeTypeDefinition6559 = new BitSet(new long[]{0x008E004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_51_in_ruleSubrangeTypeDefinition6572 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSubrangeTypeDefinition6599 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleSubrangeTypeDefinition6612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubTypeDefinition_in_entryRuleSubTypeDefinition6648 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubTypeDefinition6658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleSubTypeDefinition6695 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleSubTypeDefinition6716 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_54_in_ruleSubTypeDefinition6728 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleSubTypeDefinition6749 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleSubTypeDefinition6761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionTypeDefinition_in_entryRuleFunctionTypeDefinition6797 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionTypeDefinition6807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleFunctionTypeDefinition6844 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFunctionTypeDefinition6856 = new BitSet(new long[]{0x0003DF4000030010L});
        public static final BitSet FOLLOW_ruleType_in_ruleFunctionTypeDefinition6878 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFunctionTypeDefinition6891 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleFunctionTypeDefinition6912 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionTypeDefinition6928 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFunctionTypeDefinition6940 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleFunctionTypeDefinition6961 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression6997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExpression7007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElseExpression_in_ruleExpression7053 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIfThenElseExpression_in_entryRuleIfThenElseExpression7087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIfThenElseExpression7097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_55_in_ruleIfThenElseExpression7144 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElseExpression7165 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_56_in_ruleIfThenElseExpression7177 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElseExpression7198 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_57_in_ruleIfThenElseExpression7219 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleIfThenElseExpression7241 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleIfThenElseExpression7271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEqualExpression_in_entryRuleEqualExpression7306 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEqualExpression7316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplyExpression_in_ruleEqualExpression7363 = new BitSet(new long[]{0x0400000000000002L});
        public static final BitSet FOLLOW_58_in_ruleEqualExpression7384 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleEqualExpression_in_ruleEqualExpression7405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplyExpression_in_entryRuleImplyExpression7443 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplyExpression7453 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_ruleImplyExpression7500 = new BitSet(new long[]{0x0800000000000002L});
        public static final BitSet FOLLOW_59_in_ruleImplyExpression7521 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleImplyExpression_in_ruleImplyExpression7542 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOrExpression_in_entryRuleOrExpression7580 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOrExpression7590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression7637 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleOrExpression7659 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleAndExpression_in_ruleOrExpression7680 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_ruleAndExpression_in_entryRuleAndExpression7720 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAndExpression7730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReleaseExpression_in_ruleAndExpression7777 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleAndExpression7799 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleReleaseExpression_in_ruleAndExpression7820 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_ruleReleaseExpression_in_entryRuleReleaseExpression7860 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReleaseExpression7870 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUntilExpression_in_ruleReleaseExpression7917 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleReleaseExpression7938 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleUntilExpression_in_ruleReleaseExpression7959 = new BitSet(new long[]{0x4000000000000002L});
        public static final BitSet FOLLOW_ruleUntilExpression_in_entryRuleUntilExpression7997 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUntilExpression8007 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleUntilExpression8054 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleUntilExpression8075 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleUntilExpression8096 = new BitSet(new long[]{0x8000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_entryRuleUnaryLogicExpression8134 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleUnaryLogicExpression8144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_ruleUnaryLogicExpression8191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForallExpression_in_ruleUnaryLogicExpression8218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExistsExpression_in_ruleUnaryLogicExpression8245 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionLiteralExpression_in_ruleUnaryLogicExpression8272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGloballyExpression_in_ruleUnaryLogicExpression8299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinallyExpression_in_ruleUnaryLogicExpression8326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextExpression_in_ruleUnaryLogicExpression8353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalForallExpression_in_ruleUnaryLogicExpression8380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalExistsExpression_in_ruleUnaryLogicExpression8407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpression_in_ruleUnaryLogicExpression8434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInExpression_in_ruleUnaryLogicExpression8461 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNotExpression_in_entryRuleNotExpression8496 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNotExpression8506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleNotExpression8560 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleNotExpression8582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForallExpression_in_entryRuleForallExpression8618 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForallExpression8628 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleForallExpression8682 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleForallExpression8695 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleForallExpression8717 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleForallExpression8730 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleForallExpression8751 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleForallExpression8767 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleForallExpression8779 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleForallExpression8800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExistsExpression_in_entryRuleExistsExpression8836 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExistsExpression8846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_66_in_ruleExistsExpression8900 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleExistsExpression8913 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleExistsExpression8935 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleExistsExpression8948 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleExistsExpression8969 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleExistsExpression8985 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleExistsExpression8997 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleExistsExpression9018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFunctionLiteralExpression_in_entryRuleFunctionLiteralExpression9054 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFunctionLiteralExpression9064 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleFunctionLiteralExpression9118 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleFunctionLiteralExpression9131 = new BitSet(new long[]{0x0000000000010010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionLiteralExpression9153 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleFunctionLiteralExpression9166 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleFunctionLiteralExpression9187 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleFunctionLiteralExpression9203 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleFunctionLiteralExpression9215 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleFunctionLiteralExpression9236 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFunctionLiteralExpression9248 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleFunctionLiteralExpression9269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGloballyExpression_in_entryRuleGloballyExpression9305 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGloballyExpression9315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_67_in_ruleGloballyExpression9369 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleGloballyExpression9391 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFinallyExpression_in_entryRuleFinallyExpression9427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFinallyExpression9437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_68_in_ruleFinallyExpression9491 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleFinallyExpression9513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleNextExpression_in_entryRuleNextExpression9549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleNextExpression9559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_69_in_ruleNextExpression9613 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleNextExpression9635 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalForallExpression_in_entryRuleTemporalForallExpression9671 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemporalForallExpression9681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_70_in_ruleTemporalForallExpression9735 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleTemporalForallExpression9757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporalExistsExpression_in_entryRuleTemporalExistsExpression9793 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemporalExistsExpression9803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_71_in_ruleTemporalExistsExpression9857 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleTemporalExistsExpression9879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLetExpression_in_entryRuleLetExpression9915 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLetExpression9925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleLetExpression9971 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleLetExpression9983 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleLetDeclaration_in_ruleLetExpression10004 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleLetExpression10017 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleLetDeclaration_in_ruleLetExpression10038 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleLetExpression10052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_73_in_ruleLetExpression10064 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleUnaryLogicExpression_in_ruleLetExpression10085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInExpression_in_entryRuleInExpression10121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInExpression10131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquivalenceExpression_in_ruleInExpression10178 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
        public static final BitSet FOLLOW_73_in_ruleInExpression10199 = new BitSet(new long[]{0x0003DF4000020010L});
        public static final BitSet FOLLOW_ruleType_in_ruleInExpression10220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEquivalenceExpression_in_entryRuleEquivalenceExpression10258 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEquivalenceExpression10268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression10315 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000C00L});
        public static final BitSet FOLLOW_74_in_ruleEquivalenceExpression10337 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression10358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleEquivalenceExpression10387 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleComparisionExpression_in_ruleEquivalenceExpression10408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparisionExpression_in_entryRuleComparisionExpression10447 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparisionExpression10457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleComparisionExpression10504 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
        public static final BitSet FOLLOW_76_in_ruleComparisionExpression10527 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_77_in_ruleComparisionExpression10556 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_78_in_ruleComparisionExpression10585 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_79_in_ruleComparisionExpression10614 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleComparisionExpression10637 = new BitSet(new long[]{0x0000000000000002L,0x000000000000F000L});
        public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression10675 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression10685 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression10732 = new BitSet(new long[]{0x0004000000000002L,0x0000000000010000L});
        public static final BitSet FOLLOW_80_in_ruleAdditiveExpression10774 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression10795 = new BitSet(new long[]{0x0004000000000002L,0x0000000000010000L});
        public static final BitSet FOLLOW_50_in_ruleAdditiveExpression10827 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression10848 = new BitSet(new long[]{0x0004000000000002L,0x0000000000010000L});
        public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression10887 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression10897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression10944 = new BitSet(new long[]{0x0000000000000002L,0x00000000001E0000L});
        public static final BitSet FOLLOW_81_in_ruleMultiplicativeExpression10986 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression11007 = new BitSet(new long[]{0x0000000000000002L,0x00000000001E0000L});
        public static final BitSet FOLLOW_82_in_ruleMultiplicativeExpression11041 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_83_in_ruleMultiplicativeExpression11070 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_84_in_ruleMultiplicativeExpression11099 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleSignumExpression_in_ruleMultiplicativeExpression11122 = new BitSet(new long[]{0x0000000000000002L,0x00000000001E0000L});
        public static final BitSet FOLLOW_ruleSignumExpression_in_entryRuleSignumExpression11161 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSignumExpression11171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleSignumExpression11226 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleSignumExpression_in_ruleSignumExpression11248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_ruleSignumExpression11285 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleSignumExpression_in_ruleSignumExpression11307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessExpression_in_ruleSignumExpression11336 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAccessExpression_in_entryRuleAccessExpression11371 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAccessExpression11381 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleAccessExpression11428 = new BitSet(new long[]{0x0002000000004002L,0x0000000000E00000L});
        public static final BitSet FOLLOW_49_in_ruleAccessExpression11450 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpression11472 = new BitSet(new long[]{0x0020000000008000L});
        public static final BitSet FOLLOW_15_in_ruleAccessExpression11485 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpression11506 = new BitSet(new long[]{0x0020000000008000L});
        public static final BitSet FOLLOW_53_in_ruleAccessExpression11521 = new BitSet(new long[]{0x0002000000004002L,0x0000000000E00000L});
        public static final BitSet FOLLOW_14_in_ruleAccessExpression11550 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpression11572 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleAccessExpression11585 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleAccessExpression11606 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleAccessExpression11621 = new BitSet(new long[]{0x0002000000004002L,0x0000000000E00000L});
        public static final BitSet FOLLOW_85_in_ruleAccessExpression11650 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAccessExpression11667 = new BitSet(new long[]{0x0002000000004002L,0x0000000000E00000L});
        public static final BitSet FOLLOW_86_in_ruleAccessExpression11701 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INTEGER_in_ruleAccessExpression11718 = new BitSet(new long[]{0x0002000000004002L,0x0000000000E00000L});
        public static final BitSet FOLLOW_87_in_ruleAccessExpression11752 = new BitSet(new long[]{0x0002000000004002L,0x0000000000E00000L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression11791 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression11801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_rulePrimaryExpression11848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceExpression_in_rulePrimaryExpression11875 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rulePrimaryExpression11893 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_rulePrimaryExpression11915 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePrimaryExpression11926 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceExpression_in_entryRuleReferenceExpression11963 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferenceExpression11973 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleReferenceExpression12017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralExpression_in_entryRuleLiteralExpression12052 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralExpression12062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteralExpression_in_ruleLiteralExpression12109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimalLiteralExpression_in_ruleLiteralExpression12136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRationalLiteralExpression_in_ruleLiteralExpression12163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpression_in_ruleLiteralExpression12190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayLiteralExpression_in_ruleLiteralExpression12217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordLiteralExpression_in_ruleLiteralExpression12244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpression_in_ruleLiteralExpression12271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralExpression_in_ruleLiteralExpression12298 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIntegerLiteralExpression_in_entryRuleIntegerLiteralExpression12333 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIntegerLiteralExpression12343 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INTEGER_in_ruleIntegerLiteralExpression12384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDecimalLiteralExpression_in_entryRuleDecimalLiteralExpression12424 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDecimalLiteralExpression12434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleDecimalLiteralExpression12475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRationalLiteralExpression_in_entryRuleRationalLiteralExpression12515 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRationalLiteralExpression12525 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INTEGER_in_ruleRationalLiteralExpression12567 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
        public static final BitSet FOLLOW_88_in_ruleRationalLiteralExpression12584 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INTEGER_in_ruleRationalLiteralExpression12601 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBooleanLiteralExpression_in_entryRuleBooleanLiteralExpression12642 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteralExpression12652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrueExpression_in_ruleBooleanLiteralExpression12699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFalseExpression_in_ruleBooleanLiteralExpression12726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTrueExpression_in_entryRuleTrueExpression12761 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTrueExpression12771 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_89_in_ruleTrueExpression12817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFalseExpression_in_entryRuleFalseExpression12853 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFalseExpression12863 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_90_in_ruleFalseExpression12909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleArrayLiteralExpression_in_entryRuleArrayLiteralExpression12945 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleArrayLiteralExpression12955 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleArrayLiteralExpression12992 = new BitSet(new long[]{0x0040000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleArrayLiteralExpression13014 = new BitSet(new long[]{0x0040000000008000L});
        public static final BitSet FOLLOW_15_in_ruleArrayLiteralExpression13027 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleParameterDeclaration_in_ruleArrayLiteralExpression13048 = new BitSet(new long[]{0x0040000000008000L});
        public static final BitSet FOLLOW_54_in_ruleArrayLiteralExpression13064 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleArrayLiteralExpression13085 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_53_in_ruleArrayLiteralExpression13097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRecordLiteralExpression_in_entryRuleRecordLiteralExpression13133 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRecordLiteralExpression13143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleRecordLiteralExpression13180 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFieldAssignment_in_ruleRecordLiteralExpression13201 = new BitSet(new long[]{0x0000000000008000L,0x0000000010000000L});
        public static final BitSet FOLLOW_15_in_ruleRecordLiteralExpression13214 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleFieldAssignment_in_ruleRecordLiteralExpression13235 = new BitSet(new long[]{0x0000000000008000L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_ruleRecordLiteralExpression13249 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFieldAssignment_in_entryRuleFieldAssignment13285 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFieldAssignment13295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleFieldAssignment13337 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleFieldAssignment13354 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleFieldAssignment13375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTupleLiteralExpression_in_entryRuleTupleLiteralExpression13411 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTupleLiteralExpression13421 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleTupleLiteralExpression13458 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTupleLiteralExpression13479 = new BitSet(new long[]{0x0000000000008000L,0x0000000010000000L});
        public static final BitSet FOLLOW_15_in_ruleTupleLiteralExpression13492 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleTupleLiteralExpression13513 = new BitSet(new long[]{0x0000000000008000L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_ruleTupleLiteralExpression13527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumerationLiteralExpression_in_entryRuleEnumerationLiteralExpression13563 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumerationLiteralExpression13573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_93_in_ruleEnumerationLiteralExpression13610 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumerationLiteralExpression13630 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBasicConstraintDefinition_in_entryRuleBasicConstraintDefinition13666 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBasicConstraintDefinition13676 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_94_in_ruleBasicConstraintDefinition13713 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleExpression_in_ruleBasicConstraintDefinition13734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_80_in_synpred13_InternalTTMCSystemLanguage10755 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_synpred13_InternalTTMCSystemLanguage10762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_synpred14_InternalTTMCSystemLanguage10967 = new BitSet(new long[]{0x0086004000004070L,0x000000002E0101FFL});
        public static final BitSet FOLLOW_ruleSignumExpression_in_synpred14_InternalTTMCSystemLanguage10974 = new BitSet(new long[]{0x0000000000000002L});
    }


}
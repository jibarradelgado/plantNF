package org.xtext.example.plantext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.plantext.services.PlantExtGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalPlantExtParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ANY_OTHER", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'Declarations'", "'EndDeclarations'", "'Template'", "'EndTemplate'", "'System'", "'EndSystem'", "'Parameters'", "'EndParameters'", "'ini'", "'com'", "'urg'", "':'", "','", "';'", "'->'", "'select'", "'guard'", "'sync'", "'assign'", "'probability'", "'comments'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPlantExtParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlantExtParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlantExtParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private PlantExtGrammarAccess grammarAccess;
     	
        public InternalPlantExtParser(TokenStream input, PlantExtGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Document";	
       	}
       	
       	@Override
       	protected PlantExtGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDocument"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:73:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:74:2: (iv_ruleDocument= ruleDocument EOF )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:75:2: iv_ruleDocument= ruleDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDocumentRule()); 
            }
            pushFollow(FOLLOW_ruleDocument_in_entryRuleDocument81);
            iv_ruleDocument=ruleDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDocument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDocument91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:82:1: ruleDocument returns [EObject current=null] : ( ( (lv_declaration_0_0= ruleDeclaration ) ) ( (lv_template_1_0= ruleTemplate ) )+ ( (lv_system_2_0= ruleSystem ) ) ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        EObject lv_declaration_0_0 = null;

        EObject lv_template_1_0 = null;

        EObject lv_system_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:85:28: ( ( ( (lv_declaration_0_0= ruleDeclaration ) ) ( (lv_template_1_0= ruleTemplate ) )+ ( (lv_system_2_0= ruleSystem ) ) ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:86:1: ( ( (lv_declaration_0_0= ruleDeclaration ) ) ( (lv_template_1_0= ruleTemplate ) )+ ( (lv_system_2_0= ruleSystem ) ) )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:86:1: ( ( (lv_declaration_0_0= ruleDeclaration ) ) ( (lv_template_1_0= ruleTemplate ) )+ ( (lv_system_2_0= ruleSystem ) ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:86:2: ( (lv_declaration_0_0= ruleDeclaration ) ) ( (lv_template_1_0= ruleTemplate ) )+ ( (lv_system_2_0= ruleSystem ) )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:86:2: ( (lv_declaration_0_0= ruleDeclaration ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:87:1: (lv_declaration_0_0= ruleDeclaration )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:87:1: (lv_declaration_0_0= ruleDeclaration )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:88:3: lv_declaration_0_0= ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDocumentAccess().getDeclarationDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDeclaration_in_ruleDocument137);
            lv_declaration_0_0=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDocumentRule());
              	        }
                     		set(
                     			current, 
                     			"declaration",
                      		lv_declaration_0_0, 
                      		"Declaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:104:2: ( (lv_template_1_0= ruleTemplate ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:105:1: (lv_template_1_0= ruleTemplate )
            	    {
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:105:1: (lv_template_1_0= ruleTemplate )
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:106:3: lv_template_1_0= ruleTemplate
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDocumentAccess().getTemplateTemplateParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTemplate_in_ruleDocument158);
            	    lv_template_1_0=ruleTemplate();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDocumentRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"template",
            	              		lv_template_1_0, 
            	              		"Template");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:122:3: ( (lv_system_2_0= ruleSystem ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:123:1: (lv_system_2_0= ruleSystem )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:123:1: (lv_system_2_0= ruleSystem )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:124:3: lv_system_2_0= ruleSystem
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDocumentAccess().getSystemSystemParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSystem_in_ruleDocument180);
            lv_system_2_0=ruleSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDocumentRule());
              	        }
                     		set(
                     			current, 
                     			"system",
                      		lv_system_2_0, 
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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleDeclaration"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:148:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:149:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:150:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration216);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration226); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:157:1: ruleDeclaration returns [EObject current=null] : (otherlv_0= 'Declarations' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndDeclarations' ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:160:28: ( (otherlv_0= 'Declarations' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndDeclarations' ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:161:1: (otherlv_0= 'Declarations' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndDeclarations' )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:161:1: (otherlv_0= 'Declarations' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndDeclarations' )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:161:3: otherlv_0= 'Declarations' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndDeclarations'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDeclaration263); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDeclarationAccess().getDeclarationsKeyword_0());
                  
            }
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:165:1: ( (lv_text_1_0= ruleTEXT ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_INT)||(LA2_0>=23 && LA2_0<=24)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:166:1: (lv_text_1_0= ruleTEXT )
            	    {
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:166:1: (lv_text_1_0= ruleTEXT )
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:167:3: lv_text_1_0= ruleTEXT
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getTextTEXTParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTEXT_in_ruleDeclaration284);
            	    lv_text_1_0=ruleTEXT();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"text",
            	              		lv_text_1_0, 
            	              		"TEXT");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDeclaration297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getEndDeclarationsKeyword_2());
                  
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleTemplate"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:195:1: entryRuleTemplate returns [EObject current=null] : iv_ruleTemplate= ruleTemplate EOF ;
    public final EObject entryRuleTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemplate = null;


        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:196:2: (iv_ruleTemplate= ruleTemplate EOF )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:197:2: iv_ruleTemplate= ruleTemplate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemplateRule()); 
            }
            pushFollow(FOLLOW_ruleTemplate_in_entryRuleTemplate333);
            iv_ruleTemplate=ruleTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemplate; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemplate343); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemplate"


    // $ANTLR start "ruleTemplate"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:204:1: ruleTemplate returns [EObject current=null] : (otherlv_0= 'Template' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameter ) )? ( (lv_declaration_3_0= ruleDeclaration ) )? ( (lv_state_4_0= ruleState ) )+ ( (lv_branchpoint_5_0= ruleBranchpoint ) )* ( (lv_transition_6_0= ruleTransition ) )+ otherlv_7= 'EndTemplate' ) ;
    public final EObject ruleTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_7=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_declaration_3_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_branchpoint_5_0 = null;

        EObject lv_transition_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:207:28: ( (otherlv_0= 'Template' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameter ) )? ( (lv_declaration_3_0= ruleDeclaration ) )? ( (lv_state_4_0= ruleState ) )+ ( (lv_branchpoint_5_0= ruleBranchpoint ) )* ( (lv_transition_6_0= ruleTransition ) )+ otherlv_7= 'EndTemplate' ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:208:1: (otherlv_0= 'Template' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameter ) )? ( (lv_declaration_3_0= ruleDeclaration ) )? ( (lv_state_4_0= ruleState ) )+ ( (lv_branchpoint_5_0= ruleBranchpoint ) )* ( (lv_transition_6_0= ruleTransition ) )+ otherlv_7= 'EndTemplate' )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:208:1: (otherlv_0= 'Template' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameter ) )? ( (lv_declaration_3_0= ruleDeclaration ) )? ( (lv_state_4_0= ruleState ) )+ ( (lv_branchpoint_5_0= ruleBranchpoint ) )* ( (lv_transition_6_0= ruleTransition ) )+ otherlv_7= 'EndTemplate' )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:208:3: otherlv_0= 'Template' ( (lv_name_1_0= RULE_ID ) ) ( (lv_parameters_2_0= ruleParameter ) )? ( (lv_declaration_3_0= ruleDeclaration ) )? ( (lv_state_4_0= ruleState ) )+ ( (lv_branchpoint_5_0= ruleBranchpoint ) )* ( (lv_transition_6_0= ruleTransition ) )+ otherlv_7= 'EndTemplate'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleTemplate380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTemplateAccess().getTemplateKeyword_0());
                  
            }
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:212:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:213:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:213:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:214:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTemplate397); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTemplateAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTemplateRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:230:2: ( (lv_parameters_2_0= ruleParameter ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:231:1: (lv_parameters_2_0= ruleParameter )
                    {
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:231:1: (lv_parameters_2_0= ruleParameter )
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:232:3: lv_parameters_2_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateAccess().getParametersParameterParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleParameter_in_ruleTemplate423);
                    lv_parameters_2_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemplateRule());
                      	        }
                             		set(
                             			current, 
                             			"parameters",
                              		lv_parameters_2_0, 
                              		"Parameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:248:3: ( (lv_declaration_3_0= ruleDeclaration ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:249:1: (lv_declaration_3_0= ruleDeclaration )
                    {
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:249:1: (lv_declaration_3_0= ruleDeclaration )
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:250:3: lv_declaration_3_0= ruleDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTemplateAccess().getDeclarationDeclarationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDeclaration_in_ruleTemplate445);
                    lv_declaration_3_0=ruleDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTemplateRule());
                      	        }
                             		set(
                             			current, 
                             			"declaration",
                              		lv_declaration_3_0, 
                              		"Declaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:266:3: ( (lv_state_4_0= ruleState ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=19 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:267:1: (lv_state_4_0= ruleState )
            	    {
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:267:1: (lv_state_4_0= ruleState )
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:268:3: lv_state_4_0= ruleState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateAccess().getStateStateParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleState_in_ruleTemplate467);
            	    lv_state_4_0=ruleState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"state",
            	              		lv_state_4_0, 
            	              		"State");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:284:3: ( (lv_branchpoint_5_0= ruleBranchpoint ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1==24) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:285:1: (lv_branchpoint_5_0= ruleBranchpoint )
            	    {
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:285:1: (lv_branchpoint_5_0= ruleBranchpoint )
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:286:3: lv_branchpoint_5_0= ruleBranchpoint
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateAccess().getBranchpointBranchpointParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBranchpoint_in_ruleTemplate489);
            	    lv_branchpoint_5_0=ruleBranchpoint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"branchpoint",
            	              		lv_branchpoint_5_0, 
            	              		"Branchpoint");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:302:3: ( (lv_transition_6_0= ruleTransition ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:303:1: (lv_transition_6_0= ruleTransition )
            	    {
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:303:1: (lv_transition_6_0= ruleTransition )
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:304:3: lv_transition_6_0= ruleTransition
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTemplateAccess().getTransitionTransitionParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransition_in_ruleTemplate511);
            	    lv_transition_6_0=ruleTransition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTemplateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transition",
            	              		lv_transition_6_0, 
            	              		"Transition");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleTemplate524); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getTemplateAccess().getEndTemplateKeyword_7());
                  
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
    // $ANTLR end "ruleTemplate"


    // $ANTLR start "entryRuleSystem"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:332:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:333:2: (iv_ruleSystem= ruleSystem EOF )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:334:2: iv_ruleSystem= ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemRule()); 
            }
            pushFollow(FOLLOW_ruleSystem_in_entryRuleSystem560);
            iv_ruleSystem=ruleSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystem; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSystem570); if (state.failed) return current;

            }

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
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:341:1: ruleSystem returns [EObject current=null] : (otherlv_0= 'System' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndSystem' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:344:28: ( (otherlv_0= 'System' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndSystem' ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:345:1: (otherlv_0= 'System' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndSystem' )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:345:1: (otherlv_0= 'System' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndSystem' )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:345:3: otherlv_0= 'System' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndSystem'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSystem607); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSystemAccess().getSystemKeyword_0());
                  
            }
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:349:1: ( (lv_text_1_0= ruleTEXT ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||(LA8_0>=23 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:350:1: (lv_text_1_0= ruleTEXT )
            	    {
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:350:1: (lv_text_1_0= ruleTEXT )
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:351:3: lv_text_1_0= ruleTEXT
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemAccess().getTextTEXTParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTEXT_in_ruleSystem628);
            	    lv_text_1_0=ruleTEXT();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"text",
            	              		lv_text_1_0, 
            	              		"TEXT");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSystem641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getEndSystemKeyword_2());
                  
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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleParameter"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:379:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:380:2: (iv_ruleParameter= ruleParameter EOF )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:381:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter677);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter687); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:388:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameters' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndParameters' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_text_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:391:28: ( (otherlv_0= 'Parameters' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndParameters' ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:392:1: (otherlv_0= 'Parameters' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndParameters' )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:392:1: (otherlv_0= 'Parameters' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndParameters' )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:392:3: otherlv_0= 'Parameters' ( (lv_text_1_0= ruleTEXT ) )* otherlv_2= 'EndParameters'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleParameter724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParametersKeyword_0());
                  
            }
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:396:1: ( (lv_text_1_0= ruleTEXT ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_INT)||(LA9_0>=23 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:397:1: (lv_text_1_0= ruleTEXT )
            	    {
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:397:1: (lv_text_1_0= ruleTEXT )
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:398:3: lv_text_1_0= ruleTEXT
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterAccess().getTextTEXTParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTEXT_in_ruleParameter745);
            	    lv_text_1_0=ruleTEXT();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"text",
            	              		lv_text_1_0, 
            	              		"TEXT");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleParameter758); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getEndParametersKeyword_2());
                  
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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleState"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:426:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:427:2: (iv_ruleState= ruleState EOF )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:428:2: iv_ruleState= ruleState EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStateRule()); 
            }
            pushFollow(FOLLOW_ruleState_in_entryRuleState794);
            iv_ruleState=ruleState();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleState; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleState804); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:435:1: ruleState returns [EObject current=null] : ( (otherlv_0= 'ini' )? (otherlv_1= 'com' | otherlv_2= 'urg' )? otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_name_6_0= RULE_ID ) ) )? ( (lv_text_7_0= ruleTEXT ) )* (otherlv_8= ':' ( (lv_exponentialRate_9_0= ruleTEXT ) )* )? otherlv_10= ';' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_id_4_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_text_7_0 = null;

        AntlrDatatypeRuleToken lv_exponentialRate_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:438:28: ( ( (otherlv_0= 'ini' )? (otherlv_1= 'com' | otherlv_2= 'urg' )? otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_name_6_0= RULE_ID ) ) )? ( (lv_text_7_0= ruleTEXT ) )* (otherlv_8= ':' ( (lv_exponentialRate_9_0= ruleTEXT ) )* )? otherlv_10= ';' ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:439:1: ( (otherlv_0= 'ini' )? (otherlv_1= 'com' | otherlv_2= 'urg' )? otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_name_6_0= RULE_ID ) ) )? ( (lv_text_7_0= ruleTEXT ) )* (otherlv_8= ':' ( (lv_exponentialRate_9_0= ruleTEXT ) )* )? otherlv_10= ';' )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:439:1: ( (otherlv_0= 'ini' )? (otherlv_1= 'com' | otherlv_2= 'urg' )? otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_name_6_0= RULE_ID ) ) )? ( (lv_text_7_0= ruleTEXT ) )* (otherlv_8= ':' ( (lv_exponentialRate_9_0= ruleTEXT ) )* )? otherlv_10= ';' )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:439:2: (otherlv_0= 'ini' )? (otherlv_1= 'com' | otherlv_2= 'urg' )? otherlv_3= ':' ( (lv_id_4_0= RULE_ID ) ) (otherlv_5= ',' ( (lv_name_6_0= RULE_ID ) ) )? ( (lv_text_7_0= ruleTEXT ) )* (otherlv_8= ':' ( (lv_exponentialRate_9_0= ruleTEXT ) )* )? otherlv_10= ';'
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:439:2: (otherlv_0= 'ini' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:439:4: otherlv_0= 'ini'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleState842); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getStateAccess().getIniKeyword_0());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:443:3: (otherlv_1= 'com' | otherlv_2= 'urg' )?
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:443:5: otherlv_1= 'com'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleState857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getComKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:448:7: otherlv_2= 'urg'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleState875); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getStateAccess().getUrgKeyword_1_1());
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleState889); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:456:1: ( (lv_id_4_0= RULE_ID ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:457:1: (lv_id_4_0= RULE_ID )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:457:1: (lv_id_4_0= RULE_ID )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:458:3: lv_id_4_0= RULE_ID
            {
            lv_id_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_id_4_0, grammarAccess.getStateAccess().getIdIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStateRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"id",
                      		lv_id_4_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:474:2: (otherlv_5= ',' ( (lv_name_6_0= RULE_ID ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==RULE_ID) ) {
                    int LA12_3 = input.LA(3);

                    if ( (synpred13_InternalPlantExt()) ) {
                        alt12=1;
                    }
                }
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:474:4: otherlv_5= ',' ( (lv_name_6_0= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleState924); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getCommaKeyword_4_0());
                          
                    }
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:478:1: ( (lv_name_6_0= RULE_ID ) )
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:479:1: (lv_name_6_0= RULE_ID )
                    {
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:479:1: (lv_name_6_0= RULE_ID )
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:480:3: lv_name_6_0= RULE_ID
                    {
                    lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState941); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_name_6_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_4_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getStateRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"name",
                              		lv_name_6_0, 
                              		"ID");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:496:4: ( (lv_text_7_0= ruleTEXT ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    switch ( input.LA(2) ) {
                    case 22:
                        {
                        int LA13_4 = input.LA(3);

                        if ( (LA13_4==RULE_ID) ) {
                            int LA13_6 = input.LA(4);

                            if ( (synpred14_InternalPlantExt()) ) {
                                alt13=1;
                            }


                        }
                        else if ( ((LA13_4>=RULE_ANY_OTHER && LA13_4<=RULE_INT)||(LA13_4>=23 && LA13_4<=24)) ) {
                            alt13=1;
                        }


                        }
                        break;
                    case RULE_ANY_OTHER:
                    case RULE_INT:
                    case 23:
                    case 24:
                        {
                        alt13=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        int LA13_5 = input.LA(3);

                        if ( (LA13_5==24) ) {
                            int LA13_7 = input.LA(4);

                            if ( (synpred14_InternalPlantExt()) ) {
                                alt13=1;
                            }


                        }
                        else if ( ((LA13_5>=RULE_ID && LA13_5<=RULE_INT)||(LA13_5>=22 && LA13_5<=23)) ) {
                            alt13=1;
                        }


                        }
                        break;

                    }

                }
                else if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:497:1: (lv_text_7_0= ruleTEXT )
            	    {
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:497:1: (lv_text_7_0= ruleTEXT )
            	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:498:3: lv_text_7_0= ruleTEXT
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStateAccess().getTextTEXTParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTEXT_in_ruleState969);
            	    lv_text_7_0=ruleTEXT();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStateRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"text",
            	              		lv_text_7_0, 
            	              		"TEXT");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:514:3: (otherlv_8= ':' ( (lv_exponentialRate_9_0= ruleTEXT ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:514:5: otherlv_8= ':' ( (lv_exponentialRate_9_0= ruleTEXT ) )*
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleState983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getStateAccess().getColonKeyword_6_0());
                          
                    }
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:518:1: ( (lv_exponentialRate_9_0= ruleTEXT ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==24) ) {
                            int LA14_1 = input.LA(2);

                            if ( ((LA14_1>=RULE_ANY_OTHER && LA14_1<=RULE_INT)||(LA14_1>=23 && LA14_1<=24)) ) {
                                alt14=1;
                            }
                            else if ( (LA14_1==RULE_ID) ) {
                                int LA14_3 = input.LA(3);

                                if ( (LA14_3==24) ) {
                                    int LA14_5 = input.LA(4);

                                    if ( (synpred15_InternalPlantExt()) ) {
                                        alt14=1;
                                    }


                                }
                                else if ( ((LA14_3>=RULE_ID && LA14_3<=RULE_INT)||LA14_3==23) ) {
                                    alt14=1;
                                }


                            }


                        }
                        else if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_INT)||LA14_0==23) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:519:1: (lv_exponentialRate_9_0= ruleTEXT )
                    	    {
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:519:1: (lv_exponentialRate_9_0= ruleTEXT )
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:520:3: lv_exponentialRate_9_0= ruleTEXT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getStateAccess().getExponentialRateTEXTParserRuleCall_6_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTEXT_in_ruleState1004);
                    	    lv_exponentialRate_9_0=ruleTEXT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"exponentialRate",
                    	              		lv_exponentialRate_9_0, 
                    	              		"TEXT");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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

            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleState1019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getStateAccess().getSemicolonKeyword_7());
                  
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleBranchpoint"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:548:1: entryRuleBranchpoint returns [EObject current=null] : iv_ruleBranchpoint= ruleBranchpoint EOF ;
    public final EObject entryRuleBranchpoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranchpoint = null;


        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:549:2: (iv_ruleBranchpoint= ruleBranchpoint EOF )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:550:2: iv_ruleBranchpoint= ruleBranchpoint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBranchpointRule()); 
            }
            pushFollow(FOLLOW_ruleBranchpoint_in_entryRuleBranchpoint1055);
            iv_ruleBranchpoint=ruleBranchpoint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBranchpoint; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranchpoint1065); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBranchpoint"


    // $ANTLR start "ruleBranchpoint"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:557:1: ruleBranchpoint returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' ) ;
    public final EObject ruleBranchpoint() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:560:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:561:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:561:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';' )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:561:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ';'
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:561:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:562:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:562:1: (lv_name_0_0= RULE_ID )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:563:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBranchpoint1107); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getBranchpointAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBranchpointRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleBranchpoint1124); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBranchpointAccess().getSemicolonKeyword_1());
                  
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
    // $ANTLR end "ruleBranchpoint"


    // $ANTLR start "entryRuleTransition"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:591:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:592:2: (iv_ruleTransition= ruleTransition EOF )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:593:2: iv_ruleTransition= ruleTransition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransitionRule()); 
            }
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1160);
            iv_ruleTransition=ruleTransition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1170); if (state.failed) return current;

            }

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
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:600:1: ruleTransition returns [EObject current=null] : ( ( (lv_outBoundState_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_inboundState_2_0= RULE_ID ) ) (otherlv_3= ':' (otherlv_4= 'select' otherlv_5= ':' ( (lv_select_6_0= ruleTEXT ) )+ )? (otherlv_7= ',' )? (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleTEXT ) )+ )? (otherlv_11= ',' )? (otherlv_12= 'sync' otherlv_13= ':' ( (lv_sync_14_0= ruleTEXT ) )+ )? (otherlv_15= ',' )? (otherlv_16= 'assign' otherlv_17= ':' ( (lv_assign_18_0= ruleTEXT ) )+ )? (otherlv_19= ',' )? (otherlv_20= 'probability' otherlv_21= ':' ( (lv_probability_22_0= ruleTEXT ) )+ )? (otherlv_23= ',' )? (otherlv_24= 'comments' otherlv_25= ':' ( (lv_comments_26_0= ruleTEXT ) )+ )? ) otherlv_27= ';' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_outBoundState_0_0=null;
        Token otherlv_1=null;
        Token lv_inboundState_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_select_6_0 = null;

        AntlrDatatypeRuleToken lv_guard_10_0 = null;

        AntlrDatatypeRuleToken lv_sync_14_0 = null;

        AntlrDatatypeRuleToken lv_assign_18_0 = null;

        AntlrDatatypeRuleToken lv_probability_22_0 = null;

        AntlrDatatypeRuleToken lv_comments_26_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:603:28: ( ( ( (lv_outBoundState_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_inboundState_2_0= RULE_ID ) ) (otherlv_3= ':' (otherlv_4= 'select' otherlv_5= ':' ( (lv_select_6_0= ruleTEXT ) )+ )? (otherlv_7= ',' )? (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleTEXT ) )+ )? (otherlv_11= ',' )? (otherlv_12= 'sync' otherlv_13= ':' ( (lv_sync_14_0= ruleTEXT ) )+ )? (otherlv_15= ',' )? (otherlv_16= 'assign' otherlv_17= ':' ( (lv_assign_18_0= ruleTEXT ) )+ )? (otherlv_19= ',' )? (otherlv_20= 'probability' otherlv_21= ':' ( (lv_probability_22_0= ruleTEXT ) )+ )? (otherlv_23= ',' )? (otherlv_24= 'comments' otherlv_25= ':' ( (lv_comments_26_0= ruleTEXT ) )+ )? ) otherlv_27= ';' ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:604:1: ( ( (lv_outBoundState_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_inboundState_2_0= RULE_ID ) ) (otherlv_3= ':' (otherlv_4= 'select' otherlv_5= ':' ( (lv_select_6_0= ruleTEXT ) )+ )? (otherlv_7= ',' )? (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleTEXT ) )+ )? (otherlv_11= ',' )? (otherlv_12= 'sync' otherlv_13= ':' ( (lv_sync_14_0= ruleTEXT ) )+ )? (otherlv_15= ',' )? (otherlv_16= 'assign' otherlv_17= ':' ( (lv_assign_18_0= ruleTEXT ) )+ )? (otherlv_19= ',' )? (otherlv_20= 'probability' otherlv_21= ':' ( (lv_probability_22_0= ruleTEXT ) )+ )? (otherlv_23= ',' )? (otherlv_24= 'comments' otherlv_25= ':' ( (lv_comments_26_0= ruleTEXT ) )+ )? ) otherlv_27= ';' )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:604:1: ( ( (lv_outBoundState_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_inboundState_2_0= RULE_ID ) ) (otherlv_3= ':' (otherlv_4= 'select' otherlv_5= ':' ( (lv_select_6_0= ruleTEXT ) )+ )? (otherlv_7= ',' )? (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleTEXT ) )+ )? (otherlv_11= ',' )? (otherlv_12= 'sync' otherlv_13= ':' ( (lv_sync_14_0= ruleTEXT ) )+ )? (otherlv_15= ',' )? (otherlv_16= 'assign' otherlv_17= ':' ( (lv_assign_18_0= ruleTEXT ) )+ )? (otherlv_19= ',' )? (otherlv_20= 'probability' otherlv_21= ':' ( (lv_probability_22_0= ruleTEXT ) )+ )? (otherlv_23= ',' )? (otherlv_24= 'comments' otherlv_25= ':' ( (lv_comments_26_0= ruleTEXT ) )+ )? ) otherlv_27= ';' )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:604:2: ( (lv_outBoundState_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_inboundState_2_0= RULE_ID ) ) (otherlv_3= ':' (otherlv_4= 'select' otherlv_5= ':' ( (lv_select_6_0= ruleTEXT ) )+ )? (otherlv_7= ',' )? (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleTEXT ) )+ )? (otherlv_11= ',' )? (otherlv_12= 'sync' otherlv_13= ':' ( (lv_sync_14_0= ruleTEXT ) )+ )? (otherlv_15= ',' )? (otherlv_16= 'assign' otherlv_17= ':' ( (lv_assign_18_0= ruleTEXT ) )+ )? (otherlv_19= ',' )? (otherlv_20= 'probability' otherlv_21= ':' ( (lv_probability_22_0= ruleTEXT ) )+ )? (otherlv_23= ',' )? (otherlv_24= 'comments' otherlv_25= ':' ( (lv_comments_26_0= ruleTEXT ) )+ )? ) otherlv_27= ';'
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:604:2: ( (lv_outBoundState_0_0= RULE_ID ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:605:1: (lv_outBoundState_0_0= RULE_ID )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:605:1: (lv_outBoundState_0_0= RULE_ID )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:606:3: lv_outBoundState_0_0= RULE_ID
            {
            lv_outBoundState_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition1212); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_outBoundState_0_0, grammarAccess.getTransitionAccess().getOutBoundStateIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"outBoundState",
                      		lv_outBoundState_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleTransition1229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:626:1: ( (lv_inboundState_2_0= RULE_ID ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:627:1: (lv_inboundState_2_0= RULE_ID )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:627:1: (lv_inboundState_2_0= RULE_ID )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:628:3: lv_inboundState_2_0= RULE_ID
            {
            lv_inboundState_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition1246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_inboundState_2_0, grammarAccess.getTransitionAccess().getInboundStateIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTransitionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"inboundState",
                      		lv_inboundState_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:644:2: (otherlv_3= ':' (otherlv_4= 'select' otherlv_5= ':' ( (lv_select_6_0= ruleTEXT ) )+ )? (otherlv_7= ',' )? (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleTEXT ) )+ )? (otherlv_11= ',' )? (otherlv_12= 'sync' otherlv_13= ':' ( (lv_sync_14_0= ruleTEXT ) )+ )? (otherlv_15= ',' )? (otherlv_16= 'assign' otherlv_17= ':' ( (lv_assign_18_0= ruleTEXT ) )+ )? (otherlv_19= ',' )? (otherlv_20= 'probability' otherlv_21= ':' ( (lv_probability_22_0= ruleTEXT ) )+ )? (otherlv_23= ',' )? (otherlv_24= 'comments' otherlv_25= ':' ( (lv_comments_26_0= ruleTEXT ) )+ )? )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:644:4: otherlv_3= ':' (otherlv_4= 'select' otherlv_5= ':' ( (lv_select_6_0= ruleTEXT ) )+ )? (otherlv_7= ',' )? (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleTEXT ) )+ )? (otherlv_11= ',' )? (otherlv_12= 'sync' otherlv_13= ':' ( (lv_sync_14_0= ruleTEXT ) )+ )? (otherlv_15= ',' )? (otherlv_16= 'assign' otherlv_17= ':' ( (lv_assign_18_0= ruleTEXT ) )+ )? (otherlv_19= ',' )? (otherlv_20= 'probability' otherlv_21= ':' ( (lv_probability_22_0= ruleTEXT ) )+ )? (otherlv_23= ',' )? (otherlv_24= 'comments' otherlv_25= ':' ( (lv_comments_26_0= ruleTEXT ) )+ )?
            {
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleTransition1264); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getColonKeyword_3_0());
                  
            }
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:648:1: (otherlv_4= 'select' otherlv_5= ':' ( (lv_select_6_0= ruleTEXT ) )+ )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:648:3: otherlv_4= 'select' otherlv_5= ':' ( (lv_select_6_0= ruleTEXT ) )+
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleTransition1277); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSelectKeyword_3_1_0());
                          
                    }
                    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleTransition1289); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getColonKeyword_3_1_1());
                          
                    }
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:656:1: ( (lv_select_6_0= ruleTEXT ) )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        switch ( input.LA(1) ) {
                        case 23:
                            {
                            int LA16_1 = input.LA(2);

                            if ( (synpred17_InternalPlantExt()) ) {
                                alt16=1;
                            }


                            }
                            break;
                        case 24:
                            {
                            int LA16_3 = input.LA(2);

                            if ( ((LA16_3>=RULE_ANY_OTHER && LA16_3<=RULE_INT)||(LA16_3>=23 && LA16_3<=24)||(LA16_3>=27 && LA16_3<=31)) ) {
                                alt16=1;
                            }
                            else if ( (LA16_3==RULE_ID) ) {
                                int LA16_5 = input.LA(3);

                                if ( ((LA16_5>=RULE_ID && LA16_5<=RULE_INT)||(LA16_5>=23 && LA16_5<=24)||(LA16_5>=27 && LA16_5<=31)) ) {
                                    alt16=1;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                        case RULE_ANY_OTHER:
                        case RULE_INT:
                            {
                            alt16=1;
                            }
                            break;

                        }

                        switch (alt16) {
                    	case 1 :
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:657:1: (lv_select_6_0= ruleTEXT )
                    	    {
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:657:1: (lv_select_6_0= ruleTEXT )
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:658:3: lv_select_6_0= ruleTEXT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionAccess().getSelectTEXTParserRuleCall_3_1_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTEXT_in_ruleTransition1310);
                    	    lv_select_6_0=ruleTEXT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"select",
                    	              		lv_select_6_0, 
                    	              		"TEXT");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:674:5: (otherlv_7= ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred19_InternalPlantExt()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:674:7: otherlv_7= ','
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleTransition1326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getCommaKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:678:3: (otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleTEXT ) )+ )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:678:5: otherlv_8= 'guard' otherlv_9= ':' ( (lv_guard_10_0= ruleTEXT ) )+
                    {
                    otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleTransition1341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getGuardKeyword_3_3_0());
                          
                    }
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleTransition1353); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getColonKeyword_3_3_1());
                          
                    }
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:686:1: ( (lv_guard_10_0= ruleTEXT ) )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        switch ( input.LA(1) ) {
                        case 23:
                            {
                            int LA19_1 = input.LA(2);

                            if ( (synpred20_InternalPlantExt()) ) {
                                alt19=1;
                            }


                            }
                            break;
                        case 24:
                            {
                            int LA19_3 = input.LA(2);

                            if ( (LA19_3==RULE_ID) ) {
                                int LA19_5 = input.LA(3);

                                if ( ((LA19_5>=RULE_ID && LA19_5<=RULE_INT)||(LA19_5>=23 && LA19_5<=24)||(LA19_5>=28 && LA19_5<=31)) ) {
                                    alt19=1;
                                }


                            }
                            else if ( ((LA19_3>=RULE_ANY_OTHER && LA19_3<=RULE_INT)||(LA19_3>=23 && LA19_3<=24)||(LA19_3>=28 && LA19_3<=31)) ) {
                                alt19=1;
                            }


                            }
                            break;
                        case RULE_ID:
                        case RULE_ANY_OTHER:
                        case RULE_INT:
                            {
                            alt19=1;
                            }
                            break;

                        }

                        switch (alt19) {
                    	case 1 :
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:687:1: (lv_guard_10_0= ruleTEXT )
                    	    {
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:687:1: (lv_guard_10_0= ruleTEXT )
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:688:3: lv_guard_10_0= ruleTEXT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardTEXTParserRuleCall_3_3_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTEXT_in_ruleTransition1374);
                    	    lv_guard_10_0=ruleTEXT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"guard",
                    	              		lv_guard_10_0, 
                    	              		"TEXT");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:704:5: (otherlv_11= ',' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                int LA21_1 = input.LA(2);

                if ( (synpred22_InternalPlantExt()) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:704:7: otherlv_11= ','
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleTransition1390); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getCommaKeyword_3_4());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:708:3: (otherlv_12= 'sync' otherlv_13= ':' ( (lv_sync_14_0= ruleTEXT ) )+ )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:708:5: otherlv_12= 'sync' otherlv_13= ':' ( (lv_sync_14_0= ruleTEXT ) )+
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleTransition1405); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getSyncKeyword_3_5_0());
                          
                    }
                    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleTransition1417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getColonKeyword_3_5_1());
                          
                    }
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:716:1: ( (lv_sync_14_0= ruleTEXT ) )+
                    int cnt22=0;
                    loop22:
                    do {
                        int alt22=2;
                        switch ( input.LA(1) ) {
                        case 23:
                            {
                            int LA22_1 = input.LA(2);

                            if ( (synpred23_InternalPlantExt()) ) {
                                alt22=1;
                            }


                            }
                            break;
                        case 24:
                            {
                            int LA22_3 = input.LA(2);

                            if ( (LA22_3==RULE_ID) ) {
                                int LA22_5 = input.LA(3);

                                if ( ((LA22_5>=RULE_ID && LA22_5<=RULE_INT)||(LA22_5>=23 && LA22_5<=24)||(LA22_5>=29 && LA22_5<=31)) ) {
                                    alt22=1;
                                }


                            }
                            else if ( ((LA22_3>=RULE_ANY_OTHER && LA22_3<=RULE_INT)||(LA22_3>=23 && LA22_3<=24)||(LA22_3>=29 && LA22_3<=31)) ) {
                                alt22=1;
                            }


                            }
                            break;
                        case RULE_ID:
                        case RULE_ANY_OTHER:
                        case RULE_INT:
                            {
                            alt22=1;
                            }
                            break;

                        }

                        switch (alt22) {
                    	case 1 :
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:717:1: (lv_sync_14_0= ruleTEXT )
                    	    {
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:717:1: (lv_sync_14_0= ruleTEXT )
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:718:3: lv_sync_14_0= ruleTEXT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionAccess().getSyncTEXTParserRuleCall_3_5_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTEXT_in_ruleTransition1438);
                    	    lv_sync_14_0=ruleTEXT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"sync",
                    	              		lv_sync_14_0, 
                    	              		"TEXT");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt22 >= 1 ) break loop22;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(22, input);
                                throw eee;
                        }
                        cnt22++;
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:734:5: (otherlv_15= ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred25_InternalPlantExt()) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:734:7: otherlv_15= ','
                    {
                    otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleTransition1454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getTransitionAccess().getCommaKeyword_3_6());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:738:3: (otherlv_16= 'assign' otherlv_17= ':' ( (lv_assign_18_0= ruleTEXT ) )+ )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:738:5: otherlv_16= 'assign' otherlv_17= ':' ( (lv_assign_18_0= ruleTEXT ) )+
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleTransition1469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getTransitionAccess().getAssignKeyword_3_7_0());
                          
                    }
                    otherlv_17=(Token)match(input,22,FOLLOW_22_in_ruleTransition1481); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getTransitionAccess().getColonKeyword_3_7_1());
                          
                    }
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:746:1: ( (lv_assign_18_0= ruleTEXT ) )+
                    int cnt25=0;
                    loop25:
                    do {
                        int alt25=2;
                        switch ( input.LA(1) ) {
                        case 23:
                            {
                            int LA25_1 = input.LA(2);

                            if ( (synpred26_InternalPlantExt()) ) {
                                alt25=1;
                            }


                            }
                            break;
                        case 24:
                            {
                            int LA25_3 = input.LA(2);

                            if ( (LA25_3==RULE_ID) ) {
                                int LA25_5 = input.LA(3);

                                if ( ((LA25_5>=RULE_ID && LA25_5<=RULE_INT)||(LA25_5>=23 && LA25_5<=24)||(LA25_5>=30 && LA25_5<=31)) ) {
                                    alt25=1;
                                }


                            }
                            else if ( ((LA25_3>=RULE_ANY_OTHER && LA25_3<=RULE_INT)||(LA25_3>=23 && LA25_3<=24)||(LA25_3>=30 && LA25_3<=31)) ) {
                                alt25=1;
                            }


                            }
                            break;
                        case RULE_ID:
                        case RULE_ANY_OTHER:
                        case RULE_INT:
                            {
                            alt25=1;
                            }
                            break;

                        }

                        switch (alt25) {
                    	case 1 :
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:747:1: (lv_assign_18_0= ruleTEXT )
                    	    {
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:747:1: (lv_assign_18_0= ruleTEXT )
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:748:3: lv_assign_18_0= ruleTEXT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionAccess().getAssignTEXTParserRuleCall_3_7_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTEXT_in_ruleTransition1502);
                    	    lv_assign_18_0=ruleTEXT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"assign",
                    	              		lv_assign_18_0, 
                    	              		"TEXT");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
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

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:764:5: (otherlv_19= ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==23) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred28_InternalPlantExt()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:764:7: otherlv_19= ','
                    {
                    otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleTransition1518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getTransitionAccess().getCommaKeyword_3_8());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:768:3: (otherlv_20= 'probability' otherlv_21= ':' ( (lv_probability_22_0= ruleTEXT ) )+ )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:768:5: otherlv_20= 'probability' otherlv_21= ':' ( (lv_probability_22_0= ruleTEXT ) )+
                    {
                    otherlv_20=(Token)match(input,30,FOLLOW_30_in_ruleTransition1533); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getTransitionAccess().getProbabilityKeyword_3_9_0());
                          
                    }
                    otherlv_21=(Token)match(input,22,FOLLOW_22_in_ruleTransition1545); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getTransitionAccess().getColonKeyword_3_9_1());
                          
                    }
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:776:1: ( (lv_probability_22_0= ruleTEXT ) )+
                    int cnt28=0;
                    loop28:
                    do {
                        int alt28=2;
                        switch ( input.LA(1) ) {
                        case 23:
                            {
                            int LA28_1 = input.LA(2);

                            if ( (synpred29_InternalPlantExt()) ) {
                                alt28=1;
                            }


                            }
                            break;
                        case 24:
                            {
                            int LA28_3 = input.LA(2);

                            if ( ((LA28_3>=RULE_ANY_OTHER && LA28_3<=RULE_INT)||(LA28_3>=23 && LA28_3<=24)||LA28_3==31) ) {
                                alt28=1;
                            }
                            else if ( (LA28_3==RULE_ID) ) {
                                int LA28_5 = input.LA(3);

                                if ( ((LA28_5>=RULE_ID && LA28_5<=RULE_INT)||(LA28_5>=23 && LA28_5<=24)||LA28_5==31) ) {
                                    alt28=1;
                                }


                            }


                            }
                            break;
                        case RULE_ID:
                        case RULE_ANY_OTHER:
                        case RULE_INT:
                            {
                            alt28=1;
                            }
                            break;

                        }

                        switch (alt28) {
                    	case 1 :
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:777:1: (lv_probability_22_0= ruleTEXT )
                    	    {
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:777:1: (lv_probability_22_0= ruleTEXT )
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:778:3: lv_probability_22_0= ruleTEXT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionAccess().getProbabilityTEXTParserRuleCall_3_9_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTEXT_in_ruleTransition1566);
                    	    lv_probability_22_0=ruleTEXT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"probability",
                    	              		lv_probability_22_0, 
                    	              		"TEXT");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt28 >= 1 ) break loop28;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(28, input);
                                throw eee;
                        }
                        cnt28++;
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:794:5: (otherlv_23= ',' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:794:7: otherlv_23= ','
                    {
                    otherlv_23=(Token)match(input,23,FOLLOW_23_in_ruleTransition1582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getTransitionAccess().getCommaKeyword_3_10());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:798:3: (otherlv_24= 'comments' otherlv_25= ':' ( (lv_comments_26_0= ruleTEXT ) )+ )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==31) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:798:5: otherlv_24= 'comments' otherlv_25= ':' ( (lv_comments_26_0= ruleTEXT ) )+
                    {
                    otherlv_24=(Token)match(input,31,FOLLOW_31_in_ruleTransition1597); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getTransitionAccess().getCommentsKeyword_3_11_0());
                          
                    }
                    otherlv_25=(Token)match(input,22,FOLLOW_22_in_ruleTransition1609); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getTransitionAccess().getColonKeyword_3_11_1());
                          
                    }
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:806:1: ( (lv_comments_26_0= ruleTEXT ) )+
                    int cnt31=0;
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==24) ) {
                            int LA31_1 = input.LA(2);

                            if ( ((LA31_1>=RULE_ANY_OTHER && LA31_1<=RULE_INT)||(LA31_1>=23 && LA31_1<=24)) ) {
                                alt31=1;
                            }
                            else if ( (LA31_1==RULE_ID) ) {
                                int LA31_3 = input.LA(3);

                                if ( ((LA31_3>=RULE_ID && LA31_3<=RULE_INT)||(LA31_3>=23 && LA31_3<=24)) ) {
                                    alt31=1;
                                }


                            }


                        }
                        else if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)||LA31_0==23) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:807:1: (lv_comments_26_0= ruleTEXT )
                    	    {
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:807:1: (lv_comments_26_0= ruleTEXT )
                    	    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:808:3: lv_comments_26_0= ruleTEXT
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransitionAccess().getCommentsTEXTParserRuleCall_3_11_2_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleTEXT_in_ruleTransition1630);
                    	    lv_comments_26_0=ruleTEXT();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"comments",
                    	              		lv_comments_26_0, 
                    	              		"TEXT");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt31 >= 1 ) break loop31;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(31, input);
                                throw eee;
                        }
                        cnt31++;
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_27=(Token)match(input,24,FOLLOW_24_in_ruleTransition1646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_27, grammarAccess.getTransitionAccess().getSemicolonKeyword_4());
                  
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


    // $ANTLR start "entryRuleTEXT"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:836:1: entryRuleTEXT returns [String current=null] : iv_ruleTEXT= ruleTEXT EOF ;
    public final String entryRuleTEXT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTEXT = null;


        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:837:2: (iv_ruleTEXT= ruleTEXT EOF )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:838:2: iv_ruleTEXT= ruleTEXT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTEXTRule()); 
            }
            pushFollow(FOLLOW_ruleTEXT_in_entryRuleTEXT1683);
            iv_ruleTEXT=ruleTEXT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTEXT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTEXT1694); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTEXT"


    // $ANTLR start "ruleTEXT"
    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:845:1: ruleTEXT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= ';' | kw= ',' ) ;
    public final AntlrDatatypeRuleToken ruleTEXT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:848:28: ( (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= ';' | kw= ',' ) )
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:849:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= ';' | kw= ',' )
            {
            // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:849:1: (this_ANY_OTHER_0= RULE_ANY_OTHER | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= ';' | kw= ',' )
            int alt33=5;
            switch ( input.LA(1) ) {
            case RULE_ANY_OTHER:
                {
                alt33=1;
                }
                break;
            case RULE_ID:
                {
                alt33=2;
                }
                break;
            case RULE_INT:
                {
                alt33=3;
                }
                break;
            case 24:
                {
                alt33=4;
                }
                break;
            case 23:
                {
                alt33=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:849:6: this_ANY_OTHER_0= RULE_ANY_OTHER
                    {
                    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_ruleTEXT1734); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ANY_OTHER_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ANY_OTHER_0, grammarAccess.getTEXTAccess().getANY_OTHERTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:857:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTEXT1760); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getTEXTAccess().getIDTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:865:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTEXT1786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getTEXTAccess().getINTTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:874:2: kw= ';'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleTEXT1810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTEXTAccess().getSemicolonKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:881:2: kw= ','
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleTEXT1829); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getTEXTAccess().getCommaKeyword_4()); 
                          
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
    // $ANTLR end "ruleTEXT"

    // $ANTLR start synpred13_InternalPlantExt
    public final void synpred13_InternalPlantExt_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        Token lv_name_6_0=null;

        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:474:4: (otherlv_5= ',' ( (lv_name_6_0= RULE_ID ) ) )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:474:4: otherlv_5= ',' ( (lv_name_6_0= RULE_ID ) )
        {
        otherlv_5=(Token)match(input,23,FOLLOW_23_in_synpred13_InternalPlantExt924); if (state.failed) return ;
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:478:1: ( (lv_name_6_0= RULE_ID ) )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:479:1: (lv_name_6_0= RULE_ID )
        {
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:479:1: (lv_name_6_0= RULE_ID )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:480:3: lv_name_6_0= RULE_ID
        {
        lv_name_6_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred13_InternalPlantExt941); if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalPlantExt

    // $ANTLR start synpred14_InternalPlantExt
    public final void synpred14_InternalPlantExt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_text_7_0 = null;


        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:497:1: ( (lv_text_7_0= ruleTEXT ) )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:497:1: (lv_text_7_0= ruleTEXT )
        {
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:497:1: (lv_text_7_0= ruleTEXT )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:498:3: lv_text_7_0= ruleTEXT
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getTextTEXTParserRuleCall_5_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleTEXT_in_synpred14_InternalPlantExt969);
        lv_text_7_0=ruleTEXT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalPlantExt

    // $ANTLR start synpred15_InternalPlantExt
    public final void synpred15_InternalPlantExt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_exponentialRate_9_0 = null;


        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:519:1: ( (lv_exponentialRate_9_0= ruleTEXT ) )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:519:1: (lv_exponentialRate_9_0= ruleTEXT )
        {
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:519:1: (lv_exponentialRate_9_0= ruleTEXT )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:520:3: lv_exponentialRate_9_0= ruleTEXT
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStateAccess().getExponentialRateTEXTParserRuleCall_6_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleTEXT_in_synpred15_InternalPlantExt1004);
        lv_exponentialRate_9_0=ruleTEXT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalPlantExt

    // $ANTLR start synpred17_InternalPlantExt
    public final void synpred17_InternalPlantExt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_select_6_0 = null;


        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:657:1: ( (lv_select_6_0= ruleTEXT ) )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:657:1: (lv_select_6_0= ruleTEXT )
        {
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:657:1: (lv_select_6_0= ruleTEXT )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:658:3: lv_select_6_0= ruleTEXT
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTransitionAccess().getSelectTEXTParserRuleCall_3_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleTEXT_in_synpred17_InternalPlantExt1310);
        lv_select_6_0=ruleTEXT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalPlantExt

    // $ANTLR start synpred19_InternalPlantExt
    public final void synpred19_InternalPlantExt_fragment() throws RecognitionException {   
        Token otherlv_7=null;

        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:674:7: (otherlv_7= ',' )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:674:7: otherlv_7= ','
        {
        otherlv_7=(Token)match(input,23,FOLLOW_23_in_synpred19_InternalPlantExt1326); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalPlantExt

    // $ANTLR start synpred20_InternalPlantExt
    public final void synpred20_InternalPlantExt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_guard_10_0 = null;


        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:687:1: ( (lv_guard_10_0= ruleTEXT ) )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:687:1: (lv_guard_10_0= ruleTEXT )
        {
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:687:1: (lv_guard_10_0= ruleTEXT )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:688:3: lv_guard_10_0= ruleTEXT
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardTEXTParserRuleCall_3_3_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleTEXT_in_synpred20_InternalPlantExt1374);
        lv_guard_10_0=ruleTEXT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalPlantExt

    // $ANTLR start synpred22_InternalPlantExt
    public final void synpred22_InternalPlantExt_fragment() throws RecognitionException {   
        Token otherlv_11=null;

        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:704:7: (otherlv_11= ',' )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:704:7: otherlv_11= ','
        {
        otherlv_11=(Token)match(input,23,FOLLOW_23_in_synpred22_InternalPlantExt1390); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalPlantExt

    // $ANTLR start synpred23_InternalPlantExt
    public final void synpred23_InternalPlantExt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_sync_14_0 = null;


        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:717:1: ( (lv_sync_14_0= ruleTEXT ) )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:717:1: (lv_sync_14_0= ruleTEXT )
        {
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:717:1: (lv_sync_14_0= ruleTEXT )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:718:3: lv_sync_14_0= ruleTEXT
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTransitionAccess().getSyncTEXTParserRuleCall_3_5_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleTEXT_in_synpred23_InternalPlantExt1438);
        lv_sync_14_0=ruleTEXT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred23_InternalPlantExt

    // $ANTLR start synpred25_InternalPlantExt
    public final void synpred25_InternalPlantExt_fragment() throws RecognitionException {   
        Token otherlv_15=null;

        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:734:7: (otherlv_15= ',' )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:734:7: otherlv_15= ','
        {
        otherlv_15=(Token)match(input,23,FOLLOW_23_in_synpred25_InternalPlantExt1454); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalPlantExt

    // $ANTLR start synpred26_InternalPlantExt
    public final void synpred26_InternalPlantExt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_assign_18_0 = null;


        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:747:1: ( (lv_assign_18_0= ruleTEXT ) )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:747:1: (lv_assign_18_0= ruleTEXT )
        {
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:747:1: (lv_assign_18_0= ruleTEXT )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:748:3: lv_assign_18_0= ruleTEXT
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTransitionAccess().getAssignTEXTParserRuleCall_3_7_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleTEXT_in_synpred26_InternalPlantExt1502);
        lv_assign_18_0=ruleTEXT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred26_InternalPlantExt

    // $ANTLR start synpred28_InternalPlantExt
    public final void synpred28_InternalPlantExt_fragment() throws RecognitionException {   
        Token otherlv_19=null;

        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:764:7: (otherlv_19= ',' )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:764:7: otherlv_19= ','
        {
        otherlv_19=(Token)match(input,23,FOLLOW_23_in_synpred28_InternalPlantExt1518); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalPlantExt

    // $ANTLR start synpred29_InternalPlantExt
    public final void synpred29_InternalPlantExt_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken lv_probability_22_0 = null;


        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:777:1: ( (lv_probability_22_0= ruleTEXT ) )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:777:1: (lv_probability_22_0= ruleTEXT )
        {
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:777:1: (lv_probability_22_0= ruleTEXT )
        // ../org.xtext.example.plantext/src-gen/org/xtext/example/plantext/parser/antlr/internal/InternalPlantExt.g:778:3: lv_probability_22_0= ruleTEXT
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getTransitionAccess().getProbabilityTEXTParserRuleCall_3_9_2_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleTEXT_in_synpred29_InternalPlantExt1566);
        lv_probability_22_0=ruleTEXT();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred29_InternalPlantExt

    // Delegated rules

    public final boolean synpred26_InternalPlantExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalPlantExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalPlantExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalPlantExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalPlantExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalPlantExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalPlantExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalPlantExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalPlantExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalPlantExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalPlantExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalPlantExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalPlantExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalPlantExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalPlantExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalPlantExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalPlantExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalPlantExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalPlantExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalPlantExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalPlantExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalPlantExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalPlantExt() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalPlantExt_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleDocument_in_entryRuleDocument81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDocument91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleDocument137 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleTemplate_in_ruleDocument158 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_ruleSystem_in_ruleDocument180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDeclaration263 = new BitSet(new long[]{0x0000000001801070L});
    public static final BitSet FOLLOW_ruleTEXT_in_ruleDeclaration284 = new BitSet(new long[]{0x0000000001801070L});
    public static final BitSet FOLLOW_12_in_ruleDeclaration297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemplate_in_entryRuleTemplate333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemplate343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleTemplate380 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTemplate397 = new BitSet(new long[]{0x00000000007A0800L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleTemplate423 = new BitSet(new long[]{0x00000000007A0800L});
    public static final BitSet FOLLOW_ruleDeclaration_in_ruleTemplate445 = new BitSet(new long[]{0x00000000007A0800L});
    public static final BitSet FOLLOW_ruleState_in_ruleTemplate467 = new BitSet(new long[]{0x00000000007A0810L});
    public static final BitSet FOLLOW_ruleBranchpoint_in_ruleTemplate489 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleTemplate511 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleTemplate524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSystem_in_entryRuleSystem560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSystem570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSystem607 = new BitSet(new long[]{0x0000000001810070L});
    public static final BitSet FOLLOW_ruleTEXT_in_ruleSystem628 = new BitSet(new long[]{0x0000000001810070L});
    public static final BitSet FOLLOW_16_in_ruleSystem641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleParameter724 = new BitSet(new long[]{0x0000000001840070L});
    public static final BitSet FOLLOW_ruleTEXT_in_ruleParameter745 = new BitSet(new long[]{0x0000000001840070L});
    public static final BitSet FOLLOW_18_in_ruleParameter758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleState842 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_20_in_ruleState857 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21_in_ruleState875 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleState889 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState906 = new BitSet(new long[]{0x0000000001C00070L});
    public static final BitSet FOLLOW_23_in_ruleState924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState941 = new BitSet(new long[]{0x0000000001C00070L});
    public static final BitSet FOLLOW_ruleTEXT_in_ruleState969 = new BitSet(new long[]{0x0000000001C00070L});
    public static final BitSet FOLLOW_22_in_ruleState983 = new BitSet(new long[]{0x0000000001800070L});
    public static final BitSet FOLLOW_ruleTEXT_in_ruleState1004 = new BitSet(new long[]{0x0000000001800070L});
    public static final BitSet FOLLOW_24_in_ruleState1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranchpoint_in_entryRuleBranchpoint1055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranchpoint1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBranchpoint1107 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBranchpoint1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition1212 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTransition1229 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition1246 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransition1264 = new BitSet(new long[]{0x00000000FD800000L});
    public static final BitSet FOLLOW_26_in_ruleTransition1277 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransition1289 = new BitSet(new long[]{0x0000000001800070L});
    public static final BitSet FOLLOW_ruleTEXT_in_ruleTransition1310 = new BitSet(new long[]{0x00000000F9800070L});
    public static final BitSet FOLLOW_23_in_ruleTransition1326 = new BitSet(new long[]{0x00000000F9800000L});
    public static final BitSet FOLLOW_27_in_ruleTransition1341 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransition1353 = new BitSet(new long[]{0x0000000001800070L});
    public static final BitSet FOLLOW_ruleTEXT_in_ruleTransition1374 = new BitSet(new long[]{0x00000000F1800070L});
    public static final BitSet FOLLOW_23_in_ruleTransition1390 = new BitSet(new long[]{0x00000000F1800000L});
    public static final BitSet FOLLOW_28_in_ruleTransition1405 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransition1417 = new BitSet(new long[]{0x0000000001800070L});
    public static final BitSet FOLLOW_ruleTEXT_in_ruleTransition1438 = new BitSet(new long[]{0x00000000E1800070L});
    public static final BitSet FOLLOW_23_in_ruleTransition1454 = new BitSet(new long[]{0x00000000E1800000L});
    public static final BitSet FOLLOW_29_in_ruleTransition1469 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransition1481 = new BitSet(new long[]{0x0000000001800070L});
    public static final BitSet FOLLOW_ruleTEXT_in_ruleTransition1502 = new BitSet(new long[]{0x00000000C1800070L});
    public static final BitSet FOLLOW_23_in_ruleTransition1518 = new BitSet(new long[]{0x00000000C1800000L});
    public static final BitSet FOLLOW_30_in_ruleTransition1533 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransition1545 = new BitSet(new long[]{0x0000000001800070L});
    public static final BitSet FOLLOW_ruleTEXT_in_ruleTransition1566 = new BitSet(new long[]{0x0000000081800070L});
    public static final BitSet FOLLOW_23_in_ruleTransition1582 = new BitSet(new long[]{0x0000000081000000L});
    public static final BitSet FOLLOW_31_in_ruleTransition1597 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransition1609 = new BitSet(new long[]{0x0000000001800070L});
    public static final BitSet FOLLOW_ruleTEXT_in_ruleTransition1630 = new BitSet(new long[]{0x0000000001800070L});
    public static final BitSet FOLLOW_24_in_ruleTransition1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_entryRuleTEXT1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTEXT1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_ruleTEXT1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTEXT1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTEXT1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTEXT1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTEXT1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred13_InternalPlantExt924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred13_InternalPlantExt941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_synpred14_InternalPlantExt969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_synpred15_InternalPlantExt1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_synpred17_InternalPlantExt1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred19_InternalPlantExt1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_synpred20_InternalPlantExt1374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred22_InternalPlantExt1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_synpred23_InternalPlantExt1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred25_InternalPlantExt1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_synpred26_InternalPlantExt1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred28_InternalPlantExt1518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTEXT_in_synpred29_InternalPlantExt1566 = new BitSet(new long[]{0x0000000000000002L});

}
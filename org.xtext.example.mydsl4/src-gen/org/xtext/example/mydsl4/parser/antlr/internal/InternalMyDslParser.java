package org.xtext.example.mydsl4.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl4.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Team'", "'{'", "'}'", "'Robot'", "'at'", "'('", "','", "')'", "'Goal'", "'Task'", "'if'", "':'", "'distanceTo'", "'isLessThan'", "'isGreaterThan'", "'isEqual'", "'turnOff'", "'moveTo'", "'Simulate'", "'until'", "'Run'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_statements_0_0= ruleTeam_goal_or_task ) )* ( (lv_simulate_1_0= ruleSimulateStatement ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject lv_simulate_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_statements_0_0= ruleTeam_goal_or_task ) )* ( (lv_simulate_1_0= ruleSimulateStatement ) ) ) )
            // InternalMyDsl.g:78:2: ( ( (lv_statements_0_0= ruleTeam_goal_or_task ) )* ( (lv_simulate_1_0= ruleSimulateStatement ) ) )
            {
            // InternalMyDsl.g:78:2: ( ( (lv_statements_0_0= ruleTeam_goal_or_task ) )* ( (lv_simulate_1_0= ruleSimulateStatement ) ) )
            // InternalMyDsl.g:79:3: ( (lv_statements_0_0= ruleTeam_goal_or_task ) )* ( (lv_simulate_1_0= ruleSimulateStatement ) )
            {
            // InternalMyDsl.g:79:3: ( (lv_statements_0_0= ruleTeam_goal_or_task ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=19 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:80:4: (lv_statements_0_0= ruleTeam_goal_or_task )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_statements_0_0= ruleTeam_goal_or_task )
            	    // InternalMyDsl.g:81:5: lv_statements_0_0= ruleTeam_goal_or_task
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getStatementsTeam_goal_or_taskParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleTeam_goal_or_task();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_0_0,
            	    						"org.xtext.example.mydsl4.MyDsl.Team_goal_or_task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:98:3: ( (lv_simulate_1_0= ruleSimulateStatement ) )
            // InternalMyDsl.g:99:4: (lv_simulate_1_0= ruleSimulateStatement )
            {
            // InternalMyDsl.g:99:4: (lv_simulate_1_0= ruleSimulateStatement )
            // InternalMyDsl.g:100:5: lv_simulate_1_0= ruleSimulateStatement
            {

            					newCompositeNode(grammarAccess.getModelAccess().getSimulateSimulateStatementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_simulate_1_0=ruleSimulateStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"simulate",
            						lv_simulate_1_0,
            						"org.xtext.example.mydsl4.MyDsl.SimulateStatement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTeam_goal_or_task"
    // InternalMyDsl.g:121:1: entryRuleTeam_goal_or_task returns [EObject current=null] : iv_ruleTeam_goal_or_task= ruleTeam_goal_or_task EOF ;
    public final EObject entryRuleTeam_goal_or_task() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeam_goal_or_task = null;


        try {
            // InternalMyDsl.g:121:58: (iv_ruleTeam_goal_or_task= ruleTeam_goal_or_task EOF )
            // InternalMyDsl.g:122:2: iv_ruleTeam_goal_or_task= ruleTeam_goal_or_task EOF
            {
             newCompositeNode(grammarAccess.getTeam_goal_or_taskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeam_goal_or_task=ruleTeam_goal_or_task();

            state._fsp--;

             current =iv_ruleTeam_goal_or_task; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeam_goal_or_task"


    // $ANTLR start "ruleTeam_goal_or_task"
    // InternalMyDsl.g:128:1: ruleTeam_goal_or_task returns [EObject current=null] : (this_TeamDefinition_0= ruleTeamDefinition | this_GoalDefinition_1= ruleGoalDefinition | this_TaskDefinition_2= ruleTaskDefinition ) ;
    public final EObject ruleTeam_goal_or_task() throws RecognitionException {
        EObject current = null;

        EObject this_TeamDefinition_0 = null;

        EObject this_GoalDefinition_1 = null;

        EObject this_TaskDefinition_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:134:2: ( (this_TeamDefinition_0= ruleTeamDefinition | this_GoalDefinition_1= ruleGoalDefinition | this_TaskDefinition_2= ruleTaskDefinition ) )
            // InternalMyDsl.g:135:2: (this_TeamDefinition_0= ruleTeamDefinition | this_GoalDefinition_1= ruleGoalDefinition | this_TaskDefinition_2= ruleTaskDefinition )
            {
            // InternalMyDsl.g:135:2: (this_TeamDefinition_0= ruleTeamDefinition | this_GoalDefinition_1= ruleGoalDefinition | this_TaskDefinition_2= ruleTaskDefinition )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 20:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:136:3: this_TeamDefinition_0= ruleTeamDefinition
                    {

                    			newCompositeNode(grammarAccess.getTeam_goal_or_taskAccess().getTeamDefinitionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TeamDefinition_0=ruleTeamDefinition();

                    state._fsp--;


                    			current = this_TeamDefinition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:145:3: this_GoalDefinition_1= ruleGoalDefinition
                    {

                    			newCompositeNode(grammarAccess.getTeam_goal_or_taskAccess().getGoalDefinitionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GoalDefinition_1=ruleGoalDefinition();

                    state._fsp--;


                    			current = this_GoalDefinition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:154:3: this_TaskDefinition_2= ruleTaskDefinition
                    {

                    			newCompositeNode(grammarAccess.getTeam_goal_or_taskAccess().getTaskDefinitionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_TaskDefinition_2=ruleTaskDefinition();

                    state._fsp--;


                    			current = this_TaskDefinition_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeam_goal_or_task"


    // $ANTLR start "entryRuleTeamDefinition"
    // InternalMyDsl.g:166:1: entryRuleTeamDefinition returns [EObject current=null] : iv_ruleTeamDefinition= ruleTeamDefinition EOF ;
    public final EObject entryRuleTeamDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTeamDefinition = null;


        try {
            // InternalMyDsl.g:166:55: (iv_ruleTeamDefinition= ruleTeamDefinition EOF )
            // InternalMyDsl.g:167:2: iv_ruleTeamDefinition= ruleTeamDefinition EOF
            {
             newCompositeNode(grammarAccess.getTeamDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTeamDefinition=ruleTeamDefinition();

            state._fsp--;

             current =iv_ruleTeamDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTeamDefinition"


    // $ANTLR start "ruleTeamDefinition"
    // InternalMyDsl.g:173:1: ruleTeamDefinition returns [EObject current=null] : (otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_robots_3_0= ruleRobotDefinition ) )* otherlv_4= '}' ) ;
    public final EObject ruleTeamDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_robots_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:179:2: ( (otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_robots_3_0= ruleRobotDefinition ) )* otherlv_4= '}' ) )
            // InternalMyDsl.g:180:2: (otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_robots_3_0= ruleRobotDefinition ) )* otherlv_4= '}' )
            {
            // InternalMyDsl.g:180:2: (otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_robots_3_0= ruleRobotDefinition ) )* otherlv_4= '}' )
            // InternalMyDsl.g:181:3: otherlv_0= 'Team' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_robots_3_0= ruleRobotDefinition ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTeamDefinitionAccess().getTeamKeyword_0());
            		
            // InternalMyDsl.g:185:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:186:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:186:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:187:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTeamDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTeamDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTeamDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:207:3: ( (lv_robots_3_0= ruleRobotDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:208:4: (lv_robots_3_0= ruleRobotDefinition )
            	    {
            	    // InternalMyDsl.g:208:4: (lv_robots_3_0= ruleRobotDefinition )
            	    // InternalMyDsl.g:209:5: lv_robots_3_0= ruleRobotDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getTeamDefinitionAccess().getRobotsRobotDefinitionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_robots_3_0=ruleRobotDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTeamDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"robots",
            	    						lv_robots_3_0,
            	    						"org.xtext.example.mydsl4.MyDsl.RobotDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTeamDefinitionAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTeamDefinition"


    // $ANTLR start "entryRuleRobotDefinition"
    // InternalMyDsl.g:234:1: entryRuleRobotDefinition returns [EObject current=null] : iv_ruleRobotDefinition= ruleRobotDefinition EOF ;
    public final EObject entryRuleRobotDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotDefinition = null;


        try {
            // InternalMyDsl.g:234:56: (iv_ruleRobotDefinition= ruleRobotDefinition EOF )
            // InternalMyDsl.g:235:2: iv_ruleRobotDefinition= ruleRobotDefinition EOF
            {
             newCompositeNode(grammarAccess.getRobotDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotDefinition=ruleRobotDefinition();

            state._fsp--;

             current =iv_ruleRobotDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobotDefinition"


    // $ANTLR start "ruleRobotDefinition"
    // InternalMyDsl.g:241:1: ruleRobotDefinition returns [EObject current=null] : (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' otherlv_3= '(' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleRobotDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token lv_y_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:247:2: ( (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' otherlv_3= '(' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalMyDsl.g:248:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' otherlv_3= '(' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalMyDsl.g:248:2: (otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' otherlv_3= '(' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalMyDsl.g:249:3: otherlv_0= 'Robot' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' otherlv_3= '(' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotDefinitionAccess().getRobotKeyword_0());
            		
            // InternalMyDsl.g:253:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:254:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:254:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:255:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRobotDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotDefinitionAccess().getAtKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:279:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalMyDsl.g:280:4: (lv_x_4_0= RULE_INT )
            {
            // InternalMyDsl.g:280:4: (lv_x_4_0= RULE_INT )
            // InternalMyDsl.g:281:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_x_4_0, grammarAccess.getRobotDefinitionAccess().getXINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getRobotDefinitionAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:301:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalMyDsl.g:302:4: (lv_y_6_0= RULE_INT )
            {
            // InternalMyDsl.g:302:4: (lv_y_6_0= RULE_INT )
            // InternalMyDsl.g:303:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_y_6_0, grammarAccess.getRobotDefinitionAccess().getYINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRobotDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRobotDefinitionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobotDefinition"


    // $ANTLR start "entryRuleGoalDefinition"
    // InternalMyDsl.g:327:1: entryRuleGoalDefinition returns [EObject current=null] : iv_ruleGoalDefinition= ruleGoalDefinition EOF ;
    public final EObject entryRuleGoalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalDefinition = null;


        try {
            // InternalMyDsl.g:327:55: (iv_ruleGoalDefinition= ruleGoalDefinition EOF )
            // InternalMyDsl.g:328:2: iv_ruleGoalDefinition= ruleGoalDefinition EOF
            {
             newCompositeNode(grammarAccess.getGoalDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGoalDefinition=ruleGoalDefinition();

            state._fsp--;

             current =iv_ruleGoalDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalDefinition"


    // $ANTLR start "ruleGoalDefinition"
    // InternalMyDsl.g:334:1: ruleGoalDefinition returns [EObject current=null] : (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' otherlv_3= '(' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleGoalDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_x_4_0=null;
        Token otherlv_5=null;
        Token lv_y_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:340:2: ( (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' otherlv_3= '(' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalMyDsl.g:341:2: (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' otherlv_3= '(' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalMyDsl.g:341:2: (otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' otherlv_3= '(' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalMyDsl.g:342:3: otherlv_0= 'Goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' otherlv_3= '(' ( (lv_x_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_y_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGoalDefinitionAccess().getGoalKeyword_0());
            		
            // InternalMyDsl.g:346:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:347:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:347:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:348:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGoalDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoalDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getGoalDefinitionAccess().getAtKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getGoalDefinitionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyDsl.g:372:3: ( (lv_x_4_0= RULE_INT ) )
            // InternalMyDsl.g:373:4: (lv_x_4_0= RULE_INT )
            {
            // InternalMyDsl.g:373:4: (lv_x_4_0= RULE_INT )
            // InternalMyDsl.g:374:5: lv_x_4_0= RULE_INT
            {
            lv_x_4_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_x_4_0, grammarAccess.getGoalDefinitionAccess().getXINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoalDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"x",
            						lv_x_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getGoalDefinitionAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:394:3: ( (lv_y_6_0= RULE_INT ) )
            // InternalMyDsl.g:395:4: (lv_y_6_0= RULE_INT )
            {
            // InternalMyDsl.g:395:4: (lv_y_6_0= RULE_INT )
            // InternalMyDsl.g:396:5: lv_y_6_0= RULE_INT
            {
            lv_y_6_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            					newLeafNode(lv_y_6_0, grammarAccess.getGoalDefinitionAccess().getYINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGoalDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"y",
            						lv_y_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getGoalDefinitionAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoalDefinition"


    // $ANTLR start "entryRuleTaskDefinition"
    // InternalMyDsl.g:420:1: entryRuleTaskDefinition returns [EObject current=null] : iv_ruleTaskDefinition= ruleTaskDefinition EOF ;
    public final EObject entryRuleTaskDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskDefinition = null;


        try {
            // InternalMyDsl.g:420:55: (iv_ruleTaskDefinition= ruleTaskDefinition EOF )
            // InternalMyDsl.g:421:2: iv_ruleTaskDefinition= ruleTaskDefinition EOF
            {
             newCompositeNode(grammarAccess.getTaskDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskDefinition=ruleTaskDefinition();

            state._fsp--;

             current =iv_ruleTaskDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskDefinition"


    // $ANTLR start "ruleTaskDefinition"
    // InternalMyDsl.g:427:1: ruleTaskDefinition returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )? otherlv_4= '{' ( (lv_statements_5_0= ruleTaskStatement ) )* otherlv_6= '}' ) ;
    public final EObject ruleTaskDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_3_0 = null;

        EObject lv_statements_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:433:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )? otherlv_4= '{' ( (lv_statements_5_0= ruleTaskStatement ) )* otherlv_6= '}' ) )
            // InternalMyDsl.g:434:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )? otherlv_4= '{' ( (lv_statements_5_0= ruleTaskStatement ) )* otherlv_6= '}' )
            {
            // InternalMyDsl.g:434:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )? otherlv_4= '{' ( (lv_statements_5_0= ruleTaskStatement ) )* otherlv_6= '}' )
            // InternalMyDsl.g:435:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )? otherlv_4= '{' ( (lv_statements_5_0= ruleTaskStatement ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskDefinitionAccess().getTaskKeyword_0());
            		
            // InternalMyDsl.g:439:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:440:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:440:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:441:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:457:3: (otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:458:4: otherlv_2= 'if' ( (lv_condition_3_0= ruleCondition ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getTaskDefinitionAccess().getIfKeyword_2_0());
                    			
                    // InternalMyDsl.g:462:4: ( (lv_condition_3_0= ruleCondition ) )
                    // InternalMyDsl.g:463:5: (lv_condition_3_0= ruleCondition )
                    {
                    // InternalMyDsl.g:463:5: (lv_condition_3_0= ruleCondition )
                    // InternalMyDsl.g:464:6: lv_condition_3_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getTaskDefinitionAccess().getConditionConditionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"condition",
                    							lv_condition_3_0,
                    							"org.xtext.example.mydsl4.MyDsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:486:3: ( (lv_statements_5_0= ruleTaskStatement ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:487:4: (lv_statements_5_0= ruleTaskStatement )
            	    {
            	    // InternalMyDsl.g:487:4: (lv_statements_5_0= ruleTaskStatement )
            	    // InternalMyDsl.g:488:5: lv_statements_5_0= ruleTaskStatement
            	    {

            	    					newCompositeNode(grammarAccess.getTaskDefinitionAccess().getStatementsTaskStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_statements_5_0=ruleTaskStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTaskDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_5_0,
            	    						"org.xtext.example.mydsl4.MyDsl.TaskStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskDefinition"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:513:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:513:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:514:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

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
    // InternalMyDsl.g:520:1: ruleCondition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'distanceTo' ( (otherlv_4= RULE_ID ) ) ( (lv_comparator_5_0= ruleComparator ) ) ( (lv_distance_6_0= RULE_INT ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_distance_6_0=null;
        AntlrDatatypeRuleToken lv_comparator_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:526:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'distanceTo' ( (otherlv_4= RULE_ID ) ) ( (lv_comparator_5_0= ruleComparator ) ) ( (lv_distance_6_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:527:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'distanceTo' ( (otherlv_4= RULE_ID ) ) ( (lv_comparator_5_0= ruleComparator ) ) ( (lv_distance_6_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:527:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'distanceTo' ( (otherlv_4= RULE_ID ) ) ( (lv_comparator_5_0= ruleComparator ) ) ( (lv_distance_6_0= RULE_INT ) ) )
            // InternalMyDsl.g:528:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'distanceTo' ( (otherlv_4= RULE_ID ) ) ( (lv_comparator_5_0= ruleComparator ) ) ( (lv_distance_6_0= RULE_INT ) )
            {
            // InternalMyDsl.g:528:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:529:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:529:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:530:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getTeamTeamDefinitionCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:545:3: ( (otherlv_2= RULE_ID ) )
            // InternalMyDsl.g:546:4: (otherlv_2= RULE_ID )
            {
            // InternalMyDsl.g:546:4: (otherlv_2= RULE_ID )
            // InternalMyDsl.g:547:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getRobotRobotDefinitionCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getDistanceToKeyword_3());
            		
            // InternalMyDsl.g:562:3: ( (otherlv_4= RULE_ID ) )
            // InternalMyDsl.g:563:4: (otherlv_4= RULE_ID )
            {
            // InternalMyDsl.g:563:4: (otherlv_4= RULE_ID )
            // InternalMyDsl.g:564:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getGoalGoalDefinitionCrossReference_4_0());
            				

            }


            }

            // InternalMyDsl.g:575:3: ( (lv_comparator_5_0= ruleComparator ) )
            // InternalMyDsl.g:576:4: (lv_comparator_5_0= ruleComparator )
            {
            // InternalMyDsl.g:576:4: (lv_comparator_5_0= ruleComparator )
            // InternalMyDsl.g:577:5: lv_comparator_5_0= ruleComparator
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getComparatorComparatorParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_comparator_5_0=ruleComparator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"comparator",
            						lv_comparator_5_0,
            						"org.xtext.example.mydsl4.MyDsl.Comparator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:594:3: ( (lv_distance_6_0= RULE_INT ) )
            // InternalMyDsl.g:595:4: (lv_distance_6_0= RULE_INT )
            {
            // InternalMyDsl.g:595:4: (lv_distance_6_0= RULE_INT )
            // InternalMyDsl.g:596:5: lv_distance_6_0= RULE_INT
            {
            lv_distance_6_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_distance_6_0, grammarAccess.getConditionAccess().getDistanceINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleComparator"
    // InternalMyDsl.g:616:1: entryRuleComparator returns [String current=null] : iv_ruleComparator= ruleComparator EOF ;
    public final String entryRuleComparator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparator = null;


        try {
            // InternalMyDsl.g:616:50: (iv_ruleComparator= ruleComparator EOF )
            // InternalMyDsl.g:617:2: iv_ruleComparator= ruleComparator EOF
            {
             newCompositeNode(grammarAccess.getComparatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparator=ruleComparator();

            state._fsp--;

             current =iv_ruleComparator.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparator"


    // $ANTLR start "ruleComparator"
    // InternalMyDsl.g:623:1: ruleComparator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'isLessThan' | kw= 'isGreaterThan' | kw= 'isEqual' ) ;
    public final AntlrDatatypeRuleToken ruleComparator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:629:2: ( (kw= 'isLessThan' | kw= 'isGreaterThan' | kw= 'isEqual' ) )
            // InternalMyDsl.g:630:2: (kw= 'isLessThan' | kw= 'isGreaterThan' | kw= 'isEqual' )
            {
            // InternalMyDsl.g:630:2: (kw= 'isLessThan' | kw= 'isGreaterThan' | kw= 'isEqual' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:631:3: kw= 'isLessThan'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getIsLessThanKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:637:3: kw= 'isGreaterThan'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getIsGreaterThanKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:643:3: kw= 'isEqual'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getComparatorAccess().getIsEqualKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparator"


    // $ANTLR start "entryRuleTaskStatement"
    // InternalMyDsl.g:652:1: entryRuleTaskStatement returns [EObject current=null] : iv_ruleTaskStatement= ruleTaskStatement EOF ;
    public final EObject entryRuleTaskStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskStatement = null;


        try {
            // InternalMyDsl.g:652:54: (iv_ruleTaskStatement= ruleTaskStatement EOF )
            // InternalMyDsl.g:653:2: iv_ruleTaskStatement= ruleTaskStatement EOF
            {
             newCompositeNode(grammarAccess.getTaskStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskStatement=ruleTaskStatement();

            state._fsp--;

             current =iv_ruleTaskStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTaskStatement"


    // $ANTLR start "ruleTaskStatement"
    // InternalMyDsl.g:659:1: ruleTaskStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )? ( ( (lv_statement_3_0= ruleMoveToStatement ) ) | otherlv_4= 'turnOff' ) ) ;
    public final EObject ruleTaskStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:665:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )? ( ( (lv_statement_3_0= ruleMoveToStatement ) ) | otherlv_4= 'turnOff' ) ) )
            // InternalMyDsl.g:666:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )? ( ( (lv_statement_3_0= ruleMoveToStatement ) ) | otherlv_4= 'turnOff' ) )
            {
            // InternalMyDsl.g:666:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )? ( ( (lv_statement_3_0= ruleMoveToStatement ) ) | otherlv_4= 'turnOff' ) )
            // InternalMyDsl.g:667:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )? ( ( (lv_statement_3_0= ruleMoveToStatement ) ) | otherlv_4= 'turnOff' )
            {
            // InternalMyDsl.g:667:3: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:668:4: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:668:4: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:669:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getTaskStatementAccess().getTeamTeamDefinitionCrossReference_0_0());
            				

            }


            }

            // InternalMyDsl.g:680:3: (otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:681:4: otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getTaskStatementAccess().getColonKeyword_1_0());
                    			
                    // InternalMyDsl.g:685:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMyDsl.g:686:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMyDsl.g:686:5: (otherlv_2= RULE_ID )
                    // InternalMyDsl.g:687:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskStatementRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_2, grammarAccess.getTaskStatementAccess().getRobotRobotDefinitionCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:699:3: ( ( (lv_statement_3_0= ruleMoveToStatement ) ) | otherlv_4= 'turnOff' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==27) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:700:4: ( (lv_statement_3_0= ruleMoveToStatement ) )
                    {
                    // InternalMyDsl.g:700:4: ( (lv_statement_3_0= ruleMoveToStatement ) )
                    // InternalMyDsl.g:701:5: (lv_statement_3_0= ruleMoveToStatement )
                    {
                    // InternalMyDsl.g:701:5: (lv_statement_3_0= ruleMoveToStatement )
                    // InternalMyDsl.g:702:6: lv_statement_3_0= ruleMoveToStatement
                    {

                    						newCompositeNode(grammarAccess.getTaskStatementAccess().getStatementMoveToStatementParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_statement_3_0=ruleMoveToStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskStatementRule());
                    						}
                    						set(
                    							current,
                    							"statement",
                    							lv_statement_3_0,
                    							"org.xtext.example.mydsl4.MyDsl.MoveToStatement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:720:4: otherlv_4= 'turnOff'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getTaskStatementAccess().getTurnOffKeyword_2_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaskStatement"


    // $ANTLR start "entryRuleMoveToStatement"
    // InternalMyDsl.g:729:1: entryRuleMoveToStatement returns [EObject current=null] : iv_ruleMoveToStatement= ruleMoveToStatement EOF ;
    public final EObject entryRuleMoveToStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveToStatement = null;


        try {
            // InternalMyDsl.g:729:56: (iv_ruleMoveToStatement= ruleMoveToStatement EOF )
            // InternalMyDsl.g:730:2: iv_ruleMoveToStatement= ruleMoveToStatement EOF
            {
             newCompositeNode(grammarAccess.getMoveToStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveToStatement=ruleMoveToStatement();

            state._fsp--;

             current =iv_ruleMoveToStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMoveToStatement"


    // $ANTLR start "ruleMoveToStatement"
    // InternalMyDsl.g:736:1: ruleMoveToStatement returns [EObject current=null] : (otherlv_0= 'moveTo' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMoveToStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:742:2: ( (otherlv_0= 'moveTo' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:743:2: (otherlv_0= 'moveTo' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:743:2: (otherlv_0= 'moveTo' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:744:3: otherlv_0= 'moveTo' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveToStatementAccess().getMoveToKeyword_0());
            		
            // InternalMyDsl.g:748:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:749:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:749:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:750:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoveToStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getMoveToStatementAccess().getGoalGoalDefinitionCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMoveToStatement"


    // $ANTLR start "entryRuleSimulateStatement"
    // InternalMyDsl.g:765:1: entryRuleSimulateStatement returns [EObject current=null] : iv_ruleSimulateStatement= ruleSimulateStatement EOF ;
    public final EObject entryRuleSimulateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulateStatement = null;


        try {
            // InternalMyDsl.g:765:58: (iv_ruleSimulateStatement= ruleSimulateStatement EOF )
            // InternalMyDsl.g:766:2: iv_ruleSimulateStatement= ruleSimulateStatement EOF
            {
             newCompositeNode(grammarAccess.getSimulateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimulateStatement=ruleSimulateStatement();

            state._fsp--;

             current =iv_ruleSimulateStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimulateStatement"


    // $ANTLR start "ruleSimulateStatement"
    // InternalMyDsl.g:772:1: ruleSimulateStatement returns [EObject current=null] : (otherlv_0= 'Simulate' otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= '{' ( (lv_runs_4_0= ruleRunStatement ) )+ otherlv_5= '}' ) ;
    public final EObject ruleSimulateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_runs_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:778:2: ( (otherlv_0= 'Simulate' otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= '{' ( (lv_runs_4_0= ruleRunStatement ) )+ otherlv_5= '}' ) )
            // InternalMyDsl.g:779:2: (otherlv_0= 'Simulate' otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= '{' ( (lv_runs_4_0= ruleRunStatement ) )+ otherlv_5= '}' )
            {
            // InternalMyDsl.g:779:2: (otherlv_0= 'Simulate' otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= '{' ( (lv_runs_4_0= ruleRunStatement ) )+ otherlv_5= '}' )
            // InternalMyDsl.g:780:3: otherlv_0= 'Simulate' otherlv_1= 'until' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= '{' ( (lv_runs_4_0= ruleRunStatement ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getSimulateStatementAccess().getSimulateKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSimulateStatementAccess().getUntilKeyword_1());
            		
            // InternalMyDsl.g:788:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalMyDsl.g:789:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalMyDsl.g:789:4: (lv_condition_2_0= ruleCondition )
            // InternalMyDsl.g:790:5: lv_condition_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getSimulateStatementAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimulateStatementRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.xtext.example.mydsl4.MyDsl.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSimulateStatementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:811:3: ( (lv_runs_4_0= ruleRunStatement ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:812:4: (lv_runs_4_0= ruleRunStatement )
            	    {
            	    // InternalMyDsl.g:812:4: (lv_runs_4_0= ruleRunStatement )
            	    // InternalMyDsl.g:813:5: lv_runs_4_0= ruleRunStatement
            	    {

            	    					newCompositeNode(grammarAccess.getSimulateStatementAccess().getRunsRunStatementParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_runs_4_0=ruleRunStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSimulateStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"runs",
            	    						lv_runs_4_0,
            	    						"org.xtext.example.mydsl4.MyDsl.RunStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSimulateStatementAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimulateStatement"


    // $ANTLR start "entryRuleRunStatement"
    // InternalMyDsl.g:838:1: entryRuleRunStatement returns [EObject current=null] : iv_ruleRunStatement= ruleRunStatement EOF ;
    public final EObject entryRuleRunStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunStatement = null;


        try {
            // InternalMyDsl.g:838:53: (iv_ruleRunStatement= ruleRunStatement EOF )
            // InternalMyDsl.g:839:2: iv_ruleRunStatement= ruleRunStatement EOF
            {
             newCompositeNode(grammarAccess.getRunStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunStatement=ruleRunStatement();

            state._fsp--;

             current =iv_ruleRunStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRunStatement"


    // $ANTLR start "ruleRunStatement"
    // InternalMyDsl.g:845:1: ruleRunStatement returns [EObject current=null] : (otherlv_0= 'Run' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRunStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:851:2: ( (otherlv_0= 'Run' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMyDsl.g:852:2: (otherlv_0= 'Run' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMyDsl.g:852:2: (otherlv_0= 'Run' ( (otherlv_1= RULE_ID ) ) )
            // InternalMyDsl.g:853:3: otherlv_0= 'Run' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRunStatementAccess().getRunKeyword_0());
            		
            // InternalMyDsl.g:857:3: ( (otherlv_1= RULE_ID ) )
            // InternalMyDsl.g:858:4: (otherlv_1= RULE_ID )
            {
            // InternalMyDsl.g:858:4: (otherlv_1= RULE_ID )
            // InternalMyDsl.g:859:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRunStatementAccess().getFunctionTaskDefinitionCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRunStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020180800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000018400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080002000L});

}
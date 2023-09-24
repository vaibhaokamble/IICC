/*  WAP to create the application for OnlineExam using Collection 
    create the pojo class Question with field questionId,option1,option2,option3,option4,answer
    Create the class OnlineExamHelper which contain the following method  
    1) void addNewQuestion(Question question) : this method is used for add the new question 
        in ArrayList Collection
    2) void removeQuestion(unt questionId) : this method is used for remove the question
        from a collection
    3) void viewAllQuestion() : this method show the all question from collection
    4) boolean searchQuestion(String question_name) : this method is used for search using
        the question name
    5) void attemptQuestion(int question_id,String answer) : this method can search question using
        from collection and check its answer if answer is correct then count the marks
        otherwise not
    6) void showResult() : this method show the result means in this method we have to display 
        number of question ,count correct question and count incorrect question and display
        the result in percentage   */

        package vaibhao;

        import java.util.*;
        
        class Question {
            private int id;
            private String name;
            private String option1;
            private String option2;
            private String option3;
            private String option4;
            private String answer;
        
            public int getId() {
                return id;
            }
        
            public void setId(int id) {
                this.id = id;
            }
        
            public String getName() {
                return name;
            }
        
            public void setName(String name) {
                this.name = name;
            }
        
            public String getOption1() {
                return option1;
            }
        
            public void setOption1(String option1) {
                this.option1 = option1;
            }
        
            public String getOption2() {
                return option2;
            }
        
            public void setOption2(String option2) {
                this.option2 = option2;
            }
        
            public String getOption3() {
                return option3;
            }
        
            public void setOption3(String option3) {
                this.option3 = option3;
            }
        
            public String getOption4() {
                return option4;
            }
        
            public void setOption4(String option4) {
                this.option4 = option4;
            }
        
            public String getAnswer() {
                return answer;
            }
        
            public void setAnswer(String answer) {
                this.answer = answer;
            }
        }
        
        class OnlineExamHelper {
            ArrayList list = new ArrayList();
            int count = 0;
        
            public void addNewQuestion(Question question) {
                list.add(question);
            }
        
            public void viewAllQuestion() {
                for (Object obj : list) {
                    Question q = (Question) obj;
                    System.out.println(q.getId() + "\t" + q.getName() + "\t" + q.getOption1() + "\t" + q.getOption2() + "\t"
                            + q.getOption3() + "\t" + q.getOption4() + "\t" + q.getAnswer());
                }
            }
        
            public void removeQuestion(int questionId) {
                for (Object obj : list) {
                    Question q = (Question) obj;
                    int qid = q.getId();
                    if (qid == questionId) {
                        int index = list.indexOf(q);
                        if (index != -1) {
                            list.remove(index);
                        }
                    }
                }
            }
        
            public boolean searchQuestion(String questionName) {
                Iterator i = list.iterator();
                boolean b = false;
                while (i.hasNext()) {
                    Object obj = i.next();
                    Question q = (Question) obj;
                    String question = q.getName();
                    if (question.equals(questionName)) {
                        b = true;
                        break;
                    }
                }
                return b;
            }
        
            public void attemptQuestion(int questionId, String answer) {
                for (Object obj : list) {
                    Question q = (Question) obj;
                    int qid = q.getId();
                    String ans = q.getAnswer();
                    if (qid == questionId && ans.equals(answer)) {
                        count++;
                    }
                }
            }
        
            public void showResult() {
                if (list.size() != 0) {
                    float totalQuestion = list.size();
                    float incorrectQuestion = totalQuestion - count;
                    float per = count / totalQuestion;
                    System.out.println("Percentage Achieve By Students = " + (per * 100));
                } else {
                    System.out.println("Please  Add Question In Test The You Get Result");
                }
            }
        }
        
        public class OnlineExamApplication {
            public static void main(String[] args) {
                OnlineExamHelper helper = new OnlineExamHelper();
                do {
        
                    Scanner v = new Scanner(System.in);
                    System.out.println("1.Add The New Question In ArrayList Collection");
                    System.out.println("2.Remove The Question From A Collection");
                    System.out.println("3.Show The All Question From Collection");
                    System.out.println("4.Search Using The Question Name");
                    System.out.println(
                            "5.Search Question Using From Collection And Check Its Answer If Answer Is Correct Then Count The Marks");
                    System.out.println(
                            "6.Display Number Of Question Count Correct Question And Count Incorrect Question And Display The Result In Percentage");
                    System.out.println("Enter The Your Choice");
                    int choice = v.nextInt();
                    switch (choice) {
                    case 1:
                        v.nextLine();
                        System.out.println("Enter The Question Id");
                        int qid = v.nextInt();
                        v.nextLine();
                        System.out.println("Enter The Question");
                        String question = v.nextLine();
                        System.out.println("Enter the option1 value");
                        String option1 = v.nextLine();
                        System.out.println("Enter the option2 value");
                        String option2 = v.nextLine();
                        System.out.println("Enter the option3 value");
                        String option3 = v.nextLine();
                        System.out.println("Enter the option4 value");
                        String option4 = v.nextLine();
                        System.out.println("Enter the answer");
                        String answer = v.nextLine();
                        Question q = new Question();
                        q.setId(qid);
                        q.setName(question);
                        q.setOption1(option1);
                        q.setOption2(option2);
                        q.setOption3(option3);
                        q.setOption4(option4);
                        q.setAnswer(answer);
                        helper.addNewQuestion(q);
                        break;
        
                    case 2:
                        System.out.println("Enter The Question Id Which Want To Remove");
                        int questionId = v.nextInt();
                        helper.removeQuestion(questionId);
                        break;
        
                    case 3:
                        helper.viewAllQuestion();
                        break;
        
                    case 4:
                        System.out.println("Enter The Question For Searching Purpose");
                        question = v.nextLine();
                        boolean b = helper.searchQuestion(question);
                        if (b) {
                            System.out.println("Question Found");
                        } else {
                            System.out.println("Question Not Found");
                        }
                        break;
        
                    case 5:
                        v.nextLine();
                        System.out.println("Enter The Answer");
                        String ans = v.nextLine();
                        System.out.println("Enter The Question Number");
                        qid = v.nextInt();
                        helper.attemptQuestion(qid, ans);
                        break;
        
                    case 6:
                        helper.showResult();
                        break;
        
                    default:
                        System.out.println("Wrong Choice");
                    }
                } while (true);
            }
        }
public class Main {

    public static void main(String[] args) {

        try {

            if (args[0].equals("--pull-success") || args[0].equals("-pls")) {
                PullSuccess.create();
            } else {
                System.out.println("SimpleGitGUI: Args are invalid.\n");
                System.out.println("Valid args: \n--pull-success\n-pls");
            }
        } catch (Exception e) {
            System.out.println("SimpleGitGUI: No args provided.\n");
            System.out.println("Valid args: \n--pull-success\n-pls");
        }




    }

}

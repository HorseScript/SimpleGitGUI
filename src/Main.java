public class Main {

    public static void main(String[] args) {


        System.out.println("\n\n---------- START SIMPLEGITGUI ----------\n\n");


        try {

            if (args[0].equals("--pull-success") || args[0].equals("-pls")) {
                PullSuccess.create();
            } else if (args[0].equals("--push-success") || args[0].equals("-phs")) {
                PushSuccess.create();
            } else {
                System.out.println("\n\nSimpleGitGUI: Args are invalid.\n");
                System.out.println("Valid args: \n--pull-success\n-pls");
            }
        } catch (Exception e) {
            System.out.println("SimpleGitGUI: No args provided.\n");
            System.out.println("Valid args: \n\n--pull-success\n-pls\n\n--push-success\n-phs");
        }

        end();


    }

    public static void end () {

        System.out.println("\n\n---------- END SIMPLEGITGUI ----------\n\n");
        System.exit(0);

    }

}

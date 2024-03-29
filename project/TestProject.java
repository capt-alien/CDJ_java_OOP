public class TestProject{
    public static void main(String[] args){
        // TESTING FIRST LOAD
        Project testbot1 = new Project();

        System.out.println("Next line should be null");
        System.out.println(testbot1.elevatorPitch());

        // Test SETTERS
        testbot1.setName("Test1");
        testbot1.setDescription("Test for first Load is working");

        System.out.println("Next line should have pitch and name:");
        System.out.println(testbot1.elevatorPitch());

        System.out.println("Testing gettters:");
        System.out.println(testbot1.getName());
        System.out.println(testbot1.getDescription());

        // TESTING SECOND LOAD
        Project testbot2 = new Project("Test 2");

        System.out.println("Next line should only have a name");
        System.out.println(testbot2.elevatorPitch());

        // TEST SETTERS
        testbot2.setDescription("Testing second setter");

        System.out.println("Next line should have pitch and name:");
        System.out.println(testbot2.elevatorPitch());

        System.out.println("Testing gettters:");
        System.out.println(testbot2.getName());
        System.out.println(testbot2.getDescription());


        // TESTING Third LOAD
        Project testbot3 = new Project("Test 2", "this is the Third test.");

        System.out.println("Next line should have pitch and name:");
        System.out.println(testbot3.elevatorPitch());

        System.out.println("Testing gettters:");
        System.out.println(testbot3.getName());
        System.out.println(testbot3.getDescription());

        System.out.println("End of tests");
        // END OF CLASS
    }
}

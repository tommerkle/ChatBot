import java.io.*;


public class ChatBot {


    public static void main(String[] args) throws Exception {

        System.out.println("My name is Al");
        System.out.println("What is your name?");

        Brain botBrain = new Brain();

        while (true) {

            //new BufferedReader that is taking input from the console
            BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String input = buffer.readLine();


            //Normalize input
            input = TextNormalizer.normalize(input);



            // New message object for Brain
            Message resolvedInput = new Message(input);

            String botResponse = botBrain.respond(resolvedInput);


            /*EXIT BLOCK*/
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye");
                break;
            } else {
                System.out.println(botResponse);

            }


        }


    }
}

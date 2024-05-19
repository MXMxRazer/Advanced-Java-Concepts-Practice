import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        Students student = new Students("First", 20);

        String fileLocation = "C:\\Users\\varkr\\OneDrive\\Desktop\\Codes\\Advanced Java\\File.txt";

        System.out.println("ON LOCAL SYSTEM: " + student.getPrivateVariableNotSeen());

        // SERIALIZATION PROCESS
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;
        try
        {
            fileOut = new FileOutputStream(fileLocation);
            objOut = new ObjectOutputStream(fileOut);

            objOut.writeObject(student);

            fileOut.close();
            objOut.close();

            System.out.println("Serialized File Output: " + student);
        } catch (FileNotFoundException ex)
        {
            System.out.println("FILE NOT FOUND!");
        } catch (IOException e)
        {
            System.out.println("I/O ERROR!");
        }

        //DESERIALIZATION PROCESS
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
        try {
            fileIn = new FileInputStream(fileLocation);
            objIn = new ObjectInputStream(fileIn);

            Students deserializedObj = (Students) objIn.readObject();

            fileIn.close();
            objIn.close();

            System.out.println("Deserialized Object Output: " + deserializedObj);
            System.out.println("ON REMOTE SYSTEM: " + deserializedObj.getPrivateVariableNotSeen());
        } catch (FileNotFoundException e)
        {
            System.out.println("FILE NOT FOUND!");
        } catch (IOException e)
        {
            System.out.println("I/O ERROR!");
        } catch (ClassNotFoundException e)
        {
            System.out.println("CLASS NOT FOUND!");
        }

    }
}
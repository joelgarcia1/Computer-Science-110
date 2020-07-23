public class Puzzle
{
private static int numberOfStudents = 100;
private static int numberOfLockers = 101;
private static int LockersToCloseBy = 1;

public static void main(String[] args)
{
    boolean[] totalLockersArray = new boolean[numberOfLockers];
    for(int i = 1; i < totalLockersArray.length -1 ; i++)
    {
        totalLockersArray[i] = false;
    }


    for(int n= 0; n < totalLockersArray.length; ++n)
    {
        for(int j = 0; j < totalLockersArray.length; j += LockersToCloseBy)
        {

            if(totalLockersArray[j] == true)
            {
                totalLockersArray[j] = false;
            }
            else
            {
                totalLockersArray[j] = true;
            }   
        }
        LockersToCloseBy++;
    } 
for(int i = 1; i < numberOfLockers; i++){
    if(totalLockersArray[i] == true){
        System.out.println("Locker " + i + " is open");
    }
}

  }
}

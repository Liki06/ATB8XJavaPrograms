package sept.Assignment;
//Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4

public class Assignment_14 {
    public static void main(String[] args) {
        int vowelCount = 0;
        int ConstCount = 0;
        String name = "Likith";
        String strName = name.toUpperCase();


        for (int i = 0; i < strName.length(); i++)
        {
             if(strName.charAt(i)=='A' || strName.charAt(i)=='E' || strName.charAt(i)=='I' || strName.charAt(i)=='O' || strName.charAt(i)=='U' )
            {
                vowelCount++;
            }
             else if(!(strName.charAt(i)=='A' || strName.charAt(i)=='E' ||
                strName.charAt(i)=='I' || strName.charAt(i)=='O' || strName.charAt(i)=='U' ))
                             {
                                 ConstCount++;
                             }

        }
        System.out.println("Vowel count:" + vowelCount);
        System.out.println("Consonant count:  " + ConstCount);

    }
}


package jDemos1;

public class p71_delete_space_and_upper_1letter {
    public static void main(String[] args) {
        String str = "jaimin                       lodu";
   
        String[] words = str.split("\\s+");
        
        StringBuilder capitalizedString = new StringBuilder();
        for (String word : words) 
        {
            if (!word.isEmpty()) 
            {
                capitalizedString.append(Character.toUpperCase(word.charAt(0)));
                if (word.length() > 1) 
                {
                    capitalizedString.append(word.substring(1));
                }
                capitalizedString.append(" ");
            }
        }

        String result = capitalizedString.toString().trim();

        System.out.println("Original string: " + str);
        System.out.println("String with first: " + result);
    }
}

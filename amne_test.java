Amne Test

public class CalculateDifference{
    public static void main(String[] args) throws FileNotFoundException{
        try {
            
            // Read the input file
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            // Copy 1st line of input inside an array
            String[] line1 = bufferedReader.readLine().split(" ");

            // Window length
            int window = Integer.parseInt(line1[1]);
            
            int result;
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            
            // Append the lines of input inside a stringBuffer
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
            }
            fileReader.close();
            
            // Copy buffer elements inside an array
            String[] line2 = stringBuffer.toString().split(" ");
            int[] array = new int[line2.length];

            // Convert string into integer
            for(int i=0;i<line2.length;i++){
                array[i] = Integer.parseInt(line2[i]);
            }
            
            // Iterate over the array
            for(int i=0;i<=array.length-window;i++){
                int count1 = 0; int count2 = 0;
                int len1 = 1; int len2 = 1;
                // Count of increasing sub-arrays within the window
                for(int j=i;j<i+window-1;j++){
                    if(array[j]<array[j+1]){
                        len1++;
                    }
                    else{
                        count1 = count1+(len1*(len1-1)/2);
                        len1 = 1;
                    }
                }
                if(len1 > 1){
                    count1 = count1+(len1*(len1-1)/2);
                }

                // Count of decreasing sub-arrays within the window
                for(int j=i+window-1;j>i;j--){
                    if(array[j]<array[j-1]){
                        len2++;
                    }
                    else{
                        count2 = count2+(len2*(len2-1)/2);
                        len2 = 1;
                    }
                }
                if(len2 > 1){
                    count2 = count2+(len2*(len2-1)/2);
                }
                
                // Calculate the difference
                result = count1 - count2;

                // Prints the result
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
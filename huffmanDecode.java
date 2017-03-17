# Huffman Decoding

void decode(String S ,Node root)
{
    int length = S.length();
    StringBuilder sb = new StringBuilder();
    Node temp = root;
    for(int i=0;i<length;i++){
        if(S.charAt(i) == '1'){
            root = root.right;
            if(root.data != '\0'){
                sb.append(root.data);
                root = temp;
            }
        }
        else{
            root = root.left;
            if(root.data != '\0'){
                sb.append(root.data);
                root = temp;
            }
        }
    }
    System.out.println(sb.toString());
}
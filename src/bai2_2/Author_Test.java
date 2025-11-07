package bai2_2;
public class Author_Test {
    public static void main(String[] args){
        Author[]authors= new Author[2];
        authors[0]=new Author("Tan Ah Check","AhTeck@somewhere.com",'m');
        authors[1]= new Author("My Van","myvanhp28@gmail.com",'f');

        Book javaDummy= new Book("Java for Dummy", authors, 19.99,99);

        System.out.println(javaDummy.getAuthorName());



    }
}

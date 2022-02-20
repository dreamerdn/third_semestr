 import java.io.*;
    public class Lab1
    {
        private String data;
        private String filename;
        private String choice;
        private RandomAccessFile fio;
        private BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        public void runConsol(){
            while(true){
            try{
                System.out.println("\nEnter your choice:");
                System.out.println("1.Read text from file");
                System.out.println("2.Type text");
                System.out.println("3.Exit");

                //чтение выбора пользователя
                choice=in.readLine();
                if (choice.compareTo("1")==0){
                    System.out.println("Type your filename");
                    filename=in.readLine();
                    fio = new RandomAccessFile(new File(filename), "r");
                    data=fio.readLine();
                    fio.close();
                    System.out.println("\nFile Input:\n"+data);
                    int spaces=0, glas=0, lett=0;
                    char ch;
                    for(int i=0;i<data.length();i++) {
                        ch=Character.toLowerCase(data.charAt(i));
                        if(Character.isWhitespace(ch))
                            spaces++; if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='y')) glas++;
                        lett++;

                    }
                    System.out.println("\nspaces - "+spaces+"\nvowels - "+glas+"\nletters "+(lett-spaces));
                }

                else if (choice.compareTo("2")==0)
                {   System.out.println("Type your text");
                      data=in.readLine();
                        System.out.println("Type your filename");
                         filename=in.readLine();
                         fio = new RandomAccessFile(new File(filename), "rw");
                         fio.writeBytes(data);
                         fio.close();
                            System.out.println("Your text was saved");
                }
                else if (choice.compareTo("3")==0){
                return;
                 }
            }

            catch(FileNotFoundException e){ System.out.println("File not found"); }
            catch(IOException e){ System.out.println("Error1"); }
            catch(Exception e){System.out.println("Error2"); }
            }

        }
    }


public class typewriter {
    public static void main(String[] args) {
        String text = "Bienvenido a JavaQuest";
        int i;
        for(i = 0; i < text.length(); i++){
            System.out.printf("%c", text.charAt(i));
            try{
                Thread.sleep(100);//pause between characters
            }catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }


    }
}

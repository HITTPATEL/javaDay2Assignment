class P2{
    public static void main(String[] args){

     int number=12;
     String bag="";
  for(int i=1; i<=number; i++){ 
     if(number%i==0){
           bag+=i+" ";
     }
}

   System.out.println(bag);

}

}
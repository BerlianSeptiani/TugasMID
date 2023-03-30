/* Nama : Berlian Septiani
   Nim  : 13020210143
   Hari/Tanggal	:Rabu, 30 Maret 2023
   Kelas : B2 */




interface A {
 
   public void aaa();

  }



  interface B extends A {


    
}


class Central0143 implements B {
 
   public void aaa() {
  
      System.out.println("aaa");
   
 }

 

   public static void main(String arg[]) {
 
       Central0143 obj = new Central0143();
 
       System.out.println("main");

        obj.aaa();
    
   }

}
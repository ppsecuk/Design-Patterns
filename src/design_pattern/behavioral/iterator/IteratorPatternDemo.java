package design_pattern.behavioral.iterator;

public class IteratorPatternDemo {
	
   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();
      AgeRepository ageRepository = new AgeRepository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      }
      for(Iterator iter = ageRepository.getIterator(); iter.hasNext();){
         int age = (int)iter.next();
         System.out.println("Age : " + age);
      }
   }
}

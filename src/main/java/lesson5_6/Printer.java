package lesson5_6;

public class Printer {

  private String model;
  private int tonerLevelRed;
  private int tonerLevelGreen;
  private int tonerLevelBlue;


        public void fillUp(int tonerVolume, String color){

            if(tonerVolume> 100 ) tonerVolume = 100;
            else if (tonerVolume<0)tonerVolume =  0;
            switch (color){
                case "red":{this.tonerLevelRed=tonerVolume; break;}
                case "blue":{this.tonerLevelBlue=tonerVolume; break;}
                case "green":{this.tonerLevelGreen=tonerVolume; break;}
            }
        }

        private void usedToner(){
            this.tonerLevelGreen--;
            this.tonerLevelRed--;
            this.tonerLevelBlue--;
        }

        public void print(int pages, boolean isColor, boolean isDuplex){

            if (tonerIsEmpty() == false) {
                while (pages > 0) {
                    if (tonerIsEmpty() == false) {
                    if (isDuplex) {
                        System.out.println("Print page: " + pages + ", isColor: " + isColor + ", IsDuplex: " + isDuplex + ", Side 1");
                        System.out.println("Print page: " + pages + ", isColor: " + isColor + ", IsDuplex: " + isDuplex + ", Side 2");
                        usedToner();
                    } else {
                        System.out.println("Print page: " + pages + ", isColor: " + isColor + ", IsDuplex: " + isDuplex + ", Side 1");
                    }
                    usedToner();
                    } else { System.out.println("Without toner I can't print anything");}
                    pages--;
                }
        } else { System.out.println("Without toner I can't print anything");}

        }
        public boolean tonerIsEmpty(){
            return (tonerLevelRed>0 || tonerLevelGreen>0 || tonerLevelBlue>0) ? false : true;
        }

        private Printer(String model){
            this.model=model;
        }


    public static void main(String[] arg){

        Printer printer = new Printer("Super printer 2019");
        printer.fillUp(90,"red");
        printer.fillUp(60,"green");
        printer.fillUp(40,"blue");
        System.out.println("toner is empty: "+printer.tonerIsEmpty());
        printer.print(5,true,true);


    }


}


//"6. Create a class and demonstrate proper encapsulation techniques
//        the class will be called Printer
//        It will simulate a real Computer printer
//        It should have fields for toner level, number of pages printed, and also
//        whether its a duplex printer (capable of printing on both sides of the paper).
//        Add methods to fill up the toner (up to a maximum of 100%), another method to
//        simulate printing a page(which should increase the number of pages printed).
//        Decide on the scope, whether to use constructors, and anything else you think is needed."


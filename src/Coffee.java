public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("Dripping Coffee thru the Filter ");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}

public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee(){
    }

    public Employee(String id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }
//العلاوه السنوية
    public void setId(String id) {
        if (id.isEmpty()){
            System.out.println("Enter your ID");
        }else {
            this.id=id;
        }
    }

    public void setSalary(int salary) {
        if (salary<=0){
            System.out.println("Enter your salary");
        }else {
            this.salary = salary;
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public int getAnnualSalary(){
        if (this.salary<=0){
            System.out.println("Enter your salary first. your salary:"+this.salary);
            return salary;
        }else {
            int total=this.salary*12;
            return total;
        }
    }
    public int raisedSalary(int percent){
        double re = (double) percent / 100;
        double raise_amount = re * this.salary;
        double newSalary = this.salary + raise_amount;
        System.out.println(this.name + " your raised salary: " + newSalary);
        return (int) newSalary;
    }
    public String toString(){
        return "Your Information\n"+this.name+"\nyour salary "+this.salary+"\nyour ID "+this.id;
    }
}

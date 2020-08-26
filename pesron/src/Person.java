public class Person {
    private String name;
    private String surname;
    private Integer age;
    private String email;
    private Double salary;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setSalary(Double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    /**
     * From the csv format string gets Person.
     * @param csv
     * @return p
     */
    public static Person valueOf(String csv) {
        var parts = csv.split(",");
        Person p = new Person();
        p.setName(parts[0]);
        p.setSurname(parts[1]);
        p.setAge(Integer.valueOf(parts[2]));
        p.setEmail(parts[3]);
        p.setSalary(Double.valueOf(parts[4]));
        return p;
    }

    @Override
    public String toString()
    {
        return String.format("<%s %s, %d, %s, %f>",
                name, surname, age, email, salary);
    }
}

package com.royalsoftsolutions.getter_and_setter_javabean;

public class JavaBean_getter_setter {

    public static class Employee
    {
        private int id;
        private String Name,name;

        public Employee(){}

        public void setId(int id){this.id=id;}
        public int getId(){return id;}
        public void setName(String name)
        {
            //this.name = name;
            Name=name;
        }
        public String getName(){return Name;}
    }


}

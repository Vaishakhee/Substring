class person2
{
protected int id;
protected String name;
protected String address;
public int getId()
{
return id;
}
public void setId(int id)
{
this.id=id;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name=name;
}
public String getAddress()
{
return address;
}
public void setAddress(String address)
{
this.address=address;
}}

class Teacher extends person2
{
protected double salary;
public double getSalary()
{
return salary;
}
public void setSalary(double salary)
{
this.salary=salary;
}
}

class HOD extends Teacher
{
protected String dept;
public String getDept()
{
return dept;
}
public void setDept(String dept)
{
this.dept=dept;
}
}

class HODTest
{
public static void main(String args[])
{
HOD h=new HOD();
h.setId(102);
h.setName("vaishu");
h.setAddress("mumbai");
h.setSalary(50000);
h.setDept("computers");
System.out.println("id="+h.getId());
System.out.println("name="+h.getName());
System.out.println("address="+h.getAddress());
System.out.println("salary="+h.getSalary());
System.out.println("department="+h.getDept());
}
}

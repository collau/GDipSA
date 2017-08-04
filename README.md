# Lesson1

class MyFirstProgram { #class is like a bucket
  static void Main(){ #indentation for hierarchy (Main is in MyFirstProgram)
    System.Console.WriteLine("Hello world!");
  }

  
  #Save as FirstProgram.cs
 
 
 
 
 
namespace Day1 #title #surname
{ 
  class Program #classes cannot have the same name because it creates ambiguity: "Name of your child"
  {    
    static void Main() #method = Main [static void] must be there --> Main class, main method. Program will look for static void main
    {
      System.Console.WriteLine("Hello World!");
    }
  }

  class Something
  {
    static void Something() #static void - description of method
    {
      System.Console.WriteLine("Something was here"); #Namespace = "System", Class="Console", Method="WriteLine")
    }
  }
  
  
  Windows VisualBasic: Properties --> change the startup object to Something
  Combination of namespace/class cannot be duplicated

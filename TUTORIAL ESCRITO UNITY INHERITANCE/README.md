# How to: Inheritance in Unity

## Getting started

This guide will asume the following:
That you have already installed Unity, it will also assume that you know at least the basics of programming and have a bit of experience doing it. Also it will assume that you've had at least one beginner approach at Unity specifically. 

### What is "Inheritance"?

Inheritance one of the fundamental features of object-oriented programming (OOP) languages that allows the developer to define a parent (or base) class that provides specific behavior to data and from it define child (or derived) classes that reuses (or inherit), extends, or modifies said behaviors from the parent class thus not needing to re-code the same behaviors the developer wrote before.

## Example 1:

A step by step guide to to inherit methods and attributes from a parent class.

1. Create a parent class.

```
using UnityEngine;
using System.Collections;

public class Phone {                // This is the base/parent class
    public string color;            // This is an attribute of the parent class
    
}
```

2. Create a constructor for the parent class, in this example we'll be doing it from inside the parent class itself.

```
using UnityEngine;
using System.Collections;

public class {
    public string color;

    public Phone(){             // This is the first constructor for the Fruit class and is not inherited by any derived classes.
    color = "Jet Black";           // Here, the attribute 'color' has been inherited to the object and is given a value "Jet Black"
    Debug.Log("1st Phone Constructor Called");
    }
}
```

## Example 2:

A more complex look at inheritance in objects. 

```
using UnityEngine;
using System.Collections;

//Here we say that we are inheriting any attribute from the parent class "MonoBehavior"
public class smartPhones : MonoBehaviour {   
    void Start () {
        
        //Let's illustrate inheritance with the default constructors.
        Debug.Log("Creating a phone");
        Phone iPhone = new Phone();
        Debug.Log("Creating the iPhone");
        iPhone iPhoneX = new iPhone();

        //Call the methods of the smartPhone class.
        iPhone.unlockPhone();
        iPhone.callNumber();

        //Call the methods of the iPhoneX class.
        //Notice how class iPhoneX has access to all
        //of the public methods of class iPhone.
        iPhoneX.unlockPhone();
        iPhoneX.callNumber();

        //Now let's illustrate inheritance with the 
        //constructors that read in a string.
        Debug.Log("Creating the iPhone");
        iPhone = new smartPhone("Blue");
        Debug.Log("Creating the iPhoneX");
        IphoneX = new iPhone("Rose Gold");

    }
}
```

## Authors

* **3.14Q2** - *Explicación* 

## References

[Reference 1:](https://docs.unity3d.com/Manual/index.html)
[Reference 2:](https://docs.microsoft.com/en-us/dotnet/csharp/tutorials/inheritance)


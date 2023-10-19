package com.itheima.genericity_demo.genericity_interface;
/*
    模拟一个Cotlection接口，表示集合，集合操作的数据不确定。定义一个接口MyCollection具体表示
    接口泛型指定时机:
        1 可以在实现类实现接口时，确定接口中的泛型的类型
        2 如果实现类和接口不指定具体的类型，变成泛型的类使用。
 */
public interface MyCollection<E> {
    public abstract void add(E e);  //添加元素,但是不确定添加的元素的种类,所以使用泛型类E来约束
    public abstract void remove(E e);  //删除元素
}

//如果泛型没有指定,那么默认的泛型类型为Object类型这里的特点在之前的day_17/src/com/itheima/genericity_demo/genericity_class/Demo.java中已经提到过了
class MyCollectionImpl implements MyCollection{

    @Override
    public void add(Object o) {

    }

    @Override
    public void remove(Object o) {

    }
}

// 可以在实现类实现接口时，确定接口中的泛型的类型
class MyCollectionImpl2 implements MyCollection<String>{

    @Override
    public void add(String s) {

    }

    @Override
    public void remove(String s) {

    }
}
//如果实现类和接口不指定具体的类型，变成泛型的类使用
class MyCollectionImpl1<E> implements MyCollection<E>{//这里的E是一个泛型类,可以在创建对象时指定具体的类型,但是在实现类中的方法中的参数类型必须和泛型类的类型一致,由于不指定类的泛型会报错,无法识别出接口的泛型类,所以也需要将接口的实现类类指定为泛型类的约束
//在将类实例化为对象时,将泛型E确定为指定的数据类型,由于存在类的继承关系,所以指定的类型会传回父类,在父类中能够查看到指定的类型,所以在父类中的方法中的参数类型可以使用指定的类型,也就是将子类的泛型的指定数据类型传回父类
    @Override
    public void add(E e) {

    }

    @Override
    public void remove(E e) {

    }
}


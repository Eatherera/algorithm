package com.beijin.linear;


/**
 * 静态扩容
 * Author:Eather
 * Time:2024/9/8 上午10:07
 */
@SuppressWarnings("all")
public class SequentialList<T> implements List<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] array;

    private int size;

    public SequentialList() {
        this(DEFAULT_CAPACITY);
    }

    public SequentialList(int capacity) {
        //这里类型不能写T[]，否则会报错,无法实例化
        array = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        //根据元素个数判定是否为空
        return size == 0;
    }

    @Override
    public void add(T o) {
        if (size == array.length) {
            throw new IndexOutOfBoundsException("数组长度越界");
        }
        array[size++] = o;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index > array.length - 1) {
            throw new IndexOutOfBoundsException("索引越界");
        }
        T result = (T) array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        //末尾置空
        array[--size] = null;
        return result;
    }

    @Override
    public T set(int index, T t) {
        if (index < 0 || index > array.length - 1) {
            throw new IndexOutOfBoundsException("索引越界");
        }
        array[index] = t;
        if (index > size - 1) {
            size++;
        }
        return t;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > array.length - 1) {
            throw new IndexOutOfBoundsException("索引越界");
        }
        return (T) array[index];
    }

    /**
     * 基本数据类型自动装箱
     *
     * @param t
     * @return
     */
    @Override
    public String contains(T t) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(t)) {
                return "匹配成功";
            }
        }
        return "未找到匹配项";
    }

    @Override
    public void addFirst(T t) {
        if (size == array.length) {
            throw new IndexOutOfBoundsException("栈溢出");
        }
        for (int i = 1; i < size; i++) {
            array[i] = array[i - 1];
        }
        array[0] = t;
    }

    /**
     * 实例方法可以互相调用。在同一个类中，实例方法可以直接调用其他实例方法，
     * 而不需要通过对象引用。这是因为实例方法在同一个对象的上下文中运行，
     * 因此可以直接访问该对象的其他实例方法，构造函数可以直接调用实例方法
     *
     * @param t
     */
    @Override
    public void addLast(T t) {
        if (size == array.length) {
            throw new IndexOutOfBoundsException("栈溢出");
        }
        add(t);
    }

    @Override
    public T removeFirst() {
        return remove(0);
    }

    @Override
    public T removeLast() {
        return remove(size - 1);
    }
}

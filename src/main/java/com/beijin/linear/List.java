package com.beijin.linear;

/**
 * Author:Eather
 * Time:2024/9/8 上午10:11
 */
public interface List<T> {
    /**
     * 获取列表的大小
     * @return
     */
    int size();

    /**
     * 判断列表是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 向列表中添加元素
     * @param t
     */
    void add(T t);

    /**
     * 判断列表中是否包含元素
     * @param t
     * @return t
     */
    String contains(T t);

    /**
     * 获取列表中的第一个元素
     * @param t
     */
    void addFirst(T t);

   /**
     * 获取列表中的最后一个元素
     * @param index
     */
    T remove(int index);

    /**
     * 修改列表中的元素
     * @param index
     * @param  t
     * @return t
     */
    T set(int index, T t);

    /**
     * 获取列表中的元素
     * @param index
     * @return T
     */
    T get(int index);

    /**
     * 向列表中添加元素
     * @param t
     */
    void addLast(T t);

    /**
     * 删除列表中的第一个元素
     * @return
     */
    T removeFirst();

    /**
     * 删除列表中的最后一个元素
     * @return
     */
    T removeLast();
}

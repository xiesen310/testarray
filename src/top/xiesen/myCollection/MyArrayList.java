package top.xiesen.myCollection;

import java.util.ArrayList;

/**
 * 模拟实现jdk中提供的ArraryList类
 * 
 * @author Allen
 *
 */
public class MyArrayList {
	StringBuilder s;
	
	/**
	 * The value is used for object storage.
	 */
	private Object[] value;
	
	/**
	 * the size is number of object used.
	 */
	private int size;
	/**
	 * No arguments constructor
	 */
	public MyArrayList(){
		//value = new Object[16];
		this(10);
	}
	/**
	 * A parameter method
	 * @param size
	 */
	public MyArrayList(int size){
		if(size < 0){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		value = new Object[size];
	}
	
	/**
	 * return array size.
	 * @return
	 */
	public int size(){
		return size;
	}
	
	public boolean isEmpty() {
        return size == 0;
    }
	
	/**
	 * To add data in an array
	 * @param obj
	 */
	
	public void add(Object obj){
		value[size] = obj;
		size++;
		if(size >= value.length){
			//装不下，扩容
			int newCapacity = value.length*2;
			Object[] newList = new Object[newCapacity];
			//System.arraycopy(arg0, arg1, arg2, arg3, arg4);
			
			for (int i = 0; i < value.length; i++) {
				newList[i] = value[i];
			}
			
			value = newList;
		}
	}
	/**
	 * Access to the elements in the array
	 * @return
	 */
	public Object get(int index){
		rangeCheck(index);
		return value[index];
	}
	
	/**
	 * Returns the index of the first occurrence of the specified element
	 * @param obj
	 * @return
	 */
	public int indexOf(Object obj){
		if(obj == null){
			return -1;
		}else{
			for (int i = 0; i < value.length; i++) {
				if(obj == value[i]){
					return i;
				}
			}
			return -1;
		}
	}
	/**
	 * Returns the index of the last occurrence of the specified element
	 * @param obj
	 * @return
	 */
	public int LastIndexOf(Object obj){
		if(obj == null){
			return -1;
		}else{
			for (int i = value.length - 1; i >= 0; i--) {
				if(obj == value[i]){
					return i;
				}
			}
			return -1;
		}
	}
	
	public Object set(int index, Object object) {
		rangeCheck(index);
		Object oldValue = value[index];
        value[index] = object;
        return oldValue;
    }
	
	public void rangeCheck(int index){
		if(index < 0 || index > size -1){	//[0,size-1]
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);
		list.add("aaaaaaaa");
		list.add(new Human("Allen"));
		list.add("bbbbbbbbb");
		list.add("ccccccccc");
		list.add("ddddddddd");
		Human h = (Human) list.get(1);
		System.out.println(h.getName());
		
		System.out.println(list.size);
	}
}

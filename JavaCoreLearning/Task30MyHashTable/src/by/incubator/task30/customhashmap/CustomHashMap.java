package by.incubator.task30.customhashmap;

public class CustomHashMap<K,V> implements CustomHashMapInterface<K,V>{
    private int initialCap = 16;
    private Node<K, V>[] bucket;
    private int hashIndex;

    public CustomHashMap() {
        this.bucket = new Node[initialCap];
    }

    public CustomHashMap(int size) {
        this.initialCap = size;
        this.bucket = new Node[size];
    }

    //-----------Вставка значения по ключу------------
    public void put(K key, V val) {
        Node<K, V> nodeToEnter = new Node<>(key, val);
        if (key == null) {
            this.hashIndex = 0;
            bucket[hashIndex] = nodeToEnter; // если ключ null, то записываем узел в нулевой элемент таблицы
        } else {
            this.hashIndex = nodeToEnter.hashCode() & (initialCap - 1);
            if (hashIndex == 0) {
                hashIndex++; //потому что нулевая ячейка зарезервирована для null ключей
            }
            //Смотрим, что творится в ячейке по вычисленному индексу. Разрастание  линкед листов в ячейках происходит из-за коллизий. Разные ключи дают одинаковый хеш
            Node<K, V> nodeToCheck = bucket[hashIndex];//переписываем узел из ячейки в вычисленном индексе
            if (nodeToCheck == null) {
                bucket[hashIndex] = nodeToEnter;//если в ячейке не было узлов, тогда кладем туда наш узел
            } else {
                while (nodeToCheck.next != null) {//если в ячейке был узел проходимся по всем узлам с ним связанным
                    if (nodeToCheck.getKey().equals(key)) {//находим узел с таким же ключом, как тот, который мы добавляем и
                        //меняем в нем значение на наше
                        nodeToCheck.setValue(val);
                        return;
                    }
                    nodeToCheck = nodeToCheck.next;
                }
                //Если в ячейке был узел с таким же ключом как у нас
                if (nodeToCheck.getKey().equals(key)) {
                    nodeToCheck.setValue(val);
                    return;
                }
                nodeToCheck.next = nodeToEnter;
            }
        }
    }

    //----------------Метод для извлечения значения по ключу---------
    public V get(K key) {
        Node<K, V> tempNode = new Node<>(key, null);
        int checkIndex;
        if (key == null) {
            return bucket[0].getValue();
        } else {
            checkIndex = tempNode.hashCode() & (initialCap - 1);//вычисляем индекс
            if (checkIndex == 0) {
                checkIndex++; //смотрим следующую ячейку
            }
        }
        tempNode = bucket[checkIndex];//переписываем узел по вычисленному индексу
        if (tempNode == null) {//если по индексу нет узлов
            return null;
        }
        while (tempNode != null) {//пробегаем по линкедлисту по вычисленному индексу и ищем узел с таким же ключом как наш
            if (tempNode.getKey().equals(key)) {
                return tempNode.getValue();
            }
            tempNode = tempNode.next;
        }
        return null;
    }

    //----------------Удалить узел по ключу--------------
    public Node<K, V> remove(K key) {
        Node<K, V> tempNode = new Node<>(key, null);
        int removeIndex;
        if (key == null) {
            removeIndex = 0;
            tempNode = bucket[removeIndex];
            bucket[removeIndex] = null;
            return tempNode;
        } else {
            removeIndex = tempNode.hashCode() & (initialCap - 1);
            if (removeIndex == 0) {
                removeIndex++;
            }
            tempNode = bucket[removeIndex];
            if (tempNode == null) {
                System.out.println("nothing to remove");
                return null;
            }
            if(tempNode.getKey().equals(key)){
                bucket[removeIndex] = tempNode.next;
                tempNode.next = null;
                return tempNode;
            }
            Node<K,V> prev = tempNode;
            tempNode = tempNode.next;
            while(tempNode != null){
                if(tempNode.getKey().equals(key)){
                    prev.next = tempNode.next;
                    tempNode.next = null;
                    return tempNode;
                }

                prev = tempNode;
                tempNode = tempNode.next;
            }

        }
        return null;
    }

    public int getHashIndex() {
        return hashIndex;
    }

    public void display() {
        for (int i = 0; i < initialCap; i++) {
            Node<K, V> n = bucket[i];
            if (n == null) {
                System.out.println("nothing on Index : " + i);
            } else {
                System.out.println("Values on Index : " + i);
                while (n.next != null) {
                    System.out.println(n.getKey());//когда тестим HashSet, то замениваем на getKey()
                    n = n.next;
                }
                System.out.println(n.getKey());//когда тестим HashSet, то замениваем на getKey()
            }
        }

    }

}

class Cell{
    private Object element;
    private Cell next;
    Cell(Object element){
        this.element = element;
    }
    public Object getElement(){
        return element;

    }
    public Cell getNext(){
        return next;
    }
    public void setElement(Object element){
        this.element = element;
    }
    public void setNext(Cell next){
        this.next = next;
    }
    public String toString(){
        String s = (String)this.element;
        if (this.next == null){
            return s;
        }else {
            return (s + " <-- " + (this.next).toString());
        }
    }
}

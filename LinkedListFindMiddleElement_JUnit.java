public class LinkedListFindMiddleElement_JUnit{

	@Test
	public void edgeCaseScenarios(){
    //empty list
    LinkedListFindMiddleElement list = new LinkedListFindMiddleElement();
    assertEquals("", list.getMiddle());

	}
  
  @Test
	public void testEvenAmtOfNodes(){
    
    MyLinkedList list = new MyLinkedList();
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
		list.insert(new Node("middle"));
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
		
    assertEquals("middle", list.getMiddle());


	}
  
   @Test
	public void testUnevenAmtOfNodes(){
    
    MyLinkedList list = new MyLinkedList();
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
		list.insert(new Node("middle"));
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
		list.insert(new Node("abc"));
    
    assertEquals("middle", list.getMiddle());

	}
  
 }


//MAVIDOU ELEFTHERIA 4613

@Test
public void testGetIdentificationCode() throws ParseException
{
	List<String> instance = new ArrayList<>();
	String expResult = "000000123456";
    String result = instance.getIdentificationCode();
    assertEquals(expResult, result);
	
}


@Test(expected = ParseException.class)
public void testGetIdentificationCodeWithLongCode() throws ParseException 
{
    List<String> instance = new ArrayList<>();
    fail("Should have failed since the identification code is too long");
}

@Test
public void testGetCountryCode() throws ParseException 
{
    List<String> instance = new ArrayList<>();
    String expResult = "0964";
    String result = instance.getCountryCode();
    assertEquals(expResult, result);
}
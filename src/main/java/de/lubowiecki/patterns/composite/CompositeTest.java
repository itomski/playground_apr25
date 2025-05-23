package de.lubowiecki.patterns.composite;

public class CompositeTest {

    public static void main(String[] args) {

        WordDoc word = new WordDoc();
        ExcelDoc excel = new ExcelDoc();
        PowerPointDoc ppoint = new PowerPointDoc();

        //word.print();
        //excel.print();
        //ppoint.print();
        DocGroup group = new DocGroup(word, excel);
        group.add(ppoint);
        group.add(new WordDoc(), new WordDoc());

        // Die Gruppe verhält sich wie ein Dokument
        group.print();
    }
}

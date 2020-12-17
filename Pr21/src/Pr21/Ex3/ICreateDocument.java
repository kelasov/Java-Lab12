package Pr21.Ex3;

public class ICreateDocument implements IDocument{
    public IDocument CreateNew(){
        IDocument document = new IDocument() {

        };
        new TextDocument();
        return document;
    }

    public IDocument CreateOpen(){
        IDocument document = new IDocument() {
        };
        new TextDocument();
        return document;
    }
}
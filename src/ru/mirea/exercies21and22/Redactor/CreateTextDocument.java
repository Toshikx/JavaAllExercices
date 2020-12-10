package ru.mirea.exercies21and22.Redactor;

public class CreateTextDocument extends ICreateDocument {


    @Override
    IDocument CreateNew() {
        return new TextDocument();
    }

    @Override
    IDocument CreateOpen() {
        return new TextDocument();
    }
}
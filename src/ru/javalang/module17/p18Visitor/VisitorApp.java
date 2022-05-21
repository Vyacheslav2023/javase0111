package ru.javalang.module17.p18Visitor;

public class VisitorApp {
    public static void main(String[] args) {
        Element body = new BodyElement();
        Element engine = new EngineElement();
        Visitor badBoy = new BadBoyVisitor();

        body.accept(badBoy);
        engine.accept(badBoy);

        Visitor mechanik = new MechanicVisitor();
        body.accept(mechanik);
        engine.accept(mechanik);
    }
}

interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement body);
}

interface Element {
    void accept(Visitor visitor);
}

class BodyElement implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class EngineElement implements Element{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class BadBoyVisitor implements Visitor {

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Engine run");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Body try crash");
    }
}

class MechanicVisitor implements Visitor{

    @Override
    public void visit(EngineElement engine) {
        System.out.println("Engine test!");
    }

    @Override
    public void visit(BodyElement body) {
        System.out.println("Body Fix!");
    }
}
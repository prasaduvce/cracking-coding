package com.practice.idealo.toyrobot;

public class ToyRobot {
    int x;
    int y;
    Facing facing;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > 5 || x < 0) {
            throw new IllegalArgumentException("x or y value invalid");
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y > 5 || y < 0) {
            throw new IllegalArgumentException("x or y value invalid");
        }
        this.y = y;
    }

    public Facing getFacing() {
        return facing;
    }

    public void setFacing(Facing facing) {
        this.facing = facing;
    }

    public void init(int x, int y, Facing facing) {
        if (x > 5 || y >5 || x < 0 || y < 0) {
            throw new IllegalArgumentException("x or y value invalid");
        }
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    public Facing turnLeft(Facing facing) {
        Facing newFacing;
        switch (facing) {
            case EAST:
                newFacing = Facing.NORTH;
                this.facing = newFacing;
                return newFacing;
            case NORTH:
                newFacing = Facing.WEST;
                this.facing = newFacing;
                return newFacing;
            case WEST:
                newFacing = Facing.SOUTH;
                this.facing = newFacing;
                return newFacing;
            case SOUTH:
                newFacing = Facing.EAST;
                this.facing = newFacing;
                return newFacing;
            default: throw new IllegalArgumentException("Illegal facing "+facing);
        }
    }

    public Facing turnRight(Facing facing) {
        Facing newFacing;
        switch (facing) {
            case EAST:
                newFacing = Facing.SOUTH;
                this.facing = newFacing;
                return newFacing;
            case NORTH:
                newFacing = Facing.EAST;
                this.facing = newFacing;
                return newFacing;
            case WEST:
                newFacing = Facing.NORTH;
                this.facing = newFacing;
                return newFacing;
            case SOUTH:
                newFacing = Facing.WEST;
                this.facing = newFacing;
                return newFacing;
            default: throw new IllegalArgumentException("Illegal facing "+facing);
        }
    }

    public void move(Facing facing) {
        int newX;
        int newY;
        switch (facing) {
            case EAST:
                newX = getX();
                newX++;
                setX(newX);
                break;
            case NORTH:
                newY = getY();
                newY++;
                setY(newY);
                break;
            case WEST:
                newX = getX();
                newX--;
                setX(newX);
                break;
            case SOUTH:
                newY = getY();
                newY--;
                setY(newY);
                break;
            default:
                throw new IllegalArgumentException("Invalid Facing received while making MOVE");
        }
    }

    public Report report() {
        return new Report(this.x, this.y, this.facing);
    }

    @Override
    public String toString() {
        return "ToyRobot{" +
            "x=" + x +
            ", y=" + y +
            ", facing=" + facing +
            '}';
    }
}

enum Facing {
    NORTH, SOUTH, EAST, WEST
}

enum Direction {
    LEFT, RIGHT
}

class Report {
    int x;
    int y;
    Facing facing;

    public Report() {
    }

    public Report(int x, int y, Facing facing) {
        this.x = x;
        this.y = y;
        this.facing = facing;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Facing getFacing() {
        return facing;
    }

    public void setFacing(Facing facing) {
        this.facing = facing;
    }

    @Override
    public String toString() {
        return "Report{" +
            "x=" + x +
            ", y=" + y +
            ", facing=" + facing +
            '}';
    }
}
package exception;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException2 se) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException2 me) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException2, MemoryException2 {
        if(!enoughSpace()) {
            throw new SpaceException2("설치할 공간이 부족합니다.");
        }
        if(!enoughMemory()) {
            throw new MemoryException2("메모리가 부족합니다.");
        }
    }

    static void copyFiles() { /* 파일을 복사하는 코드를 적는다. */ }
    static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다. */ }
    static boolean enoughSpace() {
        /* 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다. */
        return false;
    }
    static boolean enoughMemory() {
        /* 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다. */
        return true;
    }
}

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException2 extends Exception {
    SpaceException2(String msg) {
        super(msg);
    }
}

class MemoryException2 extends Exception {
    MemoryException2(String msg) {
        super(msg);
    }
}

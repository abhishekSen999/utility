package codes.sen.utility;

/**
 * Utility Class To Assert certain conditions or throw {@code RuntimeException}s
 */
public class Assert {

    /**
     * Throws {@code IllegalArgumentException} if {@code leftType} class isAssignable from {@code rightType} class or {@code rightType} class isAssignable from {@code leftType}
     * @param leftType LeftClassType
     * @param rightType RightClassType
     */
    public static final void nonAssignableTypes(Class<?> leftType , Class<?> rightType){
        if(leftType.isAssignableFrom(rightType) || rightType.isAssignableFrom(leftType)){
            throw new IllegalArgumentException(
                    "Any of "+leftType.getName()+" or "
                            + rightType.getName()+" is assignable to the other.");

        }
    }

    /**
     * Throws {@code IllegalArgumentException} if {@code object} is {@code null}
     * @param object to be checked
     * @param message will be the message in {@code IllegalArgumentException}
     */
    public static final void notNull(Object object , String message){
        if( object == null)
            throw new IllegalArgumentException(message);
    }

}

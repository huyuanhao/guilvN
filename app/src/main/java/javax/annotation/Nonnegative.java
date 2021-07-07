package javax.annotation;

import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.meta.TypeQualifier;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

@TypeQualifier(applicableTo = Number.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Nonnegative {

    public static class Checker implements TypeQualifierValidator<Nonnegative> {
        public When OooO00o(Nonnegative nonnegative, Object obj) {
            if (!(obj instanceof Number)) {
                return When.NEVER;
            }
            Number number = (Number) obj;
            boolean z = true;
            if (!(number instanceof Long) ? !(number instanceof Double) ? !(number instanceof Float) ? number.intValue() >= 0 : number.floatValue() >= 0.0f : number.doubleValue() >= AbstractC8352oOoOOoO0.OooO0O0 : number.longValue() >= 0) {
                z = false;
            }
            if (z) {
                return When.NEVER;
            }
            return When.ALWAYS;
        }
    }

    When when() default When.ALWAYS;
}

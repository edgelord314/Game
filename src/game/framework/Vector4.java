package game.framework;

/**
 * Vector4 class representing a vector of <x, y, z, w> components.
 * <br />
 * <h1>Not Yet Implemented</h1>
 * <ul>
 *  <li>Barycentric</li>
 *  <li>CatmullRom</li>
 *  <li>Hermite</li>
 *  <li>Linear Interpolation</li>
 *  <li>Max</li>
 *  <li>Min</li>
 *  <li>Multiply</li>
 *  <li>Negate</li>
 *  <li>Normalize</li>
 *  <li>Subtract</li>
 *  <li>SmoothStep</li>
 *  <li>Transform</li>
 * </ul>
 * @version incomplete
 * @author paul
 */
public class Vector4 extends Vector3
{
    /**
     * The w component of the Vector4.
     */
    public final float w;
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Complete Constructor
     * Sets x, y, z, and w components of the Vector4
     * @param x x component of Vector4
     * @param y y component of Vector4
     * @param z z component of Vector4
     * @param w w component of Vector4
     */
    public Vector4(float x, float y, float z, float w)
    {
        super(x, y, z);
        this.w = w;
    }
    
    /**
     * Sets x, y, z, and w components of the Vector4. 
     * Converts integer arguments to float.
     * @param x x component of Vector4
     * @param y y component of Vector4
     * @param z z component of Vector4
     * @param w w component of Vector4
     */
    public Vector4(int x, int y, int z, int w)
    {
        this((float)x, (float)y, (float)z, (float)w);
    }
    
    /**
     * Sets x, y, z, and w components of Vector4 to value.
     * @param value Float value used to set all components to.
     */
    public Vector4(float value)
    {
        this(value, value, value, value);
    }
    
    
    /**
     * Sets x, y, z, and w components of Vector4 to value.
     * Converts integer arguments to float.
     * @param value Integer value used to set all components to.
     */
    public Vector4(int value)
    {
        this((int)value, (int)value, (int)value, (int)value);
    }
    
    /**
     * Empty Constructor.
     * Sets all components of the Vector4 to zero.
     */
    public Vector4()
    {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    /**
     * Copy Constructor.
     * Makes a copy of the Vector4 provided.
     * @param copy Vector4 to be copied.
     */
    public Vector4(Vector4 copy)
    {
        this(copy.x, copy.y , copy.z, copy.w);
    }
    
    /**
     * Creates a Vector4 with a Vector3 parameter.
     * @param vec3 A Vector3 we want to change to a Vector4.
     */
    public Vector4(Vector3 vec3)
    {
        this(vec3.x, vec3.y, vec3.z, 0.0f);
    }
    
    /**
     * Creates a Vector4 with a Vector3 and a float w.
     * @param vec3 A Vector3 we want to change to a Vector4.
     * @param w A float value we want to set the w value to.
     */
    public Vector4(Vector3 vec3, float w)
    {
        this(vec3.x, vec3.y, vec3.z, w);
    }
    
    /**
     * Creates a Vector4 with a Vector2.
     * @param vec2 A Vector2 we want to change to a Vector4.
     */
    public Vector4(Vector2 vec2)
    {
        this(vec2.x, vec2.y, 0.0f, 0.0f);
    }
    
    /**
     * Creates a Vector4 with a Vector2, a float z, and a float w.
     * @param vec2 A Vector3 we want to change to a Vector4.
     * @param z A float value we want to set the z value to.
     * @param w A float value we want to set the w value to.
     */
    public Vector4(Vector2 vec2, float z, float w)
    {
        this(vec2.x, vec2.y, z, w);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Add">
    /**
     * Performs Vector4 Addition on two Vector4
     * @param a Vector4 to be added
     * @param b Vector4 to be added
     * @return Returns the result of a + b
     */
    public static Vector4 add(Vector4 a, Vector4 b)
    {
        return new Vector4(a.x + b.x, a.y + b.y, a.z + b.z, a.w + b.w);
    }
    
    /**
     * Performs Vector4 addition with a Vector4 and a Vector3
     * @param a Vector4 to be added.
     * @param b Vector3 to be added.
     * @return Returns the result of a + b.
     */
    public static Vector4 add(Vector4 a, Vector3 b)
    {
        return Vector4.add(a, new Vector4(b));
    }
    
    /**
     * Performs Vector4 addition with a Vector4 and a Vector2
     * @param a Vector4 to be added.
     * @param b Vector2 to be added.
     * @return Returns the result of a + b.
     */
    public static Vector4 add(Vector4 a, Vector2 b)
    {
        return Vector4.add(a, new Vector4(b));
    }
    
    /**
     * Performs Vector4 addition with this Vector4 and that Vector4
     * @param that Vector4 to be added.
     * @return returns the result of this + that.
     */
    public Vector4 add(Vector4 that)
    {
        return Vector4.add(this, that);
    }
    
    /**
     * Performs Vector4 addition with this Vector4 and that Vector3
     * @param that Vector3 to be added.
     * @return Returns the result of this + that.
     */
    @Override
    public Vector4 add(Vector3 that)
    {
        return Vector4.add(this, that);
    }
    
    /**
     * Performs Vector4 addition with this Vector4 and a Vector3 and a w value.
     * @param that Vector3 to be added.
     * @param w The w component to append to the Vector3.
     * @return Returns this + that;
     */
    public Vector4 add(Vector3 that, float w)
    {
        return Vector4.add(this, new Vector4(that, w));
    }
    
    /**
     * Performs Vector4 addition with this Vector4 and that Vector2
     * @param that Vector2 to be added.
     * @return Returns the result of this + that.
     */
    @Override
    public Vector4 add(Vector2 that)
    {
        return Vector4.add(this, that);
    }
    
    /**
     * Performs Vector4 addition with this Vector4 and a Vector2, a z value, and a w value.
     * @param that Vector2 to be added.
     * @param z The z component to append to the Vector2.
     * @param w The w component to append to the Vector2.
     * @return Returns this + that;
     */
    public Vector4 add(Vector2 that, float z, float w)
    {
        return Vector4.add(this, new Vector4(that, z, w));
    }
    
    /**
     * Performs addition with this Vector4 and the x, y, z, and w values provided.
     * @param x The x component we want to add to this Vector4.
     * @param y The y component we want to add to this Vector4.
     * @param z The z component we want to add to this Vector4.
     * @param w The w component we want to add to this Vector4. 
     * @return Returns a Vector4 with x added to this.x, y added to this.y, z added to this.z, and w added to this.w
     */
    public Vector4 add(float x, float y, float z, float w)
    {
        return Vector4.add(this, new Vector4(x, y, z, w));
    }
    
    /**
     * Performs addition with this Vector4 and the x, y, z, and w values provided.
     * Converts integer arguments to float.
     * @param x The x component we want to add to this Vector4.
     * @param y The y component we want to add to this Vector4.
     * @param z The z component we want to add to this Vector4.
     * @param w The w component we want to add to this Vector4. 
     * @return Returns a Vector4 with x added to this.x, y added to this.y, z added to this.z, and w added to this.w
     */
    public Vector4 add(int x, int y, int z, int w)
    {
        return Vector4.add(this, new Vector4(x, y, z, w));
    }
    
    /**
     * Adds the value provided to the x component.
     * @param x The x value we want to add to this Vector4.
     * @return Returns a Vector4 with x added to this.x
     */
    @Override
    public Vector4 addX(float x)
    {
        return Vector4.add(this, new Vector4(x, 0.0f, 0.0f, 0.0f));
    }
    
    /**
     * Adds the value provided to the x component.
     * Converts integer arguments to float.
     * @param x The x value we want to add to this Vector4.
     * @return Returns a Vector4 with x added to this.x
     */
    @Override
    public Vector4 addX(int x)
    {
        return Vector4.add(this, new Vector4((float)x, 0.0f, 0.0f, 0.0f));
    }
    
    /**
     * Adds the value provided to the y component.
     * @param y The y value we want to add to this Vector4.
     * @return Returns a Vector4 with y added to this.y
     */
    @Override
    public Vector4 addY(float y)
    {
        return Vector4.add(this, new Vector4(0.0f, y, 0.0f, 0.0f));
    }
    
    /**
     * Adds the value provided to the y component.
     * Converts integer arguments to float.
     * @param y The y value we want to add to this Vector4.
     * @return Returns a Vector4 with y added to this.y
     */
    @Override
    public Vector4 addY(int y)
    {
        return Vector4.add(this, new Vector4(0.0f, (float)y, 0.0f, 0.0f));
    }
    
    /**
     * Adds the value provided to the z component.
     * @param z The z value we want to add to this Vector4.
     * @return Returns a Vector4 with z added to this.z
     */
    @Override
    public Vector4 addZ(float z)
    {
        return Vector4.add(this, new Vector4(0.0f, 0.0f, z, 0.0f));
    }
    
    
    /**
     * Adds the value provided to the z component.
     * Converts integer arguments to float.
     * @param z The z value we want to add to this Vector4.
     * @return Returns a Vector4 with z added to this.z
     */
    @Override
    public Vector4 addZ(int z)
    {
        return Vector4.add(this, new Vector4(0.0f, 0.0f, (float)z, 0.0f));
    }
    
    /**
     * Adds the value provided to the w component.
     * @param w The w value we want to add to this Vector4.
     * @return Returns a Vector4 with w added to this.w
     */
    public Vector4 addW(float w)
    {
        return Vector4.add(this, new Vector4(0.0f, 0.0f, 0.0f, w));
    }

    /**
     * Adds the value provided to the w component.
     * Converts integer arguments to float.
     * @param w The w value we want to add to this Vector4.
     * @return Returns a Vector4 with w added to this.w
     */
    public Vector4 addW(int w)
    {
        return Vector4.add(this, new Vector4(0.0f, 0.0f, 0.0f, (float)w));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Barycentric">
    public static Vector4 barycentric()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CatmullRom">
    public static Vector4 catmullRom()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Clamp">
    /**
     * Clamps a Vector4 between a min Vector4 and a max Vector4
     * @param value The Vector4 we want to clamp.
     * @param min A Vector4 containing the minimum values.
     * @param max A Vector4 containing the maximum values.
     * @return Returns a Vector4 clamped between min and max inclusive.
     */
    public static Vector4 clamp(Vector4 value, Vector4 min, Vector4 max)
    {
        float newX = value.x;
        float newY = value.y;
        float newZ = value.z;
        float newW = value.w;
        // Clamp the x value between the min and max.
        if(value.x < min.x)
            newX = min.x;
        else if(value.x > max.x)
            newX = max.x;
        // Clamp the y value between the min and max.
        if(value.y < min.y)
            newY = min.y;
        else if(value.y > max.y)
            newY = max.y;
        // Clamp the z value between the min and max.
        if(value.z < min.z)
            newZ = min.z;
        else if(value.z > max.z)
            newZ = max.z;
        // Clamp the w value between the min and max
        if(value.w < min.w)
            newW = min.w;
        else if(value.w > max.w)
            newW = max.w;
        // Return the clamped Vector4
        return new Vector4(newX, newY, newZ, newW);
    }
    
    /**
     * Clamps this Vector4 between a min Vector4 and a max Vector4
     * @param min A Vector4 containing the minimum values.
     * @param max A Vector4 containing the maximum values.
     * @return Returns a Vector4 clamped between min and max inclusive.
     */
    public Vector4 clamp(Vector4 min, Vector4 max)
    {
        return Vector4.clamp(this, min, max);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Distance">
    /**
     * Computes the distance between two Vector4.
     * @param a A Vector4 we want to compute the distance with.
     * @param b A Vector4 we want to compute the distance with.
     * @return Returns the distance between a and b.
     */
    public static float distance(Vector4 a, Vector4 b)
    {
        return Vector4.subtract(a, b).magnitude();
    }
    
    /**
     * Computes the distance between this and that.
     * @param that A Vector4 we want to compute the distance with this.
     * @return Returns the distance between this and that.
     */
    public float distance(Vector4 that)
    {
        return Vector4.distance(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Distance Squared">
    /**
     * Computes the distance between two Vector4 squared.
     * @param a A Vector4 we want to compute the distance squared with.
     * @param b A Vector4 we want to compute the distance squared with.
     * @return Returns the distance between a and b squared.
     */
    public static float distanceSquared(Vector4 a, Vector4 b)
    {
        return Vector4.subtract(a, b).magnitudeSquared();
    }
    
    /**
     * Computes the distance between this and that squared.
     * @param that A Vector4 we want to compute the distance squared with this.
     * @return Returns the distance between this and that squared.
     */
    public float distanceSquared(Vector4 that)
    {
        return Vector4.distanceSquared(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Divide">
    /**
     * Performs scalar division between a Vector4 and a scalar. 
     * @param vec A Vector4 we want to divide.
     * @param scalar A scalar we want to divide the Vector4 by.
     * @return Returns a new Vector4 divide by the scalar.
     */
    public static Vector4 divide(Vector4 a, float scalar)
    {
        return new Vector4(a.x / scalar, a.y / scalar, a.z / scalar, a.w / scalar);
    }
    
    /**
     * Performs scalar division between a Vector4 and a scalar. 
     * Converts integer arguments to float.
     * @param vec A Vector4 we want to divide.
     * @param scalar A scalar we want to divide the Vector4 by.
     * @return Returns a new Vector4 divide by the scalar.
     */
    public static Vector4 divide(Vector4 a, int scalar)
    {
        return Vector4.divide(a, (float)scalar);
    }
    
    /**
     * Performs scalar division between this Vector4 and a scalar. 
     * @param scalar A scalar we want to divide the Vector4 by.
     * @return Returns a new Vector4 divide by the scalar.
     */
    @Override
    public Vector4 divide(float scalar)
    {
        return Vector4.divide(this, scalar);
    }
    
    /**
     * Performs scalar division between this Vector4 and a scalar. 
     * Converts integer arguments to float.
     * @param scalar A scalar we want to divide the Vector4 by.
     * @return Returns a new Vector4 divide by the scalar.
     */
    @Override
    public Vector4 divide(int scalar)
    {
        return Vector4.divide(this, (float)scalar);
    }
    
    /**
     * Performs scalar division component wise between two Vector4's
     * @param a A Vector4 we want to divide.
     * @param b A Vector4 we want to divide by.
     * @return Returns a new Vector4 divided component wise by another Vector4.
     */
    public static Vector4 divide(Vector4 a, Vector4 b)
    {
        return new Vector4(a.x / b.x, a.y / b.y, a.z / b.z, a.w / b.w);
    }
    
    /**
     * Performs scalar division component wise between this Vector4 and that Vector4
     * @param that A Vector4 we want to divide by.
     * @return Returns a new Vector4 divided component wise by another Vector4.
     */
    public Vector4 divide(Vector4 that)
    {
        return Vector4.divide(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Dot Product">
    /**
     * Performs the dot product between two Vector4's.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param veca A Vector4 that we want to perform the dot product on.
     * @param vecb A Vector4 that we want to perform the dot product on.
     * @return Returns a dot b.
     */
    public static float dotProduct(Vector4 a, Vector4 b)
    {
        return (a.x * b.x) + (a.y * b.y) + (a.z * b.z) + (a.w * b.w); 
    }
    
    /**
     * Performs the dot product between a Vector4 and a Vector3.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param veca A Vector4 that we want to perform the dot product on.
     * @param vecb A Vector3 that we want to perform the dot product on.
     * @return Returns a dot b.
     */
    public static float dotProduct(Vector4 a, Vector3 b)
    {
        return Vector4.dotProduct(a, new Vector4(b));
    }
    
    /**
     * Performs the dot product between a Vector4 and a Vector2.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param veca A Vector4 that we want to perform the dot product on.
     * @param vecb A Vector2 that we want to perform the dot product on.
     * @return Returns a dot b.
     */
    public static float dotProduct(Vector4 a, Vector2 b)
    {
        return Vector4.dotProduct(a, new Vector4(b));
    }
    
    /**
     * Performs the dot product between this Vector4 and that Vector4.
     * @param that A Vector4 we want to perform the dot product on.
     * @return Returns the dot product of this dot that.
     */
    public float dotProduct(Vector4 that)
    {
        return Vector4.dotProduct(this, that);
    }
    
    /**
     * Performs the dot product between this Vector4 and that Vector3.
     * @param that A Vector3 we want to perform the dot product on.
     * @return Returns the dot product of this dot that.
     */
    @Override
    public float dotProduct(Vector3 that)
    {
        return Vector4.dotProduct(this, new Vector4(that));
    }
    
    /**
     * Performs the dot product between this Vector4 and that Vector2.
     * @param that A Vector2 we want to perform the dot product on.
     * @return Returns the dot product of this dot that.
     */
    @Override
    public float dotProduct(Vector2 that)
    {
        return Vector4.dotProduct(this, new Vector4(that));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals">
    @Override
    /**
     * Checks if the object is a Vector4 and if so is it equal with this Vector4.
     * @param object An object that is believed to be a Vector4.
     * @return Returns the result of the comparison between this Vector4 and that Vector4.
     */
    public boolean equals(Object object)
    {
        boolean equals = false;
        if(object != null && object instanceof Vector4)
        {
            Vector4 that = (Vector4)object;
            equals = Vector4.equals(this, that);
        }
        return equals;
    }
    
    /**
     * Checks the equality between two Vector4
     * @param veca A Vector4 that we want to compare.
     * @param vecb A Vector4 that we want to compare.
     * @return Returns the result of the comparison between the two Vector4.
     */
    public static boolean equals(Vector4 a, Vector4 b)
    {
        boolean equals = false;
        if(a.x == b.x && a.y == b.y && a.z == b.z && a.w == b.w)
            equals = true;
        return equals;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Hermite">
    public static Vector4 hermite()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude">
    /**
     * Computes the magnitude of a Vector4.
     * @param a A Vector4 to find the magnitude of.
     * @return Returns the magnitude of the Vector4 provided.
     */
    public static float magnitude(Vector4 a)
    {
        return (float)Math.sqrt(a.magnitudeSquared());
    }
    
    /**
     * Computes the magnitude of this Vector4.
     * @return Returns the magnitude of this Vector4.
     */
    @Override
    public float magnitude()
    {
        return Vector4.magnitude(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude Squared">
    /**
     * Computes the magnitude squared of a Vector4
     * @param a A Vector4 to find the magnitude squared of.
     * @return Returns the magnitude squared of the Vector4 provided.
     */
    public static float magnitudeSquared(Vector4 a)
    {
        return (a.x * a.x) + (a.y * a.y) + (a.z * a.z) + (a.w * a.w);
    }
    
    /**
     * Computes the magnitude squared of this Vector3
     * @return Returns the magnitude squared of this Vector4.
     */
    @Override
    public float magnitudeSquared()
    {
        return Vector4.magnitude(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Linear Interpolation">
    public static Vector4 lerp(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Max and Min">
    public static Vector4 max(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 min(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    public static Vector4 multiply(Vector4 a, float scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 multiply(Vector4 a, int scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 multiply(float scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 multiply(int scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Negate">
    public static Vector4 negate(Vector4 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 negate()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Normalize">
    public static Vector4 normalize(Vector4 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 normalize()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Smooth Step">
    public static Vector4 smoothStep(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Special Vectors">
    /**
     * Special type of Vector4; The One vector, <1.0, 1.0 ,1.0, 1.0>
     * @return Returns a Vector4 with all components set to 1.0.
     */
    public static Vector4 one()
    {
        return new Vector4(1.0f);
    }
    
    /**
     * Returns the unit vector for the x-axis. <1.0, 0.0, 0.0, 0.0>
     * @return Returns a Vector4 with the x component set to 1.0.
     */
    public static Vector4 unitX()
    {
        return new Vector4(1.0f, 0.0f, 0.0f, 0.0f);
    }
    
    /**
     * Returns the unit vector for the y-axis. <0.0, 1.0, 0.0, 0.0>
     * @return Returns a Vector4 with the y component set to 1.0.
     */
    public static Vector4 unitY()
    {
        return new Vector4(0.0f, 1.0f, 0.0f, 0.0f);
    }
    
    
    /**
     * Returns the unit vector for the z-axis. <0.0, 0.0, 1.0, 0.0>
     * @return Returns a Vector4 with the z component set to 1.0.
     */
    public static Vector4 unitZ()
    {
        return new Vector4(0.0f, 0.0f, 1.0f, 0.0f);
    }
    
    /**
     * Returns the unit vector for the w-axis. <0.0, 0.0, 0.0, 1.0>
     * @return Returns a Vector4 with the w component set to 1.0.
     */
    public static Vector4 unitW()
    {
        return new Vector4(0.0f, 0.0f, 0.0f, 1.0f);
    }
    
    
    /**
     * Special type of Vector4; Zero vector also known as the null vector, <0.0, 0.0, 0.0, 0.0>
     * @return Returns a Vector4 with all components set to 0.0.
     */
    public static Vector4 zero()
    {
        return new Vector4(0.0f);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Subtract">
    public static Vector4 subtract(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 subtract(Vector4 a, Vector3 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 subtract(Vector3 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 subtract(Vector4 a, Vector2 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 subtract(Vector2 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtract(Vector4 that)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtract(Vector3 that)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtract(Vector2 that)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtract(float x, float y, float z, float w)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtract(int x, int y, int z, int w)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtract(Vector3 vec, float w)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtract(Vector2 vec, float z, float w)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtractX(float x)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtractX(int x)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtractY(float y)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtractY(int y)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtractZ(float z)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtractZ(int z)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtractW(float w)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtractW(int w)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="To String">
    /**
     * Converts the Vector4 to a string. <x,y,z,w>
     * @return Returns a string representing the Vector4.
     */
    @Override
    public String toString()
    {
        return "<" + this.x + "," + this.y + "," + this.z + "," + this.w + ">";
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Transformations">
    public static Vector4 transform(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
}

/**
 */
package TTMCHybrid;

import TTMCConstraint.NullaryExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Reference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link TTMCHybrid.LocationReferenceExpression#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see TTMCHybrid.TTMCHybridPackage#getLocationReferenceExpression()
 * @model
 * @generated
 */
public interface LocationReferenceExpression extends NullaryExpression {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see TTMCHybrid.TTMCHybridPackage#getLocationReferenceExpression_Location()
	 * @model required="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link TTMCHybrid.LocationReferenceExpression#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

} // LocationReferenceExpression

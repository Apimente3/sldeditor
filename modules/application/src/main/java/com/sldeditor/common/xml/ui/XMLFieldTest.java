//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, vhudson-jaxb-ri-2.1-833
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: [TEXT REMOVED by maven-replacer-plugin]
//

package com.sldeditor.common.xml.ui;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

/**
 * Possible sets that can be carried out on a field
 *
 * <p>Java class for XMLFieldTest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="XMLFieldTest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="Disabled" type="{}XMLFieldDisabled"/>
 *         &lt;element name="LiteralString" type="{}XMLFieldLiteralString"/>
 *         &lt;element name="LiteralInt" type="{}XMLFieldLiteralInt"/>
 *         &lt;element name="LiteralDouble" type="{}XMLFieldLiteralDouble"/>
 *         &lt;element name="LiteralBool" type="{}XMLFieldLiteralBoolean"/>
 *         &lt;element name="ColourMapEntries" type="{}XMLColourMapEntries"/>
 *         &lt;element name="Attribute" type="{}XMLFieldAttribute"/>
 *         &lt;element name="Expression" type="{}XMLFieldExpression"/>
 *         &lt;element name="SetLiteralString" type="{}XMLSetFieldLiteralString"/>
 *         &lt;element name="SetLiteralInt" type="{}XMLSetFieldLiteralInt"/>
 *         &lt;element name="SetLiteralDouble" type="{}XMLSetFieldLiteralDouble"/>
 *         &lt;element name="SetLiteralBool" type="{}XMLSetFieldLiteralBoolean"/>
 *         &lt;element name="SetAttribute" type="{}XMLSetFieldAttribute"/>
 *         &lt;element name="SetExpression" type="{}XMLSetFieldExpression"/>
 *         &lt;element name="SetMultiOptionGroup" type="{}XMLSetMultiOptionGroup"/>
 *         &lt;element name="SetGroup" type="{}XMLSetGroup"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "XMLFieldTest",
        propOrder = {"disabledOrLiteralStringOrLiteralInt"})
public class XMLFieldTest {

    @XmlElements({
        @XmlElement(name = "SetMultiOptionGroup", type = XMLSetMultiOptionGroup.class),
        @XmlElement(name = "SetGroup", type = XMLSetGroup.class),
        @XmlElement(name = "LiteralDouble", type = XMLFieldLiteralDouble.class),
        @XmlElement(name = "SetLiteralString", type = XMLSetFieldLiteralStringEx.class),
        @XmlElement(name = "SetLiteralDouble", type = XMLSetFieldLiteralDoubleEx.class),
        @XmlElement(name = "LiteralBool", type = XMLFieldLiteralBoolean.class),
        @XmlElement(name = "Expression", type = XMLFieldExpression.class),
        @XmlElement(name = "ColourMapEntries", type = XMLColourMapEntries.class),
        @XmlElement(name = "Attribute", type = XMLFieldAttribute.class),
        @XmlElement(name = "SetExpression", type = XMLSetFieldExpressionEx.class),
        @XmlElement(name = "SetLiteralInt", type = XMLSetFieldLiteralIntEx.class),
        @XmlElement(name = "SetAttribute", type = XMLSetFieldAttributeEx.class),
        @XmlElement(name = "Disabled", type = XMLFieldDisabled.class),
        @XmlElement(name = "LiteralString", type = XMLFieldLiteralString.class),
        @XmlElement(name = "LiteralInt", type = XMLFieldLiteralInt.class),
        @XmlElement(name = "SetLiteralBool", type = XMLSetFieldLiteralBooleanEx.class)
    })
    protected List<Object> disabledOrLiteralStringOrLiteralInt;

    /**
     * Gets the value of the disabledOrLiteralStringOrLiteralInt property.
     *
     * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the disabledOrLiteralStringOrLiteralInt
     * property.
     *
     * <p>For example, to add a new item, do as follows:
     *
     * <pre>
     *    getDisabledOrLiteralStringOrLiteralInt().add(newItem);
     * </pre>
     *
     * <p>Objects of the following type(s) are allowed in the list {@link XMLSetMultiOptionGroup }
     * {@link XMLSetGroup } {@link XMLFieldLiteralDouble } {@link XMLSetFieldLiteralString } {@link
     * XMLSetFieldLiteralDouble } {@link XMLFieldLiteralBoolean } {@link XMLFieldExpression } {@link
     * XMLColourMapEntries } {@link XMLFieldAttribute } {@link XMLSetFieldExpression } {@link
     * XMLSetFieldLiteralInt } {@link XMLSetFieldAttribute } {@link XMLFieldDisabled } {@link
     * XMLFieldLiteralString } {@link XMLFieldLiteralInt } {@link XMLSetFieldLiteralBoolean }
     */
    public List<Object> getDisabledOrLiteralStringOrLiteralInt() {
        if (disabledOrLiteralStringOrLiteralInt == null) {
            disabledOrLiteralStringOrLiteralInt = new ArrayList<Object>();
        }
        return this.disabledOrLiteralStringOrLiteralInt;
    }
}

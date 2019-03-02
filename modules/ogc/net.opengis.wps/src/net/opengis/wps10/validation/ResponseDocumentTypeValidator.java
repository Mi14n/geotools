/**
 *
 * $Id$
 */
package net.opengis.wps10.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link net.opengis.wps10.ResponseDocumentType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResponseDocumentTypeValidator {
  boolean validate();

  boolean validateOutput(EList value);
  boolean validateLineage(boolean value);
  boolean validateStatus(boolean value);
  boolean validateStoreExecuteResponse(boolean value);
}
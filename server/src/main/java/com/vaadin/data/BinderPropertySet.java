/*
 * Copyright 2000-2016 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.data;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Describes a set of properties that can be used with a {@link Binder}.
 *
 * @author Vaadin Ltd
 *
 * @since
 *
 * @param <T>
 *            the type for which the properties are defined
 */
public interface BinderPropertySet<T> {
    /**
     * Gets all known properties as a stream.
     *
     * @return a stream of property names, not <code>null</code>
     */
    public Stream<BinderPropertyDefinition<T, ?>> getProperties();

    /**
     * Gets the definition for the named property, or an empty optional if there
     * is no property with the given name.
     *
     * @param name
     *            the property name to look for, not <code>null</code>
     * @return the property definition, or empty optional if property doesn't
     *         exist
     */
    public Optional<BinderPropertyDefinition<T, ?>> getProperty(String name);
}
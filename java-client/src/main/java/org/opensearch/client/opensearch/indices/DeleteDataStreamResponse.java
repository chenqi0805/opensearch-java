/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.client.opensearch.indices;

import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.opensearch._types.AcknowledgedResponseBase;
import org.opensearch.client.util.ObjectBuilder;

import java.util.function.Function;

// typedef: indices.delete_data_stream.Response

@JsonpDeserializable
public class DeleteDataStreamResponse extends AcknowledgedResponseBase {
    
    // ---------------------------------------------------------------------------------------------

    private DeleteDataStreamResponse(Builder builder) {
        super(builder);
    }

    public static DeleteDataStreamResponse of(Function<Builder, ObjectBuilder<DeleteDataStreamResponse>> fn) {
        return fn.apply(new Builder()).build();
    }

    // ---------------------------------------------------------------------------------------------

    /**
     * Builder for {@link DeleteDataStreamResponse}
     */
    public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
            implements ObjectBuilder<DeleteDataStreamResponse> {

        @Override
        protected Builder self() {
            return this;
        }

        /**
         * Builds a {@link DeleteDataStreamResponse}.
         *
         * @throws NullPointerException
         *             if any required field is null.
         */
        public DeleteDataStreamResponse build() {
            _checkSingleUse();

            return new DeleteDataStreamResponse(this);
        }
    }


    // ---------------------------------------------------------------------------------------------

    /**
     * Json deserializer for {@link DeleteDataStreamResponse}
     */
    public static final JsonpDeserializer<DeleteDataStreamResponse> _DESERIALIZER = ObjectBuilderDeserializer
            .lazy(Builder::new, DeleteDataStreamResponse::setupDeleteDataStreamResponseDeserializer);

    protected static void setupDeleteDataStreamResponseDeserializer(ObjectDeserializer<DeleteDataStreamResponse.Builder> op) {
        AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
    }
}
